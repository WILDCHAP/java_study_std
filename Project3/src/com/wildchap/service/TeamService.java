package com.wildchap.service;

import com.wildchap.domain.Architect;
import com.wildchap.domain.Designer;
import com.wildchap.domain.Employee;
import com.wildchap.domain.Programmer;

/**
 * 关于开发团队成员的管理
 * 
 * @author wang 993704315@qq.com
 *
 *
 */
public class TeamService {
	private static int counter = 1; // static实现id自增
	private static final int MAX_MEMBER = 5;
	// 保存开发团队成员(由于成员至少是程序员)
	private Programmer[] team = new Programmer[MAX_MEMBER];

	private int total; // 记录开发团队中的实际人数

	// 获取所有团队成员
	public Programmer[] getTeam() {
		Programmer[] p = new Programmer[total];
		for (int i = 0; i < total; i++)
			p[i] = team[i];
		return p;
	}

	// 将指定员工添加到团队中(考虑添加失败)
	public void addMember(Employee e) throws TeamException {
		if (total >= MAX_MEMBER)
			throw new TeamException("成员已满，无法添加");
		if (!(e instanceof Programmer))
			throw new TeamException("该成员不是开发人员，无法添加");
		if (isExit(e))
			throw new TeamException("该成员已经在开发团队中");
		// 此时一定是Programmer类
		Programmer p = (Programmer) e;
		if ("BUSY".equals(p.getStatus().getName())) {
			throw new TeamException("该成员已经是某个团队成员了");
		} else if ("VOCATION".equals(p.getStatus().getName())) {
			throw new TeamException("该成员正在休假，无法参加");
		}
		// 获取已有的人数
		int numOfArch = 0, numOfDes = 0, numOfPro = 0;
		for (int i = 0; i < total; i++) {
			if (team[i] instanceof Architect)
				numOfArch++;
			else if (team[i] instanceof Designer)
				numOfDes++;
			else if (team[i] instanceof Programmer)
				numOfPro++;
		}
		if (p instanceof Architect) {
			if (numOfArch >= 1)
				throw new TeamException("团队中至多有一名架构师");
		} else if (p instanceof Designer) {
			if (numOfDes >= 2)
				throw new TeamException("团队中至多有两名设计师");
		} else if (p instanceof Programmer) {
			if (numOfArch >= 3)
				throw new TeamException("团队中至多有三名程序员");
		}
		
		//将p(或e)添加到团队中并赋予属性和修改状态
		team[total++] = p;
		p.setStatus(Status.BUSY);
		p.setMemberId(counter++);
	}

	private boolean isExit(Employee e) {
		for (int i = 0; i < total; i++)
			if (team[i].getId() == e.getId())
				return true;
		return false;
	}

	//删除指定团队成员
	public void removeMember(int memberId) throws TeamException {
		int i = 0;
		for(i = 0; i < total; i ++) {
			if(team[i].getMemberId() == memberId) {
				//修改状态为自由
				team[i].setStatus(Status.FREE);
				break;
			}
		}
		for(int j = i + 1; j < total; j ++) {
			team[j - 1] = team[j];
		}
		if(i == total) {//没找到
			throw new TeamException("找不到指定memberId的员工，删除失败");
		}else {
			team[--total] = null;
		}
	}

}
