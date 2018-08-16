<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>受访域名</title>
</head>
<body>
<div class=" right_top_title" style="height: 120px">
    <div>受访域名（2018-04-28）</div>
    <div class="condition">
        <span class="condition_title">时间：</span>
        <ul class="condition_nav">
            <li class="active">今天</li>
            <li >昨天</li>
            <li >最近7天</li>
            <li >最近30天</li>
        </ul>
        <div>
            <!--  <input  type="text" class="date condition_input" value="2014-11-11">-->
        </div>
        <div class="form-condition" >
            <div class="input-group date">
                <span class="input-group-addon glyphicon glyphicon-calendar"></span>
                <input type="text" class="form-control condition_input" value="2014-11-11">
            </div>
        </div>
        <div class="form-between">
            ~
        </div>
        <div class="form-condition" >
            <div class="input-group date">
                <span class="input-group-addon glyphicon glyphicon-calendar"></span>
                <input type="text" class="form-control condition_input" value="2014-11-11">
            </div>
        </div>
    </div>
    <div  class="condition">
        <div class="condition_sub">
            <span class="condition_title">来源：</span>
            <div class="input-group">
                <select data-placeholder="选择来源..." class="chosen-select"  tabindex="2">
                    <option value="">全部</option>
                    <option value="110000" hassubinfo="true">直接访问</option>
                    <option value="110000" hassubinfo="true">百度</option>
                    <option value="110000" hassubinfo="true">谷歌</option>
                    <option value="110000" hassubinfo="true">搜狗</option>
                    <option value="110000" hassubinfo="true">腾讯</option>
                    <option value="110000" hassubinfo="true">外部链接</option>
                </select>
            </div>
        </div>
        <div class="condition_sub">
        <span class="condition_title">访客：</span>
            <ul class="condition_nav">
                <li class="active">全部</li>
                <li >新访客</li>
                <li >老访客</li>
            </ul>
        </div>
    </div>
</div>
<div class="right_content padding_zero" style="margin-top: 135px" >
        <div class="summary" style="margin-bottom: 0px">
            <div style="width: 16%">
                <div>浏览量(PV)</div>
                <div class="content">24,258</div>
            </div>
            <div style="width: 16%">
                <div>访客数(UV)</div>
                <div class="content">28,88</div>
            </div >
            <div style="width: 16%">
                <div>IP数</div>
                <div class="content">24,258</div>
            </div>
            <div style="width: 16%">
                <div>新访客数</div>
                <div class="content">24</div>
            </div>
            <div style="width: 16%">
                <div>跳出率</div>
                <div class="content">25.69%</div>
            </div>
            <div style="width: 16%">
                <div>平均访问时长</div>
                <div class="content">00:07:54</div>
            </div>
        </div>
        <table id="domainTable" class="table table-striped table-bordered table-hover my_table"></table>
</div>
<script type="text/javascript" src="../js/jquery/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="../js/dataTables/js/jquery.dataTables.js"></script>
<script type="text/javascript" src="../js/dataTables/js/dataTables.bootstrap.js"></script>
<script src="../js/bootstrap/js/bootstrap-datepicker.min.js"></script>
<script src="../js/chosen/chosen.jquery.js"></script>
<script type="text/javascript" src="../js/dataTables/js/my.dataTables.js"></script>
<script type="text/javascript" src="../js/echarts/echarts.min.js"></script>
<script src="../js/common.js"></script>
<script src="../js/visit/visitDomain.js"></script>
</body>
</html>