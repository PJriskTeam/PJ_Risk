package com.hh.serviceImpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hh.bean.LawCase;
import com.hh.repository.LowCaseMapper;
import com.hh.service.LawCaseservice;

@Service
public class LawCaseserviceImpl implements LawCaseservice{
	@Autowired
 private LowCaseMapper lowcasemapper;
	


	@Override
	public void add(String A01M002_SECT_NM, String A01M002_SECT_CD) {
		LawCase lc=new LawCase();
		lc.setA01M002_SECT_CD(A01M002_SECT_CD);
		lc.setA01M002_SECT_NM(A01M002_SECT_NM);
		this.lowcasemapper.add(lc);
		
		
	}

	@Override
	public List<LawCase> getlist(String A01M002_SECT_ALIAS) {
		// TODO Auto-generated method stub
		return this.getlist(A01M002_SECT_ALIAS);
	}

	@Override
	public List<LawCase> getLawCase(String A01M002_SECT_NM) {
		// TODO Auto-generated method stub
		return this.lowcasemapper.getLawCase(A01M002_SECT_NM);
	}



	
	}

	
	



	

	

