package com.wildchap.object;

public class AccountTest {
	public static void main(String[] args) {
		
		Account acct1 = new Account();
		Account acct2 = new Account("123456", 100000);
		System.out.println(acct1);
		System.out.println(acct2);
		
	}
}
