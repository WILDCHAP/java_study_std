package com.wildchap.object;

public class StaticTest {
	public static void main(String[] args) {
		Static s1 = new Static();
		Static s2 = new Static();
		System.out.println(s2.num_1);
		System.out.println(s1.num_1 + " " + s1.num_3);
		s1.num_1 = 11;
		s1.num_3 = 11;
		System.out.println(s1.num_1 + " " + s1.num_3);
		System.out.println(s2.num_1);
		System.out.println(Static.num_1);
		Static.show();
	}
}
