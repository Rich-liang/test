package com.ywl.demo;

import com.ywl.model.Goods;
import com.ywl.util.GoodsByDate;
import com.ywl.util.GoodsByDateOrWeight;


import java.text.ParseException;
import java.util.Arrays;

/**
 * @author YangWenliang
 */
public class Demo
{
    public static void main(String[] args) throws ParseException
    {
        Goods[] goods =
                {
                        new Goods("小熊饼干", "2019 年 12 月 11 日", "2019 年 12 月 21 日", 0.5),
                        new Goods("丘比千岛酱","2019 年 04 月 02 日","2019 年 04 月 05 日",2),
                        new Goods("丘比沙拉酱", "2019 年 04 月 02 日", "2019 年 04 月 05 日", 1.4),
                        new Goods("乌鲁木齐挂面","2019 年 04 月 02 日","2019 年 04 月 10 日",1.0)
                };

        System.out.println("规则 1 排序结果：");
        Arrays.sort(goods);
        System.out.println(Arrays.toString(goods));

        System.out.println("规则 2 排序结果：");
        GoodsByDate goodsByDate = new GoodsByDate();
        Arrays.sort(goods,goodsByDate);
        System.out.println(Arrays.toString(goods));

        System.out.println("规则 3 排序结果：");
        GoodsByDateOrWeight goodsByDateOrWeight = new GoodsByDateOrWeight();
        Arrays.sort(goods,goodsByDateOrWeight);
        System.out.println(Arrays.toString(goods));

    }
}