package com.wildchap.domain;

/**
 * 笔记本
 * 
 * @author wang 993704315@qq.com
 *
 *
 */
public class NoteBook implements Equipment {
	private String model; // 机器型号
	private double price; // 价格

	public NoteBook() {
	}

	public NoteBook(String model, double price) {
		super();
		this.model = model;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// 重写接口的方法
	public String getDescription() {
		return model + "(" + price + ")";
	}

}
