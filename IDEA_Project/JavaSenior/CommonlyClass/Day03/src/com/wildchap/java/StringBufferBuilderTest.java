package com.wildchap.java;

import org.junit.Test;

/**
 * 关于StringBuffer和StringBulider
 *
 * @author wildchap
 * @create 2020-09-18-11:43
 */
public class StringBufferBuilderTest {
    /*
    String: 不可变的字符序列
    StringBuffer、StringBuilder: 可变的字符序列
    StringBuffer:  线程安全、效率低
    StringBuilder: 线程不安全、效率高
     */
    @Test
    public void test1() {
        StringBuffer sb1 = new StringBuffer("abc");
        sb1.setCharAt(0, 'm');
        System.out.println(sb1);
    }

    /*
    StringBuffer常用方法
    StringBuffer append(xxx)：提供了很多的append()方法，用于进行字符串拼接
    StringBuffer delete(int start,int end)：删除指定位置的内容
    StringBuffer replace(int start, int end, String str)：把[start,end)位置替换为str
    StringBuffer insert(int offset, xxx)：在指定位置插入xxx  StringBuffer reverse() ：把当前字符序列逆转
     */
    @Test
    public void test2(){
        StringBuffer sb1 = new StringBuffer();
        sb1.append('1');
        sb1.append('2');
        sb1.append('a');
        sb1.append('b');
        sb1.append('c');
        System.out.println(sb1);
        sb1.delete(1, 2);
        System.out.println(sb1);
        sb1.replace(2, 4, "hellow");
        System.out.println(sb1);
        sb1.insert(2, "hahaha");
        System.out.println(sb1);
        sb1.reverse();
        System.out.println(sb1);
        System.out.println(sb1.indexOf("ha"));
    }
}
