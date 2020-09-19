package com.wildchap.thread;

/**
 * 多线程的创建
 * 方式二：实现Runnable接口
 * 1. 创建一个实现了Runnable接口的类
 * 2. 实现类去实现Runnable中的抽象方法run()
 * 3. 创建该类对象
 * 4. 将此对象作为参数传递到thread类的构造器中，创建Thread类的对象
 * 5. 通过Thread类的对象调用start()
 * 注意: 不能直接用方法名
 *
 * @author wildchap
 * @create 2020-09-17-14:18
 */
class MThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }

        }
    }
}

public class ThreadTest1 {
    public static void main(String[] args) {
        MThread m1 = new MThread();
        Thread t1 = new Thread(m1);
        t1.setName("线程1");
        t1.start();
    }
}
