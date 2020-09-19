package com.wildchap.java;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Set接口：无序不可重复
 *
 *      HashSet
 *      LinkedHashSet
 *      TreeSet
 *
 * @author wildchap
 * @create 2020-09-19-16:19
 */
public class SetTest {
    @Test
    public void test1(){
        Set set = new HashSet();
        set.add(456);
        set.add(123);
        set.add("AA");
        set.add(new Person("tom", 12));
        set.add("CC");

        System.out.println(set);
    }
}
