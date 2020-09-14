package com.wildchap.object;
/**
 * 利用static实现id的自增
 * @description 
 * @wang 993704315@qq.com
 * @params
 * @method
 * @return
 */
public class CircleTest {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		System.out.println(c1.getId() + " " + c2.getId());
	}
	
}


class Circle{
	private double r;
	private int id;
	private static int init = 1001;
	private static int total = 0;
	public Circle() {
		id = init++;
		total++;
	}
	public int getId() {
		return id;
	}
	public static int getTotal() {
		return total;
	}
}