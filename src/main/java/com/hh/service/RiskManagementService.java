package com.neuedu.personnelrisk.service;

import java.util.List;

import com.neuedu.personnelrisk.bean.RiskManagement;

public interface RiskManagementService
{
	public List<RiskManagement> selectManagement(RiskManagement rm);
}
