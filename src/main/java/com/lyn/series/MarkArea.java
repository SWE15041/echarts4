package com.lyn.series;

import com.lyn.data.MarkAreaData;
import lombok.Data;

/**
 * 图表标域，常用于标记图表中某个范围的数据，例如标出某段时间投放了广告。
 */
@Data
public class MarkArea extends BaseMark {

    /**
     * 标域的数据数组。每个数组项是一个两个项的数组，分别表示标域左上角和右下角的位置，每个项支持通过下面几种方式指定自己的位置
     *
     * 1.通过 x, y 属性指定相对容器的屏幕坐标，单位像素，支持百分比。
     *
     * 2.用 coord 属性指定数据在相应坐标系上的坐标位置，单个维度支持设置 'min', 'max', 'average'。
     *
     * 3.直接用 type 属性标注系列中的最大值，最小值。这时候可以使用 valueIndex 或者 valueDim 指定是在哪个维度上的最大值、最小值、平均值。
     *
     * 4.如果是笛卡尔坐标系的话，也可以通过只指定 xAxis 或者 yAxis 来实现 X 轴或者 Y 轴为某值的标域，见示例 scatter-weight
     *
     * 当多个属性同时存在时，优先级按上述的顺序。
     */
    private MarkAreaData[] data;
}
