package com.wildchap.object;
/**
 * abstract
 * 修饰类、方法
 * 类：	
 * 		不能实例化,但一定有构造器,便于子类调用
 * 方法：
 * 		抽象方法一定在抽象类里(因为保证它不被对象调)
 * 		子类要实现夫类里的抽象方法，否则子类也是抽象类
 * 抽象方法一定在抽象类里
 * 抽象类里不一定有抽象方法
 * @description 
 * @wang 993704315@qq.com
 * @params
 * @method
 * @return
 */
public class AbstractTest {
	public static void main(String[] args) {
//		不可实例化abstract类
//		Person p1 = new Person();
//		p1.eat();
	}
}

abstract class Person{
	String name;
	int age;
	public Person() {}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void eat() {
		System.out.println("人吃饭");
	}
	//抽象方法
	public abstract void eat2();
}

class Student extends Person{
	public Student(String name, int age) {
		super(name, age);
	}
	//重写父类抽象方法
	public void eat2() {
		System.out.println("学生吃营养的");
	}
}

