package com.lyn.base;

import lombok.Data;

@Data
public class PageIcons {
    /**
     * legend.orient 为 'horizontal' 时的翻页按钮图标。
     * <p>
     * 是一个数组，表示 [previous page button, next page button]。默认值为 ['M0,0L12,-10L12,10z', 'M0,0L-12,-10L-12,10z']，。
     * <p>
     * 数组中每项，
     * <p>
     * 可以通过 'image://url' 设置为图片，其中 URL 为图片的链接，或者 dataURI。
     * <p>
     * URL 为图片链接例如：
     * <p>
     * 'image://http://xxx.xxx.xxx/a/b.png'
     */
    private Object[] horizontal;
    /**
     * legend.orient 为 'vertical' 时的翻页按钮图标。
     * <p>
     * 是一个数组，表示 [previous page button, next page button]。默认值为 ['M0,0L20,0L10,-20z', 'M0,0L20,0L10,20z']，。
     * <p>
     * 数组中每项，
     * <p>
     * 可以通过 'image://url' 设置为图片，其中 URL 为图片的链接，或者 dataURI。
     * <p>
     * URL 为图片链接例如：
     * <p>
     * 'image://http://xxx.xxx.xxx/a/b.png'
     */
    private Object[] vertical;
}
