package com.wildchap.object;
/**
 * final
 * 修饰类:	不能被继承
 * 修饰方法:	不能被重写(一般为了方法不被重写)
 * 修饰变量:	不能改变(相当与一个常量)
 * 
 * @description 
 * @wang 993704315@qq.com
 * @params
 * @method
 * @return
 */
public class FinalTest {
	public static void main(String[] args) {
		FinalA f = new FinalA();
	}
}

//不能被继承
final class FinalA{
	final int i = 10;
	FinalA(){}
}

