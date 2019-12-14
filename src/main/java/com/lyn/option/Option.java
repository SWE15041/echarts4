package com.lyn.option;

import com.lyn.common.*;
import lombok.Data;

import java.io.Serializable;

@Data
public abstract class Option<T> implements Serializable {
    private Title title;
    private Tooltip tooltip;
    private Toolbox toolbox;
    private DataZoom[] dataZoom;
    private Legend legend;
}
