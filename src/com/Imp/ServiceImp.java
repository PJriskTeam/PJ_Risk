package com.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.entity.DATA;
import com.entity.DepartmentList;
import com.mapper.NewMapper;
import com.service.NewService;

public class ServiceImp implements NewService{

	/** 自動注入RiskMapper*/
	@Autowired
	private NewMapper newMapper;
	/**
	 * 検索ボタンをクリックして、選択した情報に基づいて案件検索を行います
	 * @param project_no
	 */
	@Override
	public List<DATA> getData(String project_no) {
		return newMapper.getData(project_no);
	}

	@Override
	public List<DepartmentList> getDownList(String ddlBranch_id) {
		return newMapper.getDownList(ddlBranch_id);
	}

	@Override
	public List<DepartmentList> gdvDepartmentList(DepartmentList deparmentList) {
		return newMapper.gdvDepartmentList(deparmentList);
	}

	@Override
	public List<DepartmentList> getDepartment(String lnkSectCd) {
		return newMapper.getDepartment(lnkSectCd);
	}

}
