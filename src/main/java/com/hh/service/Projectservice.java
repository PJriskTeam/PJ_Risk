package com.hh.service;

import java.util.List;

import com.hh.bean.Project;

public interface Projectservice {
	public void add1(int PROJECT_NO ,String PROJECT_NAME_TEMP  ,String CUSTOMER_NAME ,String ORDER_CD ,String RELATE_ORDER_CD ,String PRODUCT_SECT_NM
			 ,String PRODUCT_USER_FULLNAME ,String BRANCH_QUALITY_MANAGER ,String SECTION_QUALITY_MANAGER ,String GROUP_QUALITY_MANAGER);
	
	public List<Project> getproject(int PROJECT_NO);
	
	public void del(int PROJECT_NO );
}
