package com.wildchap.interfacetest;
/**
 * 接口中的静态方法只能接口中调
 * @description 
 * @wang 993704315@qq.com
 * @params
 * @method
 * @return
 */
public class SubClassTest {
	public static void main(String[] args) {
		SubClass s = new SubClass();
		//接口中的静态方法只能接口中调
		//s.method1();
		Compare.method1();
		//接口中的默认方法可以重写,子类>父类>接口
		s.method2();
	}
}

class SubClass implements Compare{
	
}
