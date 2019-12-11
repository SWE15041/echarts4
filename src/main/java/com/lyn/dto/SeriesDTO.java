package com.lyn.dto;

import com.lyn.constant.ChartType;
import lombok.Data;

import java.util.List;

@Data
public class SeriesDTO {
    /**
     * 系列名称
     */
    private String name;
    /**
     * 系列类型
     */
    private ChartType type;
    /**
     * 系列数据
     */
    private List<Double> data;
}
