package com.lyn.data.markData;

import com.lyn.common.Emphasis;
import com.lyn.style.ItemStyle;
import com.lyn.style.LabelStyle;
import lombok.Data;

import java.io.Serializable;

@Data
public abstract class BaseMarkData implements Serializable {

    /**
     * 标注名称，将会作为文字显示。
     * 默认值：起点
     */
    private String name;

    /**
     * 相对容器的屏幕 x 坐标，单位像素，支持百分比形式，例如 '20%'。
     */
    private Double x;

    /**
     * 相对容器的屏幕 y 坐标，单位像素，支持百分比形式，例如 '20%'。
     */
    private Double y;

    /**
     * 标域值，可以不设。
     */
    private Double value;

    private LabelStyle label;

    private Emphasis emphasis;
}
