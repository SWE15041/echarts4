package com.lyn.series;

import com.lyn.data.LineSeriesData;
import com.lyn.style.AreaStyle;
import com.lyn.style.LineStyle;
import lombok.Data;

@Data
public class LineSeries extends BaseSeries<LineSeries> {

    /**
     * 该系列使用的坐标系，可选：'cartesian2d'|'polar'
     * > 'cartesian2d': 使用二维的直角坐标系（也称笛卡尔坐标系），通过 xAxisIndex, yAxisIndex指定相应的坐标轴组件。
     * > 'polar': 使用极坐标系，通过 polarIndex 指定相应的极坐标组件
     */
    private String coordinateSystem;

    /**
     * 使用的 x 轴的 index，在单个图表实例中存在多个 x 轴的时候有用。
     * 默认值 ：0
     */
    private Integer xAxisIndex;

    /**
     * 使用的 y 轴的 index，在单个图表实例中存在多个 y轴的时候有用。
     * 默认值：0
     */
    private Integer yAxisIndex;

    /**
     * 使用的极坐标系的 index，在单个图表实例中存在多个极坐标系的时候有用。
     * 默认值：0
     */
    private Integer polarIndex;

    /**
     * 标记的图形。
     * 可以通过 'image://url' 设置为图片，其中 URL 为图片的链接，或者 dataURI。
     */
    private String symbol;

    /**
     * 标记的大小，可以设置成诸如 10 这样单一的数字，也可以用数组分开表示宽和高，例如 [20, 10] 表示标记宽为20，高为10。
     * 默认值 : 4
     */
    private Object symbolSize;

    /**
     * 标记的旋转角度。
     */
    private Double symbolRotate;

    /**
     * 如果 symbol 是 path:// 的形式，是否在缩放时保持该图形的长宽比。
     * 默认值 : false ]=
     */
    private Boolean symbolKeepAspect;

    /**
     * 标记相对于原本位置的偏移。 例如 [0, '50%'] 就是把自己向上移动了一半的位置
     * 默认值: [0, 0]
     */
    private Object symbolOffset;

    /**
     * 是否显示 symbol, 如果 false 则只有在 tooltip hover 的时候显示。
     * 默认值：true
     */
    private Boolean showSymbol;

    /**
     * 只在主轴为类目轴（axis.type 为 'category'）时有效。 可选值：
     * > 'auto'：默认，如果有足够空间则显示标志图形，否则随主轴标签间隔隐藏策略。
     * > true：显示所有图形。
     * > false：随主轴标签间隔隐藏策略。
     * <p>
     * 默认值 ：'auto'
     */
    private Object showAllSymbol;

    /**
     * 是否开启 hover 在拐点标志上的提示动画效果。
     * 默认值：true
     */
    private Boolean hoverAnimation;

    /**
     * 数据堆叠，同个类目轴上系列配置相同的stack值后，后一个系列的值会在前一个系列的值上相加。
     * 默认值：null
     */
    private String stack;

    /**
     * 鼠标悬浮时在图形元素上时鼠标的样式是什么。同 CSS 的 cursor。
     * 默认值：'pointer'
     */
    private String cursor;

    /**
     * 是否连接空数据。
     * 默认值：false
     */
    private String connectNulls;

    /**
     * 是否裁剪超出坐标系部分的图形，具体裁剪效果根据系列决定：
     * > 散点图：忽略中心点超出坐标系的图形，但是不裁剪单个图形
     * > 柱状图：裁掉所有超出坐标系的部分，但是依然保留柱子的宽度
     * > 折线图：裁掉所有超出坐标系的折线部分，拐点图形的逻辑按照散点图处理
     * > 路径图：裁掉所有超出坐标系的部分
     * > 自定义系列：裁掉所有超出坐标系的部分
     * 除了自定义系列，其它系列的默认值都为 true，及开启裁剪，如果你觉得不想要裁剪的话，可以设置成 false 关闭。
     * 默认值 ：true
     */
    private String clip;

    /**
     * 是否是阶梯线图。可以设置为 true 显示成阶梯线图，也支持设置成 'start', 'middle', 'end' 分别配置在当前点，当前点与下个点的中间点，下个点拐弯。
     * 默认值：false;
     */
    private Object step;

    /**
     * 线条样式。
     */
    private LineStyle lineStyle;

    /**
     * 区域填充样式。
     */
    private AreaStyle areaStyle;

    /**
     * 是否平滑曲线显示。
     * 布尔值：true|false ; 则表示是否开启平滑处理; 设为 true 时相当于设为 0.5。
     * 数值：[0~1] ; 表示平滑程度，越小表示越接近折线段，反之则反。
     */
    private Object smooth;

    /**
     * 折线平滑后是否在一个维度上保持单调性，可以设置成'x', 'y'来指明是在 x 轴或者 y 轴上保持单调性。
     * <p>
     * 通常在双数值轴上使用。
     */
    private String smoothMonotone;

    /**
     * 折线图在数据量远大于像素点时候的降采样策略，开启后可以有效的优化图表的绘制效率，默认关闭，也就是全部绘制不过滤数据点。
     * <p>
     * 可选：
     * 'average' 取过滤点的平均值
     * 'max' 取过滤点的最大值
     * 'min' 取过滤点的最小值
     * 'sum' 取过滤点的和
     */
    private String sampling;

    /**
     * 使用 dimensions 定义 series.data 或者 dataset.source 的每个维度的信息。
     * <p>
     * 注意：如果使用了 dataset，那么可以在 dataset.source 的第一行/列中给出 dimension 名称。于是就不用在这里指定 dimension。但是，如果在这里指定了 dimensions，那么 ECharts 不再会自动从 dataset.source 的第一行/列中获取维度信息。
     */
    private Object dimensions;

    /**
     * 可以定义 data 的哪个维度被编码成什么。比如：
     * encode: {
     * x: [3, 1, 5],      // 表示维度 3、1、5 映射到 x 轴。
     * y: 2,              // 表示维度 2 映射到 y 轴。
     * tooltip: [3, 2, 4] // 表示维度 3、2、4 会在 tooltip 中显示。
     * }
     */
    private Object encode;

    /**
     * 系列中的数据内容数组。数组项通常为具体的数据项。
     */
    private LineSeriesData[] data;

}


