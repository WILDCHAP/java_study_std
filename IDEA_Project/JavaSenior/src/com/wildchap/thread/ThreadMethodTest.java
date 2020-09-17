package com.wildchap.thread;

/**
 * 测试Thread中的常用方法:
 * 1. start():  启动run()
 * 2. run():    通常要重写，要执行的操作写在里面
 * 3. currentThread():  静态方法，返回当前代码执行的线程
 * 4. getName():获取当前线程名
 * 5. setName():设置当前线程名
 * 6. yield();  暂时释放当前CPU的执行权
 * 7. join();   (调用它的)线程先执行完，再继续执行当前的线程
 * 8. stop();   强制结束当前线程(过时了的方法)
 * 9. sleep(Long);  当前线程睡眠多少ms(1000ms=1s)，即几秒执行一次，可用于倒计时
 * 10.isAlive(); 判断当前线程是否存活
 *
 * @author wildchap
 * @create 2020-09-17-11:47
 */
class HellowThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
                try {
                    sleep(1000);    //睡 1s
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if(i % 20 == 0){
                //释放当前CPU的执行权
                yield();
            }
        }
    }

    public HellowThread(String name) {
        super(name);
    }
}

public class ThreadMethodTest {
    public static void main(String[] args) {
        HellowThread h1 = new HellowThread("Thread: 1");
        //h1.setName("线程一");
        //主线程命名
        Thread.currentThread().setName("主线程");
        h1.start();
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }

            if(i == 20){
                try {
                    h1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(h1.isAlive());
        }
    }
}
