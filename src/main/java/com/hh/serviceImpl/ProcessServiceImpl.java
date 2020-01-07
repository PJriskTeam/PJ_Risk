package com.hh.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hh.bean.ProcessListForm;
import com.hh.repository.ProcessRepository;
import com.hh.service.ProcessService;

@Service
public class ProcessServiceImpl implements ProcessService {

	@Autowired
	private ProcessRepository processRepository;
	
	@Override
	public List<ProcessListForm> getProcess() {
		return processRepository.getProcess();
	}

}
