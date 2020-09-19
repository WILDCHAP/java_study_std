package com.wildchap.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 一、集合框架概述
 *
 * 集合框架
 *      |-----Collection接口：单例集合，用来存储一个一个的对象
 *          |-----List接口：有序可重复       (动态数组)
 *              |-----ArrayList、LinkedList、Vector
 *          |-----Set接口： 无序不可重复     (集合)
 *              |-----HashSet
 *      |-----Map接口：双例集合，用来存储一对(key - value)一对的数据
 *              |-----HashMap
 * @author wildchap
 * @create 2020-09-19-13:48
 */
public class CollectionTest {

    @Test
    public  void test1(){
        Collection coll = new ArrayList();

        //add(Object e) :将元素e添加到集合coll中
        coll.add("AA");
        coll.add("BB");
        coll.add(123);
        //size():       获取添加的元素个数
        System.out.println(coll.size());

        //addAll(coll):     将另外的添加过来
        Collection coll1 = new ArrayList();
        coll1.add("CC");
        coll1.add("DD");
        coll.addAll(coll1);
        System.out.println(coll.size());
        System.out.println(coll);

        //clear():      清空集合元素
        coll.clear();

        //isEmpty():    判断是否为空
        System.out.println(coll.isEmpty());

        //contains(Object): 判断是否存在
        System.out.println(coll1.contains("CC"));

        //remove(Object):   移除某个元素
        System.out.println(coll1.remove("CC"));
        System.out.println(coll1);
    }
}
