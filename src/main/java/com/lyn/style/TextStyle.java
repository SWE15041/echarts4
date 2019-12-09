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

import com.lyn.constant.FontStyle;
import lombok.Data;

import java.io.Serializable;

/**
 * 基础文本样式
 */
@Data
public class TextStyle extends BaseStyle<TextStyle> implements Serializable {


    /**
     * 样式，可选为：'normal' | 'italic' | 'oblique'
     */
    private FontStyle fontStyle;
    /**
     * 粗细，可选为：'normal' | 'bold' | 'bolder' | 'lighter' | 100 | 200 |... | 900
     */
    private Object fontWeight;
    /**
     * 字体系列
     * 可以是 'serif' , 'monospace', 'Arial', 'Courier New', 'Microsoft YaHei', ...
     */
    private String fontFamily;
    /**
     * 字号 ，单位px
     * 默认：12px
     */
    private Integer fontSize;

    /**
     * 行高
     */
    private Double lineHeigh;

    /**
     * 文字块的宽度。一般不用指定，不指定则自动是文字的宽度。
     */
    private Double width;

    /**
     * 文字块的高度。一般不用指定，不指定则自动是文字的高度。
     */
    private Double height;

    /**
     * 文字本身的描边颜色。
     */
    private String textBorderColor;

    /**
     * 文字本身的描边宽度。
     */
    private Double textBorderWidth;

    /**
     * 文字本身的阴影颜色。
     */
    private String textShadowColor;

    /**
     * 文字本身的阴影长度。
     */
    private Double textShadowBlur;

    /**
     * 文字本身的阴影 X 偏移。
     */
    private Double textShadowOffsetX;

    /**
     * 文字本身的阴影 Y 偏移。
     */
    private Double textShadowOffsetY;

    /*public TextStyle() {
        this.setColor("#fff");
        this.fontStyle = FontStyle.normal;
        this.fontWeight = FontWeight.normal;
        this.fontFamily = "sans-serif";
        this.fontSize = 12;
        this.textBorderColor = "transparent";
        this.textBorderWidth = 0.0;
        this.textShadowColor = "transparent";
        this.textShadowBlur = 0.0;
        this.textShadowOffsetX = 0.0;
        this.textShadowOffsetY = 0.0;
    }*/

}
