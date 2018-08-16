<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>新老访客</title>
</head>
<body>
<div class=" right_top_title" style="height: 120px">
    <div>新老访客（2018-04-28）</div>
    <div class="condition">
        <span class="condition_title" >时间：</span>
        <ul class="condition_nav" name="time">
            <li class="active" data-value="0">今天</li>
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
                <input type="text"  id="start_time" class="form-control condition_input">
            </div>
        </div>
        <div class="form-between">
            ~
        </div>
        <div class="form-condition" >
            <div class="input-group date">
                <span class="input-group-addon glyphicon glyphicon-calendar"></span>
                <input type="text" id="end_time" class="form-control condition_input" >
            </div>
        </div>
    </div>
    <div  class="condition">
        <div class="condition_sub">
            <span class="condition_title">来源：</span>
            <div class="input-group">
                <select id="origin" data-placeholder="选择来源..." class="chosen-select"  tabindex="2">
                    <option value="0">全部</option>
                    <option value="" hassubinfo="true">直接访问</option>
                    <option value="baidu" hassubinfo="true">百度</option>
                    <option value="g" hassubinfo="true">谷歌</option>
                    <option value="110000" hassubinfo="true">搜狗</option>
                    <option value="110000" hassubinfo="true">腾讯</option>
                    <option value="110000" hassubinfo="true">外部链接</option>
                </select>
            </div>
        </div>
    </div>
</div>
<div class="right_content" style="margin-top: 135px" >
    <div class="right_content_sub" style="width: 45%;clear: left ">
        <table style="width: 100%" >
            <tr>
                <td colspan="2" class="user_title new_user">新访客</td>
            </tr>
            <tr >
                <td class="user_icon new_user" style="color: #00b3ee" >
                    <span class="glyphicon glyphicon-user"></span>
                </td>
                <td  class="user_data new_user"  style="color: #00b3ee"  id="new_percent">
                    0.00%
                </td>
            </tr>
            <tr >
                <td class="user_table_title">浏览量：</td>
                <td class="user_table_data new_user" id="new_pv"></td>
            </tr>
            <tr >
                <td class="user_table_title">访客数：</td>
                <td class="user_table_data new_user" id="new_uv"></td>
            </tr>
            <tr >
                <td class="user_table_title">跳出率：</td>
                <td class="user_table_data new_user" id="new_jumpOutPercent"></td>
            </tr>
            <tr >
                <td class="user_table_title">平均访问时长：</td>
                <td class="user_table_data new_user" id="new_avgVisitTime_str"></td>
            </tr>
            <tr >
                <td class="user_table_title">平均访问页数：</td>
                <td class="user_table_data new_user" id="new_avgVisitpageNum"></td>
            </tr>
        </table>
        <div>
            <div class="new_title new_user">
                访问来源网站 TOP 5
            </div>
            <table id="accessOriginWeb" class="sample_table  first_bold border-null ">
            </table>
        </div>
        <div>
            <div class="new_title new_user">
                访问入口页 TOP 5
            </div>
            <table id="accessIntoWeb_new" class="sample_table  first_bold border-null ">
            </table>
        </div>
    </div>
    <div class="right_content_sub" style="width: 45%;float: right;">
        <table style="width: 100%">
            <tr>
                <td colspan="2" class="user_title old_user">旧访客</td>
            </tr>
            <tr >
                <td class="user_icon old_user"  >
                    <span class="glyphicon glyphicon-user"></span>
                </td>
                <td  class="user_data old_user"  id="old_percent">
                   0.00%
                </td>
            </tr>
            <tr >
                <td class="user_table_title">浏览量：</td>
                <td class="user_table_data old_user" id="old_pv"></td>
            </tr>
            <tr >
                <td class="user_table_title">访客数：</td>
                <td class="user_table_data old_user" id="old_uv"></td>
            </tr>
            <tr >
                <td class="user_table_title">跳出率：</td>
                <td class="user_table_data old_user" id="old_jumpOutPercent"></td>
            </tr>
            <tr >
                <td class="user_table_title">平均访问时长：</td>
                <td class="user_table_data old_user" id="old_avgVisitTime_str"></td>
            </tr>
            <tr >
                <td class="user_table_title">平均访问页数：</td>
                <td class="user_table_data old_user" id="old_avgVisitpageNum"></td>
            </tr>
        </table>
        <div>
            <div class="old_title old_user">
                访问来源网站 TOP 5
            </div>
            <table id="accessOriginWeb_old" class="sample_table  first_bold border-null ">
            </table>
        </div>
        <div>
            <div class="old_title old_user">
                访问入口页 TOP 5
            </div>
            <table id="accessIntoWeb_old" class="sample_table  first_bold border-null ">
            </table>
        </div>
    </div>
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
<script src="../js/visitor/oldAndNewVisitor.js"></script>
</body>
</html>