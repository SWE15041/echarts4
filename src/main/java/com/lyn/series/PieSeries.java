package com.lyn.series;

import com.lyn.common.LabelLine;
import com.lyn.data.series.PieSeriesData;
import lombok.Data;

@Data
public class PieSeries extends BaseSeries<PieSeries> {

    /**
     * 是否启用图例 hover 时的联动高亮。
     * 默认值：true
     */
    private Boolean hoverAnimation;

    /**
     * 是否开启 hover 在扇区上的放大动画效果。
     * 默认值：10
     */
    private Double hoverOffset;

    /**
     * 选中模式，表示是否支持多个选中，默认关闭，支持布尔值和字符串，字符串取值可选'single'，'multiple'，分别表示单选还是多选。
     * 默认值：false;
     */
    private Object selectedMode;

    /**
     * 选中扇区的偏移距离。
     * 默认值：10
     */
    private Double selectedOffset;

    /**
     * 饼图的扇区是否是顺时针排布。
     * 默认值：true
     */
    private Boolean clockwise;

    /**
     * 起始角度，支持范围[0, 360]。
     * 默认值： 90
     */
    private Double startAngle;

    /**
     * 最小的扇区角度（0 ~ 360），用于防止某个值过小导致扇区太小影响交互。
     * 默认值：0
     */
    private Double minAngle;

    /**
     * 小于这个角度（0 ~ 360）的扇区，不显示标签（label 和 labelLine）。
     * 默认值：0
     */
    private Double minShowLabelAngle;

    /**
     * 值类型：布尔|字符串
     * 是否展示成南丁格尔图，通过半径区分数据大小。可选择两种模式：
     * 'radius' 扇区圆心角展现数据的百分比，半径展现数据的大小。
     * 'area' 所有扇区圆心角相同，仅通过半径展现数据大小。
     * 默认值：false
     */
    private Object roseType;

    /**
     * 是否启用防止标签重叠策略，默认开启，在标签拥挤重叠的情况下会挪动各个标签的位置，防止标签间的重叠。
     * 默认值：true
     */
    private Boolean avoidLabelOverlap;

    /**
     * 是否在数据和为0（一般情况下所有数据为0） 的时候不显示扇区。
     * 默认值：true
     */
    private Boolean stillShowZeroSum;

    /**
     * 标签的视觉引导线样式，在 label 位置 设置为'outside'的时候会显示视觉引导线。
     */
    private LabelLine labelLine;

    private PieSeriesData[] data;

}
