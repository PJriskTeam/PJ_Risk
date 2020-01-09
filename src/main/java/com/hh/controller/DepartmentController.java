package com.hh.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hh.pojo.Msg;
import com.hh.service.DepartmentService;




/**
 * 閮ㄩ杸闁總銇姹傘倰鍑︾悊銇欍倠
 * @author YuWF
 *
 */
@Controller
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	/**
	 * 銇欍伖銇︺伄閮ㄩ杸鎯呭牨銈掕繑銇椼伨銇欍��
	 * JSON銇埢銈娿伨銇�
	 */
	@RequestMapping("/depts")
	@ResponseBody
	public Msg getDepts() {
		return Msg.success().add("depts", departmentService.getDepts());
	}
	
}
