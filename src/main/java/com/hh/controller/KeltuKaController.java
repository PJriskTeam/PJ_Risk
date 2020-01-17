package com.hh.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hh.bean.KeltuKaList;
import com.hh.service.KeltuKaService;

/**
  Controller層
  
  @author WuQian
 *
 */
@Controller
public class KeltuKaController {
	
	/* 自動注入RiskService */
	@Autowired
	private KeltuKaService keltukaService;
	
	/*
	 * 検索ボタンをクリックして、選択した情報に基づいて案件検索を行います
	 * 
	 * @param C_A01M002_SECT_NM
	 * 
	 * @return リスク予防管理検討会検索結果画面
	 */
	
	@RequestMapping(value="getKeltuKa",method={ RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public ModelAndView getKeltuKa(Model model,String a01m002_sect_nm,
									String product_sect_nm,String process_name,
//									String open_date, 
									String order_cd,
									HttpServletRequest request){
	//	创建ModelAndView对象
	ModelAndView mav = new ModelAndView();
		
	//	检索LiSiKuList,调用service层方法
	List<KeltuKaList> keltukaList = keltukaService.getKeltuKa(a01m002_sect_nm, product_sect_nm, process_name,
//															  open_date,
															  order_cd);
	
	System.out.println(keltukaList+"------------------------------------------------------------");
	//	添加ModelAndView对象到keltukaList
	mav.addObject("keltukaList", keltukaList);
	mav.setViewName("KeltuKa.jsp");
	return mav;
	  
	 }
		 
}
