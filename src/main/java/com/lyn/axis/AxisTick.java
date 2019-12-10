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

package com.lyn.axis;

import com.lyn.style.LineStyle;
import lombok.Data;

import java.io.Serializable;

/**
 * 坐标轴 刻度 相关设置。
 */
@Data
public class AxisTick implements Serializable {

    /**
     * 是否显示坐标轴刻度。
     * 默认值：true
     */
    private Boolean show;

    /**
     * 类目轴中在 boundaryGap 为 true 的时候有效，可以保证刻度线和标签对齐。
     * 默认值：false
     */
    private Boolean alignWithLabel;

    /**
     * 坐标轴刻度的显示间隔，在类目轴中有效。
     * >  0 : 强制显示所有标签。
     * >  1 : 表示『隔一个标签显示一个标签』
     * >  2 : 表示隔两个标签显示一个标签
     * 以此类推
     * <p>
     * 小标记显示挑选间隔，默认为'auto'，可选为：
     * 'auto'（自动隐藏显示不下的） | 0（全部显示） | {number}（用户指定选择间隔）
     */
    private Object interval;

    /**
     * 坐标轴刻度的长度。
     * 默认值：5
     */
    private Integer length;

    /**
     * 坐标轴刻度是否朝内，默认朝外。
     * 默认值：false
     */
    private Boolean inside;

    /**
     * 属性lineStyle控制线条样式，（详见lineStyle）
     */
    private LineStyle lineStyle;

}
