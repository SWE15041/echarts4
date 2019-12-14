package com.lyn.option;

import com.lyn.axis.Axis;
import com.lyn.series.LineSeries;
import lombok.Data;

@Data
public class LineOption extends Option<LineOption> {
    private Axis xAxis;
    private Axis yAxis;
    private LineSeries[] series;
}
