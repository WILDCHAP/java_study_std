package com.wildchap.java;

import org.junit.Test;

import java.util.Date;

/**
 * 日期和时间测试
 *
 * @author wildchap
 * @create 2020-09-18-12:06
 */
public class DateTimeTest {
    @Test
    public void test1(){
        long time = System.currentTimeMillis();
        System.out.println(time);
    }

    /*
    java.util.Date类
           |-----java.sql.Date类
    1. 两个构造器的使用

    2. 两个方法的使用
            >toString();    显示当前年月日
            >getTime();     获取当前Date对象的时间戳

    3. sql.Date --> util.Date:  直接赋值
       util.Date--> sql.Date:

     */
    @Test
    public void test2(){
        //构造器1
        Date date1 = new Date();
        System.out.println(date1.toString());
        System.out.println(date1.getTime());
        //构造器2(创建指定毫秒数的Date对象)
        Date date2 = new Date(1600402659314L);
        System.out.println(date2.toString());

        //java.sql.Date
        System.out.println("******sql.Date******");
        java.sql.Date date3 = new java.sql.Date(1600402659314L);
        System.out.println(date3.toString());

        //sql.Date --> util.Date
        Date date4 = (Date)date3;
        //util.Date--> sql.Date
        java.sql.Date date5 = new java.sql.Date(date4.getTime());
    }

}
