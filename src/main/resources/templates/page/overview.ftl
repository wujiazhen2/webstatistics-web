<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>数据分析</title>

</head>
<body>
<div class=" right_top_title">网站概况（2018-04-28）</div>
<div class="right_content" style="margin-top: 55px">
    <div class="right_content_title">流量详情</div>
    <div>
        <table id="todayFlux" class="bivariate_table first_bold" style="width: 90%"></table>
    </div>
    <div class="more">
        <span  id="todayFlux_more" class="glyphicon glyphicon-menu-down"></span>
    </div>
</div>
<div class="right_content_left" >
    <div class="right_content_title">趋势图</div>
    <div class="go"> <span class="glyphicon glyphicon-chevron-right"></span> </div>
    <div id="trendLine" class="echart_div" ></div>
</div>
<div class="right_content_right" >
    <div class="right_content_title">来源网站top10</div>
    <div class="go"> <span class="glyphicon glyphicon-chevron-right"></span> </div>
    <div>
        <table id="originWeb" class="bivariate_table first_bold border-null" style="width: 100%"></table>
    </div>
</div>
    <div class="right_content_left" >
        <div class="right_content_title">新老访客</div>
        <div class="go"> <span class="glyphicon glyphicon-chevron-right"></span> </div>
        <table id="oldVNew" class="bivariate_table " ></table>
    </div>
    <div class="right_content_right" >
        <div class="right_content_title">地域分析</div>
        <div class="go"> <span class="glyphicon glyphicon-chevron-right"></span> </div>
        <div id="flowMap" class="echart_div" ></div>
    </div>
</body>
<script type="text/javascript" src="../js/jquery/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="../js/dataTables/js/jquery.dataTables.js"></script>
<script type="text/javascript" src="../js/dataTables/js/dataTables.bootstrap.js"></script>
<script type="text/javascript" src="../js/dataTables/js/my.dataTables.js"></script>
<script type="text/javascript" src="../js/echarts/echarts.min.js"></script>
<script type="text/javascript" src="../js/echarts/china.js"></script>
<script src="../js/common.js"></script>
<script type="text/javascript" src="../js/overview.js" ></script>
</html>