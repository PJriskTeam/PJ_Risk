package com.hh.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hh.bean.RiskPreventionList;
import com.hh.repository.RiskPreventRepository;
import com.hh.service.RiskPreventService;
@Service
public class RiskPreventServiceImpl implements RiskPreventService {

	@Autowired
	private RiskPreventRepository riskPreventRepository;
	
	@Override
	public List<RiskPreventionList> getPreventYear() {
		return riskPreventRepository.getPreventYear();
	}
	@Override
	public List<RiskPreventionList> getPreventMonth() {
		return riskPreventRepository.getPreventMonth();
	}
}
