/**
 * Created by wujiazhen on 2018/2/25.
 */
$(function () {
    //设置查询初始条件
    query.queryData.start_time="2018-04-28"
    oldAndNewVisitor.initNewAndOldVisitor();
  oldAndNewVisitor.initAccessOriginWeb();
    oldAndNewVisitor.initAccessOriginWeb_old();
    oldAndNewVisitor.initAccessIntoWeb_new();
    oldAndNewVisitor.initAccessIntoWeb_old();
})
var oldAndNewVisitor={
    initNewAndOldVisitor:function () {
        $.ajax({
            url:"/weblog/visitor/oldAndNewVisitor",
            data:query.getQueryData(),
            success:function (data) {
                if(data.length<2) {
                    var arr = ["old_", "new_"];
                    for (var i = 0; i < arr.length; i++) {
                        $("#" + arr[i] + "percent").text("0%");
                        $("#" + arr[i]  + "pv").text(0);
                        $("#" + arr[i]  + "uv").text(0);
                        $("#" + arr[i]  + "jumpOutPercent").text(0);
                        $("#" + arr[i]  + "avgVisitTime_str").text(0);
                        $("#" + arr[i]  + "avgVisitpageNum").text(0);
                    }
                }else {
                    var perfix = "";
                    var sum = data[0].pv + data[1].pv
                    for (var i = 0; i < data.length; i++) {
                        if (!data[i].isNewVisitor) {
                            perfix = "old_";
                        } else {
                            perfix = "new_";
                        }
                        $("#" + perfix + "percent").text(((data[i].pv / sum).toFixed(2) * 100) + "%");
                        $("#" + perfix + "pv").text(data[i].pv == null ? 0 : data[i].pv);
                        $("#" + perfix + "uv").text(data[i].uv == null ? 0 : data[i].uv);
                        $("#" + perfix + "jumpOutPercent").text(data[i].jumpOutPercent == null ? 0 : data[i].jumpOutPercent);
                        $("#" + perfix + "avgVisitTime_str").text(data[i].avgVisitTime_str == null ? 0 : data[i].avgVisitTime_str);
                        $("#" + perfix + "avgVisitpageNum").text(data[i].avgVisitpageNum == null ? 0 : data[i].avgVisitpageNum);
                    }
                }
            }
        })
    },
    initAccessIntoWeb_new:function () {
        $("#accessIntoWeb_new").myDataTables({
            columns:[
                {title:"排名",width:"20%",data:"order"},
                {title:"入口页链接",width:"40%",data:"originPage"},
                {title:"访问次数",width:"40%",data:"pv"}
            ],
            "processing": true, //打开数据加载时的等待效果
            "pagingType": "full_numbers",
            "ajax": {
                "url": "/weblog/detail/topPage",
                "type": "POST",
                "data": function(){
                    var json=query.getQueryData();
                    json= deepCopy(json)
                    json.offset =0;
                    json.limit=5;
                    json.isNewVisitor=1;
                    return json;
                },
                "dataSrc":function (json) {
                    for(var i=0;i<json.length;i++){
                        json[i].order=i+1;
                    }
                    return json;
                }
            }
        })
    },
    initAccessIntoWeb_old:function () {
        $("#accessIntoWeb_old").myDataTables({
            columns:[
                {title:"排名",width:"20%",data:"order"},
                {title:"入口页链接",width:"40%",data:"originPage"},
                {title:"访问次数",width:"40%",data:"pv"}
            ],
            "processing": true, //打开数据加载时的等待效果
            "pagingType": "full_numbers",
            "ajax": {
                "url": "/weblog/detail/topPage",
                "type": "POST",
                "data": function(){
                    var json=query.getQueryData();
                    json= deepCopy(json)
                    json.offset =0;
                    json.limit=5;
                    json.isNewVisitor=0;
                    return json;
                },
                "dataSrc":function (json) {
                    for(var i=0;i<json.length;i++){
                        json[i].order=i+1;
                    }
                    return json;
                }
            }
        })
    },
    initaccessIntoWeb_old:function () {

    },
    initAccessOriginWeb:function () {
        $("#accessOriginWeb").myDataTables({
            columns:[
                {title:"排名",width:"20%",data:"order"},
                {title:"来源网站",width:"40%",data:"originDomain"},
                {title:"浏览量(PV)",width:"40%",data:"pv"}
            ],
            "ajax": {
                "url": "/weblog/detail/topDomain",
                "type": "POST",
                "data": function(){
                    var json=query.getQueryData();
                    json= deepCopy(json)
                    json.offset =0;
                    json.limit=5;
                    json.isNewVisitor=1;
                    return json;
                },
                "dataSrc":function (json) {
                    for(var i=0;i<json.length;i++){
                        json[i].order=i+1;
                    }
                    return json;
                }
            }
        })
    },
    initAccessOriginWeb_old:function () {
        $("#accessOriginWeb_old").myDataTables({
            columns:[
                {title:"排名",width:"20%",data:"order"},
                {title:"来源网站",width:"40%",data:"originDomain"},
                {title:"浏览量(PV)",width:"40%",data:"pv"}
            ],
            "ajax": {
                "url": "/weblog/detail/topDomain",
                "type": "POST",
                "data": function(){
                    var json=query.getQueryData();
                    json= deepCopy(json)
                    json.offset =0;
                    json.limit=5;
                    json.isNewVisitor=0;
                    return json;
                },
                "dataSrc":function (json) {
                    for(var i=0;i<json.length;i++){
                        json[i].order=i+1;
                    }
                    return json;
                }
            }
        })
    }

}

