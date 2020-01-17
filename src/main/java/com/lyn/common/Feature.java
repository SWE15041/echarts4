package com.lyn.common;

import com.lyn.feature.*;
import lombok.Data;

/**
 * 配置项
 */
@Data
public class Feature {

    /**
     * 保存为图片。
     */
    private SaveAsImage saveAsImage;

    /**
     * 配置项还原。
     */
    private Restore restore;

    /**
     * 数据视图工具，可以展现当前图表所用的数据，编辑后可以动态更新。
     */
    private DataView dataView;

    /**
     * 数据区域缩放。目前只支持直角坐标系的缩放。
     */
    private DataZoom dataZoom;

    /**
     * 动态类型切换
     * 启用的动态类型，包括'line'（切换为折线图）, 'bar'（切换为柱状图）, 'stack'（切换为堆叠模式）, 'tiled'（切换为平铺模式）。
     */
    private MagicType magicType;

    /**
     * 选框组件的控制按钮。
     */
    private Brush brush;
}
