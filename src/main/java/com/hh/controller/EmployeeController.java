package com.crud.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crud.bean.Employee;
import com.crud.bean.Msg;
import com.crud.service.EmployeeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 従業員情報CRUDの要求を処理します。
 * 
 * @author YuWF
 *
 */
@Controller
public class EmployeeController {

	@Autowired
	private final EmployeeService employeeService;

	//すべてのクエリー
	@RequestMapping("/emps")
	@ResponseBody
	public Msg getEmpsWithJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
		PageHelper.startPage(pn, 5);
		List<Employee> emps = employeeService.getAll();
		PageInfo pageInfo = new PageInfo(emps, 5);

		return Msg.success().add("pageInfo", pageInfo);
	}

	/**
	 * list.jspページを展示して従業員のデータを調べます。
	 */
	public String getEmps(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
		PageHelper.startPage(pn, 5);
		List<Employee> emps = employeeService.getAll();
		PageInfo pageInfo = new PageInfo(emps, 5);
		model.addAttribute("pageInfo", pageInfo);

		return "list";
	}

	/**
	 * ユーザ名が占有されているかどうかを確認します。
	 */
	@RequestMapping(value = "/checkuser", method = RequestMethod.POST)
	@ResponseBody
	public Msg checkuser(@RequestParam("empName") String empName) {
		// ユーザ名が正規表現に合っているかどうかを判定します。
		String regex = "(^[A-Za-z0-9]{6,16}$)|(^[\\u2E80-\\u9FFF]{2,5}$)";
		if (!empName.matches(regex)) {
			// System.out.println(empName.matches(regex));
			return Msg.fail().add("va_msg", "名前は2-5つの中国語または6-16桁の英語の数字の組み合わせでなければなりません。");
		}

		if (employeeService.checkuser(empName)) {
			return Msg.success();
		} else {
			return Msg.fail().add("va_msg", "ユーザ名が使えません");
		}
	}

	/**
	 * 従業員の情報を保存します
	 */
	@RequestMapping(value = "/emp", method = RequestMethod.POST)
	@ResponseBody
	public Msg saveEmp(@Valid Employee employee, BindingResult result) {
		if (result.hasErrors()) {
			Map<String, Object> map = new HashMap<String, Object>();
			List<FieldError> fieldErrors = result.getFieldErrors();
			for (FieldError fieldError : fieldErrors) {
				map.put(fieldError.getField(), fieldError.getDefaultMessage());
			}
			return Msg.fail().add("errorFields", map);
		} else {
			employeeService.saveEmp(employee);
			return Msg.success();
		}
	}

	/**
	 * 従業員の情報を調べる
	 * 
	 */
	@RequestMapping(value = "/emp/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Msg getEmp(@PathVariable("id") Integer id) {
		Employee emp = employeeService.getEmp(id);
		return Msg.success().add("emp", emp);
	}

	/**
	 * 従業員IDを修正する
	 */
	@RequestMapping(value = "/emp/{empId}", method = RequestMethod.PUT)
	@ResponseBody
	public Msg getEmp(Employee employee) {
		employeeService.updateEmp(employee);
		return Msg.success();
	}

	/**
	 * 一括削除従業員情報：1-2-3単一：1
	 */
	@RequestMapping(value = "/emp/{ids}", method = RequestMethod.DELETE)
	@ResponseBody
	public Msg deleteEmpById(@PathVariable("ids") String ids) {
		if (ids.contains("-")) {
			String[] strIds = ids.split("-");
			List<Integer> del_ids = new ArrayList<Integer>();
			for (String str : strIds) {
				del_ids.add(Integer.parseInt(str));
			}
			employeeService.deleteBatchEmp(del_ids);

		} else {
			employeeService.deleteEmp(Integer.parseInt(ids));
		}
		return Msg.success();
	}

	@RequestMapping("/emp/query")
	public String toQueryPage() {
		return "query";
	}

	/**
	 * 照会機能の照会従業員情報が検索された従業員データはページ別に表示されます。
	 */
	@RequestMapping(value = "/queryEmps", method = RequestMethod.POST)
	@ResponseBody
	public Msg queryEmp(@RequestParam(value = "pn", defaultValue = "1") Integer pn, 
			Employee employee) {
		PageHelper.startPage(pn, 20);
		List<Employee> emplist = employeeService.queryEmp(employee);
		PageInfo pageInfo = new PageInfo(emplist, 5);
		return Msg.success().add("pageInfo", pageInfo);
	}
}
