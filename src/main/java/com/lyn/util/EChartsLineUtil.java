package com.lyn.util;

import com.alibaba.fastjson.JSONObject;
import com.lyn.axis.AxisLabel;
import com.lyn.axis.AxisTick;
import com.lyn.axis.XAxis;
import com.lyn.axis.YAxis;
import com.lyn.common.Legend;
import com.lyn.common.Title;
import com.lyn.constant.*;
import com.lyn.data.AxisData;
import com.lyn.data.markData.markLine.LineMarkLineData;
import com.lyn.data.markData.markPoint.LineMarkPointData;
import com.lyn.data.series.LineSeriesData;
import com.lyn.option.LineOption;
import com.lyn.series.LineSeries;
import com.lyn.series.MarkLine;
import com.lyn.series.MarkPoint;
import com.lyn.style.LabelStyle;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 * 组装option
 */
public class EChartsLineUtil {


    public static Title buildTitle(String text, String subText) {
        Title title = new Title();
        title.setText(text);
        title.setSubtext(subText);
        title.setX(X.center);
        return title;
    }

    public static MarkLine buildMarkLine() {
        MarkLine markLine = new MarkLine();
        LineMarkLineData lineMarkLineData = new LineMarkLineData();
        lineMarkLineData.setName("平均值");
        lineMarkLineData.setType(MarkType.average);
        LineMarkLineData[] markLineData = {lineMarkLineData};
        markLine.setData(markLineData);
        return markLine;
    }

    public static MarkPoint buildMarkPoint() {
        MarkPoint markPoint = new MarkPoint();

        Double symbolSize = 40.0;
        LabelStyle label = new LabelStyle();
        label.setFontSize(12);

        LineMarkPointData lineMarkPointData1 = new LineMarkPointData();
        lineMarkPointData1.setName("最大值");
        lineMarkPointData1.setType(MarkType.max);
        lineMarkPointData1.setLabel(label);
        lineMarkPointData1.setSymbolSize(symbolSize);

        LineMarkPointData lineMarkPointData2 = new LineMarkPointData();
        lineMarkPointData2.setName("最小值");
        lineMarkPointData2.setType(MarkType.min);
        lineMarkPointData2.setSymbolSize(symbolSize);
        lineMarkPointData2.setLabel(label);

        LineMarkPointData[] markPointata = {lineMarkPointData1, lineMarkPointData2};
        markPoint.setData(markPointata);
        return markPoint;
    }

    /**
     * @param name
     * @param data 数据项
     * @return
     */
    public static XAxis buildXAxis(String name, List<String> data) {
        if (data == null && data.size() <= 0) {
            return null;
        }
        XAxis xAxis = new XAxis();
        xAxis.setName(name);
        xAxis.setType(AxisType.category);
        xAxis.setNameGap(5.0);
        xAxis.setNameLocation(AxisNameLocation.end);
        AxisTick axisTick = new AxisTick();
        axisTick.setAlignWithLabel(true);
        xAxis.setAxisTick(axisTick);
        xAxis.setBoundaryGap(false);
        List<AxisData> axisDataList = new ArrayList<>();
        data.forEach(item -> axisDataList.add(AxisData.builder().value(item).build()));
        AxisData[] axisData = new AxisData[axisDataList.size()];
        xAxis.setData((axisDataList.toArray(axisData)));
        return xAxis;
    }

    public static YAxis buildYAxis(String name) {
        YAxis yAxis = new YAxis();
        yAxis.setName(name);
        yAxis.setType(AxisType.value);
        yAxis.setNameGap(15.0);
        yAxis.setNameLocation(AxisNameLocation.end);

        AxisLabel axisLabel = new AxisLabel();
        axisLabel.setFormatter("{value}");
        yAxis.setAxisLabel(axisLabel);

        return yAxis;
    }

    public static Legend buildLegend() {
        Legend legend = new Legend();
        legend.setBottom(0);
        return legend;
    }

    public static LineSeries buildLineSeries(String name, ChartType type, List<Double> data) {
        if (data == null && data.size() <= 0) {
            return null;
        }
        LineSeries lineSeries = new LineSeries();
        lineSeries.setName(name);
        lineSeries.setType(type == null ? ChartType.line : type);
        lineSeries.setMarkLine(buildMarkLine());
        lineSeries.setMarkPoint(buildMarkPoint());
        lineSeries.setSymbol(SymbolType.none);

        List<LineSeriesData> lineSeriesDataList = new ArrayList<>();
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        data.forEach(item -> {
            try {
                double value = decimalFormat.parse(decimalFormat.format(item)).doubleValue();
                lineSeriesDataList.add(new LineSeriesData(value));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        });
        LineSeriesData[] lineSeriesData = new LineSeriesData[lineSeriesDataList.size()];
        lineSeries.setData(lineSeriesDataList.toArray(lineSeriesData));
        return lineSeries;
    }

    /**
     * 创建折线图option
     *
     * @param text           标题
     * @param subText        子标题
     * @param xAxisName      x轴轴称
     * @param xAxisData      x轴数据项
     * @param yAxisName      y轴轴称
     * @param lineSeriesList 数据
     * @return
     */
    public static LineOption buildLineOption(String text, String subText, String xAxisName, List<String> xAxisData, String yAxisName, List<LineSeries> lineSeriesList) {
        Title title = buildTitle(text, subText);
        XAxis xAxis = buildXAxis(xAxisName, xAxisData);
        YAxis yAxis = buildYAxis(yAxisName);
        Legend legend = buildLegend();
        LineSeries[] series = new LineSeries[lineSeriesList.size()];
        series = lineSeriesList.toArray(series);

        LineOption lineOption = new LineOption();
        lineOption.setTitle(title);
        lineOption.setXAxis(xAxis);
        lineOption.setYAxis(yAxis);
        lineOption.setLegend(legend);
        lineOption.setSeries(series);

        return lineOption;
    }

    public static void main(String[] args) {
        String text = "流量图";
        String subText = "机器IP";
        String xAxisName = "时间";

        //X轴配置
        List<String> xAxisData = new ArrayList<>();
        xAxisData.add("星期一");
        xAxisData.add("星期二");
        xAxisData.add("星期三");
        xAxisData.add("星期四");

        String yAxisName = "流量";

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


        LineOption lineOption = buildLineOption(text, subText, xAxisName, xAxisData, yAxisName, lineSeriesList);
        String string = JSONObject.toJSONString(lineOption);
        String[] line = string.split("\n");
        String[] strings = replaceFunctionQuote(line);
        System.out.println(strings);
    }

    public static String[] replaceFunctionQuote(String[] lines) {
        boolean function = false;
        boolean immediately = false;
        for (int i = 0; i < lines.length; i++) {
            String line = lines[i].trim();
            if (!function && line.contains("\"function")) {
                function = true;
                line = line.replaceAll("\"function", "function");
            }
            if (function && line.contains("}\"")) {
                function = false;
                line = line.replaceAll("\\}\"", "\\}");
            }

            if (!immediately && line.contains("\"(function")) {
                immediately = true;
                line = line.replaceAll("\"\\(function", "\\(function");
            }
            if (immediately && line.contains("})()\"")) {
                immediately = false;
                line = line.replaceAll("\\}\\)\\(\\)\"", "\\}\\)\\(\\)");
            }
            lines[i] = line;
        }
        return lines;
    }
}
