package com.lyn.util;

import com.alibaba.fastjson.JSONObject;
import com.lyn.axis.*;
import com.lyn.common.Symbol;
import com.lyn.common.Title;
import com.lyn.constant.AxisType;
import com.lyn.constant.ChartType;
import com.lyn.data.AxisData;
import com.lyn.option.LineOption;
import com.lyn.series.LineSeries;
import com.lyn.series.MarkLine;
import com.lyn.series.MarkPoint;

import java.util.List;

public class LineChartUtil {


    public static Title buildTitle(String text, String subText, Boolean show) {
        Title title = new Title();
        title.setText(text);
        title.setSubtext(subText);
        title.setShow(show);
        return title;
    }

    public static XAxis buildXAxis(String name, AxisType type, AxisData[] data) {
        if (data == null && data.length <= 0) {
            return null;
        }
        if (type == null) {
            type = AxisType.category;
        }
        XAxis xAxis = new XAxis();
        xAxis.setName(name);
        xAxis.setType(type);
        xAxis.setData(data);
        return xAxis;
    }

    public static YAxis buildYAxis(String name, AxisType type, AxisLabel axisLabel, AxisTick axisTick) {
        if (type == null) {
            type = AxisType.value;
        }
        YAxis yAxis = new YAxis();
        yAxis.setName(name);
        yAxis.setType(type);
        yAxis.setAxisLabel(axisLabel);
        yAxis.setAxisTick(axisTick);
        return yAxis;
    }


    public static LineSeries buildLineSeries(String name, ChartType type, Symbol symbol, List<?> data, MarkLine markLine, MarkPoint markPoint) {

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
        getLineOption(null, "a", "b", "xxx", "yyy");

        //设置标题、副标题
        String text = "标题";
        String subText = "副标题";
        Title title = buildTitle(text, subText, true);

        //设置x轴

        //设置y轴

        //设置图例

        //展示系列数据

        //其他，如工具栏、提示框

    }

}
