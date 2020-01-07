package com.hh.repository;

import java.util.List;

import com.hh.bean.RiskPreventionList;

public interface RiskPreventRepository {

	public List<RiskPreventionList> getPreventYear();
	
	public List<RiskPreventionList> getPreventMonth();
}
