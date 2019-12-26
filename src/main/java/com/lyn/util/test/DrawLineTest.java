package com.lyn.util.test;

import com.lyn.axis.XAxis;
import com.lyn.axis.YAxis;
import com.lyn.common.Legend;
import com.lyn.common.Title;
import com.lyn.constant.*;
import com.lyn.option.LineOption;
import com.lyn.series.LineSeries;
import com.lyn.util.EChartsUtil;

import java.util.ArrayList;
import java.util.List;

public class DrawLineTest {
    public static LineOption drawLineOptionDemo() {
        LineOption lineOption = new LineOption();

        //标题
        Title title = EChartsUtil.buildTitle("主标题", "副标题", true, X.center, null);

        //X轴配置
        List<String> xAxisData = new ArrayList<>();
        xAxisData.add("星期一");
        xAxisData.add("星期二");
        xAxisData.add("星期三");
        xAxisData.add("星期四");
        XAxis xAxis = EChartsUtil.buildXAxis("x轴轴称", AxisType.category, xAxisData, 20.0, AxisNameLocation.center, true, false);

        //Y轴配置
        YAxis yAxis = EChartsUtil.buildYAxis("y轴轴称", AxisType.value, 60.0, AxisNameLocation.center, null);

        //图例配置
        Legend legend = EChartsUtil.buildLegend(LegendType.plain, null, null, null, 0, null, null);

        //系列配置
        List<LineSeries> lineSeriesList = new ArrayList<>();
        List<Double> seriesData1 = new ArrayList<>();
        seriesData1.add(10.0);
        seriesData1.add(20.0);
        seriesData1.add(15.0);
        seriesData1.add(30.0);
        LineSeries lineSeries1 = EChartsUtil.buildLineSeries("系列1", ChartType.line, seriesData1);

        lineSeriesList.add(lineSeries1);
        List<Double> seriesData2 = new ArrayList<>();
        seriesData2.add(12.0);
        seriesData2.add(25.0);
        seriesData2.add(34.0);
        seriesData2.add(17.0);
        LineSeries lineSeries2 = EChartsUtil.buildLineSeries("系列2", ChartType.line, seriesData2);
        lineSeriesList.add(lineSeries2);
        LineSeries[] series = new LineSeries[lineSeriesList.size()];
        series = lineSeriesList.toArray(series);

        //组装option
        lineOption.setTitle(title);
        lineOption.setXAxis(xAxis);
        lineOption.setYAxis(yAxis);
        lineOption.setLegend(legend);
        lineOption.setSeries(series);


        return lineOption;
    }
}
