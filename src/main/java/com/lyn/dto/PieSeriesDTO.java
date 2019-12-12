package com.lyn.dto;

import com.lyn.constant.ChartType;
import lombok.Data;

import java.util.Map;

@Data
public class PieSeriesDTO {
    /**
     * 系列名称
     */
    private String name;
    /**
     * 系列类型
     */
    private ChartType type;


    /**
     * 饼图圆心位置
     */
    private Object[] center = new Object[2];

    /**
     * 饼图半径
     */
    private Object radius;

    /**
     * 系列数据
     * Map<数据项名称,数据项值> data
     */
    private Map<String, Double> data;

}
