<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>搜索词</title>
</head>
<body>
<div class=" right_top_title" style="height: 120px">
    <div>搜索词（2018-04-28）</div>
    <div class="condition">
        <span class="condition_title">时间：</span>
        <ul class="condition_nav" name="time">
            <li class="active">今天</li>
            <li data-value="-1" >昨天</li>
            <li data-value="-7">最近7天</li>
            <li data-value="-30">最近30天</li>
        </ul>
        <div>
            <!--  <input  type="text" class="date condition_input" value="2014-11-11">-->
        </div>
        <div class="form-condition" >
            <div class="input-group date">
                <span class="input-group-addon glyphicon glyphicon-calendar"></span>
                <input type="text" id="start_time" class="form-control condition_input" value="">
            </div>
        </div>
        <div class="form-between">
            ~
        </div>
        <div class="form-condition" >
            <div class="input-group date">
                <span class="input-group-addon glyphicon glyphicon-calendar"></span>
                <input type="text" id="end_time" class="form-control condition_input" value="">
            </div>
        </div>
    </div>
    <div  class="condition">
        <span class="condition_title">访客：</span>
        <ul class="condition_nav" name="isNewVisitor">
            <li class="active">全部</li>
            <li data-value="1">新访客</li>
            <li data-value="0">老访客</li>
        </ul>
    </div>
</div>
<div class="right_content" style="margin-top: 135px" >
    <div class="summary" id="summary">
        <div style="width: 16%">
            <div>浏览量(PV)</div>
            <div class="content" id="pv"></div>
        </div>
        <div style="width: 16%">
            <div>访客数(UV)</div>
            <div class="content" id="uv"></div>
        </div >
        <div style="width: 16%">
            <div>IP数</div>
            <div class="content" id="ipNum"></div>
        </div>
        <div style="width: 16%">
            <div>新访客数</div>
            <div class="content" id="newVisitor"></div>
        </div>
        <div style="width: 16%">
            <div>跳出率</div>
            <div class="content" id="jumpOutPercent"></div>
        </div>
        <div style="width: 16%">
            <div>平均访问时长</div>
            <div class="content" id="avgVisitTime_str"></div>
        </div>
    </div>
<div class="right_content" style="border: none">
    <table id="searchTermTable" class="table table-striped table-bordered table-hover my_table"></table>
</div>
<script type="text/javascript" src="../js/jquery/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="../js/dataTables/js/jquery.dataTables.js"></script>
<script type="text/javascript" src="../js/dataTables/js/dataTables.bootstrap.js"></script>
<script src="../js/bootstrap/js/bootstrap-datepicker.min.js"></script>
<script src="../js/chosen/chosen.jquery.js"></script>
<script type="text/javascript" src="../js/dataTables/js/my.dataTables.js"></script>
<script type="text/javascript" src="../js/echarts/echarts.min.js"></script>
<script src="../js/common.js"></script>
    <script src="../js/query.js"></script>
<script src="../js/searchTerm.js"></script>
</body>
</html>