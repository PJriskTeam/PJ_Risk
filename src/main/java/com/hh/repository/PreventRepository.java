package com.hh.repository;


import java.util.List;

import com.hh.bean.PreventListForm;
import com.hh.bean.ProcessListForm;

public interface PreventRepository {
	
//	List<PreventListForm> getBranch(PreventListForm preventListForm);	
	
	public List<PreventListForm> getBranch();
	
	public List<PreventListForm> getDept();
	
}
