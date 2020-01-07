package com.hh.service;

import java.util.List;

import com.hh.bean.RiskPreventionList;

public interface RiskPreventService {
	public List<RiskPreventionList> getPreventYear();
	public List<RiskPreventionList> getPreventMonth();
}
