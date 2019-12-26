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

import com.lyn.constant.Orient;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 组件的基础类
 *
 */
@Data
public abstract class Basic<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 是否显示
     */
    private Boolean show;
    /**
     * 水平安放位置，默认为左侧，可选为：'center' | 'left' | 'right' | {number}（x坐标，单位px）
     */
    private Object align;
    /**
     * 垂直安放位置，默认为全图顶端，可选为：'top' | 'bottom' | 'center' | {number}（y坐标，单位px）
     */
    private Object verticalAlign;
    /**
     * 标题背景颜色，默认透明
     */
    private String backgroundColor;
    /**
     * 标题边框颜色
     */
    private String borderColor;
    /**
     * 浮层的边框宽。
     */
    private Integer borderWidth;
    /**
     * 圆角半径，单位px，支持传入数组分别指定 4 个圆角半径。 如:
     *
     * borderRadius: 5, // 统一设置四个角的圆角大小
     * borderRadius: [5, 5, 0, 0] //（顺时针左上，右上，右下，左下）
     *
     * 默认值：0
     */
    private Object borderRadius;
    /**
     * 标题内边距，单位px，默认各方向内边距为5，接受数组分别设定上右下左边距，同css，见下图
     */
    private Object padding;
    /**
     * 主副标题纵向间隔，单位px，默认为10
     */
    private Double itemGap;

    /**
     * 图例标记的图形宽度。
     * 默认值：25
     */
    private Double itemWidth;

    /**
     * 图例标记的图形高度。
     * 默认值：14
     */
    private Double itemHeight;

    /**
     * 一级层叠控制
     */
    private Integer zlevel;
    /**
     * 二级层叠控制
     */
    private Integer z;
    /**
     * xxx 组件离容器左侧的距离
     */
    private Object left;
    /**
     * xxx 组件离容器上侧的距离
     */
    private Object top;
    /**
     * xxx 组件离容器右侧的距离
     */
    private Object right;
    /**
     * xxx 组件离容器下侧的距离
     */
    private Object bottom;
    /**
     * xxx 组件的宽度
     */
    private Object width;
    /**
     * xxx 组件的高度
     */
    private Object height;

    /**
     * 图例列表的布局朝向。
     * 可选：
     *  -'horizontal'
     *  -'vertical'
     *  默认值：'horizontal'
     */
    private Orient orient;
    /**
     * 图形阴影的模糊大小。该属性配合 shadowColor,shadowOffsetX, shadowOffsetY 一起设置图形的阴影效果
     */
    private Integer shadowBlur;
    /**
     * 阴影颜色
     */
    private String shadowColor;
    /**
     * 阴影水平方向上的偏移距离
     */
    private Integer shadowOffsetX;
    /**
     * 阴影垂直方向上的偏移距离
     */
    private Integer shadowOffsetY;

}
