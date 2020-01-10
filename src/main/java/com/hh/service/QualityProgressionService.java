package com.hh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hh.bean.A01M010_USER;
import com.hh.bean.Project;
import com.hh.repository.QualityProgressionMapper;


@Service
public class QualityProgressionService {
	
	@Autowired
	QualityProgressionMapper qualityProgressionMapper; 
	
	public List<A01M010_USER> a(String userName){
		return qualityProgressionMapper.a(userName);
	}
	
	public List<Project> b(){
		return qualityProgressionMapper.b();
	}
	
	public List<Project> c(String orderNm,String productSectNm,String productUserFullName,String processName){
		return qualityProgressionMapper.c(orderNm,productSectNm, productUserFullName, processName);
	}
}
