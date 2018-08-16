<!DOCTYPE html>
<html lang="en">
<base id="basePath" href="${request.contextPath}" />
<head>
    <meta charset="utf-8">
    <title>数据分析</title>
    <link type="text/css" href="${request.contextPath}/js/bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
    <link type="text/css"  href="${request.contextPath}/js/dataTables/css/dataTables.sample.css" rel="stylesheet"/>
    <link type="text/css" href="${request.contextPath}/js/bootstrap/css/bootstrap-datepicker3.css"/>
    <link type="text/css" href="${request.contextPath}/css/chosen/chosen.css"/>
    <link type="text/css"  href="${request.contextPath}/css/right.css"  rel="stylesheet"/>
    <link type="text/css" href="${request.contextPath}/css/index.css" rel="stylesheet"/>
</head>

<body >
<div id="top" >
    <div  id="logo_title" >
        网站统计
    </div>
    <!--<div id="top_nav_div">
        <ul id="top_nav"  class="nolist">
            <li>
                <a class="active" href="#">报告</a>
            </li>
        </ul>
    </div>-->
</div>
<div id="center" >
    <div id="left" >
        <div id="left_title" >
            <span >功能导航</span>
            <span id="menu_icon" class="glyphicon glyphicon-menu-hamburger"></span>
        </div>
        <ul id="left_list" class="nolist scroll">
           <#-- <li>
                <a data-url="page/overview">
                    <span class="glyphicon glyphicon-globe function_icon"></span>
                    <span class="left_function"> 网站概况</span>
                </a>
            </li>-->
            <li>
                <a>
                    <span class="glyphicon glyphicon-blackboard function_icon"></span>
                    <span class="left_function"> 流量分析</span>
                </a>
                <ul  class="nolist sublist">
                    <li>
                        <a data-url="page/trend">
                        <span class="left_function" >趋势分析 </span>
                        </a>
                    </li>
               <#--     <li>
                        <a data-url="page/realVisitor">
                        <span class="left_function">当前在线 </span>
                        </a>
                    </li>-->
                </ul>
            </li>
            <li>
                <a>
                    <span class="glyphicon glyphicon-grain function_icon"></span>
                    <span class="left_function"> 来源分析</span>
                </a>
                <ul  class="nolist sublist">
                    <li>
                        <a data-url="page/originClassify">
                            <span class="left_function" >来源分类 </span>
                        </a>
                    </li>
                    <li>
                        <a data-url="page/originDomain">
                            <span class="left_function" >来源域名 </span>
                        </a>
                    </li>
                    <li>
                        <a data-url="page/originPage">
                            <span class="left_function" >来源页面 </span>
                        </a>
                    </li>
                    <li>
                        <a data-url="page/originSE">
                            <span class="left_function" >搜索引擎 </span>
                        </a>
                    </li>
     <#--               <li>
                        <a data-url="page/searchTerm">
                            <span class="left_function" >搜索词 </span>
                        </a>
                    </li>-->
                </ul>
            </li>
            <li>
                <a>
                    <span class="glyphicon glyphicon-comment function_icon"></span>
                    <span class="left_function"> 受访分析</span>
                </a>
                <ul  class="nolist sublist">
                    <li>
                        <a data-url="page/visit/visitPage">
                            <span class="left_function" >受访页面 </span>
                        </a>
                    </li>
                  <#--  <li>
                        <a data-url="page/visit/visitDomain">
                            <span class="left_function" >受访域名 </span>
                        </a>
                    </li>-->
                 <#--   <li>
                        <a data-url="page/visit/visitUpAndDown">
                            <span class="left_function" >受访升降榜 </span>
                        </a>
                    </li>-->
                <#--    <li>
                        <a data-url="page/originPage">
                            <span class="left_function" >访问轨迹 </span>
                        </a>
                    </li>-->
                </ul>
            </li>
        <#--    <li>
                <a>
                    <span class="glyphicon glyphicon-transfer function_icon"></span>
                    <span class="left_function"> 转化分析</span>
                </a>
                <ul  class="nolist sublist">
                    <li>
                        <a data-url="page/originPage">
                            <span class="left_function" >转化路径 </span>
                        </a>
                    </li>
                </ul>
            </li>-->
            <li>
                <a>
                    <span class="glyphicon glyphicon-user function_icon"></span>
                    <span class="left_function"> 访客分析</span>
                </a>
                <ul  class="nolist sublist">
                    <li>
                        <a data-url="page/visitor/oldAndNewVisitor">
                            <span class="left_function" >新老访客 </span>
                        </a>
                    </li>
                    <li>
                        <a data-url="page/visitor/territoryAnalyze">
                            <span class="left_function" >地域分析 </span>
                        </a>
                    </li>
                <#--    <li>
                        <a data-url="page/visitor/loyalty">
                            <span class="left_function" >忠诚度 </span>
                        </a>
                    </li>-->

                </ul>
            </li>
        </ul>
    </div>
    <div id="right"  >

    </div>
    <script type="text/javascript" src="${request.contextPath}/js/jquery/jquery-1.7.2.min.js"></script>
    <script type="text/javascript" src="${request.contextPath}/js/index.js" ></script>
</div>
</body>
</html>
