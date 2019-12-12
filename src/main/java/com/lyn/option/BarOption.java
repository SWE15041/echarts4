package com.lyn.option;

import com.lyn.common.Legend;
import com.lyn.common.Title;
import com.lyn.common.Toolbox;
import com.lyn.common.Tooltip;
import com.lyn.series.BarSeries;
import lombok.Data;

@Data
public class BarOption extends BaseOption {
    private BarSeries[] series;
}
