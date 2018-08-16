/**
 * Created by wujiazhen on 2018/2/24.
 */
$(function () {
    visitDomain.initDomainTable();
})


var visitDomain={
    initDomainTable:function () {
        var table=$("#domainTable").myDataTables({
            columns:[
                {title:"受访域名",width:"20%"},
                {title:"浏览量(PV)",width:"10%"},
                {title:"访客量(UV)",width:"10%"},
                {title:"IP数",width:"10%"},
                {title:"新访客数",width:"10%"},
                {title:"跳出率",width:"10%"},
                {title:"平均访问时长",width:"10%"},
                {title:"转化次数",width:"10%"}
            ],
            data:[
                ["https://web.umeng.com",1470,1729,192,1997,"00:38:00","25%",3],
                ["https://www.baidu.com",1470,1729,192,1997,"00:38:00","25%",3],
                ["https://www.4399.com",1470,1729,192,1997,"00:38:00","25%",3],
                ["汇总",1470,1729,192,1997,"00:38:00","25%",3]
            ]
        })
    }


}