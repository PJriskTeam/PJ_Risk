package com.hh.mapper;

import java.util.List;

import com.hh.pojo.RiskList;
import com.hh.pojo.UserList;

public interface RiskMapper {

	List<RiskList> getRiskList(String project_no);
	
	List<UserList> getDownList(String ddlBranch_id);
	
	List<UserList> gdvUserList(UserList userList);
	
	List<UserList> getUser(String lnkUserCd);
}
