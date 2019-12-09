package com.lyn.option;

import com.lyn.axis.Axis;
import com.lyn.common.DataZoom;
import com.lyn.common.Title;
import com.lyn.common.Toolbox;
import com.lyn.common.Tooltip;
import com.lyn.series.LineSeries;
import com.sun.javafx.charts.Legend;
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
