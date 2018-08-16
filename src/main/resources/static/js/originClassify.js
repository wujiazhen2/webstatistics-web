/**
 * Created by wujiazhen on 2018/2/21.
 */
$(function () {
    //设置查询初始条件
    query.queryData.start_time="2018-04-28"
    query.queryFunction=originClassify.reloadData;
    originClassify.initOriginLine();
    originClassify.initOriginPie();
    originClassify.initOriginTable();
    common.loadSummary(query.queryData);
})

var originClassify={
    lineChart:null,
    pieChart:null,
    reloadData:function () {
        if(originClassify.lineChart)
            originClassify.lineChart.clear();
        originClassify.initOriginLine();
        if(originClassify.pieChart)
            originClassify.pieChart.clear();
        originClassify.initOriginPie();
        $("#originTable").DataTable().ajax.reload();
        common.loadSummary(query.queryData);
    },
    initOriginTable:function () {
        var table=$("#originTable").myDataTables({
            columns:[
                {title:"来源类型",width:"20%",data:"originType_cn"},
                {title: "浏览量(PV)", width: "12%",data:"pv"},
                {title: "访客量(UV)", width: "12%",data:"uv"},
                {title: "IP数", width: "12%",data:"ipNum"},
                {title: "新访客数", width: "12%",data:"newVisitor"},
                {title: "跳出率", width: "12%",data:"jumpOutPercent"},
                {title: "平均访问时长", width: "12%",data:"avgVisitTime_str"},
                {title: "转化次数", width: "12%",data:"avgConversions"}
            ],
            "processing": true, //打开数据加载时的等待效果
            "pagingType": "full_numbers",
            "ajax": {
                "url": "/weblog/detail/originClassify",
                "type": "POST",
                "data": function (){
                    var json=query.getQueryData();
                    json= deepCopy(json)
                    json.offset =0;
                    json.limit=5;
                    return json;
                },
                "dataSrc":function (json) {
                    return json;
                }
            },
        })
    },
    initOriginPie:function () {
        $.ajax({
            url:"/weblog/detail/originClassify",
            data:function (){
                var json=query.getQueryData();
                json= deepCopy(json)
                json.offset =0;
                json.limit=5;
                return json;
            },
            success:function (data) {
                var arr= new Array();
                var arr2=new Array();
                for(key in data){
                    arr.push(data[key].originType_cn)
                    arr2.push({name:data[key].originType_cn,value:data[key].pv})
                }
                option = {
                    title : {
                        x:'center'
                    },
                    tooltip : {
                        trigger: 'item',
                        formatter: "{a} <br/>{b} : {c} ({d}%)"
                    },
                    legend: {
                        type: 'scroll',
                        orient: 'vertical',
                        right: 10,
                        top: 20,
                        bottom: 20,
                        data:arr,
                    },
                    series : [
                        {
                            name: '浏览量',
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
                originClassify.pieChart=echarts.init(document.getElementById("originPie"))
                originClassify.pieChart.setOption(option);
            }
        })

    },
    initOriginLine:function () {
        $.ajax({
            url: "/weblog/detail/originClassifyGroupByDateTime",
            data: query.getQueryData(),
            success: function (data) {
                if (data == null || data == undefined || data.length == 0)
                    return;
                var start = data[0].analyzeDate + " " + (data[0].hour < 10 ? "0" + data[0].hour : data[0].hour) + ":00:00";
                var end = data[data.length - 1].analyzeDate + " " + (data[data.length - 1].hour < 10 ? "0" + data[data.length - 1].hour : data[data.length - 1].hour) + ":00:00";
                var direct = new Array();
                var se = new Array();
                var out = new Array();
                var key;
                for(var i=0;i<data.length;i++){
                    key=data[i].analyzeDate+" "+(data[i].hour<10?"0"+data[i].hour:data[i].hour)+":00:00"
                   switch (data[i].originType){
                       case "0":
                            direct.push([key,data[i].pv])
                             break;
                       case "1":
                           se.push([key,data[i].pv])
                           break;
                       case "2":
                           out.push([key,data[i].pv])
                           break;
                   }
                }
                option = {
                    tooltip : {
                        trigger: 'axis'
                    },
                    legend: {
                        data:['直接访问','搜索引擎','外部链接']
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
                            name:"浏览量",
                            type : 'value',
                            axisLabel : {
                                formatter: '{value} '
                            },
                            min:0,
                            max:5000
                        }
                    ],
                    series : [
                        {
                            name:'直接访问',
                            type:'line',
                            data:direct

                        },
                        {
                            name:'搜索引擎',
                            type:'line',
                            data:se
                        },
                        {
                            name:'外部链接',
                            type:'line',
                            data:out
                        }
                    ]
                };
                originClassify.lineChart=echarts.init(document.getElementById("originLine"),null,{renderer:"svg"})
                originClassify.lineChart.setOption(option);

            }
        })

    }
}