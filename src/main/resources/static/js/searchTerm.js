/**
 * Created by wujiazhen on 2018/2/21.
 */
$(function () {
    //设置查询初始条件
    query.queryData.start_time="2018-04-28"
    query.queryFunction=searchTerm.reloadData;
    searchTerm.initSearchTermTable();
    common.loadSummary(query.queryData);
})

var searchTerm={
    reloadData:function () {
        $("#searchTermTable").DataTable().ajax.reload();
        common.loadSummary(query.queryData);
    },
    initSearchTermTable:function () {
        var table=$("#searchTermTable").myDataTables({
            columns:[
                {title:"搜索词",width:"20%",data:"searchTerm"},
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
                "url": "/weblog/term/list",
                "type": "POST",
                "data": query.getQueryData,
                "dataSrc":function (json) {
                    return json;
                }
            },
        })
    }
}