package com.lyn.style;


import com.lyn.constant.Align;
import com.lyn.constant.VerticalAlign;
import lombok.Data;

import java.io.Serializable;

@Data
public abstract class BaseStyle<T> implements Serializable {
    /**
     * 填充的颜色。
     */
    private String color;

    /**
     * 图形阴影的模糊大小。该属性配合 shadowColor,shadowOffsetX, shadowOffsetY 一起设置图形的阴影效果。
     */
    private Double shadowBlur;

    /**
     * 阴影颜色。支持的格式同color。
     */
    private String shadowColor;

    /**
     * 阴影水平方向上的偏移距离。
     * 默认值：0
     */
    private Double shadowOffsetX = 0.0;

    /**
     * 阴影垂直方向上的偏移距离。
     * 默认值：0
     */
    private Double shadowOffsetY = 0.0;

    /**
     * 图形透明度。支持从 0 到 1 的数字，为 0 时不绘制该图形
     */
    private Double opacity;

    /**
     * 图形的描边颜色;
     * 默认值："#000"
     */
    private String borderColor;

    /**
     * 描边线宽。为 0 时无描边。
     * 默认值: 0
     */
    private Double borderWidth;

    /**
     * 柱条的描边类型，默认为实线，支持 'solid', 'dashed', 'dotted'。
     * 默认值：'solid'
     */
    private String borderType;

    /**
     * 文字块的圆角。
     */
    private Object borderRadius;

    /**
     * 文字块背景色。
     */
    private String backgroundColor;

    /**
     * 文字水平对齐方式，默认自动。
     */
    private Align align;

    /**
     * 文字垂直对齐方式，默认自动。
     */
    private VerticalAlign verticalAlign;

    /**
     * 文字块的内边距。例如：padding: [3, 4, 5, 6]：表示 [上, 右, 下, 左] 的边距。
     */
    private Object padding;

}
