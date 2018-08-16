/**
 * Created by wujiazhen on 2018/2/11.
 */
$(function () {
    //设置查询初始条件
    query.queryData.start_time="2018-04-28"
    query.queryFunction=reloadData;
    trend.buildTrendLineCharts();
    trend.buildTrendTable();
    common.loadSummary(query.queryData);
})
function reloadData() {
    if(trend.lineChart)
        trend.lineChart.clear();
    trend.buildTrendLineCharts();
    $("#trendTable").DataTable().ajax.reload();
    common.loadSummary(query.queryData);
}
var trend = {
        lineChart:null,
        buildTrendTable: function () {

                    var table = $("#trendTable").myDataTables({
                        columns: [
                            {title: "时间", width: "20%",data:"dateStr"},
                            {title: "浏览量(PV)", width: "12%",data:"pv"},
                            {title: "访客量(UV)", width: "12%",data:"uv"},
                            {title: "IP数", width: "12%",data:"ipNum"},
                            {title: "新访客数", width: "12%",data:"newVisitor"},
                         /*   {title: "跳出率", width: "12%",data:"jumpOutPercent"},*/
                            {title: "平均访问时长", width: "12%",data:"avgVisitTime_str"},
                            {title: "平均访问深度", width: "12%",data:"avgConversions"}
                        ],
                        "processing": true, //打开数据加载时的等待效果
                        "pagingType": "full_numbers",
                        "ajax": {
                            "url": "/weblog/detail/trend",
                            "type": "POST",
                            "data": query.getQueryData,
                            "dataSrc":function (json) {
                                return json;
                            }
                        },
                    })

        },
        buildTrendLineCharts: function () {
            $.ajax({
                url: "/weblog/detail/trend",
                data: query.getQueryData(),
                success: function (data) {
                    if( data==null || data==undefined ||data.length==0  )
                        return;
                    var start=data[0].analyzeDate+" "+(data[0].hour<10?"0"+data[0].hour:data[0].hour)+":00:00";
                    var end =data[data.length-1].analyzeDate+" "+(data[data.length-1].hour<10?"0"+data[data.length-1].hour:data[data.length-1].hour)+":00:00";
                    var pvs =new Array();
                    var uvs =new Array();
                    var ips =new Array();
                    var newV=new Array();
                    var key;
                    for(var i=0;i<data.length;i++){
                        key=data[i].analyzeDate+" "+(data[i].hour<10?"0"+data[i].hour:data[i].hour)+":00:00"
                        pvs.push([key,data[i].pv])
                        uvs.push([key,data[i].uv])
                        ips.push([key,data[i].ipNum])
                        newV.push([key,data[i].newVisitor])
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
                                type: 'time',
                                axisLabel: {
                                    formatter: '{value} '
                                },
                                min: start,
                                max: end
                            }
                        ],
                        yAxis: [
                            {
                                type: 'value',
                                axisLabel: {
                                    formatter: '{value} '
                                },
                                min: 100,
                                max: 5000
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
                                data:ips

                            },
                            {
                                name: '新访客数',
                                type: 'line',
                                data: newV
                            }
                        ]
                    };
                    var chart = echarts.init(document.getElementById("trendLine"), null, {renderer: "svg"})
                    trend.lineChart=chart
                    chart.setOption(option);

                }
            } )
        }
    }