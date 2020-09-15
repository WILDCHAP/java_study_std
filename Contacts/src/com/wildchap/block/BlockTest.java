package com.wildchap.block;
/**
 * 代码块(初始化块)
 * 1.初始化类或者对象
 * 2.只能用static修饰,分类：
 * 		静态代码块
 * 			随着类的第一次加载而执行(包括static加载)
 * 			初始化类的信息(这个类大家都有的)
 * 			只能调用静态属性
 * 		非静态代码块
 * 			随着每个对象的创建而执行
 * 			可以用于赋值
 * 			可以调用静态和非静态的属性
 * @description 
 * @wang 993704315@qq.com
 * @params
 * @method
 * @return
 */
public class BlockTest {
	public static void main(String[] args) {
		String s = Person.desc;
		Person p1 = new Person();
		Person p2 = new Person();
		System.out.println(p1.toString());
	}
}

class Person{
	String name;
	int age;
	static String desc = "你好啊";
	public Person() {}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//static代码块
	static{
		System.out.println("hellow static block");
		desc = "我是一个爱学习的人";
	}
	//非static代码块
	{
		System.out.println("hellow block");
		age = 1;
	}
	
	public void eat() {
		System.out.println("吃饭");
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", desc=" + desc + ", toString()=" + super.toString() + "]";
	}
	
}
