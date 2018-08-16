<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>受访升降榜</title>
</head>
<body>
<div class=" right_top_title" style="height: 120px">
    <div>受访升降榜（2018-04-28）</div>
        <div class="condition">
            <span class="condition_title">时间：</span>
            <div class="form-condition" style="margin-left: 0px">
                <div class="input-group date">
                    <span class="input-group-addon glyphicon glyphicon-calendar"></span>
                    <input type="text" class="form-control condition_input" value="2014-11-11">
                </div>
            </div>
            <div class="form-between">
                对比
            </div>
            <div class="form-condition" >
                <div class="input-group date">
                    <span class="input-group-addon glyphicon glyphicon-calendar"></span>
                    <input type="text" class="form-control condition_input" value="2014-11-12">
                </div>
            </div>
        </div>
        <div class="condition">
            <span class="condition_title">指标：</span>
            <div class="input-group">
                <select data-placeholder="选择指标..." class="chosen-select"  tabindex="2">
                    <option value="110000" hassubinfo="true">浏览量(PV)</option>
                    <option value="110000" hassubinfo="true">访客数(UV)</option>
                    <option value="110000" hassubinfo="true">IP数</option>
                    <option value="110000" hassubinfo="true">新访客数</option>
                    <option value="110000" hassubinfo="true">跳出率</option>
                    <option value="110000" hassubinfo="true">平均访问时长</option>
                </select>
            </div>
        </div>
</div>
<div class="right_content padding_zero" style="margin-top: 135px" >
        <ul class="content_nav">
            <li class="active" data-tab="basePage">
                浏览量(PV)
            </li>
        </ul>
        <div class="summary" style="margin-bottom: 0px">
            <div style="width: 25%">
                <div>&nbsp;</div>
                <div class="content">浏览量(PV)</div>
            </div>
            <div style="width: 25%">
                <div>2014-11-11</div>
                <div class="content">24,258</div>
            </div>
            <div style="width: 25%">
                <div>2014-11-12</div>
                <div class="content">28,88</div>
            </div >
            <div style="width: 25%">
                <div>变化情况</div>
                <div class="content" style="color: red">10%<sup>↑</sup></div>
            </div >
        </div>
        <table id="upAndDownTable" class="table table-striped table-bordered table-hover my_table"></table>
</div>
<script type="text/javascript" src="../js/jquery/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="../js/dataTables/js/jquery.dataTables.js"></script>
<script type="text/javascript" src="../js/dataTables/js/dataTables.bootstrap.js"></script>
<script src="../js/bootstrap/js/bootstrap-datepicker.min.js"></script>
<script src="../js/chosen/chosen.jquery.js"></script>
<script type="text/javascript" src="../js/dataTables/js/my.dataTables.js"></script>
<script type="text/javascript" src="../js/echarts/echarts.min.js"></script>
<script src="../js/common.js"></script>
<script src="../js/visit/visitUpAndDown.js"></script>
</body>
</html>