package com.hh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hh.bean.Department;
import com.hh.bean.Msg;
import com.hh.serviceImpl.DepartmentService;


/**
 * 澶勭悊鍜岄儴闂ㄦ湁鍏崇殑璇锋眰
 * @author copywang
 *
 */
@Controller
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	/**
	 * 杩斿洖鎵�鏈夌殑閮ㄩ棬淇℃伅
	 * 杩斿洖JSON
	 */
	@RequestMapping("/depts")
	@ResponseBody
	public Msg getDepts() {
		List<Department> list = departmentService.getDepts();
		return Msg.success().add("depts", list);
	}
	
}
