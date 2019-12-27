package com.neuedu.personnelrisk.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.personnelrisk.bean.RiskManagement;
import com.neuedu.personnelrisk.dao.RiskManagementDao;
import com.neuedu.personnelrisk.service.RiskManagementService;

@Service
public class RiskManagementServiceImpl implements RiskManagementService
{

	@Autowired
	private RiskManagementDao dao;

	@Override
	public List<RiskManagement> selectManagement(RiskManagement rm) {
		return dao.selectManagement(rm);
	}
	
}
