/**
 * Created by wujiazhen on 2018/2/24.
 */
$(function () {
    visitUpAndDown.initUpAndDownTable();
})


var visitUpAndDown={
    initUpAndDownTable:function () {
        var table=$("#upAndDownTable").myDataTables({
            columns:[
                {title:"",width:"30%",data:"url"},
                {title:"2018-02-24",width:"15%",data:"pev"},
                {title:"2018-02-23",width:"15%",data:"next"},
                {title:"变化情况",width:"10%",data:"upDown"},
            ],
            data:[
                {url:"www.baidu.com",pev:1470,next:1729,upDown:"+10%"}
            ]
        })
    }


}