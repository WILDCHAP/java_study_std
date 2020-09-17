package com.wildchap.thread;

/**
 * 多线程的创建，
 * 方式一：继承于Thread类
 * 1. 创建一个继承与Thread类的子类
 * 2. 重写Thread类的run()方法
 * 3. 实例化对象
 * 4. 调用对象的start()方法
 * <p>
 * 例子：遍历100以内所有偶数
 *
 * @author wildchap
 * @create 2020-09-17-11:11
 */

class MyThread extends Thread {
    private String tname;

    public MyThread(String tname) {
        this.tname = tname;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++){
            if(i % 2 == 0)
                System.out.println(this.tname + " " + i);
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread1");
        MyThread t2 = new MyThread("Thread2");
        t1.start();
        t2.start();
        for (int i = 0; i <= 100; i++){
            if(i % 2 != 0)
                System.out.println("***************");
        }
    }
}

