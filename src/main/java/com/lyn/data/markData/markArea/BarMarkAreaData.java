package com.lyn.data.markData.markArea;

import com.lyn.data.MarkAreaData;
import com.lyn.data.markData.BaseMarkData;
import com.lyn.style.ItemStyle;
import lombok.Data;

@Data
public class BarMarkAreaData  extends BaseMarkData implements MarkAreaData {

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
    private  Double valueIndex;

    /**
     * 在使用 type 时有效，用于指定在哪个维度上指定最大值最小值。这可以是维度的直接名称，例如折线图时可以是x、angle等、candlestick 图时可以是open、close等维度名称。
     */
    private String valueDim;

    /**
     * 起点或终点的坐标。坐标格式视系列的坐标系而定，可以是直角坐标系上的 x, y，也可以是极坐标系上的 radius, angle。
     */
    private Object coord;


    private ItemStyle itemStyle;
}   
