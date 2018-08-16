/**
 * Created by wujiazhen on 2018/2/25.
 */
$(function () {
    loyalty.initVisitDepthTable();
    loyalty.bulidVisitDepthBar();
    loyalty.initVisitDurationTable();
    loyalty.initLastVisitTimeTable();
})
var loyalty={
    initVisitDepthTable:function () {
      $("#visitDepthTable").myDataTables({
          columns:[
              {title:"访问深度",width:"20%"},
              {title:"访客数(UV)"},
              {title:"占比"},
              {title:"访问次数"},
              {title:"占比"},
          ],
          data:[
              ["1页",2314,"25%",1313,"24%"],
              ["2页",2314,"24%",1313,"24%"],
              ["3页",2314,"31%",1313,"24%"],
              ["4页",2314,"31%",1313,"24%"],
              ["5页",2314,"31%",1313,"24%"],
              ["6页",2314,"31%",1313,"24%"],
              ["7页",2314,"31%",1313,"24%"],
              ["8页",2314,"31%",1313,"24%"]

          ]
      })
    },
    bulidVisitDepthBar:function () {
        option = {
            color: ['#3398DB'],
            tooltip : {
                trigger: 'axis',
                axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                    type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
                }
            },
            grid: {
                left: '2%',
                right: '2%',
                bottom: '2%',
                containLabel: true
            },
            xAxis : [
                {
                    type : 'category',
                    data : ['1页', '2页', '3页', '4页', '5页', '6页', '7页','8页','9页','10页','10页以上'],
                    axisTick: {
                        alignWithLabel: true
                    }
                }
            ],
            yAxis : [
                {
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'访问次数',
                    type:'bar',
                    barWidth: '30%',
                    data:[10, 52, 200, 334, 390, 330, 220,133,122,13,131]
                }
            ]
        };
        var chart=echarts.init(document.getElementById("visitDepthBar"))
        chart.setOption(option);
    },
    initVisitDurationTable:function () {
        $("#visitDurationTable").myDataTables({
            columns:[
                {title:"访问时长"},
                {title:"访客数(UV)"},
                {title:"占比"},
                {title:"访问次数"},
                {title:"占比"},
            ],
            data:[
                ["1-3分钟",2314,"25%",1313,"24%"],
                ["3-10分钟",2314,"24%",1313,"24%"],
                ["10-30分钟",2314,"31%",1313,"24%"]
            ]
        })
    },
    bulidVisitDurationBar:function () {
        option = {
            color: ['#3398DB'],
            tooltip : {
                trigger: 'axis',
                axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                    type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
                }
            },
            grid: {
                left: '2%',
                right: '2%',
                bottom: '2%',
                containLabel: true
            },
            xAxis : [
                {
                    type : 'category',
                    data : ['1-3分钟', '3-10分钟', '10-30分钟'],
                    axisTick: {
                        alignWithLabel: true
                    }
                }
            ],
            yAxis : [
                {
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'访问时长',
                    type:'bar',
                    barWidth: '30px',
                    data:[10, 52, 200, 334, 390, 330, 220,133,122,13,131]
                }
            ]
        };
        var chart=echarts.init(document.getElementById("visitDurationBar"))
        chart.setOption(option);
    },
    initLastVisitTimeTable:function () {
        $("#lastVisitTimeTable").myDataTables({
            columns:[
                {title:"上次访问时间"},
                {title:"访客数(UV)"},
                {title:"占比"},
                {title:"访问次数"},
                {title:"占比"},
            ],
            data:[
                ["首次访问",2314,"25%",1313,"24%"],
                ["一天内",2314,"24%",1313,"24%"],
                ["一天前",2314,"31%",1313,"24%"],
                ["两天前",2314,"31%",1313,"24%"],
                ["3-7天前",2314,"31%",1313,"24%"],
                ["8-15天前",2314,"31%",1313,"24%"],
                ["15-30天前",2314,"31%",1313,"24%"],

            ]
        })
    },
    bulidLastVisitTimeBar:function () {
        option = {
            color: ['#3398DB'],
            tooltip : {
                trigger: 'axis',
                axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                    type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
                }
            },
            grid: {
                left: '2%',
                right: '2%',
                bottom: '2%',
                containLabel: true
            },
            xAxis : [
                {
                    type : 'category',
                    data : ['首次访问', '一天内', '一天前', '两天前', '3-7天前', '8-15天前', '15-30天前'],
                    axisTick: {
                        alignWithLabel: true
                    }
                }
            ],
            yAxis : [
                {
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'访问次数',
                    type:'bar',
                    barWidth: '30px',
                    data:[10, 52, 200, 334, 390, 330, 220,133,122,13,131]
                }
            ]
        };
        var chart=echarts.init(document.getElementById("lastVisitTimeBar"))
        chart.setOption(option);
    }



}

