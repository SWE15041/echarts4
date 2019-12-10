package com.lyn.style;

import lombok.Data;

/**
 * 标注的样式。
 * 图形样式
 * 支持: line | pie
 */
@Data
public class ItemStyle extends BaseStyle<ItemStyle> {
//
//    public ItemStyle() {
//        this.setBorderColor("#000");
//        this.setBorderWidth(0.0);
//        this.setBorderType("solid");
//    }
}

//    /**
//     * 图形的颜色。 默认从全局调色盘 option.color 获取颜色；
//     * 全局默认值：['#c23531','#2f4554', '#61a0a8', '#d48265', '#91c7ae','#749f83',  '#ca8622', '#bda29a','#6e7074', '#546570', '#c4ccd3']
//     * 图形的颜色:线性渐变|径向渐变|纹理填充（无）
//     * default: 自适应
//     */
//    private Color color;
//
//    /**
//     * 图形的描边颜色;
//     * 默认值："#000"
//     */
//    private String borderColor = "#000";
//
//    /**
//     * 描边线宽。为 0 时无描边。
//     * 默认值: 0
//     */
//    private Double borderWidth = 0.0;
//
//    /**
//     * 柱条的描边类型，默认为实线，支持 'solid', 'dashed', 'dotted'。
//     * 默认值：'solid'
//     */
//    private String borderType = "'solid'";
//
//    /**
//     * 图形阴影的模糊大小。该属性配合 shadowColor,shadowOffsetX, shadowOffsetY 一起设置图形的阴影效果。
//     */
//    private Double shadowBlur;
//
//    /**
//     * 阴影颜色
//     */
//    private Color shadowColor;
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
//     * 图形透明度。支持从 0 到 1 的数字，为 0 时不绘制该图形。
//     */
//    private Double opacity;
