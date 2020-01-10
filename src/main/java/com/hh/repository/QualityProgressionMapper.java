package com.hh.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hh.bean.A01M010_USER;
import com.hh.bean.Project;



public interface QualityProgressionMapper {
	List<A01M010_USER> a(String userName);
	
	List<Project> b();

	List<Project> c(@Param("orderNm")String orderNm,@Param("productSectNm")String productSectNm,@Param("productUserFullName")String productUserFullName,@Param("processName")String processName);
}
