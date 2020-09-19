package com.wildchap.java;

import org.junit.Test;

import java.util.ArrayList;

/**
 * List接口：动态数组
 *      ArrayList
 *      LinkdList
 *      Vector
 *
 * @author wildchap
 * @create 2020-09-19-15:44
 */
public class ListTest {

    @Test
    public void test1(){
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");
        list.add(new Person("tom", 12));
        System.out.println(list);

        list.add(1, "BB");
        System.out.println(list);

        System.out.println(list.indexOf(456));

        System.out.println(list.subList(1, 5));
    }
}

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return name + " " + age;
    }
}
