package com.crud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crud.bean.A01M010_USER;
import com.crud.bean.Project;

public interface QualityProgressionMapper {
	List<A01M010_USER> selectAll(String userName);
	
	List<Project> selectOne();

	List<Project> findByOrderNm(@Param("orderNm")String orderNm,@Param("productSectNm")String productSectNm,@Param("productUserFullName")String productUserFullName,@Param("processName")String processName);
}
