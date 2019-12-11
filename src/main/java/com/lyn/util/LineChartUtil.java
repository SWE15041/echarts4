package com.lyn.util;

import com.alibaba.fastjson.JSONObject;
import com.lyn.axis.Axis;
import com.lyn.axis.AxisLabel;
import com.lyn.axis.XAxis;
import com.lyn.axis.YAxis;
import com.lyn.common.Legend;
import com.lyn.common.Symbol;
import com.lyn.common.Title;
import com.lyn.constant.AxisType;
import com.lyn.constant.ChartType;
import com.lyn.constant.LegendType;
import com.lyn.data.AxisData;
import com.lyn.data.LegendData;
import com.lyn.data.series.LineSeriesData;
import com.lyn.dto.LegendDTO;
import com.lyn.dto.LineFormatDataDTO;
import com.lyn.dto.SeriesDTO;
import com.lyn.option.LineOption;
import com.lyn.series.LineSeries;
import com.lyn.series.MarkLine;
import com.lyn.series.MarkPoint;

import java.util.ArrayList;
import java.util.List;

public class LineChartUtil {

    public static LineOption buildOption(LineFormatDataDTO lineFormatDataDTO, LegendDTO legendDTO, List<SeriesDTO> seriesDTOList) {

        LineOption lineOption = new LineOption();

        String text = lineFormatDataDTO.getText();
        String subText = lineFormatDataDTO.getSubText();
        Boolean show = lineFormatDataDTO.getShow();
        Title title = buildTitle(text, subText, show);
        lineOption.setTitle(title);

        String xAxisName = lineFormatDataDTO.getXAxisName();
        Double xAxisNameGap = lineFormatDataDTO.getXAxisNameGap();
        Object xAxisNameLocation = lineFormatDataDTO.getXAxisNameLocation();
        List xAxisData = lineFormatDataDTO.getXAxisData();
        XAxis xAxis = buildXAxis(xAxisName, AxisType.category, xAxisData, xAxisNameGap, xAxisNameLocation);
        lineOption.setXAxis(xAxis);

        String yAxisName = lineFormatDataDTO.getYAxisName();
        Double yAxisNameGap = lineFormatDataDTO.getYAxisNameGap();
        Object yAxisNameLocation = lineFormatDataDTO.getYAxisNameLocation();
        String yAxisUnit = lineFormatDataDTO.getYAxisUnit();
        buildYAxis(yAxisName, AxisType.value, yAxisNameGap, yAxisNameLocation, yAxisUnit);

        if (legendDTO != null) {
            Legend legend = buildLegend(legendDTO);
            lineOption.setLegend(legend);
        }

        if (seriesDTOList != null && seriesDTOList.size() > 0) {
            List<LineSeries> lineSeriesList = new ArrayList<>();
            for (SeriesDTO seriesDTO : seriesDTOList) {
                LineSeries lineSeries = buildLineSeries(seriesDTO);
                lineSeriesList.add(lineSeries);
            }
            LineSeries[] lineSeries = new LineSeries[lineSeriesList.size()];
            lineOption.setSeries(lineSeriesList.toArray(lineSeries));

        }
        return lineOption;

    }


    public static Title buildTitle(String text, String subText, Boolean show) {
        Title title = new Title();
        title.setText(text);
        title.setSubtext(subText);
        title.setShow(show);
        return title;
    }

    public static XAxis buildXAxis(String name, AxisType type, List data, Double nameGap, Object nameLocation) {
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
        List<AxisData> axisDataList = new ArrayList<>();
        for (Object o : data) {
            AxisData temp = new AxisData();
            temp.setValue(o);
            axisDataList.add(temp);
        }
        xAxis.setData(((AxisData[]) axisDataList.toArray()));
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
        axisLabel.setFormatter("{value}" + unit);
        yAxis.setAxisLabel(axisLabel);

        return yAxis;
    }

    public static Legend buildLegend(LegendType type, Object left, Object top, Object right, Object bottom, List<String> data) {
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
        if (data != null && data.size() > 0) {
            List<LegendData> legendDataList = new ArrayList<>();
            data.forEach(o -> legendDataList.add(new LegendData(o)));
            LegendData[] legendData = new LegendData[legendDataList.size()];
            legend.setData(legendDataList.toArray(legendData));
        }
        return legend;
    }

    public static Legend buildLegend(LegendDTO dto) {
        LegendType type = dto.getType();
        Object left = dto.getLeft();
        Object top = dto.getTop();
        Object right = dto.getRight();
        Object bottom = dto.getBottom();
        List<String> data = dto.getData();
        Legend legend = buildLegend(type, left, top, right, bottom, data);
        return legend;
    }

    public static LineSeries buildLineSeries(String name, ChartType type, List<Double> data, Symbol symbol, MarkLine markLine, MarkPoint markPoint) {
        if (data == null && data.size() <= 0) {
            return null;
        }
        LineSeries lineSeries = new LineSeries();
        lineSeries.setName(name);
        if (type == null) {
            type = ChartType.line;
        }
        lineSeries.setType(type);
        List<LineSeriesData> lineSeriesDataList = new ArrayList<>();
        data.forEach(o -> lineSeriesDataList.add(new LineSeriesData(o)));
        LineSeriesData[] lineSeriesData = new LineSeriesData[lineSeriesDataList.size()];
        lineSeries.setData(lineSeriesDataList.toArray(lineSeriesData));

        return lineSeries;
    }

    public static LineSeries buildLineSeries(SeriesDTO dto) {
        String name = dto.getName();
        List<Double> data = dto.getData();
        ChartType type = dto.getType();
        LineSeries lineSeries = buildLineSeries(name, type, data, null, null, null);
        return lineSeries;
    }

    public static LineSeries checkLegend() {
        return null;
    }

    public static LineOption getLineOption(LineSeries[] series, String text, String subText, String xAxisName, String yAxisName) {
        if (series == null || series.length <= 0) {
            LineOption lineOption = new LineOption();
            Title title = new Title();
            title.setText(text);
            title.setSubtext(subText);

            Axis xAxis = new XAxis();
            xAxis.setName(xAxisName);

            Axis yAxis = new YAxis();
            yAxis.setName(yAxisName);

            lineOption.setTitle(title);
            lineOption.setXAxis(xAxis);
            lineOption.setYAxis(yAxis);

            String string = JSONObject.toJSONString(lineOption);
            System.out.println(string);
        }


        return null;
    }


    public static LineSeries[] formatData(List<?> originalData) {
        if (originalData == null && originalData.size() <= 0) {
            return null;
        }
        LineSeries[] series = new LineSeries[originalData.size()];
//        LineSeriesData[]
        return null;
    }

    public static void main(String[] args) {
//        getLineOption(null, "a", "b", "xxx", "yyy");

        //设置标题、副标题
        String text = "标题";
        String subText = "副标题";
        Title title = buildTitle(text, subText, true);

        //设置x轴

        //设置y轴

        //设置图例

        //展示系列数据

        //其他，如工具栏、提示框
        Legend legend = new Legend();
        List<String> data = new ArrayList<>();
        data.add("1");
        data.add("2");
        data.add("3");
        List<LegendData> legendDataList = new ArrayList<>();
        data.forEach(o -> legendDataList.add(new LegendData(o)));
        LegendData[] legendData = new LegendData[legendDataList.size()];
        legend.setData(legendDataList.toArray(legendData));
        System.out.println(legend);
    }

}
