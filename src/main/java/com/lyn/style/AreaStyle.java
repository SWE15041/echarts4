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

package com.lyn.style;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.io.Serializable;

/**
 * 分隔区域的样式设置。
 */
@Data
public class AreaStyle extends BaseStyle<AreaStyle> implements Serializable {

//    public AreaStyle() {
//        super();
//        this.setColor("['rgba(250,250,250,0.3)','rgba(200,200,200,0.3)']");
//    }
}

//    /**
//     * 分隔区域颜色。分隔区域会按数组中颜色的顺序依次循环设置颜色。默认是一个深浅的间隔色。
//     */
//    private String color = " ['rgba(250,250,250,0.3)','rgba(200,200,200,0.3)'] ";
//
//    /**
//     * 图形阴影的模糊大小。该属性配合 shadowColor,shadowOffsetX, shadowOffsetY 一起设置图形的阴影效果。
//     */
//    private Double shadowBlur;
//
//    /**
//     * 阴影颜色
//     */
//    private String shadowColor;
//
//    /**
//     * 阴影水平方向上的偏移距离。
//     * 默认值：0
//     */
//    private Double shadowOffsetX = 0.0;
//
//    /**
//     * 阴影垂直方向上的偏移距离。
//     * 默认值：0
//     */
//    private Double shadowOffsetY = 0.0;
//
//    /**
//     * 图形透明度。支持从 0 到 1 的数字，为 0 时不绘制该图形。
//     */
//    private Double opacity;