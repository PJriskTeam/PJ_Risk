package com.hh.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hh.bean.LiSiKuList;
import com.hh.service.LiSiKuService;

/**
 * Controller層
 * 
 * @author WuQian
 *
 */
@Controller
public class LiSiKuController {

	/** 自動注入RiskService */
	@Autowired
	private LiSiKuService riskPreventionService;

	/**
	 * 検索ボタンをクリックして、選択した情報に基づいて案件検索を行います
	 * 
	 * @param a01m002_sect_nm
	 * 		  product_sect_nm
	 * 		  process_name
	 * @return リスク予防管理検討会検索結果画面
	 */
	
	/* ajxaはDB中からjspに部門を取值する */
	@RequestMapping(value="getSiSilya",method={ RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public List<LiSiKuList> getSiSilya(String a01m002_sect_nm) {
		return riskPreventionService.getSiSilya(a01m002_sect_nm);
	}
	
	/* ajxaはDB中からjspに部門を取值する */
	@RequestMapping(value="getBuMoN",method={ RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public List<LiSiKuList> getBuMoN(String product_sect_nm) {
		return riskPreventionService.getBuMoN(product_sect_nm);
	}
	
	/* ajxaはDB中からjspにプロセスを取值する */
	@RequestMapping(value="getPuRoSeSu",method={ RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public List<LiSiKuList> getPuRoSeSu(String process_name) {
		return riskPreventionService.getPuRoSeSu(process_name);
	}
	
	/* ajxaはDB中からjspに开催日の年を取值する */
	@RequestMapping(value="getNeN",method={ RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public List<LiSiKuList> getNeN() {
		return riskPreventionService.getNeN();
	}
	
	/* ajxaはDB中からjspに开催日の月を取值する */
	 @RequestMapping(value="getGaTu",method={RequestMethod.GET,RequestMethod.POST})
	 @ResponseBody 
	 public List<LiSiKuList> getGaTu() {
		 return riskPreventionService.getGaTu(); 
	 }
	

}
