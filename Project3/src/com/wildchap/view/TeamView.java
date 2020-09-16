package com.wildchap.view;

import com.wildchap.domain.Employee;
import com.wildchap.domain.Programmer;
import com.wildchap.service.NameListService;
import com.wildchap.service.TeamException;
import com.wildchap.service.TeamService;

/**
 * 
 * @author wang	993704315@qq.com
 *
 *
 */
public class TeamView {
	private NameListService listSvc = new NameListService();
	private TeamService teamSvc = new TeamService();
	
	//进入主界面
	public void enterMainMenu() {
		boolean loopFlag = true;
		char menu = 0;
		while(loopFlag) {
			if(menu != '1')
				listAllEmployees();
			System.out.println();
			System.out.print("1-团队列表  2-添加团队成员  3-删除团队成员 4-退出   请选择(1-4)：");
			menu = TSUtility.readMenuSelection();
			switch(menu) {
			case '1':
				getTeam();
				break;
			case '2':
				addMember();
				break;
			case '3':
				deleteMember();
				break;
			case '4':
				System.out.println("是否要退出(Y/N):");
				char ans = TSUtility.readConfirmSelection();
				if(ans == 'Y')
					loopFlag = false;
				break;
			}
		}
	}
	//显示所有员工信息
	private void listAllEmployees() {
		System.out.println("\n-------------------------------开发团队调度软件--------------------------------\n");
		Employee[] employees = listSvc.getAllEmployees();
		if(employees.length == 0 || employees == null) {
			System.out.println("公司没有员工信息");
		}else {
			System.out.println("ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t领用设备");
			for(int i = 0; i < employees.length; i ++)
				System.out.println(employees[i]);
		}
		System.out.println("-------------------------------------------------------------------------------");
	}
	//查看开发团队情况
	private void getTeam() {
		System.out.println("\n--------------------团队成员列表---------------------\n");
		Programmer[] team = teamSvc.getTeam();
		if(team == null || team.length == 0) {
			System.out.println("没有开发团队成员");
		}else {
			System.out.println("TID/ID\t姓名\t年龄\t工资\t职位\t奖金\t股票");
			for(int i = 0; i < team.length; i ++) {
				System.out.println(team[i].getDetailsForTeam());
			}
		}
		System.out.println("-----------------------------------------------------");
	}
	//添加团队成员
	private void addMember() {
		System.out.println("---------------------添加成员---------------------");
		System.out.print("请输入要添加的员工ID：");
		int id = TSUtility.readInt();
		Employee emp;
		try {
			emp = listSvc.getEmployee(id);
			teamSvc.addMember(emp);
			System.out.println("添加成功");
		} catch (TeamException e) {
			System.out.println("添加失败，原因:" + e.getMessage());
		}
		//按回车继续...
		TSUtility.readReturn();
	}
	//删除团队成员
	private void deleteMember() {
		System.out.println("---------------------删除成员---------------------");
		System.out.print("请输入要删除员工的TID：");
		int id = TSUtility.readInt();
		System.out.println("是否要删除(Y/N):");
		char ans = TSUtility.readConfirmSelection();
		if(ans == 'N')
			return;
		try {
			teamSvc.removeMember(id);
		} catch (TeamException e) {
			System.out.println("删除失败，原因：" + e.getMessage());
		}
	}
	public static void main(String[] args) {
		TeamView view = new TeamView();
		view.enterMainMenu();
	}
}
