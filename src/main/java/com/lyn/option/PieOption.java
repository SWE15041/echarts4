package com.lyn.option;

import com.lyn.series.PieSeries;
import lombok.Data;

@Data
public class PieOption extends BaseOption{
    private PieSeries[] series;
}
