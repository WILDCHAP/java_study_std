package com.wildchap.test;

/**
 * 用方法二实现买票
 * <p>
 * 卖票过程中，出现重票、错票
 *
 * 解决：
 * 当一个线程在操作ticket的时候，其他线程不能参与进来，
 * 直到线程a操作完ticket时，其他线程才可以操作ticket
 * 在Java中，我们通过同步机制来解决
 *
 * 方式一：同步代码块
 * synchronized(同步监视器){
 *      //需要被同步的代码
 *      //即操作共享数据(如车票)的代码
 * }
 * 说明：同步监视器--即‘锁’，任何一个类的对象都可以充当锁
 *      接口方式自己能保证唯一，因为Thread都是用一个实例化
 *      但是继承方式要通过声明static保证唯一
 *      可以用类名.class
 * 好处：解决了安全问题
 * 坏处：操作同步代码时只能有一个线程参与，相当单线程
 *
 * 方式二：同步方法
 *  将操作共享数据的代码放到一个同步方法中
 *
 * @author wildchap
 * @create 2020-09-17-14:31
 */
class Window1 implements Runnable {
    private int ticket = 100;
    Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (Window1.class) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + ":买票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}

public class WindowTest1 {
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
