package com.lyn.data;

import lombok.Data;

@Data
public class LineSeriesData extends SeriesData<LineSeriesData> {

    /**
     * 单个数据标记的图形。
     */
    private String symbol;

    /**
     * 单个数据标记的大小，可以设置成诸如 10 这样单一的数字，也可以用数组分开表示宽和高，例如 [20, 10] 表示标记宽为20，高为10。
     * 默认值: 4
     */
    private Object symbolSize;

    /**
     * 单个数据标记的旋转角度。注意在 markLine 中当 symbol 为 'arrow' 时会忽略 symbolRotate 强制设置为切线的角度。
     */
    private Double symbolRotate;

    /**
     * 如果 symbol 是 path:// 的形式，是否在缩放时保持该图形的长宽比。
     * 默认值：false
     */
    private Boolean symbolKeepAspect;

    /**
     * 单个数据标记相对于原本位置的偏移。默认情况下，标记会居中置放在数据对应的位置，但是如果 symbol 是自定义的矢量路径或者图片，就有可能不希望 symbol 居中。这时候可以使用该配置项配置 symbol 相对于原本居中的偏移，可以是绝对的像素值，也可以是相对的百分比。
     * <p>
     * 例如 [0, '50%'] 就是把自己向上移动了一半的位置，在 symbol 图形是气泡的时候可以让图形下端的箭头对准数据点。
     * <p>
     * 默认值：[0,0]
     */
    private Object symbolOffset;

}
