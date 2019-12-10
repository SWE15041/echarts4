package com.lyn.data.markData.markArea;

import com.lyn.data.MarkAreaData;
import com.lyn.data.markData.BaseMarkData;
import com.lyn.style.ItemStyle;
import lombok.Data;

@Data
public class PieMarkAreaData extends BaseMarkData implements MarkAreaData {

    private ItemStyle itemStyle;

}
