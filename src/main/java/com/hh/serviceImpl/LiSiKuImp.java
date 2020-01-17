package com.hh.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hh.bean.LiSiKuList;
import com.hh.repository.LiSiKuRepository;
import com.hh.service.LiSiKuService;

/**
 * ServiceImp層
 * 
 * @author WuQian
 *
 */
@Service
public class LiSiKuImp implements LiSiKuService {

	/** 自動注入RiskMapper */
	@Autowired
	private LiSiKuRepository riskpreventionMapper;

	/**
	 * 検索ボタンをクリックして、選択した情報に基づいて案件検索を行います
	 * 
	 * @param a01m002_sect_nm
	 * 		  product_sect_nm
	 * 		  process_name
	 */
	/* ajxaはDB中からjspに支社を取值する */
	@Override
	public List<LiSiKuList> getSiSilya(String a01m002_sect_nm) {
		// TODO Auto-generated method stub
		return riskpreventionMapper.getSiSilya(a01m002_sect_nm);
	}

	/* ajxaはDB中からjspに部門を取值する */
	@Override
	public List<LiSiKuList> getBuMoN(String product_sect_nm) {
		// TODO Auto-generated method stub
		return riskpreventionMapper.getBuMoN(product_sect_nm);
	}

	/* ajxaはDB中からjspにプロセスを取值する */
	@Override
	public List<LiSiKuList> getPuRoSeSu(String process_name) {
		// TODO Auto-generated method stub
		return riskpreventionMapper.getPuRoSeSu(process_name);
	}

	@Override
	/* ajxaはDB中からjspに开催日の年を取值する */
	public List<LiSiKuList> getNeN() {
		// TODO Auto-generated method stub
		return riskpreventionMapper.getNeN();
	}

	@Override
	/* ajxaはDB中からjspに开催日の月を取值する */
	public List<LiSiKuList> getGaTu() { 
		// TODO Auto-generated method stub
		return riskpreventionMapper.getGaTu(); }

}
