package com.hh.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hh.bean.Project;
import com.hh.repository.ProjectMapper;
import com.hh.service.Projectservice;



@Service
public class Projectserviceimpl implements Projectservice {
	@Autowired
private ProjectMapper projectmapper;

	@Override
	@Transactional
	public void add1(int PROJECT_NO, String PROJECT_NAME_TEMP, String CUSTOMER_NAME, String ORDER_CD,
			String RELATE_ORDER_CD, String PRODUCT_SECT_NM, String PRODUCT_USER_FULLNAME, String BRANCH_QUALITY_MANAGER,
			String SECTION_QUALITY_MANAGER, String GROUP_QUALITY_MANAGER) {
		Project p= new Project();
	    p.setPROJECT_NO(PROJECT_NO);
	    p.setPROJECT_NAME_TEMP(PROJECT_NAME_TEMP);
	    p.setCUSTOMER_NAME(CUSTOMER_NAME);
	    p.setORDER_CD(ORDER_CD);
	    p.setRELATE_ORDER_CD(RELATE_ORDER_CD);
	    p.setPRODUCT_SECT_NM(PRODUCT_SECT_NM);
	    p.setPRODUCT_USER_FULLNAME(PRODUCT_USER_FULLNAME);
	    p.setBRANCH_QUALITY_MANAGER(BRANCH_QUALITY_MANAGER);
	    p.setSECTION_QUALITY_MANAGER(SECTION_QUALITY_MANAGER);
	    p.setGROUP_QUALITY_MANAGER(GROUP_QUALITY_MANAGER);
	    this.projectmapper.add1(p);
	    
	}

	@Override
	public List<Project> getproject(int PROJECT_NO) {
		
		return this.projectmapper.getproject(PROJECT_NO);
	}

	@Override
	public void del(int PROJECT_NO) {
		this.projectmapper.del(PROJECT_NO);
		
	}


	
	
}
