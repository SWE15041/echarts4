package com.lyn.series;

import com.lyn.common.Emphasis;
import com.lyn.common.Tooltip;
import com.lyn.constant.ChartType;
import com.lyn.style.ItemStyle;
import com.lyn.style.LabelStyle;
import lombok.Data;

import java.io.Serializable;

@Data
public abstract class BaseSeries<T> implements Serializable {
    /**
     * 图表类型
     */
    private ChartType type;

    /**
     * 组件 ID。默认不指定。
     */
    private String id;

    /**
     * 系列名称，用于tooltip的显示，legend 的图例筛选，在 setOption 更新数据和配置项时用于指定对应的系列。
     */
    private String name;

    /**
     * 是否启用图例 hover 时的联动高亮。
     * 默认值 ：true
     */
    private Boolean legendHoverLink;

    /**
     * 图形上的文本标签，可用于说明图形的一些数据信息，比如值，名称等。
     */
    private LabelStyle label;

    /**
     * -折线拐点标志的样式。
     *
     */
    private ItemStyle itemStyle;

    private Emphasis emphasis;

    /**
     * 鼠标悬浮时在图形元素上时鼠标的样式是什么。同 CSS 的 cursor。
     * 默认值：'pointer'
     */
    private String cursor;

    /**
     * 折线图所有图形的 zlevel 值。
     * 默认值：0
     */
    private Double zlevel;

    /**
     * 折线图组件的所有图形的z值。控制图形的前后顺序。z值小的图形会被z值大的图形覆盖。
     */
    private Double z;

    /**
     * 图形是否不响应和触发鼠标事件，默认为 false，即响应和触发鼠标事件。
     */
    private Boolean silent;

    /**
     *
     * 使用 dimensions 定义 series.data 或者 dataset.source 的每个维度的信息。
     * 数据类型：数组
     */
    private Object dimensions;

    /**
     * 当使用 dataset 时，seriesLayoutBy 指定了 dataset 中用行还是列对应到系列上，也就是说，系列“排布”到 dataset 的行还是列上。可取值：
     *
     * 'column'：默认，dataset 的列对应于系列，从而 dataset 中每一列是一个维度（dimension）。
     * 'row'：dataset 的行对应于系列，从而 dataset 中每一行是一个维度（dimension）。
     *
     * 默认值：'column'
     */
    private String seriesLayoutBy;

    /**
     * 如果 series.data 没有指定，并且 dataset 存在，那么就会使用 dataset。datasetIndex 指定本系列使用那个 dataset。如果 series.data 没有指定，并且 dataset 存在，那么就会使用 dataset。datasetIndex 指定本系列使用那个 dataset。
     *
     * 默认值：0
     */
    private Double datasetIndex;

    private MarkPoint markPoint;

    private MarkLine markLine;

    private MarkArea markArea;

    /**
     * 是否开启动画。
     * 默认值：true
     */
    private Boolean animation;

    /**
     * 是否开启动画的阈值，当单个系列显示的图形数量大于这个阈值时会关闭动画。
     * 默认值：2000
     */
    private Double animationThreshold;

    /**
     * 初始动画的时长，支持回调函数，可以通过每个数据返回不同的 delay 时间实现更戏剧的初始动画效果：
     * 默认值：1000
     */
    private Double animationDuration;

    /**
     * 初始动画的缓动效果。
     * 默认值：linear
     */
    private Double animationEasing;

    /**
     * 初始动画的延迟，支持回调函数，可以通过每个数据返回不同的 delay 时间实现更戏剧的初始动画效果。
     * 默认值：0
     */
    private Object animationDelay;

    /**
     * 数据更新动画的时长。
     * 默认值：0
     */
    private Object animationDurationUpdate;

    /**
     * 数据更新动画的缓动效果。
     * 默认值：cubicOut
     */
    private String animationEasingUpdate;

    /**
     * 数据更新动画的延迟，支持回调函数，可以通过每个数据返回不同的 delay 时间实现更戏剧的更新动画效果。
     * 默认值：0
     */
    private Object animationDelayUpdate;

    /**
     * 提示框设置
     */
    private Tooltip tooltip;


}
