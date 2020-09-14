package com.wildchap.object;
/**
 * 
 * @description 
 * @wang 993704315@qq.com
 * @params
 * @method
 * @return
 */
public class Account {
	private int id;
	private String pwd;
	private double balance;
	
	private static double intereste;
	private static double minmoney = 1.0;
	private static int init = 1001;	//用于自动生产id
	public Account() {
		id = init++;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", pwd=" + pwd + ", balance=" + balance + "]";
	}
	public Account(String pwd, double balance) {
		id = init++;
		this.pwd = pwd;
		this.balance = balance;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public static double getIntereste() {
		return intereste;
	}
	public static void setIntereste(double intereste) {
		Account.intereste = intereste;
	}
	public static double getMinmoney() {
		return minmoney;
	}
	public static void setMinmoney(double minmoney) {
		Account.minmoney = minmoney;
	}
	public int getId() {
		return id;
	}
	public double getBalance() {
		return balance;
	}
	
	
}
