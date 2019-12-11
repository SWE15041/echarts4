package com.lyn.option;

import com.lyn.axis.Axis;
import com.lyn.common.*;
import com.lyn.series.LineSeries;
import lombok.Data;

@Data
public class LineOption {
    private Title title;
    private Tooltip tooltip;
    private Toolbox toolbox;
    private DataZoom[] dataZoom;
    private Legend legend;
    private Axis xAxis;
    private Axis yAxis;
    private LineSeries[] series;
}
