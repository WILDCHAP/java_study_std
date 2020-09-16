package com.wildchap.junit;

import com.wildchap.domain.Employee;
import com.wildchap.service.NameListService;
import com.wildchap.service.TeamException;

/**
  * 测试NameListService类和其方法
 * @author wang	993704315@qq.com
 *
 *
 */
public class NameListServiceTest {
	public static void main(String[] args) {
		//NameListServiceTest n = new NameListServiceTest();
		testGetEmployee();
	}
	public static void testGetAllEmployees() {
		NameListService service = new NameListService();
		Employee[] allEmployees = service.getAllEmployees();
		for(int i = 0; i < allEmployees.length; i ++) {
			System.out.println(allEmployees[i]);
		}
	}
	public static void testGetEmployee() {
		NameListService service = new NameListService();
		int id = 100;
		try {
			Employee employee = service.getEmployee(id);
			System.out.println(employee);
		} catch (TeamException e) {
			// TODO 自动生成的 catch 块
			System.out.println(e.getMessage());
		}
	}
}
