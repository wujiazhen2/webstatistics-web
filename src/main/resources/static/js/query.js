$(function () {
    $(".condition_nav > li ").click(function () {
        $(this).parent().find(".active").removeClass("active");
        $(this).addClass("active");
        var u=$(this).attr("data-value")
        //查询条件设置
        var key= $(this).parent().attr("name")
        switch (key) {
            case "time":
                time = common.getDateAfter(u);
                if (u == '0' || u=='-1') {
                    query.queryData.start_time = time;
                    query.queryData.end_time = null;
                } else {
                    query.queryData.start_time = time;
                    query.queryData.end_time = common.getDateAfter(0);
                }
                break;
            case "isNewVisitor":
                query.queryData.isNewVisitor=u;
                break;

        }
        query.queryFunction()
    })

    $("#origin").change(function () {
        if(this.value=='0') {
            delete query.queryData.originDomain;
        }else {
            query.queryData.originDomain = this.value
        }
        query.queryFunction()
    })

    $("#end_time").change(function () {
        query.queryData.start_time=$("#start_time").val();
        query.queryData.end_time=this.value;
        query.queryFunction()
    })
})
var query={
    queryData:{

    },
    getQueryData:function(){
        return query.queryData;
    },
    getPageQueryCondition:function (){
        var json=query.getQueryData();
        json= deepCopy(json)
        json.offset =0;
        json.limit=5;
        console.log(json)
        return json;
    }
}
