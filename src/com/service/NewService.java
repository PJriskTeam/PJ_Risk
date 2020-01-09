package com.service;

import java.util.List;

import com.entity.DATA;
import com.entity.DepartmentList;

public interface NewService {
	
	List<DATA> getData(String project_no);
	
	List<DepartmentList> getDownList(String ddlBranch_id);
	
	List<DepartmentList> gdvDepartmentList(DepartmentList deparmentList);

	List<DepartmentList> getDepartment(String lnkSectCd);
	
}
