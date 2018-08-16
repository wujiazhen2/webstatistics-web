/**
 * Created by wujiazhen on 2018/2/8.
 */
$(function () {
    overview.buildTodayFluxTable();
    overview.buildTrendLineCharts();
    overview.buildOriginWebTable();
    overview.buildoldVNewTable();
    overview.bulidLlowMap();

    //绑定事件
    $("#todayFlux_more").click(function () {
        if(this.className.indexOf("glyphicon-menu-down")>-1){
            overview.event.todayFluxShow();
        }else {
            overview.event.todayFluxHide();
        }
    })

    $(".go").mouseover(overview.event.goHover)
    $(".go").mouseout(overview.event.goOut)
})
var overview={
    event:{
        todayFluxHide:function () {
            $("#todayFlux tr:gt(2)").hide();
            $("#todayFlux_more").removeClass("glyphicon-menu-up");
            $("#todayFlux_more").addClass("glyphicon-menu-down")
        },
        todayFluxShow:function () {
            $("#todayFlux tr:gt(2)").show();
            $("#todayFlux_more").removeClass("glyphicon-menu-down")
            $("#todayFlux_more").addClass("glyphicon-menu-up");
        },
        goHover:function () {
            $(this).addClass("go_hover");
        },
        goOut:function () {
            $(this).removeClass("go_hover");
        }
    },
    buildTodayFluxTable:function () {

        $.ajax({
            url:"/weblog/day/summary",
            success:function (data) {
                var table=$("#todayFlux").myDataTables({
                    columns:[
                        {title:"",width:"10%",data:"type_cn"},
                        {title:"浏览量(PV)",width:"15%",data:"pv"},
                        {title:"访客量(UV)",width:"15%",data:"uv"},
                        {title:"IP数",width:"15%",data:"ipNum"},
                        {title:"新访客数",width:"15%",data:"newVisitor"},
                        {title:"平均访问时长",width:"15%",data:"avgVisitTime_str"},
                        {title:"平均访问深度",width:"15%",data:"avgConversions"}

                    ],
                    data: data
                })
                overview.event.todayFluxHide();
            }
        })


    },
    buildoldVNewTable:function () {
        $.ajax({
            url:"/weblog/visitor/today",
            success:function (data) {
                var newVisitor,oldVisitor;
                for(var i=0;i<2;i++){
                    if(data[i].isNewVisitor==0){
                        oldVisitor=data[i];
                    }else{
                        newVisitor=data[i];
                    }
                }
                $("#oldVNew").myDataTables({
                    columns:[
                        {title:"",width:"30%",data:"title"},
                        {title:"新访客",width:"35%",data:"newVisitor"},
                        {title:"旧访客",width:"35%",data:"oldVisitor"},
                    ],
                    data:[
                        {title:"浏览量",newVisitor:newVisitor.pv,oldVisitor:oldVisitor.pv},
                        {title:"访客数",newVisitor:newVisitor.uv,oldVisitor:oldVisitor.uv},
                        {title:"平均访问时长",newVisitor:newVisitor.avgVisitTime_str,oldVisitor:oldVisitor.avgVisitTime_str},
                        {title:"平均访问页面数",newVisitor:newVisitor.avgConversions,oldVisitor:oldVisitor.avgConversions}
                    ]

                })
            }

        })

    },
    buildOriginWebTable:function () {
        $.ajax({
            url:"/weblog/origin/topTen",
            success:function (data) {
                $("#originWeb").myDataTables({
                    columns:[
                        {title:"来源网站",width:"60%",data:"origin"},
                        {title:"浏览量(PV)",width:"25%",data:"pv"},
                        {title:"占比",width:"15%",data:"pvPercent_cn"}
                    ],
                    data:data
                })
            }
        })

    },
    buildTrendLineCharts:function () {
        $.ajax({
            url: "/weblog/hour/today",
            success: function (data) {
                var pvs=new Array();
                var uvs=new Array();
                var ips=new Array();
                var nus=new Array();
                for(var i=0;i<data.length;i++){
                    pvs.push([data[i].hour,data[i].pv]);
                    uvs.push([data[i].hour,data[i].uv]);
                    ips.push([data[i].hour,data[i].ipNum]);
                    nus.push([data[i].hour,data[i].newVisitor]);
                }
                option = {
                    tooltip: {
                        trigger: 'axis'
                    },
                    legend: {
                        data: ['浏览量(PV)', '访客量(UV)', 'IP数', '新访客数']
                    },
                    toolbox: {
                        show: true,
                        feature: {
                            saveAsImage: {show: true}
                        }
                    },
                    calculable: true,
                    xAxis: [
                        {
                            type: 'value',
                            axisLabel: {
                                formatter: '{value} '
                            },
                            min: 0,
                            max: 24
                        }
                    ],
                    yAxis: [
                        {
                            type: 'value',
                            axisLabel: {
                                formatter: '{value} '
                            },
                            min: 0,
                            max: 2500
                        }
                    ],
                    series: [
                        {
                            name: '浏览量(PV)',
                            type: 'line',
                            data: pvs

                        },
                        {
                            name: '访客量(UV)',
                            type: 'line',
                            data: uvs
                        },
                        {
                            name: 'IP数',
                            type: 'line',
                            data: ips

                        },
                        {
                            name: '新访客数',
                            type: 'line',
                            data: nus
                        }
                    ]
                };
                var chart = echarts.init(document.getElementById("trendLine"), null, {renderer: "svg"})
                chart.setOption(option);
            }
        })
    },
    bulidLlowMap:function () {

        function randomValue() {
            return Math.round(Math.random()*1000);
        }

        option = {
            tooltip: {},
            visualMap: {
                min: 0,
                max: 2000,
                text:['High','Low'],
                realtime: false,
                calculable: true,
                inRange: {
                    color: ['#e0ffff', '#006edd']
                }
            },
            geo: {
                map: 'china',
                roam: true,
                label: {
                    normal: {
                        show: true,
                        textStyle: {
                            color: 'rgba(0,0,0,0.4)'
                        }
                    }
                },
                itemStyle: {
                    normal:{
                        borderColor: 'rgba(0, 0, 0, 0.2)'
                    },
                    emphasis:{
                        areaColor: null,
                        shadowOffsetX: 0,
                        shadowOffsetY: 0,
                        shadowBlur: 20,
                        borderWidth: 0,
                        shadowColor: 'rgba(0, 0, 0, 0.5)'
                    }
                }
            },
            series : [
                {
                    name: '浏览量',
                    type: 'map',
                    roam: true,
                    coordinateSystem: 'geo',
                    geoIndex: 0,
                    // tooltip: {show: false},
                    label: {
                        normal: {
                            formatter: '{b}',
                            position: 'right',
                            show: false
                        },
                        emphasis: {
                            show: true
                        }
                    },
                    itemStyle: {
                        normal: {
                            color: '#F06C00'
                        }
                    },
                    data:[
                        {name: '北京', value: randomValue()},
                        {name: '天津', value: randomValue()},
                        {name: '上海', value: randomValue()},
                        {name: '重庆', value: randomValue()},
                        {name: '河北', value: randomValue()},
                        {name: '河南', value: randomValue()},
                        {name: '云南', value: randomValue()},
                        {name: '辽宁', value: randomValue()},
                        {name: '黑龙江', value: randomValue()},
                        {name: '湖南', value: randomValue()},
                        {name: '安徽', value: randomValue()},
                        {name: '山东', value: randomValue()},
                        {name: '新疆', value: randomValue()},
                        {name: '江苏', value: randomValue()},
                        {name: '浙江', value: randomValue()},
                        {name: '江西', value: randomValue()},
                        {name: '湖北', value: randomValue()},
                        {name: '广西', value: randomValue()},
                        {name: '甘肃', value: randomValue()},
                        {name: '山西', value: randomValue()},
                        {name: '内蒙古', value: randomValue()},
                        {name: '陕西', value: randomValue()},
                        {name: '吉林', value: randomValue()},
                        {name: '福建', value: randomValue()},
                        {name: '贵州', value: randomValue()},
                        {name: '广东', value: randomValue()},
                        {name: '青海', value: randomValue()},
                        {name: '西藏', value: randomValue()},
                        {name: '四川', value: randomValue()},
                        {name: '宁夏', value: randomValue()},
                        {name: '海南', value: randomValue()},
                        {name: '台湾', value: randomValue()},
                        {name: '香港', value: randomValue()},
                        {name: '澳门', value: randomValue()}
                    ]
                }
            ]
        };
        var chart=echarts.init(document.getElementById("flowMap"))
        chart.setOption(option)
    }

}