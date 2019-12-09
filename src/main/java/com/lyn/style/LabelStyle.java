package com.lyn.style;

import lombok.Data;

/**
 * series 下的label
 */
@Data
public class LabelStyle extends TextStyle {

    /**
     * 是否显示刻度标签。
     * 默认值：true
     */
    private Boolean show;

    /**
     * 标签的位置。可选：[x, y] ;例子：[10, 10], ['50%', '50%']
     * 默认值：'top'
     * 定义值：LabelPosition
     * 例子：https://www.echartsjs.com/examples/en/view.html?c=doc-example/label-position
     */
    private Object position;

    /**
     * 距离图形元素的距离。当 position 为字符描述值（如 'top'、'insideRight'）时候有效。
     * 例子：https://www.echartsjs.com/examples/en/view.html?c=doc-example/label-position
     * 默认值：5
     */
    private Double distance;

    /**
     * 刻度标签旋转的角度，在类目轴的类目标签显示不下的时候可以通过旋转防止标签之间重叠。
     * <p>
     * 旋转的角度从 -90 度到 90 度。
     * <p>
     * 默认值：0
     */
    private Double rotate;

    /**
     * 是否对文字进行偏移。默认不偏移。例如：[30, 40] 表示文字在横向上偏移 30，纵向上偏移 40。
     */
    private Object offset;

    /**
     * 刻度标签的内容格式器，支持字符串模板和回调函数两种形式。
     * 默认值：null
     */
    private Object formatter;

    /**
     * 刻度标签是否朝内，默认朝外。
     * 默认值：false
     */
    private Boolean inside;

    /**
     * 坐标轴刻度标签的显示间隔，在类目轴中有效。
     */
    private Object interval;

    /**
     * 刻度标签与轴线之间的距离。
     * 默认值：8
     */
    private Double margin;

    /**
     * 是否显示最小 tick 的 label。可取值 true, false, null。默认自动判定（即如果标签重叠，不会显示最小 tick 的 label）。
     * 默认值：null
     */
    private Boolean showMinLabel;

    /**
     * 是否显示最大 tick 的 label。可取值 true, false, null。默认自动判定（即如果标签重叠，不会显示最大 tick 的 label）。
     */
    private Boolean showMaxLabel;

}
