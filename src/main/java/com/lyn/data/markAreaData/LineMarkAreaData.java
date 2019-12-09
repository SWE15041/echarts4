package com.lyn.data.markAreaData;

import com.lyn.common.Emphasis;
import com.lyn.style.ItemStyle;
import com.lyn.style.LabelStyle;
import lombok.Data;

@Data
public class LineMarkAreaData implements MarkAreaData {

    /**
     * 特殊的标注类型，用于标注最大值最小值等。
     * 可选:
     * -'min' 最大值。
     * -'max' 最大值。
     * -'average' 平均值。
     */
    private String type;

    /**
     * 在使用 type 时有效，用于指定在哪个维度上指定最大值最小值，可以是 0（xAxis, radiusAxis），1（yAxis, angleAxis），默认使用第一个数值轴所在的维度。
     */
    private Double valueIndex;

    /**
     * 在使用 type 时有效，用于指定在哪个维度上指定最大值最小值。这可以是维度的直接名称，例如折线图时可以是x、angle等、candlestick 图时可以是open、close等维度名称。
     */
    private String valueDim;

    /**
     * 起点或终点的坐标。坐标格式视系列的坐标系而定，可以是直角坐标系上的 x, y，也可以是极坐标系上的 radius, angle。
     */
    private Object coord;

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

    private ItemStyle itemStyle;

    private LabelStyle label;

    private Emphasis emphasis;

    }
