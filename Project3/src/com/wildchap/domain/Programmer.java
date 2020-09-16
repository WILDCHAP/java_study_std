package com.wildchap.domain;

import com.wildchap.service.Status;

/**
 * 程序员
 * 
 * @author wang 993704315@qq.com
 *
 *
 */
public class Programmer extends Employee {
	private int memberId; // 团队id
	private Status status = Status.FREE; // 员工状态
	Equipment equipment;

	public Programmer() {
		super();
	}

	public Programmer(int id, String name, int age, double salary, Equipment equipment) {
		super(id, name, age, salary);
		this.equipment = equipment;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Equipment getEquipment() {
		return equipment;
	}

	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}

	public String toString() {
		return super.toString() + "\t程序员\t" + status + "\t\t\t" + equipment.getDescription();
	}
}
