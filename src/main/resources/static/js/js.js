$(window).load(function () {
    $(".loading").fadeOut()
})
$(function () {
    const BaseUrl = 'http://localhost:1978';
    echarts_1();
    echarts_2();
    echarts_3();
    echarts_3_2()
    echarts_3_3()
    echarts_3_4()
    echarts_3_5()
    echarts_4();
    echarts_5();
    zb1();
    zb2();
    zb3();
    zb4();
    zb5();
    zb6();

    // 区域用户数
    function echarts_1() {
        const url = BaseUrl + '/api/bg/findUserGroupByArea';

        $.ajax({
            type: 'get',
            url: url,
            dataType: 'json',
            success: function (data) {
                const lenged = [];
                for (let i = 0; i < data.length; i++) {
                    lenged.push(data[i].name);
                }
                // 基于准备好的dom，初始化echarts实例
                const myChart = echarts.init(document.getElementById('echart1'));
                let option = {
                    tooltip: {
                        trigger: 'item',
                        formatter: "{b} : {c} ({d}%)"
                    },
                    legend: {
                        right: 0,
                        top: 30,
                        height: 160,
                        itemWidth: 10,
                        itemHeight: 10,
                        itemGap: 10,
                        textStyle: {
                            color: 'rgba(255,255,255,.6)',
                            fontSize: 12
                        },
                        orient: 'vertical',
                        data: lenged
                        //['区域1', '区域2', '区域3', '区域4', '区域5']
                    },
                    calculable: true,
                    series: [
                        {
                            name: ' ',
                            color: ['#62c98d', '#2f89cf', '#4cb9cf', '#53b666', '#62c98d', '#205acf', '#c9c862', '#c98b62', '#c962b9', '#7562c9', '#c96262', '#c25775', '#00b7be'],
                            type: 'pie',
                            radius: [30, 70],
                            center: ['35%', '50%'],
                            roseType: 'radius',
                            label: {
                                normal: {
                                    show: true
                                },
                                emphasis: {
                                    show: true
                                }
                            },

                            lableLine: {
                                normal: {
                                    show: true
                                },
                                emphasis: {
                                    show: true
                                }
                            },

                            data: data

                        },
                    ]
                };

                // 使用刚指定的配置项和数据显示图表。
                myChart.setOption(option);
                window.addEventListener("resize", function () {
                    myChart.resize();
                });
            }
        });

    }


    /**
     * 区域用水前两名
     */
    function echarts_2() {
        const url = BaseUrl + '/api/bg/findWaterAndCostByArea';

        $.ajax({
            type: 'get',
            url: url,
            dataType: 'json',
            success: function (data) {
                const lendend = [];
                for (let i = 0; i < data.length; i++) {
                    lendend.push(data[i].name);
                }
                // 基于准备好的dom，初始化echarts实例
                const myChart = echarts.init(document.getElementById('echart2'));

                let option = {
                    tooltip: {
                        trigger: 'item',
                        formatter: "{b} : {c} ({d}%)"
                    },
                    legend: {

                        top: '15%',
                        data: lendend,
                        //x轴，
                        //['区域3', '区域4', '区域1', '区域5', '区域2'],
                        icon: 'circle',
                        textStyle: {
                            color: 'rgba(255,255,255,.6)',
                        }
                    },
                    calculable: true,
                    series: [{
                        name: '',
                        color: ['#62c98d', '#2f89cf', '#4cb9cf', '#c9c862', '#205acf', '#205acf', '#c9c862', '#c98b62', '#c962b9', '#c96262'],
                        type: 'pie',
                        //起始角度，支持范围[0, 360]
                        startAngle: 0,
                        //饼图的半径，数组的第一项是内半径，第二项是外半径
                        radius: [51, 100],
                        //支持设置成百分比，设置成百分比时第一项是相对于容器宽度，第二项是相对于容器高度
                        center: ['50%', '45%'],

                        //是否展示成南丁格尔图，通过半径区分数据大小。可选择两种模式：
                        // 'radius' 面积展现数据的百分比，半径展现数据的大小。
                        //  'area' 所有扇区面积相同，仅通过半径展现数据大小
                        roseType: 'radius',
                        //是否启用防止标签重叠策略，默认开启，圆环图这个例子中需要强制所有标签放在中心位置，可以将该值设为 false。
                        avoidLabelOverlap: false,
                        label: {
                            normal: {
                                show: true,
                                //  formatter: '{c}辆'
                            },
                            emphasis: {
                                show: true
                            }
                        },
                        labelLine: {
                            normal: {
                                show: true,
                                length2: 1,
                            },
                            emphasis: {
                                show: true
                            }
                        },
                        data: data

                        // [
                        // {value: 1078, name: '区域3',},
                        // {value: 642, name: '区域4',},
                        // {value: 508, name: '区域1',},
                        // {value: 360, name: '区域5',},
                        // {value: 190, name: '区域2',},
                        // {value: 0, name: "", label: {show: false}, labelLine: {show: false}},
                        // {value: 0, name: "", label: {show: false}, labelLine: {show: false}},
                        // {value: 0, name: "", label: {show: false}, labelLine: {show: false}},
                        // {value: 0, name: "", label: {show: false}, labelLine: {show: false}},
                        // {value: 0, name: "", label: {show: false}, labelLine: {show: false}},
                        // ]
                    }]
                };

                // 使用刚指定的配置项和数据显示图表。
                myChart.setOption(option);
                window.addEventListener("resize", function () {
                    myChart.resize();
                });
            }
        });


    }

    /**
     * 设备增量图表
     */
    function echarts_3() {
        // 集中器每月数据
        const url = BaseUrl + '/api/bg/findDeviceByMonth';

        $.ajax({
            type: 'get',
            url: url,
            dataType: 'json',
            success: function (data) {
                const legend = Object.keys(data);
                const myData = new Array();
                const xAxis = Array.from({length: 12}, (item, index) => (index + 1) + "月")
                const createData = function (month, key) {
                    return {
                        "month": month,
                        "count": 0,
                        "device": key,
                        "growth_rate": 0.00,
                        "growth_count": 0
                    }
                };
                // 根據器材數目進行數組的初始化
                for (let i = 0; i < legend.length; i++) {
                    myData[i] = Array.from({length: 12}, (item, index) => createData((index + 1), legend[i]));
                }
                for (let i = 0; i < legend.length; i++) {
                    for (let j = 0; j < data[legend[i]].length; j++) {
                        myData[i][data[legend[i]][j].month - 1] = data[legend[i]][j];
                    }
                }
                // 基于准备好的dom，初始化echarts实例
                const myChart = echarts.init(document.getElementById('echart3'));
                let option = {
                    tooltip: {
                        trigger: 'axis',
                        axisPointer: {
                            lineStyle: {
                                color: '#57617B'
                            }
                        }
                    },
                    legend: {

                        //icon: 'vertical',
                        data: legend,
                        //['阀控器', '中继器', '集中器'],
                        //align: 'center',
                        // right: '35%',
                        top: '0',
                        textStyle: {
                            color: "#fff"
                        },
                        // itemWidth: 15,
                        // itemHeight: 15,
                        itemGap: 20,
                    },
                    grid: {
                        left: '0',
                        right: '20',
                        top: '10',
                        bottom: '20',
                        containLabel: true
                    },
                    xAxis: [{
                        type: 'category',
                        boundaryGap: false,
                        axisLabel: {
                            show: true,
                            textStyle: {
                                color: 'rgba(255,255,255,.6)'
                            }
                        },
                        axisLine: {
                            lineStyle: {
                                color: 'rgba(255,255,255,.1)'
                            }
                        },
                        data: xAxis,
                        //['1月', '2月', '3月', '4月', '5月', '6月', '7月', '8月', '9月', '10月', '11月', '12月']
                    }, {}],
                    yAxis: [{
                        axisLabel: {
                            show: true,
                            textStyle: {
                                color: 'rgba(255,255,255,.6)'
                            }
                        },
                        axisLine: {
                            lineStyle: {
                                color: 'rgba(255,255,255,.1)'
                            }
                        },
                        splitLine: {
                            lineStyle: {
                                color: 'rgba(255,255,255,.1)'
                            }
                        }
                    }],
                    series:
                        function () {
                            const serie = [];
                            const color = ['#cdba00', '#877ace', '#277ace', '#85ba00', 'green'];
                            const offset = ['rgba(24, 163, 64, 0.3)', 'rgba(309, 22,206, 0.3)', 'rgba(39, 122,206, 0.3)', 'rgba(24, 163, 64, 0.3)', 'rgba(24, 163, 64, 0.3)']
                            for (let i = 0; i < Object.keys(data).length; i++) {
                                const item = {
                                    name: legend[i],
                                    type: 'line',
                                    smooth: true,
                                    symbol: 'circle',
                                    symbolSize: 5,
                                    showSymbol: false,
                                    lineStyle: {
                                        normal: {
                                            width: 2
                                        }
                                    },
                                    areaStyle: {
                                        normal: {
                                            color: new echarts.graphic.LinearGradient(0, 0, 0, 1, [{
                                                offset: 0,
                                                color: offset[i]
                                            }, {
                                                offset: 0.8,
                                                color: 'rgba(24, 163, 64, 0)'
                                            }], false),
                                            // shadowColor: 'rgba(0, 0, 0, 0.1)',
                                            shadowBlur: 10
                                        }
                                    },
                                    itemStyle: {
                                        normal: {
                                            color: color[i],
                                            borderColor: 'rgba(137,189,2,0.27)',
                                            borderWidth: 12
                                        }
                                    },
                                    data: myData[i]
                                }
                                serie.push(item);
                            }
                            ;
                            return serie;
                        }()

                };

                // 使用刚指定的配置项和数据显示图表。
                myChart.setOption(option);
                window.addEventListener("resize", function () {
                    myChart.resize();
                });
            }
        });


    }

    /**
     * 区域用水量
     */
    function echarts_3_2() {

        const url = BaseUrl + '/api/bg/findWaterAndCostByAreaGroupByMonth';
        $.ajax({
            type: 'get',
            url: url,
            dataType: 'json',

            success: function (data) {
                // 基于准备好的dom，初始化echarts实例
                const myChart = echarts.init(document.getElementById('echart3-2'));
                const xAxis = Array.from({length: 12}, (item, index) => (index + 1) + "月");
                const lengend = Object.keys(data);
                const length = Object.keys(data).length;
                // 初始化一維數組
                const myData = new Array();
                // 構建結構
                const createData = function (month) {
                    return {
                        "hour": month,
                        "cost_amount": 0,
                        "water_usage": 0,
                        "area_guid": "",
                        "area_name": ""
                    }
                };
                // 根據區域數目進行數組的初始化
                for (let i = 0; i < length; i++) {
                    myData[i] = Array.from({length: 12}, (item, index) => createData(index + 1));
                }
                /**
                 * 把api請求到的data數據複製到當前myData中，
                 * 然後對myData進行遍歷放入到serials的item的data中
                 * @type
                 *
                 * */

                for (let i = 0; i < lengend.length; i++) {
                    for (let j = 0; j < data[lengend[i]].length; j++) {
                        myData[i][data[lengend[i]][j].hour] = data[lengend[i]][j];
                    }
                }
                // for (let i = 0; i < myData.length; i++) {
                //     cost_amounts[i] =myData[i].cost_amount;
                //     water_usages[i] =myData[i].water_usage;
                // }
                const myDataKeys = Object.keys(myData);
                for (let i = 0; i < myDataKeys.length; i++) {
                    for (let j = 0; j < myData[myDataKeys[i]].length; j++) {
                        myData[myDataKeys[i]][j].value = myData[myDataKeys[i]][j].cost_amount;
                    }
                }
                let option = {
                    tooltip: {
                        trigger: 'axis',
                        axisPointer: {
                            lineStyle: {
                                color: '#57617B'
                            }
                        }
                    },
                    legend: {

                        //icon: 'vertical',
                        data: lengend,
                        // ['区域1', '区域2', '区域3'],
                        //align: 'center',
                        // right: '35%',
                        top: '0',
                        textStyle: {
                            color: "#fff"
                        },
                        // itemWidth: 15,
                        // itemHeight: 15,
                        itemGap: 20,
                    },
                    grid: {
                        left: '0',
                        right: '20',
                        top: '10',
                        bottom: '20',
                        containLabel: true
                    },
                    xAxis: [{
                        type: 'category',
                        boundaryGap: false,
                        axisLabel: {
                            show: true,
                            textStyle: {
                                color: 'rgba(255,255,255,.6)'
                            }
                        },
                        axisLine: {
                            lineStyle: {
                                color: 'rgba(255,255,255,.1)'
                            }
                        },
                        data: xAxis
                    }, {}],
                    yAxis: [{
                        axisLabel: {
                            show: true,
                            textStyle: {
                                color: 'rgba(255,255,255,.6)'
                            }
                        },
                        axisLine: {
                            lineStyle: {
                                color: 'rgba(255,255,255,.1)'
                            }
                        },
                        splitLine: {
                            lineStyle: {
                                color: 'rgba(255,255,255,.1)'
                            }
                        }
                    }],
                    series:
                        function () {
                            const serie = [];
                            const color = ['#cdba00', '#877ace', '#277ace', '#85ba00', 'green'];
                            const offset = ['rgba(24, 163, 64, 0.3)', 'rgba(309, 22,206, 0.3)', 'rgba(39, 122,206, 0.3)', 'rgba(24, 163, 64, 0.3)', 'rgba(24, 163, 64, 0.3)']
                            for (let i = 0; i < myDataKeys.length; i++) {
                                const item = {
                                    name: lengend[i],
                                    type: 'line',
                                    smooth: true,
                                    symbol: 'circle',
                                    symbolSize: 5,
                                    showSymbol: false,
                                    lineStyle: {
                                        normal: {
                                            width: 2
                                        }
                                    },
                                    areaStyle: {
                                        normal: {
                                            color: new echarts.graphic.LinearGradient(0, 0, 0, 1, [{
                                                offset: 0,
                                                color: offset[i]
                                            }, {
                                                offset: 0.8,
                                                color: 'rgba(24, 163, 64, 0)'
                                            }], false),
                                            // shadowColor: 'rgba(0, 0, 0, 0.1)',
                                            shadowBlur: 10
                                        }
                                    },
                                    itemStyle: {
                                        normal: {
                                            color: color[i],
                                            borderColor: 'rgba(137,189,2,0.27)',
                                            borderWidth: 12
                                        }
                                    },
                                    data: myData[myDataKeys[i]]
                                }
                                serie.push(item);
                            }
                            ;
                            return serie;
                        }()
                    //     [{
                    //     name: '区域1',
                    //     type: 'line',
                    //     smooth: true,
                    //     symbol: 'circle',
                    //     symbolSize: 5,
                    //     showSymbol: false,
                    //     lineStyle: {
                    //         normal: {
                    //             width: 2
                    //         }
                    //     },
                    //     areaStyle: {
                    //         normal: {
                    //             color: new echarts.graphic.LinearGradient(0, 0, 0, 1, [{
                    //                 offset: 0,
                    //                 color: 'rgba(24, 163, 64, 0.3)'
                    //             }, {
                    //                 offset: 0.8,
                    //                 color: 'rgba(24, 163, 64, 0)'
                    //             }], false),
                    //             shadowColor: 'rgba(0, 0, 0, 0.1)',
                    //             shadowBlur: 10
                    //         }
                    //     },
                    //     itemStyle: {
                    //         normal: {
                    //             color: '#cdba00',
                    //             borderColor: 'rgba(137,189,2,0.27)',
                    //             borderWidth: 12
                    //         }
                    //     },
                    //     data: [223, 825, 912, 144, 501, 207, 130, 254, 425, 242, 625, 242]
                    // },
                    //     {
                    //         name: '区域2',
                    //         type: 'line',
                    //         smooth: true,
                    //         symbol: 'circle',
                    //         symbolSize: 5,
                    //         showSymbol: false,
                    //         lineStyle: {
                    //             normal: {
                    //                 width: 2
                    //             }
                    //         },
                    //         areaStyle: {
                    //             normal: {
                    //                 color: new echarts.graphic.LinearGradient(0, 0, 0, 1, [{
                    //                     offset: 0,
                    //                     color: 'rgba(309, 22,206, 0.3)'
                    //                 }, {
                    //                     offset: 0.8,
                    //                     color: 'rgba(309, 22,206, 0)'
                    //                 }], false),
                    //                 shadowColor: 'rgba(0, 0, 0, 0.1)',
                    //                 shadowBlur: 10
                    //             }
                    //         },
                    //         itemStyle: {
                    //             normal: {
                    //                 color: '#877ace',
                    //                 borderColor: 'rgba(0,136,212,0.2)',
                    //                 borderWidth: 12
                    //             }
                    //         },
                    //         data: [220, 170, 225, 444, 222, 655, 222, 280, 812, 931, 374, 520]
                    //     }, {
                    //         name: '区域3',
                    //         type: 'line',
                    //         smooth: true,
                    //         symbol: 'circle',
                    //         symbolSize: 5,
                    //         showSymbol: false,
                    //         lineStyle: {
                    //             normal: {
                    //                 width: 2
                    //             }
                    //         },
                    //         areaStyle: {
                    //             normal: {
                    //                 color: new echarts.graphic.LinearGradient(0, 0, 0, 1, [{
                    //                     offset: 0,
                    //                     color: 'rgba(39, 122,206, 0.3)'
                    //                 }, {
                    //                     offset: 0.8,
                    //                     color: 'rgba(39, 122,206, 0)'
                    //                 }], false),
                    //                 shadowColor: 'rgba(0, 0, 0, 0.1)',
                    //                 shadowBlur: 10
                    //             }
                    //         },
                    //         itemStyle: {
                    //             normal: {
                    //                 color: '#277ace',
                    //                 borderColor: 'rgba(0,136,212,0.2)',
                    //                 borderWidth: 12
                    //             }
                    //         },
                    //         data: [553, 324, 863, 463, 232, 866, 442, 372, 938, 449, 623, 725]
                    //     }]
                };

                // 使用刚指定的配置项和数据显示图表。
                myChart.setOption(option);
                window.addEventListener("resize", function () {
                    myChart.resize();
                });
            }
        });


    }

    /**
     * 实时用水量
     */
    function echarts_3_3() {
        const url = BaseUrl + '/api/bg/findWaterAndCostByHour';

        $.ajax({
            type: 'get',
            url: url,
            dataType: 'json',
            success: function (data) {
                // 基于准备好的dom，初始化echarts实例
                const myChart = echarts.init(document.getElementById('echart3-3'));
                const lenged = [];
                const keys = Object.keys(data);
                const water_usage = new Array(keys.length);
                for (let i = 0; i < water_usage.length; i++) {
                    water_usage[i] = Array.apply(null, Array(24)).map(() => 0);    //每行有24列,24小时

                }
                /**
                 * 对json排序
                 * @param filed
                 * @param rev
                 * @param primer
                 * @returns {Function}
                 */
                const sortBy = function (filed, rev, primer) {
                    rev = (rev) ? -1 : 1;
                    return function (a, b) {
                        a = a[filed];
                        b = b[filed];
                        if (typeof (primer) != 'undefined') {
                            a = primer(a);
                            b = primer(b);
                        }
                        if (a < b) {
                            return rev * -1;
                        }
                        if (a > b) {
                            return rev * 1;
                        }
                        return 1;
                    }
                };

                for (let i = 0; i < keys.length; i++) {
                    data[keys[i]].sort(sortBy('hour', false, parseInt));
                    lenged.push(keys[i]);
                    for (let j = 0; j < data[keys[i]].length; j++) {
                        water_usage[i][data[keys[i]][j].hour] = data[keys[i]][j].water_usage;
                    }
                }
                const xAxis = new Array(24);
                for (let i = 0; i < xAxis.length; i++) {
                    xAxis[i] = i + ":00";
                }
                let option = {
                    tooltip: {
                        trigger: 'axis',
                        axisPointer: {
                            lineStyle: {
                                color: '#57617B'
                            }
                        }
                    },
                    legend: {

                        //icon: 'vertical',
                        data: lenged,
                        // x轴 小时
                        //     ['总量', '区域2', '区域3', '区域4', '区域5'],
                        //align: 'center',
                        // right: '35%',
                        top: '0',
                        textStyle: {
                            color: "#fff"
                        },
                        // itemWidth: 15,
                        // itemHeight: 15,
                        itemGap: 20,
                    },
                    grid: {
                        left: '0',
                        right: '20',
                        top: '10',
                        bottom: '20',
                        containLabel: true
                    },
                    xAxis: [{
                        type: 'category',
                        boundaryGap: false,
                        axisLabel: {
                            show: true,
                            textStyle: {
                                color: 'rgba(255,255,255,.6)'
                            }
                        },
                        axisLine: {
                            lineStyle: {
                                color: 'rgba(255,255,255,.1)'
                            }
                        },
                        data: xAxis
                        //['14:00', '16:00', '18:00', '20:00', '22:00', '0:00', '2:00', '4:00', '6:00', '8:00', '10:00', '12:00']
                    }, {}],
                    yAxis: [{
                        axisLabel: {
                            show: true,
                            textStyle: {
                                color: 'rgba(255,255,255,.6)'
                            }
                        },
                        axisLine: {
                            lineStyle: {
                                color: 'rgba(255,255,255,.1)'
                            }
                        },
                        splitLine: {
                            lineStyle: {
                                color: 'rgba(255,255,255,.1)'
                            }
                        }
                    }],
                    series: function () {
                        const serie = [];
                        const color = ['#cdba00', '#877ace', '#277ace', '#85ba00', 'green'];
                        const offset = ['rgba(24, 163, 64, 0.3)', 'rgba(309, 22,206, 0.3)', 'rgba(39, 122,206, 0.3)', 'rgba(24, 163, 64, 0.3)', 'rgba(24, 163, 64, 0.3)']
                        for (let i = 0; i < Object.keys(data).length; i++) {
                            const item = {
                                name: lenged[i],
                                type: 'line',
                                smooth: true,
                                symbol: 'circle',
                                symbolSize: 5,
                                showSymbol: false,
                                lineStyle: {
                                    normal: {
                                        width: 2
                                    }
                                },
                                areaStyle: {
                                    normal: {
                                        color: new echarts.graphic.LinearGradient(0, 0, 0, 1, [{
                                            offset: 0,
                                            color: offset[i]
                                        }, {
                                            offset: 0.8,
                                            color: 'rgba(24, 163, 64, 0)'
                                        }], false),
                                        // shadowColor: 'rgba(0, 0, 0, 0.1)',
                                        shadowBlur: 10
                                    }
                                },
                                itemStyle: {
                                    normal: {
                                        color: color[i],
                                        borderColor: 'rgba(137,189,2,0.27)',
                                        borderWidth: 12
                                    }
                                },
                                data: water_usage[i]
                            }
                            serie.push(item);
                        }
                        ;
                        return serie;
                    }()

                };

                // 使用刚指定的配置项和数据显示图表。
                myChart.setOption(option);
                window.addEventListener("resize", function () {
                    myChart.resize();
                });
            }
        });


    }

    /**
     * 日平均用水量
     */
    function echarts_3_4() {

        const url = BaseUrl + '/api/bg/findWaterAndCostByDay';

        $.ajax({
            type: 'get',
            url: url,
            dataType: 'json',
            success: function (data) {
                const xAixs = [];
                const water_usage = [];
                for (let i = 0; i < data.length; i++) {
                    /**
                     * year 就是实际的天数，
                     */
                    const day = (data[i].year + '日');
                    xAixs.push(day);
                    water_usage.push(data[i].water_usage);
                }
                // 基于准备好的dom，初始化echarts实例
                const myChart = echarts.init(document.getElementById('echart3-4'));

                let option = {
                    tooltip: {
                        trigger: 'axis',
                        axisPointer: {
                            lineStyle: {
                                color: '#57617B'
                            }
                        }
                    },
                    legend: {

                        //icon: 'vertical',
                        data: ['日平均用水量'],
                        //align: 'center',
                        // right: '35%',
                        top: '0',
                        textStyle: {
                            color: "#fff"
                        },
                        // itemWidth: 15,
                        // itemHeight: 15,
                        itemGap: 20,
                    },
                    grid: {
                        left: '0',
                        right: '20',
                        top: '10',
                        bottom: '20',
                        containLabel: true
                    },
                    xAxis: [{
                        type: 'category',
                        boundaryGap: false,
                        axisLabel: {
                            show: true,
                            textStyle: {
                                color: 'rgba(255,255,255,.6)'
                            }
                        },
                        axisLine: {
                            lineStyle: {
                                color: 'rgba(255,255,255,.1)'
                            }
                        },
                        data: xAixs
                        // 每月天数 x轴数据
                        // ['1', '2', '3', '4', '5', '6', '7', '8', '9', '10', '11', '12', '13', '14', '15', '16', '17', '18', '19', '20', '21', '22', '23', '24', '25', '26', '27', '28', '29', '30']
                    }, {}],
                    yAxis: [{
                        axisLabel: {
                            show: true,
                            textStyle: {
                                color: 'rgba(255,255,255,.6)'
                            }
                        },
                        axisLine: {
                            lineStyle: {
                                color: 'rgba(255,255,255,.1)'
                            }
                        },
                        splitLine: {
                            lineStyle: {
                                color: 'rgba(255,255,255,.1)'
                            }
                        }
                    }],
                    series: [{
                        name: '日平均用水量',
                        type: 'line',
                        smooth: true,
                        symbol: 'circle',
                        symbolSize: 5,
                        showSymbol: false,
                        lineStyle: {
                            normal: {
                                width: 2
                            }
                        },
                        areaStyle: {
                            normal: {
                                color: new echarts.graphic.LinearGradient(0, 0, 0, 1, [{
                                    offset: 0,
                                    color: 'rgba(24, 163, 64, 0.3)'
                                }, {
                                    offset: 0.8,
                                    color: 'rgba(24, 163, 64, 0)'
                                }], false),
                                shadowColor: 'rgba(0, 0, 0, 0.1)',
                                shadowBlur: 10
                            }
                        },
                        itemStyle: {
                            normal: {
                                color: '#cdba00',
                                borderColor: 'rgba(137,189,2,0.27)',
                                borderWidth: 12
                            }
                        },
                        data: water_usage
                        // y轴数据，每天平均用水量
                        // [22, 82, 51, 14, 50, 20, 10, 25, 45, 22, 65, 22, 82, 31, 14, 50, 20, 10, 25, 45, 22, 45, 22, 65, 22, 82, 91, 14, 50, 20]
                    }]
                };

                // 使用刚指定的配置项和数据显示图表。
                myChart.setOption(option);
                window.addEventListener("resize", function () {
                    myChart.resize();
                });

            }
        });


    }

    /**
     * 月平均用水量
     */
    function echarts_3_5() {

        const url = BaseUrl + '/api/bg/findWaterAndCostByMonth';

        $.ajax({
            type: 'get',
            url: url,
            dataType: 'json',
            success: function (data) {
                // 生成十二月份
                const xAxis = Array.from({length: 12}, (item, index) => (index + 1) + "月");
                // 生成十个月的默认数据
                const water_usage = Array.apply(null, Array(12)).map(() => 0);
                for (let i = 0; i < data.length; i++) {
                    for (let j = 0; j < 12; j++) {
                        if (data[i].year == j) {
                            water_usage[i] = (data[i].water_usage);
                        }
                    }
                }
                // 基于准备好的dom，初始化echarts实例
                const myChart = echarts.init(document.getElementById('echart3-5'));

                let option = {
                    tooltip: {
                        trigger: 'axis',
                        axisPointer: {
                            lineStyle: {
                                color: '#57617B'
                            }
                        }
                    },
                    legend: {

                        //icon: 'vertical',
                        data: ['月平均用水量'],
                        //align: 'center',
                        // right: '35%',
                        top: '0',
                        textStyle: {
                            color: "#fff"
                        },
                        // itemWidth: 15,
                        // itemHeight: 15,
                        itemGap: 20,
                    },
                    grid: {
                        left: '0',
                        right: '20',
                        top: '10',
                        bottom: '20',
                        containLabel: true
                    },
                    xAxis: [{
                        type: 'category',
                        boundaryGap: false,
                        axisLabel: {
                            show: true,
                            textStyle: {
                                color: 'rgba(255,255,255,.6)'
                            }
                        },
                        axisLine: {
                            lineStyle: {
                                color: 'rgba(255,255,255,.1)'
                            }
                        },
                        data: xAxis
                        // x轴 月份
                        // ['1月', '2月', '3月', '4月', '5月', '6月', '7月', '8月', '9月', '10月', '11月', '12月']
                    }, {}],
                    yAxis: [{
                        axisLabel: {
                            show: true,
                            textStyle: {
                                color: 'rgba(255,255,255,.6)'
                            }
                        },
                        axisLine: {
                            lineStyle: {
                                color: 'rgba(255,255,255,.1)'
                            }
                        },
                        splitLine: {
                            lineStyle: {
                                color: 'rgba(255,255,255,.1)'
                            }
                        }
                    }],
                    series: [{
                        name: '月平均用水量',
                        type: 'line',
                        smooth: true,
                        symbol: 'circle',
                        symbolSize: 5,
                        showSymbol: false,
                        lineStyle: {
                            normal: {
                                width: 2
                            }
                        },
                        areaStyle: {
                            normal: {
                                color: new echarts.graphic.LinearGradient(0, 0, 0, 1, [{
                                    offset: 0,
                                    color: 'rgba(24, 163, 64, 0.3)'
                                }, {
                                    offset: 0.8,
                                    color: 'rgba(24, 163, 64, 0)'
                                }], false),
                                shadowColor: 'rgba(0, 0, 0, 0.1)',
                                shadowBlur: 10
                            }
                        },
                        itemStyle: {
                            normal: {
                                color: '#cdba00',
                                borderColor: 'rgba(137,189,2,0.27)',
                                borderWidth: 12
                            }
                        },
                        data: water_usage
                        // y轴，用水量
                        //[2245, 8234, 5123, 1423, 5095, 2340, 1220, 2535, 4735, 2342, 6235, 2542]
                    }]
                };

                // 使用刚指定的配置项和数据显示图表。
                myChart.setOption(option);
                window.addEventListener("resize", function () {
                    myChart.resize();
                });

            }
        });


    }

    /**
     * 月用水量详情
     */
    function echarts_4() {
        const url = BaseUrl + '/api/bg/findWaterAndCostByDate';
        const getLoss =BaseUrl +'/api/bg/findWaterAndCostForLossRateGroupByMonth';

        $.ajax({
            type: 'get',
            url: getLoss,
            dataType: 'json',
            success: function (data) {
                const createData = function (month) {
                    return {
                        "cost_amount": 0.00,
                        "water_usage": 0.00,
                        "area_guid": null,
                        "area_name": null,
                        "loss": 0.00,
                        "month": month
                    }
                };
                const myData = Array.from({length: 12}, (item, index) => createData(index + 1));

                for (let i = 0; i < data.length; i++) {
                    myData[data[i].month - 1] = data[i];
                }
                const lossData=[];
                // 转换为百分数*100
                for(let i=0;i<myData.length;i++){
                    if(myData[i].water_usage!=0){
                        myData[i].loss =(1-(myData[i].cost_amount/myData[i].water_usage))*100;
                    }else{
                        myData[i].loss =0;
                    }
                }
                for (let i = 0; i < myData.length; i++) {
                    lossData.push(myData[i].loss);
                }
                // console.log(lossData);
                $.ajax({
                    type: 'get',
                    url: url,
                    dataType: 'json',

                    success: function (data) {
                        const cost_amounts = Array.from({length: 12}, () => 0);
                        const water_usages = Array.from({length: 12}, () => 0);
                        const xAxis = Array.from({length: 12}, (item, index) => (index + 1) + "月");
                        const createData = function (month) {
                            return {
                                "year": 2020,
                                "month": month,
                                "cost_amount": 0,
                                "water_usage": 0
                            }
                        };
                        const myData = Array.from({length: 12}, (item, index) => createData(index + 1));
                        const keys = Object.keys(data);

                        for (let i = 0; i < keys.length; i++) {
                            myData[data[i].month - 1] = data[i];
                        }
                        for (let i = 0; i < myData.length; i++) {
                            cost_amounts[i] = myData[i].cost_amount;
                            water_usages[i] = myData[i].water_usage;
                        }
                        // console.log(lossData);
                        // var lossData2 = [0, 20, 0, 2, 80, 100, 0, 0, 0, 0, 0, 0];
                        // 基于准备好的dom，初始化echarts实例
                        const myChart = echarts.init(document.getElementById('echart4'));
                        let option = {
                            tooltip: {
                                trigger: 'axis',
                                axisPointer: {
                                    lineStyle: {
                                        color: '#57617B'
                                    }
                                }
                            },
                            "legend": {

                                "data": [
                                    {"name": "用户购水(金额)"},
                                    {"name": "用户购水(用量)"},
                                    {"name": "损耗"}
                                ],
                                "top": "0%",
                                "textStyle": {
                                    "color": "rgba(255,255,255,0.9)"//图例文字
                                }
                            },

                            "xAxis": [
                                {
                                    "type": "category",

                                    data: xAxis,
                                    // ['1月', '2月', '3月', '4月', '5月', '6月', '7月', '8月', '9月', '10月', '11月', '12月'],
                                    axisLine: {lineStyle: {color: "rgba(255,255,255,.1)"}},
                                    axisLabel: {
                                        textStyle: {color: "rgba(255,255,255,.6)", fontSize: '14',},
                                    },

                                },
                            ],
                            "yAxis": [
                                {
                                    "type": "value",
                                    "name": "金额",
                                    "min": 0,
                                    "max": 10000,
                                    "interval": 1000,
                                    "axisLabel": {
                                        "show": true,

                                    },
                                    axisLine: {lineStyle: {color: 'rgba(255,255,255,.4)'}},//左线色

                                },
                                {
                                    "type": "value",
                                    "name": "用水量",
                                    "min": 0,
                                    "max": 5000,
                                    "interval": 500,
                                    "show": true,
                                    "axisLabel": {
                                        "show": true,

                                    },
                                    axisLine: {lineStyle: {color: 'rgba(255,255,255,.4)'}},//右线色
                                    splitLine: {show: true, lineStyle: {color: "#001e94"}},//x轴线
                                },
                                {
                                    "type": "value",
                                    "name": "损耗",
                                    "min": 0,
                                    "max": 100,
                                    "interval": 10,
                                    "show": false,
                                    "axisLabel": {
                                        "show": false,

                                    },
                                    axisLine: {lineStyle: {color: 'rgba(255,255,255,.4)'}},//右线色
                                    splitLine: {show: false, lineStyle: {color: "#001e94"}},//x轴线
                                },
                            ],
                            "grid": {
                                "top": "13%",
                                "right": "50",
                                "bottom": "30",
                                "left": "60",
                            },
                            "series": [
                                {
                                    "name": "用户购水(金额)",

                                    "type": "bar",
                                    "data":
                                    cost_amounts,
                                    // [5000, 7000, 4743, 7896, 2453, 4567, 9555, 8935, 3245, 6865, 2353, 9463],
                                    "barWidth": "auto",
                                    "itemStyle": {
                                        "normal": {
                                            "color": {
                                                "type": "linear",
                                                "x": 0,
                                                "y": 0,
                                                "x2": 0,
                                                "y2": 1,
                                                "colorStops": [
                                                    {
                                                        "offset": 0,
                                                        "color": "#609db8"
                                                    },

                                                    {
                                                        "offset": 1,
                                                        "color": "#609db8"
                                                    }
                                                ],
                                                "globalCoord": false
                                            }
                                        }
                                    }
                                },
                                {
                                    "name": "用户购水(用量)",
                                    "type": "bar",
                                    "yAxisIndex": 1,
                                    "data":
                                    water_usages,
                                    // [5000 / 2 + 300, 7000 / 2 + 600, 4743 / 2 - 600, 7896 / 2 + 234, 2453 / 2 + 547, 4567 / 2 - 23, 9555 / 2 - 784, 8935 / 2 - 2000, 3245 / 2, 6865 / 2 + 345, 2353 / 2 + 2000, 9463 / 2 - 234],
                                    "barWidth": "auto",

                                    "itemStyle": {
                                        "normal": {
                                            "color": {
                                                "type": "linear",
                                                "x": 0,
                                                "y": 0,
                                                "x2": 0,
                                                "y2": 1,
                                                "colorStops": [
                                                    {
                                                        "offset": 0,
                                                        "color": "#66b8a7"
                                                    },
                                                    {
                                                        "offset": 1,
                                                        "color": "#66b8a7"
                                                    }
                                                ],
                                                "globalCoord": false
                                            }
                                        }
                                    },
                                    "barGap": "0"
                                },
                                {
                                    "name": "损耗",
                                    "type": "line",
                                    "yAxisIndex": 2,

                                    "data":
                                        lossData,
                                        // [30, 24, 3, 34, 23, 6, 87, 44, 87, 35, 26, 96],
                                    lineStyle: {
                                        normal: {
                                            width: 2
                                        },
                                    },
                                    "itemStyle": {
                                        "normal": {
                                            "color": "#cdba00",

                                        }
                                    },
                                    "smooth": true
                                }

                            ]
                        };


                        // 使用刚指定的配置项和数据显示图表。
                        myChart.setOption(option);
                        window.addEventListener("resize", function () {
                            myChart.resize();
                        });
                    }
                });

            }});


    }

    /**
     * 已开阀防水图表
     */
    function echarts_5() {
        const url = BaseUrl + '/api/bg/findBgWaterWastedByArea';

        $.ajax({
            type: 'get',
            url: url,
            dataType: 'json',
            success: function (data) {
                // 基于准备好的dom，初始化echarts实例
                const xAxis = [];
                const used_waters = [];
                const cost_amounts = [];
                for (let i = 0; i < data.length; i++) {
                    xAxis.push(data[i].area_name);
                    used_waters.push(data[i].used_water);
                    cost_amounts.push(data[i].cost_amount);
                }
                const myChart = echarts.init(document.getElementById('echart5'));
                let option = {
                    tooltip: {
                        show: false
                    },
                    grid: {
                        top: '0%',
                        left: '25%',
                        right: '14%',
                        bottom: '0%',
                    },
                    xAxis: {
                        min: 0,
                        max: 100,
                        splitLine: {
                            show: false
                        },
                        axisTick: {
                            show: false
                        },
                        axisLine: {
                            show: false
                        },
                        axisLabel: {
                            show: false
                        }
                    },
                    yAxis: {
                        data: xAxis,
                        //['区域11', '区域10', '区域9', '区域8', '区域7', '区域6', '区域5', '区域4', '区域3', '区域2', '区域1'],
                        //offset: 15,
                        axisTick: {
                            show: false
                        },
                        axisLine: {
                            show: false
                        },
                        axisLabel: {
                            color: 'rgba(255,255,255,.6)',
                            fontSize: 14
                        }
                    },
                    series:
                    // function () {
                    //     const dataArr = [120, 132, 101, 134, 90, 230, 210]
                    //     const serie = [];
                    //     for (let i = 0; i < 1; i++) {
                    //         const item = {
                    //             type: 'bar',
                    //             label: {
                    //                 show: true,
                    //                 zlevel: 10000,
                    //                 position: 'right',
                    //                 padding: 10,
                    //                 color: '#49bcf7',
                    //                 fontSize: 14,
                    //                 formatter: '{c}%'
                    //
                    //             },
                    //             itemStyle: {
                    //                 color: '#49bcf7'
                    //             },
                    //             barWidth: '15',
                    //             data: dataArr
                    //         }
                    //         serie.push(item);
                    //     }
                    //     ;
                    //     return serie;
                    // }()

                        [{
                            type: 'bar',
                            label: {
                                show: true,
                                zlevel: 10000,
                                position: 'right',
                                padding: 10,
                                color: '#49bcf7',
                                fontSize: 14,
                                formatter: '{c}%'

                            },
                            itemStyle: {
                                color: '#49bcf7'
                            },
                            barWidth: '15',
                            data: used_waters,
                            //[49, 80, 67, 99, 12, 19, 80, 67, 99, 12, 19],
                            z: 10
                        }, {
                            type: 'bar',
                            barGap: '-100%',
                            itemStyle: {
                                color: '#fff',
                                opacity: 0.1
                            },
                            barWidth: '15',
                            data: cost_amounts,
                            //[100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100],
                            z: 5
                        }]
                };
                // 使用刚指定的配置项和数据显示图表。
                myChart.setOption(option);
                window.addEventListener("resize", function () {
                    myChart.resize();
                });
            }
        });

    }

    /**
     * 阀控器在线数
     */
    function zb4() {
        const url = BaseUrl + '/api/bg/findOnlineMeter';

        $.ajax({
            type: 'get',
            url: url,
            dataType: 'json',
            success: function (data) {
                // 基于准备好的dom，初始化echarts实例
                const myChart = echarts.init(document.getElementById('zb4'));
                const onlineMeter = data.online_meter;//在线数量
                const allMeter = data.all_meter;
                const offlineMeter = allMeter - onlineMeter;//不在线数量
                let option = {
                    series: [{

                        type: 'pie',
                        radius: ['60%', '70%'],
                        color: '#49bcf7',
                        label: {
                            normal: {
                                position: 'center'
                            }
                        },
                        data: [{
                            value: onlineMeter,
                            name: '在线数量',
                            label: {
                                normal: {
                                    formatter: allMeter + '',
                                    textStyle: {
                                        fontSize: 20,
                                        color: '#fff',
                                    }
                                }
                            }
                        }, {
                            value: offlineMeter,
                            name: '不在线数量',
                            label: {
                                normal: {
                                    formatter: function (params) {
                                        return '在线' + Math.round(onlineMeter / allMeter * 100) + '%'
                                    },
                                    textStyle: {
                                        color: '#aaa',
                                        fontSize: 12
                                    }
                                }
                            },
                            itemStyle: {
                                normal: {
                                    color: 'rgba(255,255,255,.2)'
                                },
                                emphasis: {
                                    color: '#fff'
                                }
                            },
                        }]
                    }]
                };
                myChart.setOption(option);
                window.addEventListener("resize", function () {
                    myChart.resize();
                });
            }
        });


    }

    function zb5() {
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('zb5'));
        var v1 = 54//在线数量
        var v2 = 1//不在线数量
        var v3 = v1 + v2//总数量
        option = {

//animation: false,
            series: [{
                type: 'pie',
                radius: ['60%', '70%'],
                color: '#cdba00',
                label: {
                    normal: {
                        position: 'center'
                    }
                },
                data: [{
                    value: v1,
                    name: '在线数量',
                    label: {
                        normal: {
                            formatter: v3 + '',
                            textStyle: {
                                fontSize: 20,
                                color: '#fff',
                            }
                        }
                    }
                }, {
                    value: v2,
                    name: '不在线数量',
                    label: {
                        normal: {
                            formatter: function (params) {
                                return '在线' + Math.round(v1 / v3 * 100) + '%'
                            },
                            textStyle: {
                                color: '#aaa',
                                fontSize: 12
                            }
                        }
                    },
                    itemStyle: {
                        normal: {
                            color: 'rgba(255,255,255,.2)'
                        },
                        emphasis: {
                            color: '#fff'
                        }
                    },
                }]
            }]
        };
        myChart.setOption(option);
        window.addEventListener("resize", function () {
            myChart.resize();
        });
    }

    function zb6() {
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('zb6'));
        var v1 = 20//在线数量
        var v2 = 0//不在线数量
        var v3 = v1 + v2//总数量
        option = {
            series: [{

                type: 'pie',
                radius: ['60%', '70%'],
                color: '#62c98d',
                label: {
                    normal: {
                        position: 'center'
                    }
                },
                data: [{
                    value: v1,
                    name: '在线数量',
                    label: {
                        normal: {
                            formatter: v3 + '',
                            textStyle: {
                                fontSize: 20,
                                color: '#fff',
                            }
                        }
                    }
                }, {
                    value: v2,
                    name: '不在线数量',
                    label: {
                        normal: {
                            formatter: function (params) {
                                return '在线' + Math.round(v1 / v3 * 100) + '%'
                            },
                            textStyle: {
                                color: '#aaa',
                                fontSize: 12
                            }
                        }
                    },
                    itemStyle: {
                        normal: {
                            color: 'rgba(255,255,255,.2)'
                        },
                        emphasis: {
                            color: '#fff'
                        }
                    },
                }]
            }]
        };
        myChart.setOption(option);
        window.addEventListener("resize", function () {
            myChart.resize();
        });
    }

    /**
     * 本月损耗
     */
    function zb1() {
        const url = BaseUrl + '/api/bg/findWaterAndCostForLossRateByMonth';

        $.ajax({
            type: 'get',
            url: url,
            dataType: 'json',
            success: function (data) {
                // 基于准备好的dom，初始化echarts实例
                const myChart = echarts.init(document.getElementById('zb1'));
                const v2 = data[0].cost_amount;//本月用户用量
                const v3 = data[0].water_usage;//总用量
                const v1 = v3 - v2;//本月损耗
                let option = {
                    series: [{

                        type: 'pie',
                        radius: ['60%', '70%'],
                        color: '#49bcf7',
                        label: {
                            normal: {
                                position: 'center'
                            }
                        },
                        data: [{
                            value: v1,
                            name: '本月损耗',
                            label: {
                                normal: {
                                    formatter: v1 + '',
                                    textStyle: {
                                        fontSize: 20,
                                        color: '#fff',
                                    }
                                }
                            }
                        }, {
                            value: v2,
                            name: '本月用户用量',
                            label: {
                                normal: {
                                    formatter: function (params) {
                                        return '占比' + Math.round(v1 / v3 * 100) + '%'
                                    },
                                    textStyle: {
                                        color: '#aaa',
                                        fontSize: 12
                                    }
                                }
                            },
                            itemStyle: {
                                normal: {
                                    color: 'rgba(255,255,255,.2)'
                                },
                                emphasis: {
                                    color: '#fff'
                                }
                            },
                        }]
                    }]
                };
                myChart.setOption(option);
                window.addEventListener("resize", function () {
                    myChart.resize();
                });
            }
        });


    }

    function zb2() {

        const url = BaseUrl + '/api/bg/findWaterAndCostForLossRateByYear';

        $.ajax({
            type: 'get',
            url: url,
            dataType: 'json',
            success: function (data) {

                // 基于准备好的dom，初始化echarts实例
                const myChart = echarts.init(document.getElementById('zb2'));
                const v1 = 298//本年损耗
                const v2 = 52300//本年用户用量
                const v3 = v1 + v2//总用量
                let option = {

//animation: false,
                    series: [{
                        type: 'pie',
                        radius: ['60%', '70%'],
                        color: '#cdba00',
                        label: {
                            normal: {
                                position: 'center'
                            }
                        },
                        data: [{
                            value: v1,
                            name: '本年损耗',
                            label: {
                                normal: {
                                    formatter: v1 + '',
                                    textStyle: {
                                        fontSize: 20,
                                        color: '#fff',
                                    }
                                }
                            }
                        }, {
                            value: v2,
                            name: '本年用户用量',
                            label: {
                                normal: {
                                    formatter: function (params) {
                                        return '占比' + Math.round(v1 / v3 * 100) + '%'
                                    },
                                    textStyle: {
                                        color: '#aaa',
                                        fontSize: 12
                                    }
                                }
                            },
                            itemStyle: {
                                normal: {
                                    color: 'rgba(255,255,255,.2)'
                                },
                                emphasis: {
                                    color: '#fff'
                                }
                            },
                        }]
                    }]
                };
                myChart.setOption(option);
                window.addEventListener("resize", function () {
                    myChart.resize();
                });
            }
        });

    }

    function zb3() {
        const url = BaseUrl + '/api/bg/findWaterAndCostForLossRate';

        $.ajax({
            type: 'get',
            url: url,
            dataType: 'json',
            success: function (data) {

                // 基于准备好的dom，初始化echarts实例
                const myChart = echarts.init(document.getElementById('zb3'));
                const v1 = 498//总损耗
                const v2 = 92300//用用户用量
                const v3 = v1 + v2//总用量
                let option = {
                    series: [{

                        type: 'pie',
                        radius: ['60%', '70%'],
                        color: '#62c98d',
                        label: {
                            normal: {
                                position: 'center'
                            }
                        },
                        data: [{
                            value: v1,
                            name: '总损耗',
                            label: {
                                normal: {
                                    formatter: v1 + '',
                                    textStyle: {
                                        fontSize: 20,
                                        color: '#fff',
                                    }
                                }
                            }
                        }, {
                            value: v2,
                            name: '用用户用量',
                            label: {
                                normal: {
                                    formatter: function (params) {
                                        return '占比' + Math.round(v1 / v3 * 100) + '%'
                                    },
                                    textStyle: {
                                        color: '#aaa',
                                        fontSize: 12
                                    }
                                }
                            },
                            itemStyle: {
                                normal: {
                                    color: 'rgba(255,255,255,.2)'
                                },
                                emphasis: {
                                    color: '#fff'
                                }
                            },
                        }]
                    }]
                };
                myChart.setOption(option);
                window.addEventListener("resize", function () {
                    myChart.resize();
                });
            }
        });

    }
})