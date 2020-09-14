package com.wildchap.algorithm;
/**
 * 
 * wang
 */

public class Hanoi {
	static int num = 0;
	public static void main(String[] args) {
		Hanoi h = new Hanoi();
		h.move('a', 'b', 'c', 10);
		System.out.println(num);
	}
	public void move(char x1, char x2, char x3, int n) {
		if(n>0) {
			//利用x3将x1中n-1个移动到x2上
			move(x1, x3, x2, n-1);
			//移动剩下一个到x3上
			System.out.println(x1 + " move to " + x3);
			num ++;
			//利用x1将x2中n-1个移动到x3上
			move(x2, x1, x3, n-1);
		}
	}
}
