package com.lyn.option;

import com.lyn.base.Color;
import com.lyn.common.*;
import lombok.Data;

import java.io.Serializable;

@Data
public abstract class Option<T> implements Serializable {
    private Title title;
    private Tooltip tooltip;
    private Toolbox toolbox;
    private DataZoom[] dataZoom;
    private Legend legend;
    /**
     * 调色盘颜色列表。如果系列没有设置颜色，则会依次循环从该列表中取颜色作为系列颜色。
     * 默认为：
     * ['#c23531','#2f4554', '#61a0a8', '#d48265', '#91c7ae','#749f83',  '#ca8622', '#bda29a','#6e7074', '#546570', '#c4ccd3']
     */
    private String[] color;
}
