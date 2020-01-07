package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crud.bean.Department;
import com.crud.bean.Employee;
import com.crud.bean.Msg;
import com.crud.service.DepartmentService;
import com.crud.service.EmployeeService;

/**
 * 部門関係の要求を処理する
 * @author YuWF
 *
 */
@Controller
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	/**
	 * すべての部門情報を返します。
	 * JSONに戻ります
	 */
	@RequestMapping("/depts")
	@ResponseBody
	public Msg getDepts() {
		return Msg.success().add("depts", departmentService.getDepts());
	}
	
}
