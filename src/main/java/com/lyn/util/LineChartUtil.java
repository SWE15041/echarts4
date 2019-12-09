package com.lyn.util;

import com.alibaba.fastjson.JSONObject;
import com.lyn.axis.Axis;
import com.lyn.common.Title;
import com.lyn.option.LineOption;
import com.lyn.series.LineSeries;

import java.util.List;

public class LineChartUtil {

    public static LineOption getLineOption(List<?> originalData, String text, String subText, String xAxisName, String yAxisName) {
        if (originalData == null || originalData.size() <= 0) {
            LineOption lineOption = new LineOption();
            Title title = new Title();
            title.setText(text);
            title.setSubtext(subText);

            Axis xAxis = new Axis();
            xAxis.setName(xAxisName);

            Axis yAxis = new Axis();
            yAxis.setName(yAxisName);

            lineOption.setTitle(title);
            lineOption.setXAxis(xAxis);
            lineOption.setYAxis(yAxis);

            String string = JSONObject.toJSONString(lineOption);
            System.out.println(string);
        }


        return null;
    }

    public static LineSeries[] formatData( List<?> originalData){
        LineSeries[] series;

        return null;
    }

    public static void main(String[] args) {
        getLineOption(null, "a", "b", "xxx", "yyy");

    }

}
