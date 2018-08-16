/**
 * Created by wujiazhen on 2018/2/24.
 */
$(function () {
//初始化时间插件
    if($('.date').size()>0) {
        $('.date').datepicker({
            format: "yyyy-mm-dd"
        });
    }

    //绑定事件
    $(".content_nav > li").click(function () {
        $(this).parent().find(".active").removeClass("active");
        $(this).addClass("active");
        $(this).parent().siblings(".tab_active").removeClass("tab_active");
        $("#"+$(this).attr("data-tab")).addClass("tab_active");
        //初始化方法
        eval($(this).attr("data-load"));
    })


})
Array.prototype.contains = function ( needle ) {
    for (i in this) {
        if (this[i] == needle) return true;
    }
    return false;
}
var common={
    loadSummary:function (param) {
        if($("#summary").size()>0){
            $.ajax({
                url:"/weblog/detail/summary",
                data:param,
                success:function (data) {
                    if(!data){
                        $("#summary  .content").text("0");
                    }else {
                        for (key in data) {
                            $("#summary").find("#" + key).text(data[key] == null ? 0 : data[key])
                        }
                    }
                }
            })
        }
    },
    formatDate:function(date){
        var year = date.getFullYear();
        // 月+1是因为js中月份是按0开始的
        var month = date.getMonth() + 1;
        var day = date.getDate();
        if (day < 10) { // 如果日小于10，前面拼接0
            day = '0' + day;
        }
        if (month < 10) { // 如果月小于10，前面拼接0
            month = '0' + month;
        }
        return [year, month, day].join('-');
    },
     getDateAfter:function (num){
         var date =  new Date(), timestamp, newDate;
         timestamp = date.getTime();
         // 获取三天前的日期
         newDate = new Date(timestamp + num * 24 * 3600 * 1000);
         var year = newDate.getFullYear();
         // 月+1是因为js中月份是按0开始的
         var month = newDate.getMonth() + 1;
         var day = newDate.getDate();
         if (day < 10) { // 如果日小于10，前面拼接0
             day = '0' + day;
         }
         if (month < 10) { // 如果月小于10，前面拼接0
             month = '0' + month;
         }
         return [year, month, day].join('-');
     }
}