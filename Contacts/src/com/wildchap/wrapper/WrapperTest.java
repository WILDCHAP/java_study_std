package com.wildchap.wrapper;
/**
 * 包装类使用
 * @description 
 * @wang 993704315@qq.com
 * @params
 * @method
 * @return
 */
public class WrapperTest {
	public static void main(String[] args) {
		WrapperTest w = new WrapperTest();
		w.test4();
	}
	//基本数据类型->包装类，调用构造器
	public void test1() {
		int num1 = 10;
		Integer in1 = new Integer(num1);
		System.out.println(in1.toString());;
		
	}
	//包装类->基本数据类型，xxxValue()
	public void test2() {
		Integer in1 = new Integer(12);
		//转换能做加减
		int i1 = in1.intValue();
		i1++;
		System.out.println(i1);
	}
	//JDK5.0新特性：自动装箱与拆箱
	public void test3_1() {
		int num2 = 10;
		Integer in1 = num2;//自动装箱
		System.out.println(in1);
		
		int num3 = in1;		//自动拆箱
	}
	//基本数据类型->String
	public void test3() {
		//方式1
		int num1 = 10;
		String str1 = num1 + "";
		//方式2:调用String的ValueOf
		float f1 = 12.3f;
		String.valueOf(f1);	//"12.3"
		Float f2 = f1;
		System.out.println(f2.toString());
	}
	//String->基本数据类型: parsexxx()
	public void test4() {
		String str1 = "123";
		int num2 = Integer.parseInt(str1);
		System.out.println(num2+1);
	}
}
