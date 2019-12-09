package com.lyn.series;

public class MarkLine {
    /**
     * 特殊的标注类型，用于标注最大值最小值等。
     * 值：min|max|average
     */
    private String type;

    /**
     * 标注名
     */
    private String name;

//    private List<Double> coord=new ArrayList<>(2);


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
