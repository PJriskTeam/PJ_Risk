package com.hh.controller;

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

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hh.bean.Employee;
import com.hh.bean.Msg;
import com.hh.serviceImpl.EmployeeService;



/**
 * 澶勭悊鍛樺伐淇℃伅CRUD璇锋眰
 * 
 * @author copywang
 *
 */
@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	/**
	 * 瀵煎叆jackson鍖� 鎶婂璞¤浆鎹㈡垚JSON瀛楃涓� 绗簩绋� 鏀寔绉诲姩璁惧
	 * 
	 * @param pn
	 * @return
	 */
	@RequestMapping("/emps")
	@ResponseBody
	public Msg getEmpsWithJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
		// 寮曞叆PageHelper鍒嗛〉鎻掍欢
		// 鏌ヨ鍓嶈皟鐢紝浼犲叆椤电爜鍜岃褰曟暟
		PageHelper.startPage(pn, 5);
		// startPage绱ц窡鐫�鐨勮繖涓煡璇㈠氨鏄竴涓垎椤垫煡璇�
		List<Employee> emps = employeeService.getAll();
		// PageInfo鍖呰鏌ヨ缁撴灉锛屽皝瑁呬簡璇︾粏鐨勫垎椤典俊鎭拰璇︾粏鏁版嵁
		// 杩炵画鏄剧ず5椤�
		PageInfo pageInfo = new PageInfo(emps, 5);

		return Msg.success().add("pageInfo", pageInfo);
	}

	/**
	 * 灞曠ずlist.jsp椤甸潰 鏌ヨ鍛樺伐鏁版嵁锛堝垎椤垫煡璇級 绗竴绋� 鐢ㄩ潤鎬佹柟娉曞埛鏂扮殑椤甸潰锛屾敮鎸佹祻瑙堝櫒
	 * 
	 * @return
	 */
	// @RequestMapping("/emps")
	public String getEmps(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
		// 寮曞叆PageHelper鍒嗛〉鎻掍欢
		// 鏌ヨ鍓嶈皟鐢紝浼犲叆椤电爜鍜岃褰曟暟
		PageHelper.startPage(pn, 5);
		// startPage绱ц窡鐫�鐨勮繖涓煡璇㈠氨鏄竴涓垎椤垫煡璇�
		List<Employee> emps = employeeService.getAll();
		// PageInfo鍖呰鏌ヨ缁撴灉锛屽皝瑁呬簡璇︾粏鐨勫垎椤典俊鎭拰璇︾粏鏁版嵁
		// 杩炵画鏄剧ず5椤�
		PageInfo pageInfo = new PageInfo(emps, 5);
		// 鎶奝ageInfo浜ょ粰椤甸潰鍗冲彲
		model.addAttribute("pageInfo", pageInfo);

		return "list";
	}

	/**
	 * 鏍￠獙鐢ㄦ埛鍚嶆槸鍚﹁鍗犵敤
	 * 
	 * @param empName
	 * @return
	 */
	@RequestMapping(value = "/checkuser", method = RequestMethod.POST)
	@ResponseBody
	public Msg checkuser(@RequestParam("empName") String empName) {
		// 鍒ゆ柇鐢ㄦ埛鍚嶆槸鍚︾鍚堟鍒欒〃杈惧紡

		String regex = "(^[A-Za-z0-9]{6,16}$)|(^[\\u2E80-\\u9FFF]{2,5}$)";
		if (!empName.matches(regex)) {
			// System.out.println(empName.matches(regex));
			return Msg.fail().add("va_msg", "鍚嶅瓧蹇呴』鏄�2-5涓腑鏂囨垨鑰�6-16浣嶈嫳鏂囨暟瀛楃粍鍚�");
		}

		if (employeeService.checkuser(empName)) {
			return Msg.success();
		} else {
			return Msg.fail().add("va_msg", "鐢ㄦ埛鍚嶄笉鍙敤");
		}
	}

	/**
	 * 淇濆瓨鍛樺伐淇℃伅
	 * 
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
	 * 鏌ヨ鍛樺伐淇℃伅
	 * 
	 */
	@RequestMapping(value = "/emp/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Msg getEmp(@PathVariable("id") Integer id) {
		Employee emp = employeeService.getEmp(id);
		return Msg.success().add("emp", emp);
	}

	/**
	 * 淇敼鍛樺伐ID
	 */
	@RequestMapping(value = "/emp/{empId}", method = RequestMethod.PUT)
	@ResponseBody
	public Msg getEmp(Employee employee) {
		employeeService.updateEmp(employee);
		return Msg.success();
	}
	/*
	 * //鍗曚釜鍒犻櫎鍛樺伐淇℃伅
	 * 
	 * @RequestMapping(value="/emp/{id}",method=RequestMethod.DELETE)
	 * 
	 * @ResponseBody public Msg deleteEmpById(@PathVariable("id")Integer id) {
	 * employeeService.deleteEmp(id); return Msg.success(); }
	 */

	/**
	 * 鎵归噺鍒犻櫎鍛樺伐淇℃伅:1-2-3 鍗曚釜锛�1
	 */
	@RequestMapping(value = "/emp/{ids}", method = RequestMethod.DELETE)
	@ResponseBody
	public Msg deleteEmpById(@PathVariable("ids") String ids) {
		if (ids.contains("-")) {
			String[] strIds = ids.split("-");
			/*
			 * 涓�绉嶅疄鐜� for (String str : strIds) {
			 * employeeService.deleteEmp(Integer.parseInt(str)); }
			 */
			// 鍙︿竴绉嶅疄鐜�
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
	 * 鏌ヨ鍔熻兘鐨勬煡璇㈠憳宸ヤ俊鎭� 鏌ヨ鍑烘潵鐨勫憳宸ユ暟鎹垎椤垫樉绀�
	 */
	@RequestMapping(value = "/queryEmps", method = RequestMethod.POST)
	@ResponseBody
	public Msg queryEmp(@RequestParam(value = "pn", defaultValue = "1") Integer pn, 
			Employee employee) {
		// System.out.println(employee);
		PageHelper.startPage(pn, 20);
		List<Employee> emplist = employeeService.queryEmp(employee);
		// PageInfo鍖呰鏌ヨ缁撴灉锛屽皝瑁呬簡璇︾粏鐨勫垎椤典俊鎭拰璇︾粏鏁版嵁
		// 杩炵画鏄剧ず5椤�
		PageInfo pageInfo = new PageInfo(emplist, 5);
		return Msg.success().add("pageInfo", pageInfo);
	}
}
