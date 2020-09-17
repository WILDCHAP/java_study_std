package com.wildchap.exer;

/**
 * 多线程练习
 *
 * @author wildchap
 * @create 2020-09-17-11:36
 */
class Mythread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}

class Mythread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0)
                System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
//        Mythread1 m1 = new Mythread1();
//        Mythread2 m2 = new Mythread2();
//
//        m1.start();
//        m2.start();

        //创建Thread类的匿名子类
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    if (i % 2 == 0)
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    if (i % 2 != 0)
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        }.start();
    }
}
