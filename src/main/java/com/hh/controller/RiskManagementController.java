package com.neuedu.personnelrisk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.personnelrisk.bean.RiskManagement;
import com.neuedu.personnelrisk.service.RiskManagementService;

@Controller
public class RiskManagementController
{
	@Autowired
	private RiskManagementService service;
	
	@RequestMapping(value = "/prm",method=RequestMethod.GET)
	@ResponseBody
	public List<RiskManagement> selectAll(RiskManagement rm)
	{
		return service.selectManagement(rm);
	}
}
