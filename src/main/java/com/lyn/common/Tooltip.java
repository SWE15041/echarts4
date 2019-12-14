/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2015 abel533@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.lyn.common;

import com.lyn.constant.TriggerType;
import com.lyn.style.TextStyle;
import lombok.Data;

/**
 * 提示框配置
 * 注意：series.tooltip 仅在 tooltip.triggerType 为 'item' 时有效。
 */
@Data
public class Tooltip implements Component {

    /**
     * 是否显示提示框浮层，默认显示。
     * 只需tooltip触发事件或显示axisPointer而不需要显示内容时可配置该项为false。
     */
    private Boolean showContent;
    /**
     * 触发类型，默认数据触发，见下图，可选为：'item' | 'axis'|'none'
     * 'item': 数据项图形触发，主要在散点图，饼图等无类目轴的图表中使用。
     * <p>
     * 'axis': 坐标轴触发，主要在柱状图，折线图等会使用类目轴的图表中使用。
     * 在 ECharts 2.x 中只支持类目轴上使用 axis triggerType，在 ECharts 3 中支持在直角坐标系和极坐标系上的所有类型的轴。并且可以通过 axisPointer.axis 指定坐标轴。
     * <p>
     * 'none': 什么都不触发。
     */
    private TriggerType triggerType;
    /**
     * 提示框触发的条件
     * [ default: 'mousemove|click' ]
     */
    private String triggerOn;

    /**
     * 内容格式器：{string}（Template） | {Function}，支持异步回调见表格下方
     */
    private String islandFormatter;
    /**
     * 浮层显示的延迟，单位为 ms，默认没有延迟，也不建议设置。在 triggerOn 为 'mousemove' 时有效。
     * 默认值：0
     */
    private Double showDelay;
    /**
     * 浮层隐藏的延迟，单位为 ms，在 alwaysShowContent 为 true 的时候无效。
     * 默认值：100
     */
    private Double hideDelay;

    /**
     * 鼠标是否可进入提示框浮层中，默认为false，如需详情内交互，如添加链接，按钮，可设置为 true。
     * 默认值：false
     */
    private Boolean enterable;

    /**
     * 浮层的渲染模式，默认以 'html 即额外的 DOM 节点展示 tooltip；
     * 此外还可以设置为 'richText' 表示以富文本的形式渲染，渲染的结果在图表对应的 Canvas 中（目前 SVG 尚未支持富文本），这对于一些没有 DOM 的环境（如微信小程序）有更好的支持。
     */
    private String renderMode;

    /**
     * 是否将 tooltip 框限制在图表的区域内。
     * <p>
     * 当图表外层的 dom 被设置为 'overflow: hidden'，或者移动端窄屏，导致 tooltip 超出外界被截断时，此配置比较有用。
     * <p>
     * 默认值：false
     */
    private Boolean confine;

    /**
     * 提示框浮层的移动动画过渡时间，单位是 s，设置为 0 的时候会紧跟着鼠标移动。
     * 默认值：0.4
     */
    private Double transitionDuration;

    /**
     * 提示框浮层的位置，默认不设置时位置会跟随鼠标的位置
     */
    private Object position;

    /**
     * 提示框浮层内容格式器，支持字符串模板和回调函数两种形式。
     * 支持：1, 字符串模板
     * 模板变量有 {a}, {b}，{c}，{d}，{e}，分别表示系列名，数据名，数据值等。 在 triggerType 为 'axis' 的时候，会有多个系列的数据，此时可以通过 {a0}, {a1}, {a2} 这种后面加索引的方式表示系列的索引。 不同图表类型下的 {a}，{b}，{c}，{d} 含义不一样。 其中变量{a}, {b}, {c}, {d}在不同图表类型下代表数据含义为：
     * <p>
     * 折线（区域）图、柱状（条形）图、K线图 : {a}（系列名称），{b}（类目值），{c}（数值）, {d}（无）
     * <p>
     * 散点图（气泡）图 : {a}（系列名称），{b}（数据名称），{c}（数值数组）, {d}（无）
     * <p>
     * 地图 : {a}（系列名称），{b}（区域名称），{c}（合并数值）, {d}（无）
     * <p>
     * 饼图、仪表盘、漏斗图: {a}（系列名称），{b}（数据项名称），{c}（数值）, {d}（百分比）
     * <p>
     * 2, 回调函数
     * <p>
     * 字符串模板 模板变量有：
     * {a}：系列名。
     * {b}：数据名。
     * {c}：数据值。
     * {@xxx}：数据中名为'xxx'的维度的值，如{@product}表示名为'product'` 的维度的值。
     * {@[n]}：数据中维度n的值，如{@[3]}` 表示维度 3 的值，从 0 开始计数。
     */
    private String formatter;

    /**
     * 提示框浮层的背景颜色。
     */
    private String backgroundColor;

    /**
     * 提示框浮层的边框颜色。
     */
    private String borderColor;

    /**
     * 提示框浮层的边框宽。
     */
    private Double borderWidth;

    /**
     * 提示框浮层内边距，单位px，默认各方向内边距为5，接受数组分别设定上右下左边距。
     * <p>
     * <p>
     * > 设置内边距为 5
     * padding: 5
     * > 设置上下的内边距为 5，左右的内边距为 10
     * padding: [5, 10]
     * > 分别设置四个方向的内边距
     * padding: [
     * 5,  // 上
     * 10, // 右
     * 5,  // 下
     * 10, // 左
     * ]
     */
    private Double padding;

    /**
     * 文本样式，默认为白色字体
     */
    private TextStyle textStyle;

    /**
     * 额外附加到浮层的 css 样式。
     */
    private String extraCssText;

    /**
     * 是否永远显示提示框内容，默认情况下在移出可触发提示框区域后 一定时间 后隐藏，设置为 true 可以保证一直显示提示框内容。
     */
    private Boolean alwaysShowContent;

    /**
     * 坐标轴指示器配置项。
     */
    private AxisPointer axisPointer;

}
