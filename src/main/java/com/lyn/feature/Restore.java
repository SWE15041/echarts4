package com.lyn.feature;

import com.lyn.common.Emphasis;
import com.lyn.common.Title;
import com.lyn.style.IconStyle;
import lombok.Data;

/**
 * 配置项还原。
 */
@Data
public class Restore {

    /**
     * 是否显示该工具。
     */
    private Boolean show;

    /**
     * 工具名："还原"
     */
    private String title;

    /**
     * 可以通过 'image://url' 设置为图片，其中 URL 为图片的链接，或者 dataURI。
     */
    private String icon;

    /**
     *  还原 icon 样式设置。由于 icon 的文本信息只在 icon hover 时候才显示，所以文字相关的配置项请在 emphasis 下设置。
     */
    private IconStyle iconStyle;


    private Emphasis emphasis;
}
