/**
 * Created by wujiazhen on 2018/2/21.
 */
$(function () {
    //设置查询初始条件
    query.queryData.start_time="2018-04-28"
    query.queryFunction=originDomain.reloadData;
    originDomain.initOriginLine();
    originDomain.initOriginPie();
    originDomain.initOriginTable();
    common.loadSummary(query.queryData);

})

var originDomain={
    lineChart:null,
    pieChart:null,
    reloadData:function () {
        if(originDomain.lineChart)
            originDomain.lineChart.clear();
        originDomain.initOriginLine();
        if(originDomain.pieChart)
            originDomain.pieChart.clear();
        originDomain.initOriginPie();
        $("#originTable").DataTable().ajax.reload();
        common.loadSummary(query.queryData);
    },
    initOriginTable:function () {
        var table=$("#originTable").myDataTables({
            columns:[
                {title:"来源域名",width:"20%",data:"originDomain"},
                {title: "浏览量(PV)", width: "12%",data:"pv"},
                {title: "访客量(UV)", width: "12%",data:"uv"},
                {title: "IP数", width: "12%",data:"ipNum"},
                {title: "新访客数", width: "12%",data:"newVisitor"},
                {title: "平均访问时长", width: "12%",data:"avgVisitTime_str"},
                {title: "平均访问深度", width: "12%",data:"avgConversions"}
            ],
            "processing": true, //打开数据加载时的等待效果
            "pagingType": "full_numbers",
            "ajax": {
                "url": "/weblog/detail/originDomain",
                "type": "POST",
                "data": query.getQueryData,
                "dataSrc":function (json) {
                    return json;
                }
            },
        })
    },
    initOriginPie:function () {

        $.ajax({
            url: "/weblog/detail/originDomain",
            data: query.getPageQueryCondition(),
            success: function (data) {
                var arr = new Array();
                var arr2 = new Array();
                for (key in data) {
                    arr.push(data[key].originDomain)
                    arr2.push({name: data[key].originDomain, value: data[key].pv})
                }

                option = {
                    title : {
                        x:'center'
                    },
                    tooltip : {
                        trigger: 'item',
                        formatter: "{a} <br/>{b} : {c} ({d}%)"
                    },
                    series : [
                        {
                            name: '域名',
                            type: 'pie',
                            radius : '55%',
                            center: ['40%', '50%'],
                            data: arr2,
                            itemStyle: {
                                emphasis: {
                                    shadowBlur: 10,
                                    shadowOffsetX: 0,
                                    shadowColor: 'rgba(0, 0, 0, 0.5)'
                                }
                            }
                        }
                    ]
                };
                originDomain.pieChart=echarts.init(document.getElementById("originPie"))
                originDomain.pieChart.setOption(option);
            }
        })

    },
    initOriginLine:function () {
        $.ajax({
            url: "/weblog/detail/originDomainGroupByDateTime",
            data: query.getPageQueryCondition(),
            success: function (data) {
                if (data == null || data == undefined || data.length == 0)
                    return;
                var start = data[0].analyzeDate + " " + (data[0].hour < 10 ? "0" + data[0].hour : data[0].hour) + ":00:00";
                var end = data[data.length - 1].analyzeDate + " " + (data[data.length - 1].hour < 10 ? "0" + data[data.length - 1].hour : data[data.length - 1].hour) + ":00:00";
                var legend = new Array();
                var series = new Array();
                var map ={};
                for (var i = 0; i < data.length; i++) {
                    key = data[i].analyzeDate + " " + (data[i].hour < 10 ? "0" + data[i].hour : data[i].hour) + ":00:00"
                    if(!legend.contains(data[i].originDomain)){
                        legend.push(data[i].originDomain)
                        map[data[i].originDomain]={
                            name:data[i].originDomain,
                            type:"line",
                            data:[]
                        }
                    }
                    map[data[i].originDomain].data.push([key,data[i].pv])
                }
                for(key in map){
                    series.push(map[key]);
                }
                option = {
                    tooltip : {
                        trigger: 'axis'
                    },
                    legend: {
                        data:legend
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
                            type : 'time',
                            axisLabel : {
                                formatter: '{value} '
                            },
                            min:start,
                            max:end
                        }
                    ],
                    yAxis : [
                        {
                            type : 'value',
                            axisLabel : {
                                formatter: '{value} '
                            },
                            min:0,
                            max:5000
                        }
                    ],
                    series :series
                };
                originDomain.lineChart=echarts.init(document.getElementById("originLine"),null,{renderer:"svg"})
                originDomain.lineChart.setOption(option);
            }
        })


    }
}