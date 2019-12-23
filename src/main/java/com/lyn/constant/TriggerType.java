package com.lyn.constant;

/**
 * 触发类型。
 * 可选：
 * <p>
 * 'item'
 * <p>
 * 数据项图形触发，主要在散点图，饼图等无类目轴的图表中使用。
 * <p>
 * 'axis'
 * <p>
 * 坐标轴触发，主要在柱状图，折线图等会使用类目轴的图表中使用。
 * <p>
 * 在 ECharts 2.x 中只支持类目轴上使用 axis trigger，在 ECharts 3 中支持在直角坐标系和极坐标系上的所有类型的轴。并且可以通过 axisPointer.axis 指定坐标轴。
 * <p>
 * 'none'
 * <p>
 * 什么都不触发。
 */
public enum TriggerType {
    item, axis, none
}
