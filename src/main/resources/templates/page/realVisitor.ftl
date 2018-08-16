<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<div class=" right_top_title" >
    当前在线
</div>
<div class="right_content" style="margin-top: 55px">
    <div class="right_content_title" style="clear: both">最近30分钟访问情况</div>
    <div class="right_content_sub" style="width: 30%;margin-top: 70px;padding:0px 20px;clear: left ">
       <div style="color: #00b3ee;">
        <span class="span_title">在线访客</span>
        <span class="span_content">14</span>
      </div>
        <div style="color: orange">
            <span class="span_title" >浏览次数</span>
            <span class="span_content">1434</span>
        </div>
        <div style="color: #81c13d">
            <span class="span_title">IP数</span>
            <span class="span_content">134</span>
        </div>
        <div style="color: #c1244b">
            <span class="span_title">新访客</span>
            <span class="span_content">134</span>
        </div>
    </div>
    <div class="right_content_sub" style="width: 70%;float: right;">
        <div id="visitorCondition" class="echart_div" style="height: 300px"></div>
    </div>
</div>
<div class="right_content" >
    <div class="right_content_title">访问明细</div>
    <table id="visitInfo" class="table table-striped table-bordered table-hover " ></table>
</div>
</body>
<script type="text/javascript" src="../js/jquery/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="../js/dataTables/js/jquery.dataTables.js"></script>
<script type="text/javascript" src="../js/dataTables/js/dataTables.bootstrap.js"></script>
<script src="../js/bootstrap/js/bootstrap-datepicker.min.js"></script>
<script src="../js/chosen/chosen.jquery.js"></script>
<script type="text/javascript" src="../js/dataTables/js/my.dataTables.js"></script>
<script type="text/javascript" src="../js/echarts/echarts.min.js"></script>
<script src="../js/common.js"></script>
<script src="../js/realVisitor.js"></script>
</html>