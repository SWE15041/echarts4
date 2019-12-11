package com.lyn.common;

import com.lyn.base.PageIcons;
import com.lyn.constant.LegendType;
import com.lyn.data.LegendData;
import com.lyn.style.LabelStyle;
import com.lyn.style.TextStyle;
import lombok.Data;

/**
 * 图例组件。
 * <p>
 * 图例组件展现了不同系列的标记(symbol)，颜色和名字。可以通过点击图例控制哪些系列不显示。
 * <p>
 * ECharts 3 中单个 echarts 实例中可以存在多个图例组件，会方便多个图例的布局。
 * <p>
 * 当图例数量过多时，可以使用 滚动图例（垂直） 或 滚动图例（水平），参见：legend.type
 */
@Data
public class Legend extends Basic<Legend> implements Component {

    /**
     * 图例的类型。可选值：
     */
    private LegendType type;

    /**
     * 如果图标（可能来自系列的 symbol 或用户自定义的 legend.data.icon）是 path:// 的形式，是否在缩放时保持该图形的长宽比。
     * 默认值：true
     */
    private Boolean symbolKeepAspect;

    /**
     * 用来格式化图例文本，支持字符串模板和回调函数两种形式。
     */
    private String formatter;

    /**
     * 图例选择的模式，控制是否可以通过点击图例改变系列的显示状态。默认开启图例选择，可以设成 false 关闭。
     * 除此之外也可以设成 'single' 或者 'multiple' 使用单选或者多选模式。
     */
    private Object selectedMode;

    /**
     * 图例关闭时的颜色。
     * 默认值：'#ccc'
     */
    private String inactiveColor;

    /**
     * 图例选中状态表。
     */
    private Object selected;

    /**
     * 图例的公用文本样式。
     */
    private TextStyle textStyle;

    private Tooltip tooltip;

    /**
     * ECharts 提供的标记类型包括 'circle', 'rect', 'roundRect', 'triangle', 'diamond', 'pin', 'arrow', 'none'
     * <p>
     * 可以通过 'image://url' 设置为图片，其中 URL 为图片的链接，或者 dataURI。
     */
    private Object icon;

    /**
     * 如果 data 没有被指定，会自动从当前系列中获取。
     * 多数系列会取自 series.name 或者 series.encode 的 seriesName 所指定的维度。
     * 如 饼图 and 漏斗图 等会取自 series.data 中的 name。
     */
    private LegendData[] data;

    /**
     * legend.type 为 'scroll' 时有效。
     * 图例当前最左上显示项的 dataIndex。
     */
    private Double scrollDataIndex;

    /**
     * legend.type 为 'scroll' 时有效。(以下pageXXX同理)
     * 图例控制块中，按钮和页信息之间的间隔。
     */
    private Double pageButtonItemGap;

    /**
     * 图例控制块和图例项之间的间隔。
     */
    private Double pageButtonGap;

    /**
     * 图例控制块的位置。可选值为：
     * - 'start'：控制块在左或上。
     * - 'end'：控制块在右或下。
     */
    private String pageButtonPosition;

    /**
     * 图例控制块中，页信息的显示格式。
     * 默认为 '{current}/{total}'，其中 {current} 是当前页号（从 1 开始计数），{total} 是总页数。
     * 默认值： '{current}/{total}'
     */
    private String pageFormatter;

    /**
     * 图例控制块的图标。
     */
    private PageIcons pageIcons;

    /**
     * 翻页按钮的颜色。
     */
    private String pageIconColor;
    /**
     * 翻页按钮不激活时（即翻页到头时）的颜色。
     */
    private String pageIconInactiveColor;

    /**
     * 翻页按钮的大小。可以是数字，也可以是数组，如 [10, 3]，表示 [宽，高]。
     */
    private Object pageIconSize;

    private TextStyle pageTextStyle;

    /**
     * 图例翻页是否使用动画。
     */
    private Boolean animation;

    /**
     * 图例翻页时的动画时长。
     */
    private Object animationDurationUpdate;

    /**
     * 图例组件中的选择器按钮，目前包括全选和反选两种功能。默认不显示，用户可手动开启，也可以手动配置每个按钮的标题。
     * 默认值：false
     */
    private Object selector;

    private LabelStyle selectorLabel;

    /**
     * 选择器的位置，可以放在图例的尾部或者头部，对应的值分别为 'end' 和 'start'。默认情况下，图例横向布局的时候，选择器放在图例的尾部；图例纵向布局的时候，选择器放在图例的头部。
     * 默认值：'auto'
     */
    private String selectorPosition;

    /**
     * 选择器按钮之间的间隔。
     * 默认值：7
     */
    private Double selectorItemGap;

    /**
     * 选择器按钮与图例组件之间的间隔。
     * 默认值：10
     */
    private Double selectorButtonGap;

}

