package com.lyn.series;

import java.util.ArrayList;
import java.util.List;

public class MarkPoint {
    /**
     * 标记的图形。
     * <p>
     * ECharts 提供的标记类型包括 'circle', 'rect', 'roundRect', 'triangle', 'diamond', 'pin', 'arrow', 'none';
     * 默认值：'pin'
     * 支持url
     */
    private String symbol = "'pin'";

    /**
     * 标记的大小，可以设置成诸如 10 这样单一的数字，也可以用数组分开表示宽和高，例如 [20, 10] 表示标记宽为20，高为10。
     * 默认值：50
     */
    private Double[] symbolSize = new Double[]{50.0, 50.0};


    /**
     * 如果 symbol 是 path:// 的形式，是否在缩放时保持该图形的长宽比。
     * 默认值：false
     */
    private Boolean symbolKeepAspect = false;

    /**
     * 标记相对于原本位置的偏移。
     */
    private List<Double> symbolOffset = new ArrayList<Double>(2){};

    /**
     * 图形是否不响应和触发鼠标事件;
     * <p>
     * 默认: false，即响应和触发鼠标事件。
     */
    private Boolean silent = false;

    private Data data;

    public class Data {
        public final static String TYPE_MAX = "max";
        public final static String TYPE_MIN = "min";
        public final static String TYPE_AVERAGE = "average";

        private String name;

        /**
         * 特殊的标注类型，用于标注最大值最小值等。
         * 'min' 最大值。
         * 'max' 最大值。
         * 'average' 平均值。
         */
        private String type;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Double[] getSymbolSize() {
        return symbolSize;
    }

    public void setSymbolSize(Double[] symbolSize) {
        this.symbolSize = symbolSize;
    }

    public Boolean getSymbolKeepAspect() {
        return symbolKeepAspect;
    }

    public void setSymbolKeepAspect(Boolean symbolKeepAspect) {
        this.symbolKeepAspect = symbolKeepAspect;
    }

    public List<Double> getSymbolOffset() {
        return symbolOffset;
    }

    public void setSymbolOffset(List<Double> symbolOffset) {
        this.symbolOffset = symbolOffset;
    }

    public Boolean getSilent() {
        return silent;
    }

    public void setSilent(Boolean silent) {
        this.silent = silent;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
