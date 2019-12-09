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

import com.lyn.style.AreaStyle;
import lombok.Data;

import java.io.Serializable;

/**
 * 坐标轴在 grid 区域中的分隔区域，默认不显示。
 *
 */
@Data
public class SplitArea implements Serializable {

    /**
     * 坐标轴分隔区域的显示间隔，在类目轴中有效。默认同 axisLabel.interval 一样。
     */
    private Object interval = "auto";

    /**
     * 是否显示分隔区域。 默认不显示
     * 默认值：false
     */
    private Boolean show = false;
    /**
     * 分隔区域的样式设置。
     */
    private AreaStyle areaStyle;
}
