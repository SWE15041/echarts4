package com.lyn.data;

import lombok.Data;

@Data
public class PieSeriesData extends SeriesData<PieSeriesData> {
    /**
     * 该数据项是否被选中。
     * 默认值：false
     */
    private Boolean selected;

}
