package com.lyn.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class LineChartDataDTO implements Serializable {

    /**
     * 标题定义
     */
    private String text;
    private String subText;
    private Boolean show;
    //todo 标题位置待定

    /**
     * x轴参数定义
     */
    private String xAxisName;
    private Object xAxisNameLocation;
    private Double xAxisNameGap;
    /**
     * 类目值与刻度对齐
     */
    private Boolean xAxisAlignWithLabel;
    private List xAxisData;

    /**
     * y轴参数定义
     */
    private String yAxisName;
    private Object yAxisNameLocation;
    private Double yAxisNameGap;
    private String yAxisUnit;

}
