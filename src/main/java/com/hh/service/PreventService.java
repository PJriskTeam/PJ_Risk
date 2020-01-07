package com.hh.service;

import java.util.List;

import com.hh.bean.PreventListForm;
import com.hh.bean.ProcessListForm;

public interface PreventService {
	
//	List<PreventListForm> getBranch(PreventListForm preventListForm);
	
	public List<PreventListForm> getBranch();
	
	public List<PreventListForm> getDept();
	
}
