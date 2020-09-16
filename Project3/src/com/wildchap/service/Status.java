package com.wildchap.service;

/**
 * 员工的三个状态
 * 
 * @author wang 993704315@qq.com
 *
 *
 */
public class Status {
	private final String NAME;

	private Status(String name) {
		this.NAME = name;
	}

	public static final Status FREE = new Status("FREE");
	public static final Status BUSY = new Status("BUSY");
	public static final Status VOCATION = new Status("VOCATION");

	// 返回员工状态
	public String getName() {
		return NAME;
	}
	
	//重写toString
	public String toString() {
		return NAME;
	}
}
