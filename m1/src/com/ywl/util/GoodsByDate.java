package com.ywl.util;

import com.ywl.model.Goods;

import java.util.Comparator;

/**
 * @author YangWenliang
 */
public class GoodsByDate implements Comparator
{
    @Override
    public int compare(Object o1, Object o2)
    {
        Goods goods1 = (Goods)o1,goods2 = (Goods)o2;
        if (goods1.madeDate.after(goods2.madeDate))
            return 1;
        else if (goods1.madeDate.before(goods2.madeDate))
            return -1;
        else if (goods1.localDate.isAfter(goods2.localDate))
            return -1;
        else if (goods1.localDate.isBefore(goods2.localDate))
            return 1;
        else
            return 0;
    }
}
