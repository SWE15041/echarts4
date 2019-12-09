package com.lyn.style;


import lombok.Data;

import java.io.Serializable;

/**
 * 坐标轴名称的文字样式。
 */
@Data
public class NameTextStyle extends TextStyle implements Serializable {

    public NameTextStyle() {
        super();
        this.setBackgroundColor("transparent");
        this.setShadowBlur(0.0);
        this.setShadowColor("transparent");
        this.setShadowOffsetX(0.0);
        this.setShadowOffsetY(0.0);
        this.setBorderColor("transparent");
        this.setBorderWidth(0.0);
        this.setBorderRadius(0);
        this.setPadding(0);
    }
}

//    /**
//     * 文字水平对齐方式，默认自动。
//     */
//    private Align align;
//
//    /**
//     * 文字垂直对齐方式，默认自动。
//     */
//    private VerticalAlign verticalAlign;
//    /**
//     * 文字块背景色。
//     */
//    private String backgroundColor = "transparent";
//    /**
//     * 文字块边框宽度。
//     */
//    private String borderColor = "transparent";
//    /**
//     * 文字块的圆角。数组类型
//     * 默认值：0
//     */
//    private Object borderWidth = 0;
//
//    /**
//     * 文字块的圆角。
//     */
//    private Object borderRadius = 0;
//    /**
//     * 文字块的内边距。例如：padding: [3, 4, 5, 6]：表示 [上, 右, 下, 左] 的边距。
//     */
//    private Object padding = 0;
//    /**
//     * 文字块的背景阴影颜色。
//     */
//    private String shadowColor = "transparent";
//    /**
//     * 文字块的背景阴影长度。
//     */
//    private Double shadowBlur = 0.0;
//    /**
//     * 文字块的背景阴影 X 偏移。
//     */
//    private Double shadowOffsetX = 0.0;
//
//    /**
//     * 文字块的背景阴影 Y 偏移。
//     */
//    private Double shadowOffsetY = 0.0;
