package com.wildchap.test;

import org.junit.Test;

/**
 * @author wildchap
 * @create 2020-09-19-11:47
 */
public class StringDemo2 {
    /*
    获取两个字符串的最大相同子串
     */
    public String maxSameSubString(String main_str, String sub_str){
        String temp_same_str = null;   //用于暂存最大相同子串
        int same_len = 0;       //用于存储当前最大相同子串的长度
        for(int i = 0; i < sub_str.length(); i++){
            //思路：将短的子串拆分
            for(int len = 1; (i + len) <sub_str.length(); len++){
                //这里定义拆分长度
                String temp_str = sub_str.substring(i, i + len);
                if(main_str.indexOf(temp_str) != -1 && temp_str.length() > same_len){
                    temp_same_str = temp_str;
                    same_len = temp_str.length();
                }
            }
        }

        return temp_same_str;
    }

    @Test
    public void testMaxSameSubString(){
        String main_str = "abcashellowaccabacashea";
        String sub_str = "acashhellowa";
        System.out.println(maxSameSubString(main_str, sub_str));
    }
}
