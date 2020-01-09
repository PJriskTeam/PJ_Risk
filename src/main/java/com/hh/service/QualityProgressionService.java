package com.hh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hh.mapper.QualityProgressionMapper;
import com.hh.pojo.A01M010_USER;
import com.hh.pojo.Project;


@Service
public class QualityProgressionService {
	
	@Autowired
	QualityProgressionMapper qualityProgressionMapper; 
	
	public List<A01M010_USER> selectAll(String userName){
		return qualityProgressionMapper.selectAll(userName);
	}
	
	public List<Project> selectOne(){
		return qualityProgressionMapper.selectOne();
	}
	
	public List<Project> findByOrderNm(String orderNm,String productSectNm,String productUserFullName,String processName){
		return qualityProgressionMapper.findByOrderNm(orderNm,productSectNm, productUserFullName, processName);
	}
}
