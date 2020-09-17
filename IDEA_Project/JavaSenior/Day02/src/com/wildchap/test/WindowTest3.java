package com.wildchap.test;

/**
 * 用方法二解决(同步方法)
 *
 * @author wildchap
 * @create 2020-09-17-17:05
 */
class Window3 implements Runnable {
    private int ticket = 100;
    Object obj = new Object();

    @Override
    public void run() {
        while (true) {

            show();
        }
    }

    //创建同步方法
    private synchronized void show() {      //同步监视器: this
        // synchronized (Window3.class) {
        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":买票，票号为：" + ticket);
            ticket--;
        }
        // }
    }
}

public class WindowTest3 {
    public static void main(String[] args) {
        Window1 w = new Window1();
        //三个线程用的同一个Window1
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
