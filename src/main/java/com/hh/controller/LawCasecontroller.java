package com.hh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hh.bean.LawCase;
import com.hh.service.LawCaseservice;

import jdk.nashorn.internal.runtime.JSONFunctions;
@Controller
public class LawCasecontroller {

	@Autowired
	private LawCaseservice lawcaseservice;
	
	@RequestMapping("/tologin")
	public ModelAndView toDownList(@RequestParam("A01M002_SECT_NM")String A01M002_SECT_NM,String A01M002_SECT_CD,String A01M002_APLSTA_YMD){
		System.out.println(A01M002_SECT_NM);
		ModelAndView mav = new ModelAndView();
		List<LawCase> lawlist = this.lawcaseservice.getLawCase(A01M002_SECT_NM);

		if(!lawlist.isEmpty()||lawlist.size()!=0) {
			mav.addObject("lawlist", lawlist);
			mav.setViewName("anjian");
		}else {
			this.lawcaseservice.add(A01M002_SECT_NM, A01M002_SECT_CD);
			mav.setViewName("add");
		}

		return mav;
	}
@RequestMapping("tolist1")
public List<LawCase> tolist(String A01M002_SECT_ALIAS) {

	return lawcaseservice.getlist(A01M002_SECT_ALIAS);
	
	 
}
}
