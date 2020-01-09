package com.hh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hh.pojo.A01M010_USER;
import com.hh.pojo.Project;
import com.hh.service.QualityProgressionService;


/**
*�����û���ѯ����
*/
@Controller
public class QualityProgressionController {
	
	@Autowired
	QualityProgressionService qualityProgressionService;
	
	@RequestMapping("/selectAll")
	@ResponseBody
	public List<A01M010_USER> selectAll(String userName) {
		return qualityProgressionService.selectAll(userName);
	}
	
	@RequestMapping("/select")
	@ResponseBody
	public List<Project> select() {
		return qualityProgressionService.selectOne();
	}
	
	@RequestMapping("/find")
	@ResponseBody
	public List<Project> find(String orderNm,String productSectNm,String productUserFullName,String processName) {
		return qualityProgressionService.findByOrderNm( orderNm,productSectNm, productUserFullName, processName);
	}
}
