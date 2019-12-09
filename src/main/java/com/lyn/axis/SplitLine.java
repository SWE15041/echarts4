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
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 坐标轴在 grid 区域中的分隔线。
 */
@Data
public class SplitLine implements Serializable {

    private static final long serialVersionUID = 6968396515815364363L;

    /**
     * 默认显示，属性show控制显示与否
     */
    private Boolean show = true;
    /**
     * 小标记是否显示为间隔，默认等于boundaryGap
     */
    private Object interval = "auto";
    /**
     * 属性lineStyle（详见lineStyle）控制线条样式
     */
    private LineStyle lineStyle;

    public LineStyle getLineStyle() {
        if (lineStyle != null) {
            lineStyle = new LineStyle();
            lineStyle.setType(LineType.solid);
            lineStyle.setColor("#ccc");
            lineStyle.setWidth(1.0);
        }
        return lineStyle;
    }

    public void setLineStyle(LineStyle lineStyle) {
        this.lineStyle = lineStyle;
    }
}
