package com.hh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hh.bean.RiskPreventionList;
import com.hh.service.RiskPreventService;

@Controller
public class RiskPreventController {

	@Autowired
	private RiskPreventService riskPreventService;
	
	@RequestMapping(value="/getPreventYear",method=RequestMethod.GET)
	@ResponseBody
	private List<RiskPreventionList> getPreventYear() {
		return riskPreventService.getPreventYear();
	}
	@RequestMapping(value="/getPreventMonth",method=RequestMethod.GET)
	@ResponseBody
	private List<RiskPreventionList> getPreventMonth() {
		return riskPreventService.getPreventMonth();
	}
}
