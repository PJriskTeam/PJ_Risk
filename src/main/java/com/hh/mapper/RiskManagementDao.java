package com.neuedu.personnelrisk.dao;

import java.util.List;

import com.neuedu.personnelrisk.bean.RiskManagement;

public interface RiskManagementDao
{
	public List<RiskManagement> selectManagement(RiskManagement rm);
}
