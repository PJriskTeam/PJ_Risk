package com.hh.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hh.bean.ProcessListForm;
import com.hh.service.ProcessService;

@Controller
public class ProcessController {

	@Autowired
	private ProcessService processService;
	
	@RequestMapping(value="/getProcess",method=RequestMethod.GET)
	@ResponseBody
	public List<ProcessListForm> getProcess(){
		return processService.getProcess();
	}
}
