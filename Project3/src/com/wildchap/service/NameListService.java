package com.wildchap.service;

import com.wildchap.domain.Architect;
import com.wildchap.domain.Designer;
import com.wildchap.domain.Employee;
import com.wildchap.domain.Equipment;
import com.wildchap.domain.NoteBook;
import com.wildchap.domain.PC;
import com.wildchap.domain.Printer;
import com.wildchap.domain.Programmer;

/**
 * 负责将Data中数据封装到Employee[]中， 同时提供操作Employee的方法
 * 
 * @author wang 993704315@qq.com
 *
 *
 */
public class NameListService {

	private Employee[] employees;

	// 生成该类对象时生成员工数组
	public NameListService() {
		// 根据Date长度初始化employees数组
		employees = new Employee[Data.EMPLOYEES.length];

		for (int i = 0; i < employees.length; i++) {
			// 获取第一个描述员工类型的字段值
			int type = Integer.parseInt(Data.EMPLOYEES[i][0]);
			// 获取Employee的4个基本信息(因为都有)
			int id = Integer.parseInt(Data.EMPLOYEES[i][1]);
			String name = Data.EMPLOYEES[i][2];
			int age = Integer.parseInt(Data.EMPLOYEES[i][3]);
			double salary = Double.parseDouble(Data.EMPLOYEES[i][4]);

			// 不一定有的先声明
			Equipment equipment = null;
			double bonus;

			switch (type) {
			case Data.EMPLOYEE:
				employees[i] = new Employee(id, name, age, salary);
				break;
			case Data.PROGRAMMER:
				// 获取他的相应设备
				equipment = createEquipment(i);
				employees[i] = new Programmer(id, name, age, salary, equipment);
				break;
			case Data.DESIGNER:
				equipment = createEquipment(i);
				bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
				employees[i] = new Designer(id, name, age, salary, equipment, bonus);
				break;
			case Data.ARCHITECT:
				equipment = createEquipment(i);
				bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
				int stock = Integer.parseInt(Data.EMPLOYEES[i][6]);
				employees[i] = new Architect(id, name, age, salary, equipment, bonus, stock);
				break;
			}
		}

	}

	// 获取指定index位置上员工的设备
	private Equipment createEquipment(int index) {

		Equipment e = null;

		int type = Integer.parseInt(Data.EQUIPMENTS[index][0]);
		String model = Data.EQUIPMENTS[index][1];

		switch (type) {
		case Data.PC:
			String display = Data.EQUIPMENTS[index][2];
			e = new PC(model, display);
			break;
		case Data.NOTEBOOK:
			double price = Double.parseDouble(Data.EQUIPMENTS[index][2]);
			e = new NoteBook(model, price);
			break;
		case Data.PRINTER:
			String type2 = Data.EQUIPMENTS[index][2];
			e = new Printer(model, type2);
			break;
		}
		return e;
	}

	// 获取所有员工信息
	public Employee[] getAllEmployees() {
		return employees;
	}

	// 获取某一个员工的信息(有可能返回没有，所以返回一个异常)
	public Employee getEmployee(int id) throws TeamException{
		//查找数组里员工的员工号
		for(int i = 0; i < employees.length; i++) {
			if(employees[i].getId() == id) {
				return employees[i];
			}
		}
		
		throw new TeamException("找不到指定的员工");
	}
}
