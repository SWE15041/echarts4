package com.lyn.dto;

import com.lyn.constant.LegendType;
import com.lyn.data.LegendData;
import lombok.Data;

import java.util.List;

@Data
public class LegendDTO {
    /**
     * 图例的类型。可选值：'plain'|'scroll'
     */
    private LegendType type;
    /**
     * xxx 组件离容器左侧的距离
     */
    private Object left;
    /**
     * xxx 组件离容器上侧的距离
     */
    private Object top;
    /**
     * xxx 组件离容器右侧的距离
     */
    private Object right;
    /**
     * xxx 组件离容器下侧的距离
     */
    private Object bottom;

    /**
     * 图例名称数组
     */
    private List<String> data;
}
