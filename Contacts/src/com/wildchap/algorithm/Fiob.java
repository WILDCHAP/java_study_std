package com.wildchap.algorithm;
/**
 * 
 * @author wang	993704315@qq.com
 *
 *
 */
public class Fiob {
	public static void main(String[] args) {
		Fiob f = new Fiob();
		System.out.println(f.f(6));
	}
	public int f(int n) {
		if(n==1 || n==2)
			return 1;
		else
			return f(n-1) + f(n-2);
	}
}
