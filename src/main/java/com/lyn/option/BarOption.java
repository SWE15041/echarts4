package com.lyn.option;

import com.lyn.series.BarSeries;
import lombok.Data;

@Data
public class BarOption extends Option<BarOption> {
    private BarSeries[] series;
}
