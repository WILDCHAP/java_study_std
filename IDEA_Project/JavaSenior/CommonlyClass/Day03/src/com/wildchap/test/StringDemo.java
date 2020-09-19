package com.wildchap.test;

import org.junit.Test;

/**
 * @author wildchap
 * @create 2020-09-19-11:08
 */
public class StringDemo {


    /*
    将一个字符串中指定位置进行反转

    方式一：转换为char[]
     */
    public  String reverse(String str, int startIndex, int endIndex){

        char[] arr = str.toCharArray();
        for(int x = startIndex, y = endIndex; x < y; x++, y--){
            char temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }

        return new String(arr);
    }

    @Test
    public void testReverse() {

        String str = "abcdefg";
        String str1 = reverse(str, 2,5);
        System.out.println(str1);
    }

    //方式二
    //StringBuilder的substring和reverse
    @Test
    public void testReverse1(){
        String str = "abcdefg";
        StringBuilder sb1 = new StringBuilder(str);
        String str1 = sb1.substring(0, 2);
        String str2 = sb1.substring(2, 5);
        String str3 = sb1.substring(5);
        StringBuilder sb2 = new StringBuilder(str2);
        sb2 = sb2.reverse();
        System.out.println(str1 + sb2 + str3);
    }
}
