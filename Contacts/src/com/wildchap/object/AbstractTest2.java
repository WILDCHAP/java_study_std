package com.wildchap.object;
/**
 * 创建抽象类的匿名子类(重写它的抽象方法即可)
 * @description 
 * @wang 993704315@qq.com
 * @params
 * @method
 * @return
 */
public class AbstractTest2 {
	public static void main(String[] args) {
		//创建了一个匿名对象p1
		Person p1 = new Person() {
			public void eat() {
				
			}
			public void work() {
				
			}
		};
	}
}

abstract class Person{
	public Person() {
		
	}
	public abstract void eat();
	public abstract void work();
	public void get() {
		
	}
}


