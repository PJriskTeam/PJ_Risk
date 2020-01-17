package com.hh.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hh.bean.LiSiKuList;

public interface LiSiKuService {
	
	/* ajxaはDB中からjspに支社を取值する */
	public List<LiSiKuList>  getSiSilya(@Param("a01m002_sect_nm")String a01m002_sect_nm);
	
	/* ajxaはDB中からjspに部門を取值する */ 
	public List<LiSiKuList>  getBuMoN(@Param("product_sect_nm")String product_sect_nm);
	
	/* ajxaはDB中からjspにプロセスを取值する */ 
	public List<LiSiKuList>  getPuRoSeSu(@Param("process_name")String process_name);
	
	/* ajxaはDB中からjspに开催日の年を取值する */ 
	public List<LiSiKuList>  getNeN();
	
	/* ajxaはDB中からjspに开催日の月を取值する */ 
	public List<LiSiKuList> getGaTu();
	

}
