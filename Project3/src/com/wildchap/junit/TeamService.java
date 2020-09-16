package com.wildchap.junit;

import com.wildchap.domain.Employee;
import com.wildchap.domain.Programmer;
import com.wildchap.service.TeamException;

/**
  * 关于开发团队成员的管理
 * @author wang	993704315@qq.com
 *
 *
 */
public class TeamService {
	private static int counter = 1;	//static实现id自增
	private static final int MAX_MEMBER = 5;
	//保存开发团队成员(由于成员至少是程序员)
	private Programmer[] team = new Programmer[MAX_MEMBER];
	
	private int total;	//记录开发团队中的实际人数
	
	//获取所有团队成员
	public Programmer[] getTeam() {
		Programmer[] p = new Programmer[total];
		for(int i = 0; i < total; i ++)
			p[i] = team[i];
		return p;
	}
	
	//将指定员工添加到团队中(考虑添加失败)
	public void addMember(Employee e) throws TeamException {
		if(total >= MAX_MEMBER)
			throw new TeamException("成员已满，无法添加");
		if(!(e instanceof Programmer))
			throw new TeamException("该成员不是开发人员，无法添加");
		if(isExit(e))
			throw new TeamException("该成员已经在开发团队中");
		
	}
	
	private boolean isExit(Employee e) {
		for(int i = 0; i < total; i++)
			if(team[i].getId() == e.getId())
				return true;
		return false;
	}

	public void removeMember(int memberId) {
		
	}
	
}
