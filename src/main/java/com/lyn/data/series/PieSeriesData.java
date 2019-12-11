package com.lyn.data.series;

import lombok.Data;

@Data
public class PieSeriesData extends SeriesData {
    /**
     * 该数据项是否被选中。
     * 默认值：false
     */
    private Boolean selected;

}
