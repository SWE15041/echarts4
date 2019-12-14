package com.lyn.common;

import com.lyn.constant.PointerStatus;
import com.lyn.constant.PointerType;
import com.lyn.constant.TriggerOn;
import com.lyn.style.LineStyle;
import com.lyn.style.ShadowStyle;
import lombok.Data;

import java.io.Serializable;

/**
 * 坐标轴指示器，坐标轴触发有效
 * 例子：https://www.echartsjs.com/examples/en/editor.html?c=line-tooltip-touch&edit=1&reset=1
 */
@Data
public class AxisPointer implements Serializable {

    /**
     * 组件 ID。默认不指定。指定则可用于在 option 或者 API 中引用组件。
     */
    private String id;

    /**
     * 默认不显示指示器。
     * 但是如果 tooltip.triggerType 设置为 'axis' 或者 tooltip.axisPointer.type 设置为 'cross'，则自动显示 axisPointer。
     * 坐标系会自动选择显示显示哪个轴的 axisPointer，也可以使用 tooltip.axisPointer.axis 改变这种选择。
     * 默认值：false
     */
    private Boolean show = false;

    /**
     * 默认为直线，可选为：'line' | 'shadow' | 'cross'
     */
    private PointerType type = PointerType.line;

    /**
     * 坐标轴指示器是否自动吸附到点上。默认自动判断。
     * <p>
     * 这个功能在数值轴和时间轴上比较有意义，可以自动寻找细小的数值点。
     */
    private Boolean snap;

    /**
     * 坐标轴指示器的 z 值。控制图形的前后顺序。z值小的图形会被z值大的图形覆盖。
     */
    private Double z;

    /**
     * 坐标轴指示器的文本标签。
     * todo : 待编辑
     */
    private Object label;

    /**
     * axisPointer.type 为 'line' 时有效。
     */
    private LineStyle lineStyle;

    /**
     * 设置阴影指示器
     */
    private ShadowStyle shadowStyle;

    /**
     * 是否触发 tooltip。如果不想触发 tooltip 可以关掉。
     * 默认值： true
     */
    private Boolean triggerTooltip = true;

    /**
     * 当前的 value。在使用 axisPointer.handle 时，可以设置此值进行初始值设定，从而决定 axisPointer 的初始位置。
     */
    private Double value;

    /**
     * 当前的状态，可取值为 'show' 和 'hide'。
     */
    private PointerStatus status;

    /**
     * 拖拽手柄，适用于触屏的环境
     */
    private Handle handle;

    /**
     * 不同轴的 axisPointer 可以进行联动，在这里设置。联动表示轴能同步一起活动。轴依据他们的 axisPointer 当前对应的值来联动。
     * todo  类型：数组
     */
    private Object link;

    /**
     * 提示框触发的条件
     * [ default: 'mousemove|click' ]
     */
    private String triggerOn = TriggerOn.mousemove + "|" + TriggerOn.click;


}
