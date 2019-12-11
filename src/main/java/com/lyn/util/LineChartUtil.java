package com.lyn.util;

import com.alibaba.fastjson.JSONObject;
import com.lyn.axis.AxisLabel;
import com.lyn.axis.AxisTick;
import com.lyn.axis.XAxis;
import com.lyn.axis.YAxis;
import com.lyn.common.Legend;
import com.lyn.common.Symbol;
import com.lyn.common.Title;
import com.lyn.constant.AxisNameLocation;
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
        Boolean alignWithLabel = lineFormatDataDTO.getXAxisAlignWithLabel();
        List xAxisData = lineFormatDataDTO.getXAxisData();
        XAxis xAxis = buildXAxis(xAxisName, AxisType.category, xAxisData, xAxisNameGap, xAxisNameLocation, alignWithLabel);
        lineOption.setXAxis(xAxis);

        String yAxisName = lineFormatDataDTO.getYAxisName();
        Double yAxisNameGap = lineFormatDataDTO.getYAxisNameGap();
        Object yAxisNameLocation = lineFormatDataDTO.getYAxisNameLocation();
        String yAxisUnit = lineFormatDataDTO.getYAxisUnit();
        YAxis yAxis = buildYAxis(yAxisName, AxisType.value, yAxisNameGap, yAxisNameLocation, yAxisUnit);
        lineOption.setYAxis(yAxis);

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

    public static XAxis buildXAxis(String name, AxisType type, List data, Double nameGap, Object nameLocation, Boolean alignWithLabel) {
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

    public static void main(String[] args) {

        LineFormatDataDTO lineDTO = new LineFormatDataDTO();
        lineDTO.setText("机器流量图");
        lineDTO.setSubText("pps影音");
        lineDTO.setShow(true);

        lineDTO.setXAxisName("时间");
        lineDTO.setXAxisNameGap(20.0);
        lineDTO.setXAxisNameLocation(AxisNameLocation.center);
        lineDTO.setXAxisAlignWithLabel(true);
        List<String> xAxisData = new ArrayList<>();
        xAxisData.add("星期一");
        xAxisData.add("星期二");
        xAxisData.add("星期三");
        xAxisData.add("星期四");
        lineDTO.setXAxisData(xAxisData);

        lineDTO.setYAxisName("流量");
        lineDTO.setYAxisNameGap(80.0);
        lineDTO.setYAxisUnit("Mbps");
        lineDTO.setYAxisNameLocation(AxisNameLocation.center);

        LegendDTO legendDTO = new LegendDTO();
//        lineDTO.setLegendDTO(legendDTO);

        List<SeriesDTO> seriesDTOS = new ArrayList<>();
        SeriesDTO seriesDTO = new SeriesDTO();
        seriesDTO.setName("吐出流量");
        seriesDTO.setType(ChartType.line);
        List<Double> seriesData1 = new ArrayList<>();
        seriesData1.add(10.0);
        seriesData1.add(20.0);
        seriesData1.add(30.0);
        seriesData1.add(30.0);
        seriesDTO.setData(seriesData1);
        seriesDTOS.add(seriesDTO);

        LineOption lineOption = buildOption(lineDTO, legendDTO, seriesDTOS);
        String option = JSONObject.toJSONString(lineOption);
        System.out.println(option);

    }

}
