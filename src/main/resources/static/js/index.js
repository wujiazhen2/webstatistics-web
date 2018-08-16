/**
 * Created by wujiazhen on 2017/9/29.
 */

$(function(){
    index.initStyle();
    index.loadRight();
    //绑定事件
    $("#left_list li a").click(index.event.secondaryMenuToggle)
})
var index={
    event:{
        secondaryMenuToggle:function () {
            if($(this).siblings("ul").size()>0) {
                $(this).siblings("ul").toggle("normal");
            }else{
                index.loadRight($(this).attr("data-url"));
            }
        }
    },
    initStyle:function(){
        $("body").css("width",screen.width);
        /**
         * 设置高度
         */
        $("#left_list").css("height",window.innerHeight-$("#top").height()-$("#left_title").height());
        $("#right").css("height",window.innerHeight-$("#top").height());
        $("#right").css("width",window.innerWidth-$("#left").width())
    },
    loadRight:function (url) {
        $("#right").load(url,{},function () {
        })
    }
}


