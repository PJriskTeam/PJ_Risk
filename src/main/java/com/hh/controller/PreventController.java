package com.hh.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hh.bean.PreventListForm;
import com.hh.service.PreventService;

@Controller
public class PreventController {
	@Autowired
	private PreventService preventService;
	//当url处于这个时，由toBranchList方法来处理请求
//	@RequestMapping("/toBranchList")
//	public ModelAndView toBranchList(PreventListForm preventListForm){
//		//创建一个模型视图对象
//		ModelAndView mav = new ModelAndView();
//		//获取到查询的数据
//		List<PreventListForm> branchList = preventService.getBranch(preventListForm);
//		//将数据放置到ModelAndView对象view中,第二个参数可以是任何java类型
//		mav.addObject("branchList", branchList);
//		//放入jsp路径
//		mav.setViewName("menu.jsp");
//		//返回ModelAndView对象mav
//		return mav;		
//	}

	@RequestMapping(value="/getBranch",method=RequestMethod.GET)
	@ResponseBody
	public List<PreventListForm> getBranch() {
		return preventService.getBranch();
	}
	
	@RequestMapping(value="/getDept",method=RequestMethod.GET)
	@ResponseBody
	public List<PreventListForm> getDept(){
		return preventService.getDept();
		
	}
}
