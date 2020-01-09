package com.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.entity.DATA;
import com.entity.DepartmentList;
import com.service.NewService;

public class NewController {
	/** 自動注入RiskService */       
	@Autowired
	private NewService newService;
	/**
	 * 検索ボタンをクリックして、選択した情報に基づいて案件検索を行います
	 * @param project_no
	 * @return menu画面
	 */
	@RequestMapping("/toSearchList")
	public ModelAndView toRiskResults(String project_no){
		ModelAndView mav = new ModelAndView();
		List<DATA> data = newService.getData(project_no);
		mav.addObject("data", data);
		mav.setViewName("searchList");
		return mav;
	}
	/**
	 * プルダウンメニューの一覧
	 * @param ddlBranch_id
	 * @return department画面
	 */
	@RequestMapping("/toDownList")
	public ModelAndView toDownList(String ddlBranch_id){
		ModelAndView mav = new ModelAndView();
		List<DepartmentList> downList = newService.getDownList(ddlBranch_id);
		mav.addObject("downList", downList);
		mav.setViewName("department");
		return mav;
	}
	/**
	 * 部门が情報を検索する
	 * @param deparmentList
	 * @param ddlBranch_id
	 * @return department画面
	 */
	@RequestMapping("/toRiskUserList")
	public ModelAndView toRiskUserList(DepartmentList deparmentList,String ddlBranch_id){
		ModelAndView mav = new ModelAndView();
		List<DepartmentList> gdvDepartmentList = newService.gdvDepartmentList(deparmentList);
		List<DepartmentList> downList = newService.getDownList(ddlBranch_id);
		mav.addObject("downList", downList);
		mav.addObject("gdvDepartmentList", gdvDepartmentList);
		mav.setViewName("department");
		return mav;
	}
	/**
	 * 部门情報を取得しリスク管理画面に送信する
	 * @param lnkSectCd
	 * @return riskSort_01画面
	 */
	@RequestMapping("/department")
	public ModelAndView toUser(String lnkSectCd){
		ModelAndView mav = new ModelAndView();
		List<DepartmentList> department = newService.getDepartment(lnkSectCd);
		mav.addObject("department", department.get(0));
		mav.setViewName("riskSort_01");
		return mav;
	}
}
