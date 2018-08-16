/**
 * Created by wujiazhen on 2018/2/11.
 */
$(function () {
    realVistor.buildVisitorConditionLineChart();
    realVistor.buildVisitInfoTable()
})


var realVistor={
    buildVisitInfoTable:function () {
        var table=$("#visitInfo").myDataTables({
            columns: [
                {title: "访问时间",width:"150px"},
                {title: "地域"},
                {title: "来源"},
                {title: "入口页面"},
                {title: "搜索词"},
                {title: "访问IP"},
                {title: "访客ID"},
                {title: "访问时长"},
                {title: "访问页数"}

            ],
            data:[
                ["2018/02/11 20:51:02","北京","直接访问","/zh/result/2018-02-11","--","106.121.77.8","1683251485715942706","正在访问",1]
            ,["2018/02/11 20:51:02","北京","直接访问","/zh/result/2018-02-11","--","106.121.77.8","1683251485715942706","正在访问",1]
,["2018/02/11 20:51:02","北京","直接访问","/zh/result/2018-02-11","--","106.121.77.8","1683251485715942706","正在访问",1]
            ]
        });
    },
    buildVisitorConditionLineChart:function () {
        option = {
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data:['浏览量(PV)','访客量(UV)','IP数','新访客数']
            },
            toolbox: {
                show : true,
                feature : {
                    saveAsImage : {show: true}
                }
            },
            calculable : true,
            xAxis : [
                {
                    type : 'value',
                    axisLabel : {
                        formatter: '{value} '
                    },
                    min:0,
                    max:24
                }
            ],
            yAxis : [
                {
                    type : 'value',
                    axisLabel : {
                        formatter: '{value} '
                    },
                    min:0,
                    max:2500
                }
            ],
            series : [
                {
                    name:'浏览量(PV)',
                    type:'line',
                    data:[[2,1100], [4,1134], [6,1566], [15,1346], [19,1264], [20,1376], [24,1056]]

                },
                {
                    name:'访客量(UV)',
                    type:'line',
                    data:[[3,1233], [4,1442], [6,1234], [15,1532], [19,1264], [20,1320], [24,1224]]
                },
                {
                    name:'IP数',
                    type:'line',
                    data:[[3,1130], [4,1314], [6,1546], [15,1546], [19,1364], [20,1376], [24,1056]]

                },
                {
                    name:'新访客数',
                    type:'line',
                    data:[[3,1233], [4,1442], [6,1234], [15,1532], [19,1264], [20,1320], [24,1224]]
                }
            ]
        };
        var chart=echarts.init(document.getElementById("visitorCondition"),null,{renderer:"svg"})
        chart.setOption(option);
    }
}