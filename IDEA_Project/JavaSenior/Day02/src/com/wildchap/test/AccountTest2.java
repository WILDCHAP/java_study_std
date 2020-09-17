package com.wildchap.test;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 练习：
 * 银行两个储户分别向同一个账户存3000元，每次存1000，存3次。每次显示余额。
 * 实现 + lock()
 *
 * @author wildchap
 * @create 2020-09-17-19:29
 */
class Account2 implements Runnable{
    private double balance;
    private ReentrantLock lock = new ReentrantLock();

    public Account2(double balance){
        this.balance = balance;
    }

    //存钱
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try{
                lock.lock();
                deposite(1000);
            }finally{
                lock.unlock();
            }
        }
    }

    public void deposite(double amt){
        if(amt > 0){
            balance += amt;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "存钱成功，当前余额：" + balance);
        }
    }

}


public class AccountTest2 {
    public static void main(String[] args) {
        Account2 acc = new Account2(0);

        //一个线程对应一个用户
        Thread t1 = new Thread(acc);
        Thread t2 = new Thread(acc);

        t1.setName("甲");
        t2.setName("乙");

        t1.start();
        t2.start();
    }
}

