package com.wildchap.thread;

/**
 * 线程通信的例子：使用两个线程打印1 - 100。线程1和线程2交替打印
 *
 * wait():  使当前线程进入阻塞状态，并释放同步监视器
 * notify():唤醒一个被wait的线程，有多个就唤醒优先级高的
 * notifyAll():唤醒所有被wait的线程
 *
 * @author wildchap
 * @create 2020-09-17-20:21
 */
class Number implements Runnable{
    private int number = 1;
    @Override
    public void run() {
        while(true){
            synchronized (Number.class) {

                Number.class.notify();

                if(number < 100){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number++;

                    //线程1运行完了，让线程2运行
                    try {
                        Number.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    break;
                }
            }
        }
    }
}

public class CommunicationTest {
    public static void main(String[] args) {
        Number n = new Number();

        Thread t1 = new Thread(n);
        Thread t2 = new Thread(n);

        t1.setName("打印机1");
        t2.setName("打印机2");

        t1.start();
        t2.start();
    }
}
