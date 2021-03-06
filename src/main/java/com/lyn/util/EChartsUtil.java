package com.lyn.util;

import com.alibaba.fastjson.JSONObject;
import com.lyn.axis.AxisLabel;
import com.lyn.axis.AxisTick;
import com.lyn.axis.XAxis;
import com.lyn.axis.YAxis;
import com.lyn.common.*;
import com.lyn.constant.*;
import com.lyn.data.AxisData;
import com.lyn.data.LegendData;
import com.lyn.data.markData.markLine.LineMarkLineData;
import com.lyn.data.markData.markPoint.LineMarkPointData;
import com.lyn.data.series.LineSeriesData;
import com.lyn.data.series.PieSeriesData;
import com.lyn.feature.Restore;
import com.lyn.feature.SaveAsImage;
import com.lyn.option.LineOption;
import com.lyn.option.PieOption;
import com.lyn.series.LineSeries;
import com.lyn.series.MarkLine;
import com.lyn.series.MarkPoint;
import com.lyn.series.PieSeries;
import com.lyn.style.LabelStyle;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 组装option
 */
public class EChartsUtil {

    /**
     * 数值格式：纯数值|含百分号的数值
     */
    private static final String RADIUS_PATTERN = "^(\\d+(\\.\\d+)?%?)(,(\\d+(\\.\\d+)?%?))?$";
    private static final String TOOLTIP_FORMATTER = "function (params) {\n" +
            "            if (params !== undefined && params.length > 0) {\n" +
            "                var str = params[0].name + '<br/>';\n" +
            "                $.each(params, function (index, item) {\n" +
            "                    str += item.seriesName + \": \" + item.value + '<br/>';\n" +
            "                });\n" +
            "                return str;\n" +
            "            }\n" +
            "        }";

    public static Title buildTitle(String text, String subText, Boolean show, Object x, Object y) {
        Title title = new Title();
        title.setText(text);
        title.setSubtext(subText);
        title.setShow(show);
        title.setX(x);
        title.setY(y);
        return title;
    }

    public static MarkLine buildBaseMarkLine() {
        MarkLine markLine = new MarkLine();
        LineMarkLineData lineMarkLineData = new LineMarkLineData();
        lineMarkLineData.setName("平均值");
        lineMarkLineData.setType(MarkType.average);
        LineMarkLineData[] markLineData = {lineMarkLineData};
        markLine.setData(markLineData);
        return markLine;
    }

    public static MarkPoint buildBaseMarkPoint() {
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
     * @param type
     * @param data           数据项
     * @param nameGap
     * @param nameLocation
     * @param alignWithLabel
     * @param boundaryGap
     * @return
     */
    public static XAxis buildXAxis(String name, AxisType type, List data, Double nameGap, Object nameLocation, Boolean alignWithLabel, Object boundaryGap) {
        if (data == null && data.size() <= 0) {
            return null;
        }
        if (type == null) {
            type = AxisType.category;
        }
        XAxis xAxis = new XAxis();
        xAxis.setName(name);
        xAxis.setType(type);
        if (nameGap != null) {
            xAxis.setNameGap(nameGap);
        }
        if (nameLocation != null) {
            xAxis.setNameLocation(nameLocation);
        }
        if (alignWithLabel != null && alignWithLabel == true) {
            AxisTick axisTick = new AxisTick();
            axisTick.setAlignWithLabel(alignWithLabel);
            xAxis.setAxisTick(axisTick);
        }
        if (boundaryGap != null) {
            xAxis.setBoundaryGap(boundaryGap);
        }
        List<AxisData> axisDataList = new ArrayList<>();
        for (Object o : data) {
            AxisData temp = new AxisData();
            temp.setValue(o);
            axisDataList.add(temp);
        }
        AxisData[] axisData = new AxisData[axisDataList.size()];
        xAxis.setData((axisDataList.toArray(axisData)));
        return xAxis;
    }

    public static YAxis buildYAxis(String name, AxisType type, Double nameGap, Object nameLocation, String unit) {
        if (type == null) {
            type = AxisType.value;
        }
        YAxis yAxis = new YAxis();
        yAxis.setName(name);
        yAxis.setType(type);
        if (nameGap != null) {
            yAxis.setNameGap(nameGap);
        }
        if (nameLocation != null) {
            yAxis.setNameLocation(nameLocation);
        }

        AxisLabel axisLabel = new AxisLabel();
        if (unit == null || "".equals(unit)) {
            axisLabel.setFormatter("{value}");
        } else {
            axisLabel.setFormatter("{value}" + unit);
        }
        yAxis.setAxisLabel(axisLabel);

        return yAxis;
    }

    public static Legend buildLegend(LegendType type, Object left, Object top, Object right, Object bottom, List<String> data, Orient orient) {
        Legend legend = new Legend();
        if (type == null) {
            type = LegendType.plain;
        }
        legend.setType(type);
        if (left != null) {
            legend.setLeft(left);
        }
        if (top != null) {
            legend.setTop(top);
        }
        if (right != null) {
            legend.setRight(right);
        }
        if (bottom != null) {
            legend.setBottom(bottom);
        }
        if (orient != null) {
            legend.setOrient(orient);
        }
        if (data != null && data.size() > 0) {
            List<LegendData> legendDataList = new ArrayList<>();
            data.forEach(o -> legendDataList.add(new LegendData(o)));
            LegendData[] legendData = new LegendData[legendDataList.size()];
            legend.setData(legendDataList.toArray(legendData));
        }
        return legend;
    }

    public static LineSeries buildLineSeries(String name, ChartType type, List<Double> data) {
        if (data == null && data.size() <= 0) {
            return null;
        }
        LineSeries lineSeries = new LineSeries();
        lineSeries.setName(name);
        lineSeries.setType(type == null ? ChartType.line : type);
        lineSeries.setMarkLine(buildBaseMarkLine());
        lineSeries.setMarkPoint(buildBaseMarkPoint());
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
     * 生成饼图option
     *
     * @param text          标题
     * @param subText       副标题
     * @param legend        图例
     * @param pieSeriesList 系列
     * @return
     */
    public static PieOption buildPieOption(String text, String subText, Legend legend, List<PieSeries> pieSeriesList) {
        PieOption pieOption = new PieOption();
        Title title = buildTitle(text, subText, true, X.center, null);
        pieOption.setTitle(title);
        pieOption.setLegend(legend);
        PieSeries[] pieSeries = new PieSeries[pieSeriesList.size()];
        pieOption.setSeries(pieSeriesList.toArray(pieSeries));
        return pieOption;
    }

    /**
     * 创建饼图基本系列
     *
     * @param name   系列名称
     * @param type   默认为饼图系列
     * @param center 饼图圆心位置
     * @param radius 饼图半径
     * @param data   系列中的数值内容数组
     * @return
     */
    public static PieSeries buildPieSeries(String name, ChartType type, Object[] center, String radius, Map<String, Double> data) {
        if (data == null || data.size() <= 0) {
            return null;
        }
        PieSeries pieSeries = new PieSeries();
        pieSeries.setName(name);
        type = type == null ? ChartType.pie : type;
        pieSeries.setType(type);
        if (center != null && center.length == 2) {
            pieSeries.setCenter(center);
        }
        if (radius != null && isRadius(radius)) {
            pieSeries.setRadius(radius);
        }
        List<PieSeriesData> pieSeriesDataList = new ArrayList<>();
        Iterator<Map.Entry<String, Double>> iterator = data.entrySet().stream().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Double> next = iterator.next();
            String key = next.getKey();
            Double value = next.getValue();
            PieSeriesData pieSeriesData = new PieSeriesData();
            pieSeriesData.setName(key);
            pieSeriesData.setValue(value);
            pieSeriesDataList.add(pieSeriesData);
        }
        PieSeriesData[] pieSeriesData = new PieSeriesData[pieSeriesDataList.size()];
        pieSeries.setData(pieSeriesDataList.toArray(pieSeriesData));
        return pieSeries;
    }

    /**
     * 判断半径值是否为：数值|百分值|（数值或百分值的数组:容量=2）
     *
     * @param source
     * @return
     */
    private static Boolean isRadius(String source) {
        if ("".equals(source) || source == null) {
            return false;
        }
        if (source.startsWith("[") && source.endsWith("]")) {
            source = source.substring(source.indexOf('[') + 1, source.indexOf(']') - 1);
        }
        Pattern compile = Pattern.compile(RADIUS_PATTERN);
        Matcher matcher = compile.matcher(source);
        return matcher.matches();

    }

    public static Tooltip buildTooltip(TriggerType triggerType, String formatter, AxisPointer axisPointer) {
        Tooltip tooltip = new Tooltip();
        triggerType = triggerType == null ? TriggerType.item : triggerType;
        tooltip.setTrigger(triggerType);
        tooltip.setFormatter(formatter == null ? TOOLTIP_FORMATTER : formatter);
        tooltip.setAxisPointer(axisPointer);
        return tooltip;
    }

    public static Toolbox buildToolbox() {
        Toolbox toolbox = new Toolbox();
        Feature feature = new Feature();
        SaveAsImage saveAsImage = new SaveAsImage();
        saveAsImage.setTitle("下载");
        Restore restore = new Restore();
        restore.setTitle("刷新");
        feature.setSaveAsImage(saveAsImage);
        feature.setRestore(restore);
        toolbox.setFeature(feature);
        return toolbox;
    }

    /**
     * 绘制无数据空图的optipn
     *
     * @param text      标题
     * @param subText   子标题
     * @param xAxisName x轴名称
     * @param yAxisName y轴名称
     * @return
     */
    public static LineOption buildEmptyLineOption(String text, String subText, String xAxisName, String yAxisName) {
        LineOption lineOption = new LineOption();
        Title title = buildTitle(text, subText, true, X.center, null);
        lineOption.setTitle(title);
        XAxis xAxis = new XAxis();
        xAxis.setName(xAxisName);
        lineOption.setXAxis(xAxis);
        YAxis yAxis = new YAxis();
        yAxis.setName(yAxisName);
        lineOption.setYAxis(yAxis);
        return lineOption;
    }

    public static void main(String[] args) {
        List<String> legendData = new ArrayList<>();
        legendData.add("a");
        legendData.add("b");
        legendData.add("c");
        legendData.add("d");
        Legend legend = buildLegend(LegendType.plain, null, null, 20, null, legendData, Orient.vertical);
        String[] center = {"50%", "60%"};

        List<PieSeries> pieSeriesList = new ArrayList<>();
        Map<String, Double> pieSeriesData = new HashMap<>();
        pieSeriesData.put("a", 10.0);
        pieSeriesData.put("b", 20.0);
        pieSeriesData.put("c", 30.0);
        pieSeriesData.put("d", 40.0);
        PieSeries pieSeries = buildPieSeries("pieseries", ChartType.pie, center, "55%", pieSeriesData);
        pieSeriesList.add(pieSeries);
        PieOption pieOption = buildPieOption("主标题", "副标题", legend, pieSeriesList);

        Tooltip tooltip = buildTooltip(TriggerType.item, "{a}<br/>{b}:{c}({d})", null);
        pieOption.setTooltip(tooltip);

        Toolbox toolbox = buildToolbox();
        pieOption.setToolbox(toolbox);

        String pieOptionJson = JSONObject.toJSONString(pieOption);
        System.out.println(pieOptionJson);

        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        String format = decimalFormat.format(0.005715526470953327);
        System.out.println(format);
    }


}