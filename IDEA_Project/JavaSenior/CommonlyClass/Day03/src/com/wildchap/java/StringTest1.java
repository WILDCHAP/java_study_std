package com.wildchap.java;

import org.junit.Test;

/**
 * @author wildchap
 * @create 2020-09-18-11:27
 */
public class StringTest1 {
    /*
    String 与 char[] 之间的转换
     */
    @Test
    public void test1(){
        String s1 = "abc123";
        char[] charArray = s1.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i]);
        }
        System.out.println('\n');

        char[] arr = new char[]{'h', 'e', 'l', 'l', 'o', 'w'};
        String s2 = new String(arr);
        System.out.println(s2);
    }
}
