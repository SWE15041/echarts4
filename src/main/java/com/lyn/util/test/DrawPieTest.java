package com.lyn.util.test;

import com.lyn.common.Legend;
import com.lyn.common.Title;
import com.lyn.common.Toolbox;
import com.lyn.common.Tooltip;
import com.lyn.constant.*;
import com.lyn.option.PieOption;
import com.lyn.series.PieSeries;
import com.lyn.util.EChartsUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DrawPieTest {
    public static PieOption drawPieOptionDemo() {
        PieOption pieOption = new PieOption();
        //标题
        Title title = EChartsUtil.buildTitle("主标题", "副标题", true, X.center, null);

        //图例
        List<String> legendData = new ArrayList<>();
        legendData.add("a");
        legendData.add("b");
        legendData.add("c");
        legendData.add("d");
        Legend legend = EChartsUtil.buildLegend(LegendType.plain, null, 30, 0, null, legendData, Orient.vertical);


        //系列
        List<PieSeries> pieSeriesList = new ArrayList<>();
        Map<String, Double> pieSeriesData = new HashMap<>();
        pieSeriesData.put("a", 10.0);
        pieSeriesData.put("b", 20.0);
        pieSeriesData.put("c", 30.0);
        pieSeriesData.put("d", 40.0);
        String[] center = {"50%", "60%"};
        PieSeries pieSeries = EChartsUtil.buildPieSeries("pieseries", ChartType.pie, center, "55%", pieSeriesData);
        pieSeriesList.add(pieSeries);
        PieSeries[] series = new PieSeries[pieSeriesList.size()];
        series = pieSeriesList.toArray(series);

        //提示框
        Tooltip tooltip = EChartsUtil.buildTooltip(TriggerType.item, "{a}<br/>{b}:{c}({d}%)", null);

        //工具栏
        Toolbox toolbox = EChartsUtil.buildToolbox();
        //其他组件等

        //组装
        pieOption.setTitle(title);
        pieOption.setLegend(legend);
        pieOption.setTooltip(tooltip);
        pieOption.setSeries(series);
        pieOption.setToolbox(toolbox);

        return pieOption;
    }
}
