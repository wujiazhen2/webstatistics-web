/**
 * Created by wujiazhen on 2018/2/8.
 */
$.fn.dataTable.ext.errMode = 'none';
$.fn.myDataTables=function (json) {
    //对 opt进行深复制
    var opt= deepCopy(json);
    if(!opt.searching)
        opt.searching= false;
    if(!opt.paging)
        opt.paging=false;
    if(!opt.lengthChange)
        opt.lengthChange=false;
    if(!opt.info)
        opt.info=false;
    if(!opt.ordering)
        opt.ordering=false;

    var $obj=$(this);
    if(opt.ajax){
        return  $obj.DataTable(opt);
    }
    else {
        if(opt.data) {
            opt.data = mapToArray(opt.columns, opt.data);
            if (opt.rows) {
                opt.data = rowHead(opt.rows, opt.data);
            }
        }
        return  $obj.DataTable(opt);
    }
}
var deepCopy = function(obj) {
    var newO = {};
    if ( Array.isArray(obj)) {
        newO = [];
    }
    if(obj==null){
        newO=null;
    }
    for ( var key in obj) {
        var val = obj[key];
        newO[key] = typeof val === 'object' ? arguments.callee(val) : val;
    }
    return newO;
}
function getDataTableObj(tableId){
    return  $("#"+tableId).DataTable();
}
function mapToArray(col,data){
    var arr = new Array();
    var subArr=null;
    var temp=null;
    var onClick=null;
    for(var j=0;j<data.length;j++){
        subArr=new Array();
        for(var i=0;i<col.length;i++){
            if(col[i].type=='lineNum'){
                subArr.push(j+1);
                continue;
            }
            if(!col[i].data)
                continue;
            temp=data[j][col[i].data]!=undefined?data[j][col[i].data]:(col[i].defaultValue!=undefined?col[i].defaultValue:'');
            if(col[i].onClick){
                onClick=transferUrl(col[i].onClick,data[j]);
                temp="<a href='javaScript:void(0)' onclick="+onClick+">"+temp+"</a>"
            }
            subArr.push(temp)
        }
        arr.push(subArr);
    }
    for(var i=0;i<col.length;i++){
        delete col[i].data
    }
    return arr;
}
function transferUrl(url,data){
    var arr=url.match(/{\w+}/g)
    var key=null;
    if(arr) {
        for (var i = 0; i < arr.length; i++) {
            key = arr[i].substring(1, arr[i].length - 1);
            url = url.replace(arr[i], data[key]);
        }
    }
    return url;
}
function sumRowWithHead(opt,data) {
    var arr =  {};
    var obj =null;
    for(key in data) {
        obj = new Array();
        pushAll(obj,data[key]);
        obj.push(sum(data[key]));
        arr[key]=obj;
    }
    return arr;
}
function sumRow(opt,data) {
    var arr = new Array();
    var obj =null;
    if(opt.columns[opt.columns.length-1].type='sum'){
        for(key in data) {
            obj = new Array();
            obj.push(data[key]);
            obj.push(sum(data[key]));
            arr.push(obj)
        }
    }
    return arr;
}
function sum(arr){
    var sum=0;
    for(var i in arr){
        sum+=arr[i]
    }
    return sum;
}
//将行头 放在值的最前面。
function rowHead(rows,data){
    var arr = new Array();
    var obj =null;

    for(var key in rows){
        obj=new Array();
        obj.push(rows[key])

        if(data && data[key]) {
            pushAll(obj, data[key]);
        }
        arr.push(obj);
    }
    return arr;
}
function pushAll(arr1,arr2){
    for(var i=0;i<arr2.length;i++){
        arr1.push(arr2[i]);
    }
}
