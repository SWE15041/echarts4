package com.lyn.series;

import com.lyn.common.Emphasis;
import com.lyn.style.ItemStyle;
import com.lyn.style.LabelStyle;
import com.sun.tools.javac.jvm.Items;
import lombok.Data;

import java.io.Serializable;

@Data
public  abstract class BaseMark  implements Serializable {


    private Boolean silent;
    private LabelStyle label;
//    private ItemStyle itemStyle;
    private Emphasis emphasis;
    /**
     * 是否开启动画。
     * 默认值：true
     */
    private Boolean animation;

    /**
     * 是否开启动画的阈值，当单个系列显示的图形数量大于这个阈值时会关闭动画。
     * 默认值：2000
     */
    private Double animationThreshold;

    /**
     * 初始动画的时长，支持回调函数，可以通过每个数据返回不同的 delay 时间实现更戏剧的初始动画效果：
     * 默认值：1000
     */
    private Double animationDuration;

    /**
     * 初始动画的缓动效果。
     * 默认值：linear
     */
    private Double animationEasing;

    /**
     * 初始动画的延迟，支持回调函数，可以通过每个数据返回不同的 delay 时间实现更戏剧的初始动画效果。
     * 默认值：0
     */
    private Object animationDelay;

    /**
     * 数据更新动画的时长。
     * 默认值：0
     */
    private Object animationDurationUpdate;

    /**
     * 数据更新动画的缓动效果。
     * 默认值：cubicOut
     */
    private String animationEasingUpdate;

    /**
     * 数据更新动画的延迟，支持回调函数，可以通过每个数据返回不同的 delay 时间实现更戏剧的更新动画效果。
     * 默认值：0
     */
    private Object animationDelayUpdate;
}
