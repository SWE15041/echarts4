package com.lyn.option;

import com.lyn.series.PieSeries;
import lombok.Data;

@Data
public class PieOption extends Option<PieOption> {
    private PieSeries[] series;
}
