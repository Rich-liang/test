package com.ywl.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * 商品信息类
 * @author YangWenliang
 */
public class Goods implements Comparable
{
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy 年 MM 月 dd 日");

    public Goods(String name, String madeDate, String localDateTime, double weight) throws ParseException
    {
        this.name = name;
        this.madeDate = simpleDateFormat.parse(madeDate);
        this.localDate = LocalDate.parse(localDateTime,DateTimeFormatter.ofPattern("yyyy 年 MM 月 dd 日"));
        this.weight = weight;
    }


    /** 商品名称 */
    public String name;

    /** 生产日期 */
    public Date madeDate;

    /** 出库日期 */
    public LocalDate localDate;

    /** 商品重量 */
    public double weight;


    @Override
    public String toString()
    {
        return "{" + name + "," + simpleDateFormat.format(madeDate) + "," +localDate.format(DateTimeFormatter.ofPattern("yyyy 年 MM 月 dd 日")) + "," + weight + "}" + "\n";
    }

    @Override
    public int compareTo(Object o)
    {
        Goods goods = (Goods)o;
        if (this.name.length()>goods.name.length())
            return 1;
        else if (this.name.length()<goods.name.length())
            return -1;
        else
            return 0;
    }
}
