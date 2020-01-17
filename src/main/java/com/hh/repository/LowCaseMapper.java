package com.hh.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import com.hh.bean.LawCase;



@Mapper
public interface LowCaseMapper {
	public List<LawCase> getLawCase(@Param("A01M002_SECT_NM")String A01M002_SECT_NM );
	
	public void add(LawCase lc);
	
	public List<LawCase> getlist(@Param("A01M002_SECT_ALIAS")String A01M002_SECT_ALIAS);
}
