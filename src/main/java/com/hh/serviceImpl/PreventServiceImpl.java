package com.hh.serviceImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hh.bean.PreventListForm;
import com.hh.bean.ProcessListForm;
import com.hh.repository.PreventRepository;
import com.hh.service.PreventService;
@Service
public class PreventServiceImpl implements PreventService {
	
	@Autowired
	private PreventRepository preventRepository;
	
//	@Override
//	public List<PreventListForm> getBranch(PreventListForm preventListForm){
//		
//		return preventRepository.getBranch(preventListForm);
//		
//	}

	@Override
	public List<PreventListForm> getBranch() {
		return preventRepository.getBranch();
	}

	@Override
	public List<PreventListForm> getDept() {
		return preventRepository.getDept();
	}
	
}
