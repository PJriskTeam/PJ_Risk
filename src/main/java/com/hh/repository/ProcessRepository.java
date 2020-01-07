package com.hh.repository;

import java.util.List;

import com.hh.bean.ProcessListForm;

public interface ProcessRepository {
	
	public List<ProcessListForm> getProcess();
}
