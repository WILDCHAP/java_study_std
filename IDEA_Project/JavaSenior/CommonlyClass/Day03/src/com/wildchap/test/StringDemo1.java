package com.wildchap.test;

import org.junit.Test;

/**
 * @author wildchap
 * @create 2020-09-19-11:23
 */
public class StringDemo1 {
    /*
    获取一个字符串在另一个字符串中出现的此时
     */
    public int getCount(String mainStr, String subStr){
        int i = 0, j = 0, k = 0, count = 0;
        char[] m_ch = mainStr.toCharArray();
        char[] s_ch = subStr.toCharArray();
        //一直循环完mainstr
        while(k < mainStr.length()){
            while(j < subStr.length() && i < mainStr.length()){
                if(m_ch[i] == s_ch[j]){
                    i++;
                    j++;
                }else
                    break;
            }
            if(i <= mainStr.length() && j >= subStr.length()){
                count++;
            }
            k++;
            i = k;
            j = 0;
        }
        return count;
    }

    @Test
    public void testGetCount(){
        String main_str = "abkkcadkabkebkfavkskab";
        String sub_str = "ab";
        System.out.println(getCount(main_str, sub_str));
    }

    @Test
    public void testGetCount2(){
        String main_str = "abkkcadkabkebkfavkskab";
        String sub_str = "ab";

        int count = 0;
        int index;
        while(main_str.indexOf(sub_str) != -1){
            //只要找到了就进行如下循环
            count++;
            //将main_str拆分
            main_str = main_str.substring(main_str.indexOf(sub_str) + sub_str.length());
        }
        System.out.println(count);
    }

}
