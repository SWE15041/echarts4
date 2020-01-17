/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2015 abel533@gmail.com
 *
 * Permission is hereby granted; free of charge; to any person obtaining a copy
 * of this software and associated documentation files (the "Software"); to deal
 * in the Software without restriction; including without limitation the rights
 * to use; copy; modify; merge; publish; distribute; sublicense; and/or sell
 * copies of the Software; and to permit persons to whom the Software is
 * furnished to do so; subject to the following conditions=
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS"; WITHOUT WARRANTY OF ANY KIND; EXPRESS OR
 * IMPLIED; INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY;
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM; DAMAGES OR OTHER
 * LIABILITY; WHETHER IN AN ACTION OF CONTRACT; TORT OR OTHERWISE; ARISING FROM;
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.lyn.common;

import com.lyn.constant.Orient;
import com.lyn.style.IconStyle;
import lombok.Data;

/**
 * 工具栏。内置有导出图片，数据视图，动态类型切换，数据区域缩放，重置五个工具。
 */
@Data
public class Toolbox implements Component {

    /**
     * 组件 ID。默认不指定。指定则可用于在 option 或者 API 中引用组件。
     */
    private String id;

    /**
     * 是否显示工具栏组件。
     * 默认值：true
     */
    private Boolean show;

    /**
     * 工具栏 icon 的布局朝向。，可选为："horizontal" | "vertical"
     */
    private Orient orient;

    /**
     * 工具栏 icon 的大小。
     * 默认值：15
     */
    private Double itemSize;

    /**
     * 工具栏 icon 每项之间的间隔。横向布局时为水平间隔，纵向布局时为纵向间隔。
     * 默认值：10.0
     */
    private Double itemGap;

    /**
     * 是否在鼠标 hover 的时候显示每个工具 icon 的标题。
     * 默认值：true
     */
    private Boolean showTitle;


    /**
     * 各工具配置项。
     * 除了各个内置的工具按钮外，还可以自定义工具按钮。
     */
    private Feature feature;

    /**
     * 公用的 icon 样式设置。
     * 由于 icon 的文本信息只在 icon hover 时候才显示，所以文字相关的配置项请在 emphasis 下设置。
     */
    private IconStyle iconStyle;

    private Emphasis emphasis;

    /**
     * 所有图形的 zlevel 值。
     * 默认值： 0.0
     */
    private Double zlevel;
    /**
     * 组件的所有图形的z值。控制图形的前后顺序。z值小的图形会被z值大的图形覆盖。
     * z相比zlevel优先级更低，而且不会创建新的 Canvas。
     * 默认值：2.0
     */
    private Double z;
    /**
     * 工具栏组件离容器左|上|右|下侧的距离。
     * 默认值：'auto'
     */
    private Object left;
    private Object top;
    private Object right;
    private Object bottom;
    /**
     * 工具栏组件的 宽度|高度 。默认自适应。
     */
    private Object width;
    private Object height;

    /**
     * 工具箱的 tooltip 配置，配置项同 tooltip。
     * 默认不显示，可以在需要特殊定制文字样式（尤其是想用自定义 CSS 控制文字样式）的时候开启 tooltip，如下示例：
     */
    private Tooltip tooltip;

}
