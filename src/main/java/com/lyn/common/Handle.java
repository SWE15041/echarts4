package com.lyn.common;

/**
 * 拖拽手柄，适用于触屏的环境。
 */
public class Handle {

    /**
     * 当 show 设为 true 时开启，这时显示手柄，并且 axisPointer 会一直显示。
     * 默认：true
     */
    private Boolean show=false;

    /**
     * 手柄的图标。
     * 可以通过 'image://url' 设置为图片，其中 URL 为图片的链接，或者 dataURI。
     * URL 为图片链接例如： 'image://http://xxx.xxx.xxx/a/b.png'
     */
    private String icon;

    /**
     * 手柄的尺寸，可以设置单值，如 45，也可以设置为数组：[width, height]。
     * 默认值：45
     */
    private Object size=45;

    /**
     * 手柄与轴的距离。注意，这是手柄中心点和轴的距离。
     * 默认值：50
     */
    private Double margin=50.0;

    /**
     * 手柄颜色。
     * 默认值： #333
     */
    private String color="#333";

    /**
     * 手柄拖拽时触发视图更新周期，单位:毫秒；
     * 调大这个数值可以改善性能，但是降低体验。
     * 默认值：40
     */
    private Double throttle=40.0;

    /**
     * 图形阴影的模糊大小。该属性配合 shadowColor,shadowOffsetX, shadowOffsetY 一起设置图形的阴影效果。
     * 默认值：3
     */
    private Double shadowBlur=3.0;

    /**
     * 阴影颜色。支持的格式同color。
     * 默认值：#aaa
     */
    private String shadowColor="#aaa";

    /**
     * 阴影水平方向上的偏移距离。
     * 默认值：2
     */
    private Double shadowOffsetX = 2.0;

    /**
     * 阴影垂直方向上的偏移距离。
     * 默认值：0
     */
    private Double shadowOffsetY = 0.0;
}
