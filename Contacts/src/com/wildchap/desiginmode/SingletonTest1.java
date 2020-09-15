package com.wildchap.desiginmode;
/**
 * ‘一个类只能造一个对象实例’
 * 单例设计模式(饿汉式)不管你什么时候用，先造好
 * @description 
 * @wang 993704315@qq.com
 * @params
 * @method
 * @return
 * 饿懒两者区分：
 * 饿：对象加载时间过长	但安全
 * 懒：好处,延迟对象创建  坏处,线程不安全
 * 
 * 网站计数器
 * 日志应用
 * 数据库链接池
 * 回收站
 * 任务管理器
 * 
 */
public class SingletonTest1 {
	public static void main(String[] args) {
		Bank bank1 = Bank.getInstance();
		Bank bank2 = Bank.getInstance();
		//bank1 == bank2，只有一个，饿汉式设计模式
		System.out.println(bank1 == bank2);
	}
}

class Bank{
	
	//1.私有化类的构造器
	private Bank() {
		
	}
	//2.内部创建类的对象(静态)
	private static Bank instance = new Bank();
	//3.提供公共方法返回类的对象
	public static Bank getInstance() {
		return instance;
	}
}
