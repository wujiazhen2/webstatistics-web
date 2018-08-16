/**
 * Created by wujiazhen on 2018/2/25.
 */
$(function () {
    //设置查询初始条件
    query.queryData.start_time="2018-04-28"
    query.queryFunction=territoryAnalyze.reloadData;
    common.loadSummary(query.queryData);
    territoryAnalyze.bulidLlowMap();
    territoryAnalyze.initTerritoryTable();
    territoryAnalyze.initTerritoryInfoTable();
})
var territoryAnalyze={
    mapChart:null,
    reloadData:function () {
        if(territoryAnalyze.mapChart)
            territoryAnalyze.mapChart.clear();
        territoryAnalyze.bulidLlowMap();
        $("#territoryInfoTable").DataTable().ajax.reload();
        $("#territoryTable").DataTable().ajax.reload();
        common.loadSummary(query.queryData);
    },
    initTerritoryInfoTable:function () {
      $("#territoryInfoTable").myDataTables({
          columns:[
              {title:"省份",width:"20%",data:"terrioryName"},
              {title:"浏览量(PV)",data:"pv"},
              {title:"访客数(UV)",data:"uv"},
              {title:"IP数",data:"ipNum"},
              {title:"新访客数",data:"newVisitor"},
              {title:"平均访问时长",data:"avgVisitTime_str"}
          ],
          /*"processing": true, //打开数据加载时的等待效果
          "pagingType": "full_numbers",
          "ajax": {
              "url": "/weblog/terriory/list",
              "type": "POST",
              "data": query.getQueryData,
              "dataSrc":function (json) {
                  return json;
              }
          },*/
          data:[
            ["浙江	",2314,1314,1313,134,"24%","00:25:00"],
            ["广东",2314,1314,1313,134,"24%","00:25:00"],
            ["江苏",2314,1314,1313,134,"24%","00:25:00"],
            ["北京"	,2314,1314,1313,134,"24%","00:25:00"],
            ["上海",2314,1314,1313,134,"24%","00:25:00"],
            ["山东",2314,1314,1313,134,"24%","00:25:00"],
            ["广西",2314,1314,1313,134,"24%","00:25:00"],
            ["安徽",2314,1314,1313,134,"24%","00:25:00"],
            ["浙江	",2314,1314,1313,134,"24%","00:25:00"],
            ["广东",2314,1314,1313,134,"24%","00:25:00"],
            ["江苏",2314,1314,1313,134,"24%","00:25:00"],
            ["北京"	,2314,1314,1313,134,"24%","00:25:00"],
            ["上海",2314,1314,1313,134,"24%","00:25:00"],
            ["山东",2314,1314,1313,134,"24%","00:25:00"],
            ["广西",2314,1314,1313,134,"24%","00:25:00"],
            ["安徽",2314,1314,1313,134,"24%","00:25:00"],
        ]
      })
    },
    initTerritoryTable:function () {
        $("#territoryTable").myDataTables({
            columns:[
                {title:"省份",width:"40%",data:"territory_name"},
                {title:"浏览量(PV)",width:"35%",data:"pv"},
                {title:"占比",width:"15%",data:"percent"}
            ],
            /*"processing": true, //打开数据加载时的等待效果
            "pagingType": "full_numbers",
            "ajax": {
                "url": "/weblog/terriory/list",
                "type": "POST",
                "data": query.getQueryData,
                "dataSrc":function (json) {
                    return json;
                }
            }*/
            data:[
                {territory_name:"浙江",pv:17341,percent:"86.32%"},
                {territory_name:"广东",pv:	2045 ,percent:"7.37%"},
                {territory_name:"江苏",pv:	797,percent:"2.87%"},
                {territory_name:"北京"	,pv:325,percent:"1.17%"},
                {territory_name:"上海",pv:202, percent:"0.73%"},
                {territory_name:"山东",	pv:2045 ,percent:"7.37%"},
                {territory_name:"广西",	pv:797,percent:"2.87%"},
                {territory_name:"安徽"	,pv:325,percent:"1.17%"},
                {territory_name:"湖北",pv:202, percent:"0.73%"},
                {territory_name:"四川"	,pv:325,percent:"1.17%"},
                {territory_name:"河北",pv:202, percent:"0.73%"},
                {territory_name:"广西",	pv:797,percent:"2.87%"},
                {territory_name:"安徽"	,pv:325,percent:"1.17%"},
                {territory_name:"湖北",pv:202, percent:"0.73%"},
                {territory_name:"四川"	,pv:325,percent:"1.17%"},
                {territory_name:"河北",pv:202, percent:"0.73%"}
            ]
        })
    },
    bulidLlowMap:function () {

        function randomValue() {
            return Math.round(Math.random()*1000);
        }

        option = {
            tooltip: {},
            visualMap: {
                min: 0,
                max: 2000,
                text:['High','Low'],
                realtime: false,
                calculable: true,
                inRange: {
                    color: ['#e0ffff', '#006edd']
                }
            },
            geo: {
                map: 'china',
                roam: true,
                label: {
                    normal: {
                        show: true,
                        textStyle: {
                            color: 'rgba(0,0,0,0.4)'
                        }
                    }
                },
                itemStyle: {
                    normal:{
                        borderColor: 'rgba(0, 0, 0, 0.2)'
                    },
                    emphasis:{
                        areaColor: null,
                        shadowOffsetX: 0,
                        shadowOffsetY: 0,
                        shadowBlur: 20,
                        borderWidth: 0,
                        shadowColor: 'rgba(0, 0, 0, 0.5)'
                    }
                }
            },
            series : [
                {
                    name: '浏览量',
                    type: 'map',
                    roam: true,
                    coordinateSystem: 'geo',
                    geoIndex: 0,
                    // tooltip: {show: false},
                    label: {
                        normal: {
                            formatter: '{b}',
                            position: 'right',
                            show: false
                        },
                        emphasis: {
                            show: true
                        }
                    },
                    itemStyle: {
                        normal: {
                            color: '#F06C00'
                        }
                    },
                    data:[
                        {name: '北京', value: randomValue()},
                        {name: '天津', value: randomValue()},
                        {name: '上海', value: randomValue()},
                        {name: '重庆', value: randomValue()},
                        {name: '河北', value: randomValue()},
                        {name: '河南', value: randomValue()},
                        {name: '云南', value: randomValue()},
                        {name: '辽宁', value: randomValue()},
                        {name: '黑龙江', value: randomValue()},
                        {name: '湖南', value: randomValue()},
                        {name: '安徽', value: randomValue()},
                        {name: '山东', value: randomValue()},
                        {name: '新疆', value: randomValue()},
                        {name: '江苏', value: randomValue()},
                        {name: '浙江', value: randomValue()},
                        {name: '江西', value: randomValue()},
                        {name: '湖北', value: randomValue()},
                        {name: '广西', value: randomValue()},
                        {name: '甘肃', value: randomValue()},
                        {name: '山西', value: randomValue()},
                        {name: '内蒙古', value: randomValue()},
                        {name: '陕西', value: randomValue()},
                        {name: '吉林', value: randomValue()},
                        {name: '福建', value: randomValue()},
                        {name: '贵州', value: randomValue()},
                        {name: '广东', value: randomValue()},
                        {name: '青海', value: randomValue()},
                        {name: '西藏', value: randomValue()},
                        {name: '四川', value: randomValue()},
                        {name: '宁夏', value: randomValue()},
                        {name: '海南', value: randomValue()},
                        {name: '台湾', value: randomValue()},
                        {name: '香港', value: randomValue()},
                        {name: '澳门', value: randomValue()}
                    ]
                }
            ]
        };
        var chart=echarts.init(document.getElementById("flowMap"))
        chart.setOption(option)
    }


}

