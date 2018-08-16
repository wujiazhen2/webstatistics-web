/**
 * Created by wujiazhen on 2018/2/24.
 */
$(function () {
    //设置查询初始条件
    query.queryData.start_time="2018-04-28"
    query.queryFunction=visitPage.reloadData;
    common.loadSummary(query.queryData);
    visitPage.loadSummary();
    visitPage.initBasePageTable();
    visitPage.initIntoPageTable();
    visitPage.initLeavePageTable();
})


var visitPage={
    reloadData:function () {
        $("#basePageTable").DataTable().ajax.reload();
        $("#intoPageTable").DataTable().ajax.reload();
        $("#leavePageTable").DataTable().ajax.reload();
        common.loadSummary(query.queryData);
        visitPage.loadSummary();
    },
    loadSummary:function () {
        $.ajax({
            url: "/weblog/visitPage/summary",
            data:query.getQueryData(),
            success:function (data) {
                var ins=$("#inSummary .content");
                for(var i=0;i<ins.size();i++){
                    key=ins[i].id.substring(3,ins[i].id.length);
                    $(ins.get(i)).text(!data || data[key]==null?0:data[key])
                }
                var outs=$("#outSummary .content");
                for(var i=0;i<outs.size();i++){
                    key=outs[i].id.substring(4,outs[i].id.length);
                    $(outs.get(i)).text(!data || data[key]==null?0:data[key])
                }

            }
        })
    },
    initBasePageTable:function () {
        var table=$("#basePageTable").myDataTables({
            columns:[
                {title:"受访页面",width:"20%",data:"visitPage"},
                {title: "浏览量(PV)", width: "12%",data:"pv"},
                {title: "访客量(UV)", width: "12%",data:"uv"},
                {title: "IP数", width: "12%",data:"ipNum"},
                {title: "新访客数", width: "12%",data:"newVisitor"},
                {title: "平均访问时长", width: "12%",data:"avgVisitTime_str"},
                {title: "转化次数", width: "12%",data:"avgConversions"}
            ],
            "processing": true, //打开数据加载时的等待效果
            "pagingType": "full_numbers",
            "ajax": {
                "url":  "/weblog/visitPage/visitPage",
                "type": "POST",
                "data": query.getQueryData,
                "dataSrc":function (json) {
                    return json;
                }
            },
        })
    },
    initIntoPageTable:function () {
        var table=$("#intoPageTable").myDataTables({
            columns:[
                {title:"受访页面",width:"19%",data:"visitPage"},
                {title:"浏览量(PV)",width:"8%",data:"pv"},
                {title:"访客量(UV)",width:"8%",data:"uv"},
                {title:"进入次数",width:"10%",data:"outcount"},
                {title:"平均访问深度",width:"18%",data:"avgDeepth"},
                {title:"平均访问时长 ",width:"18%",data:"avgVisitTime_str"},
            ],
            "processing": true, //打开数据加载时的等待效果
            "pagingType": "full_numbers",
            "ajax": {
                "url": "/weblog/visitPage/inPage",
                "type": "POST",
                "data": query.getQueryData,
                "dataSrc":function (json) {
                    return json;
                }
            },
        })
    },
    initLeavePageTable:function () {
        var table=$("#leavePageTable").myDataTables({
            columns:[
                {title:"受访页面",width:"60%",data:"visitPage"},
                {title:"浏览量(PV)",width:"10%",data:"pv"},
                {title:"访客量(UV)",width:"10%",data:"uv"},
                {title:"离开次数",width:"10%",data:"outcount"},
            ],
            "processing": true, //打开数据加载时的等待效果
            "pagingType": "full_numbers",
            "ajax": {
                "url": "/weblog/visitPage/outPage",
                "type": "POST",
                "data": query.getQueryData,
                "dataSrc":function (json) {
                    return json;
                }
            },
        })
    }
    

}