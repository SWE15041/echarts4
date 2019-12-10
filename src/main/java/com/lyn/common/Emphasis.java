package com.lyn.common;

import com.lyn.style.ItemStyle;
import com.lyn.style.LabelStyle;
import lombok.Data;

/**
 * 标注的高亮样式。
 */
@Data
public class Emphasis {
    private LabelStyle label;
    private ItemStyle itemStyle;
}
