package com.hh.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hh.bean.RiskList;
import com.hh.bean.UserList;
import com.hh.service.RiskService;
/**
 * Controller層
 * @author Wei_Chi
 *
 */
@Controller
public class RiskController {
	/** 自動注入RiskService */
	@Autowired
	private RiskService riskService;
	/**
	 * 検索ボタンをクリックして、選択した情報に基づいて案件検索を行います
	 * @param project_no
	 * @return riskResults_01画面
	 */
	@RequestMapping("/toRiskResults")
	public ModelAndView toRiskResults(String project_no){
		ModelAndView mav = new ModelAndView();
		List<RiskList> riskList2 = riskService.getRiskList(project_no);
		mav.addObject("riskList2", riskList2);
		mav.setViewName("riskResults_01");
		return mav;
	}
	/**
	 * プルダウンメニューの一覧
	 * @param ddlBranch_id
	 * @return user画面
	 */
	@RequestMapping("/toDownList")
	public ModelAndView toDownList(String ddlBranch_id){
		ModelAndView mav = new ModelAndView();
		List<UserList> downList = riskService.getDownList(ddlBranch_id);
		mav.addObject("downList", downList);
		mav.setViewName("user");
		return mav;
	}
	/**
	 * 社員が情報を検索する
	 * @param userList
	 * @param ddlBranch_id
	 * @return user画面
	 */
	@RequestMapping("/toRiskUserList")
	public ModelAndView toRiskUserList(UserList userList,String ddlBranch_id){
		ModelAndView mav = new ModelAndView();
		List<UserList> gdvUserList = riskService.gdvUserList(userList);
		List<UserList> downList = riskService.getDownList(ddlBranch_id);
		mav.addObject("downList", downList);
		mav.addObject("gdvUserList", gdvUserList);
		mav.setViewName("user");
		return mav;
	}
	/**
	 * 社員情報を取得しリスク管理画面に送信する
	 * @param lnkUserCd
	 * @return riskSort_01画面
	 */
	@RequestMapping("/user")
	public ModelAndView toUser(String lnkUserCd){
		ModelAndView mav = new ModelAndView();
		List<UserList> user = riskService.getUser(lnkUserCd);
		mav.addObject("user", user.get(0));
		mav.setViewName("riskSort_01");
		return mav;
	}
}
