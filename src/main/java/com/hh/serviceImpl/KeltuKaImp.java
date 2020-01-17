package com.hh.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hh.bean.KeltuKaList;
import com.hh.repository.KeltuKaRepository;
import com.hh.service.KeltuKaService;

/**
 * ServiceImp層
 * 
 * @author WuQian
 *
 */
@Service
public class KeltuKaImp implements KeltuKaService{

	/** 自動注入RiskMapper */
	@Autowired
	private KeltuKaRepository keltukaMapper;

	@Override
	public List<KeltuKaList> getKeltuKa(String a01m002_sect_nm, String product_sect_nm, String process_name,
//			String open_date, 
			String order_cd) {
		// TODO Auto-generated method stub
		return keltukaMapper.getKeltuKa(a01m002_sect_nm, product_sect_nm, process_name, 
//				open_date, 
				order_cd);
	}


	
}
	

