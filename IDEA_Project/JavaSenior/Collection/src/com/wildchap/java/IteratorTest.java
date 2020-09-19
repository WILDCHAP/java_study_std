package com.wildchap.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Iterator接口遍历集合元素
 *
 * @author wildchap
 * @create 2020-09-19-15:04
 */
public class IteratorTest {
    @Test
    public void test1() {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("abc"));
        coll.add(false);

        Iterator iterator = coll.iterator();

//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());

//        for (int i = 0; i < coll.size(); i++) {
//            System.out.println(iterator.next());
//
//        }

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //增强for循环
        //for(集合元素的类型 局部变量: 集合对象)
        for (Object obj : coll) {
            System.out.println(obj);
        }
    }

    @Test
    public void test2() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
