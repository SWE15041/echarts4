package com.lyn.base;

import lombok.Data;

@Data
public class Color {
    private  String type;
    private Integer x;
    private Integer y;
    private Integer x2;
    private Integer y2;
    private ColorStops colorStops;
    private Boolean golbal=false;

}
