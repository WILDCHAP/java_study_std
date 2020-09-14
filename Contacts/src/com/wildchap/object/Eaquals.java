package com.wildchap.object;
import java.util.Arrays;
/**
 * 
 * @author wang	993704315@qq.com
 *
 *
 */
public class Eaquals {
	public static void main(String[] args) {
		int i = 10;
		int j = 10;
		double k = 10.0;
		System.out.println(i == j);		//true
		System.out.println(i == k);		//true
		char ch = 10;
		System.out.println(ch == i);	//true
		
		/************************************
		 * 
		 */
		Test t1 = new Test("zhang", 20);
		Test t2 = new Test("zhang", 20);
		System.out.println(t1 == t2);
		System.out.println("**************************");
		System.out.println(t1.equals(t2));
		int [] a = new int[] {1, 2, 3};
		System.out.println(Arrays.toString(a));
		System.out.println("**************************");
		System.out.println(t1);
	}
}
