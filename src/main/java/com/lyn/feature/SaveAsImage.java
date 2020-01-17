package com.lyn.feature;

import com.lyn.common.Emphasis;
import com.lyn.constant.PictureType;
import com.lyn.style.IconStyle;
import lombok.Data;

@Data
public class SaveAsImage {

    /**
     * 保存的图片格式。支持 'png' 和 'jpeg'。
     */
    private PictureType type;

    /**
     * 保存的文件名称，默认使用 title.text 作为名称。
     */
    private String name;
    /**
     * 保存的图片背景色，默认使用 backgroundColor，如果backgroundColor不存在的话会取白色。
     */
    private String backgroundColor;

    /**
     * 如果图表使用了 echarts.connect 对多个图表进行联动，则在导出图片时会导出这些联动的图表。该配置项决定了图表与图表之间间隙处的填充色。
     */
    private String connectedBackgroundColor;

    /**
     * 保存为图片时忽略的组件列表，默认忽略工具栏。
     */
    private String[] excludeComponents;
    /**
     * 是否显示该工具。
     */
    private Boolean show;

    /**
     * 工具名称 ："保存为图片"
     */
    private String title;
    /**
     * 可以通过 'image://url' 设置为图片，其中 URL 为图片的链接，或者 dataURI。
     */
    private String icon;
    /**
     * 保存为图片 icon 样式设置。由于 icon 的文本信息只在 icon hover 时候才显示，所以文字相关的配置项请在 emphasis 下设置。
     */
    private IconStyle iconStyle;

    private Emphasis emphasis;

    /**
     * 保存图片的分辨率比例，默认跟容器相同大小，如果需要保存更高分辨率的，可以设置为大于 1 的值，例如 2。
     */
    private Double pixelRatio;
}
