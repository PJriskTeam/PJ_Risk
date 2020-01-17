package com.hh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import com.hh.bean.Project;
import com.hh.service.Projectservice;

@Controller
public class Projectcontroller {
@Autowired
private Projectservice projectservice;
@RequestMapping("/menu")
@ResponseBody
public  ModelAndView  toproject(@RequestParam("PROJECT_NO")int PROJECT_NO,String PROJECT_NAME_TEMP,String CUSTOMER_NAME,String ORDER_CD,String RELATE_ORDER_CD
		,String PRODUCT_SECT_NM,String PRODUCT_USER_FULLNAME , String BRANCH_QUALITY_MANAGER, String SECTION_QUALITY_MANAGER ,String GROUP_QUALITY_MANAGER ) {
	System.out.println(PROJECT_NO);
	ModelAndView mav = new ModelAndView();
	List<Project> list1 = this.projectservice.getproject(PROJECT_NO);
	if(!list1.isEmpty()||list1.size()!=0) {
		mav.addObject("list1", list1);
		mav.setViewName("file");
	}else {
	this.projectservice.add1(PROJECT_NO, PROJECT_NAME_TEMP, CUSTOMER_NAME, ORDER_CD, RELATE_ORDER_CD, PRODUCT_SECT_NM, PRODUCT_USER_FULLNAME, BRANCH_QUALITY_MANAGER, SECTION_QUALITY_MANAGER, GROUP_QUALITY_MANAGER);
		mav.setViewName("add");

	}
	
	return mav;
}
@RequestMapping("/delete")
public String delete(int PROJECT_NO ) {
	
this.projectservice.del(PROJECT_NO);

return "delete";
	
	
}
}