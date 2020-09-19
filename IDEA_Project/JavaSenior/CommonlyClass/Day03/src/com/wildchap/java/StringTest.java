package com.wildchap.java;

import org.junit.Test;

/**
 * String的使用
 *
 *  String用一对""表示
 *  不能被继承
 *  实现了Serializable接口:  表示字符串支持序列化
 *  实现了Comparable接口:    表示可以比较大小
 *  内部定义了final char[] value用于存储字符串数据:   不可变性
 *
 * @author wildchap
 * @create 2020-09-18-10:18
 */
public class StringTest {
    @Test
    public void test1(){
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);   //true
        s1 = "hellow";
        System.out.println(s1); //hellow
        System.out.println(s2); //abc

        System.out.println("*****************");

        String s3 = "abc";
        s3 += "def";
        System.out.println(s3);
        System.out.println(s2);

        System.out.println("*****************");

        String s4 = "abc";
        String s5 = s4.replace('a', 'm');
        System.out.println(s4);
        System.out.println(s5);

        System.out.println("*****************");

        String s6 = "JavaEE";
        String s7 = "JavaEE";   //此时s6和s7声明在字符串常量池中
        String s8 = new String("JavaEE");
        String s9 = new String("JavaEE");   //此时s8和s9在堆空间中
        s8 = "JavaEE";
        System.out.println(s6 == s8);
        System.out.println(s7 == s9);

    }
}
