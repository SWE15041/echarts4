package com.lyn.axis;

import com.lyn.common.AxisPointer;
import com.lyn.common.Component;
import com.lyn.constant.AxisPosition;
import com.lyn.constant.AxisType;
import com.lyn.data.AxisData;
import com.lyn.style.NameTextStyle;
import lombok.Data;

/**
 * 坐标轴定义
 */
@Data
public abstract class Axis implements Component {

    /**
     * 组件 ID。默认不指定。指定则可用于在 option 或者 API 中引用组件。
     */
    private String id;

    /**
     * 是否显示坐标轴
     * 默认值：true
     */
    private Boolean show;

    /**
     * x|y 轴所在的 grid 的索引，默认位于第一个 grid
     * 默认值：0
     */
    private Double gridIndex;

    /**
     * x轴：默认 grid 中的第一个 x 轴在 grid 的下方（'bottom'），第二个 x 轴视第一个 x 轴的位置放在另一侧。
     * <p>
     * y轴：默认 grid 中的第一个 y 轴在 grid 的左侧（'left'），第二个 y 轴视第一个 y 轴的位置放在另一侧。
     */
    private AxisPosition position;

    /**
     * 相对于x|y轴的偏移量
     * 默认值：0
     */
    private Double offset;

    /**
     * 如果没有设置 type，但是设置了 axis.data，则认为 type 是 'category'。
     * 如果设置了 type 是 'category'，但没有设置 axis.data，则 axis.data 的内容会自动从 series.data 中获取，这会比较方便。
     * 坐标轴类型，X轴默认为类目型'category'，Y轴默认为数值型'value'
     */
    private AxisType type;

    /**
     * 坐标轴名称
     */
    private String name;

    /**
     * 坐标轴名称显示位置。
     * [ default: 'end' ]
     * 可选值：AxisNameLocation.xxx|数值|百分值
     */
    private Object nameLocation;

    /**
     * 坐标轴名称的文字样式。
     */
    private NameTextStyle nameTextStyle;

    /**
     * 坐标轴名称与轴线之间的距离。
     * 默认值：15
     */
    private Double nameGap;

    /**
     * 坐标轴名字旋转，角度值。
     * 默认值 ：null
     */
    private Double nameRotate;

    /**
     * 是否是反向坐标轴。ECharts 3 中新加。
     * 默认值：false
     */
    private Boolean inverse;

    /**
     * 坐标轴两边留白策略，类目轴和非类目轴的设置和表现不一样。
     * <p>
     * 类目轴中 boundaryGap 可以配置为 true 和 false。默认为 true，这时候刻度只是作为分隔线，标签和数据点都会在两个刻度之间的带(band)中间。
     * <p>
     * 非类目轴，包括时间，数值，对数轴，boundaryGap是一个两个值的数组，分别表示数据最小值和最大值的延伸范围，可以直接设置数值或者相对的百分比，在设置 min 和 max 后无效。 示例：
     * <p>
     * boundaryGap: ['20%', '20%']
     * <p>
     * 数据类型：数组或者布尔值
     */
    private Object boundaryGap;

    /**
     * 坐标轴刻度最小值。
     * 默认值：null
     */
    private Object min;

    /**
     * 坐标轴刻度最大值。
     * 默认值：null
     */
    private Object max;

    /**
     * 只在数值轴中（type: 'value'）有效。
     * <p>
     * 是否是脱离 0 值比例。设置成 true 后坐标刻度不会强制包含零刻度。在双数值轴的散点图中比较有用。
     * <p>
     * 在设置 min 和 max 之后该配置项无效。
     * 默认值：   false
     */
    private Boolean scale;

    /**
     * 坐标轴的分割段数，需要注意的是这个分割段数只是个预估值，最后实际显示的段数会在这个基础上根据分割后坐标轴刻度显示的易读程度作调整。
     * <p>
     * 在类目轴中无效。
     * 默认值：5
     */
    private Double splitNumber;

    /**
     * 自动计算的坐标轴最小间隔大小。
     * 只在数值轴或时间轴中（type: 'value' 或 'time'）有效。
     * 默认值：0
     */
    private Double minInterval;

    /**
     * 自动计算的坐标轴最大间隔大小。
     * 只在数值轴或时间轴中（type: 'value' 或 'time'）有效。
     */
    private Double maxInterval;

    /**
     * 强制设置坐标轴分割间隔。
     * 无法在类目轴中使用。在时间轴（type: 'time'）中需要传时间戳，在对数轴（type: 'log'）中需要传指数值。
     */
    private Double interval;

    /**
     * 对数轴的底数，只在对数轴中（type: 'log'）有效。
     * 默认值：10
     */
    private Double logBase;

    /**
     * 坐标轴是否是静态无法交互。
     * 默认值：false
     */
    private Boolean silent;

    /**
     * 坐标轴的标签是否响应和触发鼠标事件，默认不响应。
     * 默认值：false
     */
    private Boolean triggerEvent;

    /**
     * 坐标轴轴线相关设置。
     */
    private AxisLine axisLine;

    /**
     * 坐标轴刻度相关设置。
     */
    private AxisTick axisTick;

    /**
     * 坐标轴刻度标签的相关设置。
     */
    private AxisLabel axisLabel;

    /**
     * 坐标轴在 grid 区域中的分隔线。
     */
    private SplitLine splitLine;

    /**
     * 坐标轴在 grid 区域中的分隔区域，默认不显示。
     */
    private SplitArea splitArea;

    /**
     * 类目数据，在类目轴（type: 'category'）中有效。
     * 如果设置了 type 是 'category'，但没有设置 axis.data，则 axis.data 的内容会自动从 series.data 中获取，这会比较方便。
     */
    private AxisData[] data;

    /**
     * 坐标轴指示器
     */
    private AxisPointer axisPointer;

    /**
     * X|Y 轴所有图形的 zlevel 值。
     * 默认值：0
     */
    private Double zlevel;

    /**
     * X|Y 轴组件的所有图形的z值。控制图形的前后顺序。z值小的图形会被z值大的图形覆盖。
     * <p>
     * z相比zlevel优先级更低，而且不会创建新的 Canvas。
     */
    private Double z;

}
