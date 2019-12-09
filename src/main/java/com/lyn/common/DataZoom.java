package com.lyn.common;

import com.lyn.constant.FilterMode;
import com.lyn.constant.Orient;
import lombok.Data;

/**
 * dataZoom 组件 用于区域缩放，从而能自由关注细节的数据信息，或者概览数据整体，或者去除离群点的影响。
 * <p>
 * 现在支持这几种类型的 dataZoom 组件：
 * <p>
 * 内置型数据区域缩放组件（dataZoomInside）：内置于坐标系中，使用户可以在坐标系上通过鼠标拖拽、鼠标滚轮、手指滑动（触屏上）来缩放或漫游坐标系。
 * <p>
 * 滑动条型数据区域缩放组件（dataZoomSlider）：有单独的滑动条，用户在滑动条上进行缩放或漫游。
 * <p>
 * 框选型数据区域缩放组件（dataZoomSelect）：提供一个选框进行数据区域缩放。即 toolbox.feature.dataZoom，配置项在 toolbox 中。
 */
@Data
public class DataZoom implements Component {

    /**
     * 可选值：'inside'|'slider'
     * 默认值：'inside'
     */
    private String type;

    /**
     * 组件 ID。默认不指定。指定则可用于在 option 或者 API 中引用组件。
     */
    private String id;

    /**
     * 是否停止组件的功能。
     * 默认值：false
     */
    private Boolean disabled;

    /**
     * 设置 dataZoom-inside 组件控制的 x轴（即xAxis，是直角坐标系中的概念，参见 grid）。
     * 不指定时，当 dataZoom-inside.orient 为 'horizontal'时，默认控制和 dataZoom 平行的第一个 xAxis。但是不建议使用默认值，建议显式指定。
     * 数值类型：double|数值
     * 默认值：null
     */
    private Object xAxisIndex;

    /**
     * 同xAxisIndex
     */
    private Object yAxisIndex;

    /**
     * 数值类型： number| Array
     * 设置 dataZoom-inside 组件控制的 radius 轴（即radiusAxis，是直角坐标系中的概念，参见 polar）。
     * 如果是 number 表示控制一个轴，如果是 Array 表示控制多个轴。
     * 默认值：null
     */
    private Object radiusAxisIndex;

    /**
     * 设置 dataZoom-inside 组件控制的 angle 轴（即angleAxis，是直角坐标系中的概念，参见 polar）。
     * <p>
     * 如果是 number 表示控制一个轴，如果是 Array 表示控制多个轴。
     * 默认值：null
     */
    private Object angleAxisIndex;

    /**
     * dataZoom 的运行原理是通过 数据过滤 来达到 数据窗口缩放 的效果。数据过滤模式的设置不同，效果也不同。
     * 默认值：'filter'
     */
    private FilterMode filterMode;

    /**
     * 数据窗口范围的起始百分比。范围是：0 ~ 100。表示 0% ~ 100%。
     */
    private Double start;

    /**
     * 数据窗口范围的结束百分比。范围是：0 ~ 100。
     */
    private Double end;

    /**
     * 数值类型：number| string| Date
     * 数据窗口范围的起始数值。如果设置了 dataZoom-inside.start 则 startValue 失效。
     * 默认值：null
     */
    private Object startValue;

    /**
     * 同startValue
     */
    private Object endValue;

    /**
     * 用于限制窗口大小的最小值（百分比值），取值范围是 0 ~ 100。
     * 默认值：null
     */
    private Double minSpan;

    /**
     * 用于限制窗口大小的最大值（百分比值），取值范围是 0 ~ 100。
     * 默认值：null
     */
    private Double maxSpan;

    /**
     * 数值类型：number| string| Date
     * 用于限制窗口大小的最小值（实际数值）。
     * 默认值：null
     */
    private Object minValueSpan;

    /**
     * 同minValueSpan
     */
    private Object maxValueSpan;

    /**
     * 布局方式是横还是竖。不仅是布局方式，对于直角坐标系而言，也决定了，缺省情况控制横向数轴还是纵向数轴。
     * 可选值：
     * -'horizontal'：水平
     * -'vertical'：竖直。
     * 默认值：null
     */
    private Orient orient;

    /**
     * 是否锁定选择区域（或叫做数据窗口）的大小。
     * 默认值：false
     */
    private Boolean zoomLock;

    /**
     * 设置触发视图刷新的频率。单位为毫秒（ms）。
     * 如果 animation 设为 true 且 animationDurationUpdate 大于 0，可以保持 throttle 为默认值 100（或者设置为大于 0 的值），否则拖拽时有可能画面感觉卡顿。
     * 如果 animation 设为 false 或者 animationDurationUpdate 设为 0，且在数据量不大时，拖拽时画面感觉卡顿，可以把尝试把 throttle 设为 0 来改善。
     * 默认值：100
     */
    private Double throttle;

    /**
     * 数值类型：Array
     */
    private Object rangeMode;

    /**
     * 数值类型：布尔|string
     * true：表示不按任何功能键，鼠标滚轮能触发缩放。
     * false：表示鼠标滚轮不能触发缩放。
     * 'shift'：表示按住 shift 和鼠标滚轮能触发缩放。
     * 'ctrl'：表示按住 ctrl 和鼠标滚轮能触发缩放。
     * 'alt'：表示按住 alt 和鼠标滚轮能触发缩放。
     * <p>
     * 可选：KeyBoardValue.xxx
     * 默认值 ：true
     */
    private Object zoomOnMouseWheel;

    /**
     * 同zoomOnMouseWheel
     */
    private Object moveOnMouseMove;

    /**
     * 同zoomOnMouseWheel
     */
    private Object moveOnMouseWheel;

    /**
     * 是否阻止 mousemove 事件的默认行为。
     * 默认值：true
     */
    private Boolean preventDefaultMouseMove;

}
