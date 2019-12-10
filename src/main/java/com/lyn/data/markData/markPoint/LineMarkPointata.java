package com.lyn.data.markData.markPoint;

import com.lyn.data.MarkAreaData;
import com.lyn.data.MarkPointData;
import com.lyn.data.markData.BaseMarkData;
import com.lyn.style.ItemStyle;
import lombok.Data;

@Data
public class LineMarkPointata extends BaseMarkData implements MarkPointData {

    /**
     * 特殊的标注类型，用于标注最大值最小值等。
     * 可选:
     * -'min' 最大值。
     * -'max' 最大值。
     * -'average' 平均值。
     */
    private String type;

    /**
     * 在使用 type 时有效，用于指定在哪个维度上指定最大值最小值，可以是 0（xAxis, radiusAxis），1（yAxis, angleAxis），默认使用第一个数值轴所在的维度。
     */
    private Double valueIndex;

    /**
     * 在使用 type 时有效，用于指定在哪个维度上指定最大值最小值。这可以是维度的直接名称，例如折线图时可以是x、angle等、candlestick 图时可以是open、close等维度名称。
     */
    private String valueDim;

    /**
     * 起点或终点的坐标。坐标格式视系列的坐标系而定，可以是直角坐标系上的 x, y，也可以是极坐标系上的 radius, angle。
     */
    private Object coord;

    /**
     * 单个数据标记的图形。
     */
    private Object symbol;

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

    private ItemStyle itemStyle;
}
