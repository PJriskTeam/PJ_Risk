package com.hh.service;

import java.util.List;



import com.hh.bean.LawCase;

public interface LawCaseservice {
	public List<LawCase> getLawCase(String A01M002_SECT_NM );
	
	public void add(String A01M002_SECT_NM ,String A01M002_SECT_CD );
	
	public List<LawCase> getlist(String  A01M002_SECT_ALIAS);
}
