package com.lyn.style;

import com.lyn.constant.LineType;
import lombok.Data;

/**
 * 线的定义
 * <p>
 * axisPointer.type 为 'line' 时有效。
 */
@Data
public class LineStyle extends BaseStyle<LineStyle> {

    /**
     * 线宽。
     * 默认值：1
     */
    private Double width;
    /**
     * 线的类型。，可选为：'solid' | 'dotted' | 'dashed'
     * [ default: solid ]
     */
    private LineType type;

}

  /*  public LineStyle() {
        this.setColor("#555");
        this.setWidth(1.0);
        this.setType(LineType.solid);
        this.setShadowOffsetX(0.0);
        this.setShadowOffsetY(0.0);
    }*/
//    /**
//     * 阳线颜色
//     */
//    private String color = "#555";
//
//    /**
//     * 线宽。
//     * 默认值：1
//     */
//    private Double width = 1.0;
//
//    /**
//     * 线的类型。，可选为：'solid' | 'dotted' | 'dashed'
//     * [ default: solid ]
//     */
//    private LineType type = LineType.solid;
//
//    /**
//     * 图形阴影的模糊大小。该属性配合 shadowColor,shadowOffsetX, shadowOffsetY 一起设置图形的阴影效果。
//     */
//    private Double shadowBlur;
//
//    /**
//     * 阴影颜色。支持的格式同color。
//     */
//    private String shadowColor;
//
//    /**
//     * 阴影水平方向上的偏移距离。
//     * 默认值：0
//     */
//    private Double shadowOffsetX = 0.0;
//
//    /**
//     * 阴影垂直方向上的偏移距离。
//     * 默认值：0
//     */
//    private Double shadowOffsetY = 0.0;
//
//    /**
//     * 图形透明度。支持从 0 到 1 的数字，为 0 时不绘制该图形
//     */
//    private Double opacity;