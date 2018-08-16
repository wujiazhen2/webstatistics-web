<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>忠诚度</title>
</head>
<body>
<div class=" right_top_title" style="height: 120px">
    <div>忠诚度</div>
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
</div>
<div class="right_content_with_nav" style="margin-top: 135px" >
    <ul class="content_nav">
        <li class="active" data-tab="visitDepth">
            访问深度
        </li>
        <li data-tab="visitDuration" data-load="loyalty.bulidVisitDurationBar()">
            访问时长
        </li>
        <li data-tab="lastVisitTime" data-load="loyalty.bulidLastVisitTimeBar()">
            上传访问时间
        </li>
    </ul>
    <div class="tab tab_active" id="visitDepth">
        <div id="visitDepthBar" class="echart_div"></div>
        <table id="visitDepthTable" class="table table-striped table-bordered table-hover my_table"></table>
    </div>
    <div class="tab " id="visitDuration">
        <div id="visitDurationBar" class="echart_div"></div>
        <table id="visitDurationTable" class="table table-striped table-bordered table-hover my_table"></table>
    </div>
    <div class="tab " id="lastVisitTime">
        <div id="lastVisitTimeBar" class="echart_div"></div>
        <table id="lastVisitTimeTable" class="table table-striped table-bordered table-hover my_table"></table>
    </div>
</div>
<script type="text/javascript" src="../js/jquery/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="../js/dataTables/js/jquery.dataTables.js"></script>
<script type="text/javascript" src="../js/dataTables/js/dataTables.bootstrap.js"></script>
<script src="../js/bootstrap/js/bootstrap-datepicker.min.js"></script>
<script src="../js/chosen/chosen.jquery.js"></script>
<script type="text/javascript" src="../js/dataTables/js/my.dataTables.js"></script>
<script type="text/javascript" src="../js/echarts/echarts.min.js"></script>
<script type="text/javascript" src="../js/echarts/china.js"></script>
<script src="../js/common.js"></script>
<script src="../js/visitor/loyalty.js"></script>
</body>
</html>