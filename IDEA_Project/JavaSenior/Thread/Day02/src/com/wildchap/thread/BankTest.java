package com.wildchap.thread;

/**
 * 使用同步机制解决懒汉单例模式的安全问题
 *
 * @author wildchap
 * @create 2020-09-17-17:21
 */
public class BankTest {
}

class  Bank{

    private Bank(){}

    private static Bank instance = null;

    public static Bank getInstance(){

        if(instance == null){
            synchronized(Bank.class) {
                instance = new Bank();
            }
        }
        return instance;
    }
}
