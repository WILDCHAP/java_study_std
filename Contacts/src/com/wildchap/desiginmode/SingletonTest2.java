package com.wildchap.desiginmode;
/**
 * 单例设计模式(懒汉式)啥时候用啥时候造
 * @description 
 * @wang 993704315@qq.com
 * @params
 * @method
 * @return
 */
public class SingletonTest2 {
	public static void main(String[] args) {
		Order order1 = Order.getInstance();
		Order order2 = Order.getInstance();
		System.out.println(order1 == order2);
	}
}

class Order{
	//私有化类的构造器
	private Order() {
		
	}
	//内部创建对象
	private static Order instance = null;
	//由于不能通过对象调，只能通过类调，所以要设置成static
	public static Order getInstance() {
		if(instance == null)
			instance = new Order();
		return instance;
	}
}
