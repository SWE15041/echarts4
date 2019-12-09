package com.lyn.common;

import com.lyn.style.LineStyle;
import lombok.Data;

/**
 * 标签的视觉引导线样式，在 label 位置 设置为'outside'的时候会显示视觉引导线。
 */
@Data
public class LabelLine {
    /**
     * 是否显示视觉引导线。
     */
    private Boolean show;
    /**
     * 视觉引导线第一段的长度。
     */
    private Double length;

    /**
     * 视觉引导项第二段的长度。
     */
    private Double length2;

    /**
     * 可选数值类型：布尔|字符串
     * 是否平滑视觉引导线，默认不平滑，可以设置成 true 平滑显示，也可以设置为 0 到 1 的值，表示平滑程度。
     * 默认值：false
     */
    private Object smooth;

    private LineStyle lineStyle;

}
