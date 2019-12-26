package com.hh.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hh.bean.PreventListForm;
import com.hh.repository.PreventRepository;
import com.hh.service.PreventService;
@Service
public class PreventServiceImpl implements PreventService {
	
	@Autowired
	private PreventRepository preventRepository;
	
	@Override
	public PreventListForm getPreventList(PreventListForm preventListForm){
		
		return preventRepository.getPreventList(preventListForm);
		
	}
}
