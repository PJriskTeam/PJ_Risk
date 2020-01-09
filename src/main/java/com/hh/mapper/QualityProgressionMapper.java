package com.hh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hh.pojo.A01M010_USER;
import com.hh.pojo.Project;


public interface QualityProgressionMapper {
	List<A01M010_USER> selectAll(String userName);
	
	List<Project> selectOne();

	List<Project> findByOrderNm(@Param("orderNm")String orderNm,@Param("productSectNm")String productSectNm,@Param("productUserFullName")String productUserFullName,@Param("processName")String processName);
}
