package com.hh.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hh.pojo.RiskList;
import com.hh.pojo.UserList;
import com.hh.service.RiskService;
/**
 * Controller灞�
 * @author Wei_Chi
 *
 */
@Controller
public class RiskController {
	/** 鑷嫊娉ㄥ叆RiskService */       
	@Autowired
	private RiskService riskService;
	/**
	 * 妞滅储銉溿偪銉炽倰銈儶銉冦偗銇椼仸銆侀伕鎶炪仐銇熸儏鍫便伀鍩恒仴銇勩仸妗堜欢妞滅储銈掕銇勩伨銇�
	 * @param project_no
	 * @return riskResults_01鐢婚潰
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
	 * 銉椼儷銉�銈︺兂銉°儖銉ャ兗銇竴瑕�
	 * @param ddlBranch_id
	 * @return user鐢婚潰
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
	 * 绀惧摗銇屾儏鍫便倰妞滅储銇欍倠
	 * @param userList
	 * @param ddlBranch_id
	 * @return user鐢婚潰
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
	 * 绀惧摗鎯呭牨銈掑彇寰椼仐銉偣銈鐞嗙敾闈€伀閫佷俊銇欍倠
	 * @param lnkUserCd
	 * @return riskSort_01鐢婚潰
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
