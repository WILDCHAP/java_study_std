package com.wildchap.test;

/**
 * 练习：
 * 银行两个储户分别向同一个账户存3000元，每次存1000，存3次。每次显示余额。
 *
 * 继承 + synchronized
 *
 * @author wildchap
 * @create 2020-09-17-19:14
 */
class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    //存钱
    public synchronized void deposite(double amt){
        if(amt > 0){
            balance += amt;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "存钱成功，余额为：" + balance);
        }
    }
}

class Customer1 extends Thread{
    private Account acct;

    public Customer1(Account acct) {
        this.acct = acct;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            //System.out.print(getName() + "存钱");
            acct.deposite(1000);
        }
    }
}


public class AccountTest {
    public static void main(String[] args) {
        Account acct = new Account(0);
        Customer1 c1 = new Customer1(acct);
        Customer1 c2 = new Customer1(acct);

        c1.setName("甲");
        c2.setName("乙");
        //存钱
        c1.start();
        c2.start();
    }
}
