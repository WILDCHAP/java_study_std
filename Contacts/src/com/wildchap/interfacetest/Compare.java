package com.wildchap.interfacetest;
/**
 * 全局常量、抽象方法、静态方法、默认方法
 * @description 
 * @wang 993704315@qq.com
 * @params
 * @method
 * @return
 */
public interface Compare {
	//静态方法
	public static void method1() {
		System.out.println("beijin");
	}
	//默认方法
	public default void method2() {
		System.out.println("shanghai");
	}
}
