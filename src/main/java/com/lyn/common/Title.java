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

import com.lyn.constant.Align;
import com.lyn.constant.VerticalAlign;
import com.lyn.style.TextStyle;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * 标题组件，包含主标题和副标题。
 */
@Data
public class Title extends Basic<Title> implements Component {


    /**
     * 组件 ID。默认不指定。
     */
    private String id;
    /**
     * 是否显示标题组件。
     * 默认值：true;
     */
    private Boolean show;

    /**
     * 主标题文本，'\n'指定换行
     */
    private String text;

    /**
     * 主标题文本超链接
     */
    private String link;

    /**
     * 指定窗口打开主标题超链接，支持'self' | 'blank'，不指定等同为'blank'（新窗口）
     */
    private String target;

    /**
     * 主标题文本样式（详见textStyle）
     */
    private TextStyle textStyle;

    /**
     * 副标题文本，'\n'指定换行
     */
    private String subtext;

    /**
     * 副标题文本超链接
     */
    private String sublink;

    /**
     * 指定窗口打开副标题超链接，支持'self' | 'blank'，不指定等同为'blank'（新窗口）
     */
    private String subtarget;

    /**
     * 默认值{color: '#aaa'}，副标题文本样式
     */
    private TextStyle subtextStyle;

    /**
     * 水平对齐方式，默认根据x设置自动调整，可选为： left' | 'right' | 'center
     */
    private Align textAlign;

    /**
     * [ default: 'auto' ]
     * 整体（包括 text 和 subtext）的垂直对齐。
     * <p>
     * 可选值：'auto'、'top'、'bottom'、'middle'。
     */
    private VerticalAlign textVerticalAlign;

    /**
     * 是否触发事件。
     * 默认值：false
     */
    private Boolean triggerEvent;

    /**
     * 距离容器的距离
     * 可选值类型：X.xxx|数值|百分值
     */
    private Object x;

    /**
     * 距离容器的距离
     * 可选值类型：Y.xxx|数值|百分值
     */
    private Object y;
}
