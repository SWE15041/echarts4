package com.lyn.series;

import com.lyn.data.MarkLineData;
import com.lyn.style.LineStyle;
import lombok.Data;

/**
 * 图表标线。
 */
@Data
public class MarkLine extends BaseMark {

    /**
     * 标记的图形。
     * 可以通过 'image://url' 设置为图片，其中 URL 为图片的链接，或者 dataURI。
     * 可选 ：symbol.xxx|'image://url....'
     */
    private Object symbol;

    /**
     * 标记的大小，可以设置成诸如 10 这样单一的数字，也可以用数组分开表示宽和高，例如 [20, 10] 表示标记宽为20，高为10。
     * 默认值 : 4
     */
    private Object symbolSize;

    /**
     * 标线数值的精度，在显示平均值线的时候有用。
     */
    private Double precision;

    private LineStyle lineStyle;

    private MarkLineData[] data;

}
