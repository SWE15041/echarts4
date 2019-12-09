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

import com.lyn.constant.LineType;
import com.lyn.style.LineStyle;
import lombok.Data;

import java.io.Serializable;

/**
 * 坐标轴线
 *
 * @author liuzh
 */
@Data
public class AxisLine implements Serializable {

    /**
     * 默认显示，属性show控制显示与否
     */
    private Boolean show = true;
    /**
     * 定位到垂直方向的0值坐标上
     */
    private Boolean onZero = true;

    /**
     * 当有双轴时，可以用这个属性手动指定，在哪个轴的 0 刻度上。
     */
    private Double onZeroAxisIndex;

    /**
     * 轴线两边的箭头。可以是字符串，表示两端使用同样的箭头；或者长度为 2 的字符串数组，分别表示两端的箭头。
     * 默认不显示箭头，即 'none'。
     * 两端都显示箭头可以设置为 'arrow';
     * 只在末端显示箭头可以设置为 ['none', 'arrow']。
     */
    private Object symbol = "none";

    /**
     * 轴线两边的箭头的大小，第一个数字表示宽度（垂直坐标轴方向），第二个数字表示高度（平行坐标轴方向）。
     * 默认值：[10, 15]
     */
    private Object symbolSize = "[10, 15]";

    /**
     * 轴线两边的箭头的偏移，如果是数组，第一个数字表示起始箭头的偏移，第二个数字表示末端箭头的偏移；如果是数字，表示这两个箭头使用同样的偏移。
     */
    private Object symbolOffset = "[0，0]";

    /**
     * {color: '#333', width: 1, type: 'solid'}
     */
    private LineStyle lineStyle;

    public LineStyle getLineStyle() {
        if (lineStyle != null) {
            lineStyle = new LineStyle();
            lineStyle.setColor("#333");
            lineStyle.setWidth(1.0);
            lineStyle.setType(LineType.solid);
        }
        return lineStyle;
    }

    public void setLineStyle(LineStyle lineStyle) {
        this.lineStyle = lineStyle;
    }
}
