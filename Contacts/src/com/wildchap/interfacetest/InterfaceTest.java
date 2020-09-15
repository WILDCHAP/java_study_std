package com.wildchap.interfacetest;
/**
 * 继承：xxx(子类)是xxx(父)
 * 接口：xxx有xxx(接口)功能
 * 两者是并列的结构
 * 
 * 定义接口成员:
 * 		只能有常量，只能是抽象方法
 * 		全局常量、抽象方法、静态方法、默认方法
 * 		public static final
 * 		public abstract
 * 		接口中不能有构造器
 * 		接口中的静态方法只能接口中调
 * @description 
 * @wang 993704315@qq.com
 * @params
 * @method
 * @return
 */
public class InterfaceTest {
	public static void main(String[] args) {
		System.out.println(Flyable.MAX_SPEED);
		System.out.println(Flyable.MIN_SPEED);
		Plane p1 = new Plane();
		p1.fly();
	}
}

interface Flyable{
	//全局常量
	public static final int MAX_SPEED = 7900;
	public static final int MIN_SPEED = 1;
	//抽象方法
	public abstract void fly();
}

class Plane implements Flyable{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("fly");
	}
	
}
