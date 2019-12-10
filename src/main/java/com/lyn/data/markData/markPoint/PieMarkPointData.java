package com.lyn.data.markData.markPoint;

import com.lyn.data.MarkAreaData;
import com.lyn.data.MarkPointData;
import com.lyn.data.markData.BaseMarkData;
import com.lyn.style.ItemStyle;
import lombok.Data;

@Data
public class PieMarkPointData extends BaseMarkData implements MarkPointData {

    private ItemStyle itemStyle;

}
