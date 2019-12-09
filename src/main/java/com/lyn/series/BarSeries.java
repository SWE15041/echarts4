package com.lyn.series;

import com.lyn.data.BarSeriesData;
import lombok.Data;

@Data
public class BarSeries extends BaseSeries<BarSeries> {

    /**
     * 该系列使用的坐标系，可选：'cartesian2d'|'polar'
     * > 'cartesian2d': 使用二维的直角坐标系（也称笛卡尔坐标系），通过 xAxisIndex, yAxisIndex指定相应的坐标轴组件。
     * > 'polar': 使用极坐标系，通过 polarIndex 指定相应的极坐标组件
     */
    private String coordinateSystem;

    /**
     * 使用的 x 轴的 index，在单个图表实例中存在多个 x 轴的时候有用。
     * 默认值 ：0
     */
    private Integer xAxisIndex;

    /**
     * 使用的 y 轴的 index，在单个图表实例中存在多个 y轴的时候有用。
     * 默认值：0
     */
    private Integer yAxisIndex;

    /**
     * 是否在环形柱条两侧使用圆弧效果。仅对极坐标系柱状图有效。
     * 默认值：false
     */
    private  Boolean roundCap;

    /**
     * 数据堆叠，同个类目轴上系列配置相同的stack值后，后一个系列的值会在前一个系列的值上相加。
     * 默认值：null
     */
    private String stack;

    /**
     *  柱条的宽度，不设时自适应。
     *  可以是绝对值例如 40 或者百分数例如 '60%'。百分数基于自动计算出的每一类目的宽度。
     */
    private String barWidth;

    /**
     * 柱条的最大宽度。
     * 比 barWidth 优先级高。
     * 可以是绝对值例如 40 或者百分数例如 '60%'。百分数基于自动计算出的每一类目的宽度。
     */
    private String barMaxWidth;

    /**
     * 柱条的最小宽度。在直角坐标系中，默认值是 1。否则默认值是 null。
     */
    private String barMinWidth;

    /**
     * 柱条最小高度，可用于防止某数据项的值过小而影响交互。
     */
    private String barMinHeight;

    /**
     * 不同系列的柱间距离，为百分比（如 '30%'，表示柱子宽度的 30%）。
     */
    private String barGap;

    /**
     * 同一系列的柱间距离，默认为类目间距的20%，可设固定值
     */
    private String barCategoryGap;

    /**
     * 是否开启大数据量优化，在数据图形特别多而出现卡顿时候可以开启。
     * 开启后配合 largeThreshold 在数据量大于指定阈值的时候对绘制进行优化。
     */
    private Boolean large;

    /**
     * 开启绘制优化的阈值。
     * 默认值：400
     */
    private Double largeThreshold;

    /**
     * 渐进式渲染时每一帧绘制图形数量，设为 0 时不启用渐进式渲染，支持每个系列单独配置。
     */
    private Double progressive;

    /**
     *  启用渐进式渲染的图形数量阈值，在单个系列的图形数量超过该阈值时启用渐进式渲染。
     *  默认值：3000
     */
    private Double progressiveThreshold;

    /**
     * 分片的方式。可选值：
     * -'sequential': 按照数据的顺序分片。缺点是渲染过程不自然。
     * -'mod': 取模分片，即每个片段中的点会遍布于整个数据，从而能够视觉上均匀得渲染。
     */
    private String progressiveChunkMode;

    private BarSeriesData[] data;
}
