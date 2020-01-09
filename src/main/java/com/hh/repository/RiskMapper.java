package com.hh.repository;

import java.util.List;

import com.hh.bean.RiskList;
import com.hh.bean.UserList;

public interface RiskMapper {

	List<RiskList> getRiskList(String project_no);
	
	List<UserList> getDownList(String ddlBranch_id);
	
	List<UserList> gdvUserList(UserList userList);
	
	List<UserList> getUser(String lnkUserCd);
}
