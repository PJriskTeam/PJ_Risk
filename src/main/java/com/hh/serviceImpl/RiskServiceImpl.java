package com.hh.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hh.repository.RiskMapper;
import com.hh.bean.RiskList;
import com.hh.bean.UserList;
import com.hh.service.RiskService;
/**
 * Service層
 * @author Wei_Chi
 *
 */
@Service
public class RiskServiceImpl implements RiskService {
	/** 自動注入RiskMapper*/
	@Autowired
	private RiskMapper riskMapper;
	/**
	 * 検索ボタンをクリックして、選択した情報に基づいて案件検索を行います
	 * @param project_no
	 */
	/*@Override*/
	public List<RiskList> getRiskList(String project_no){
		return riskMapper.getRiskList(project_no);
	}
	/**
	 * プルダウンメニューデータの値を取得する
	 * @param ddlBranch_id
	 */
	/*@Override*/
	public List<UserList> getDownList(String ddlBranch_id) {
		return riskMapper.getDownList(ddlBranch_id);
	}
	/**
	 * 社員検索情報を取得する
	 * @param userList
	 */
	/*@Override*/
	public List<UserList> gdvUserList(UserList userList){
		return riskMapper.gdvUserList(userList);
	}
	/**
	 * 社員情報を取得しリスク管理画面に送信する
	 * @param lnkUserCd
	 */
	/*@Override*/
	public List<UserList> getUser(String lnkUserCd) {
		return riskMapper.getUser(lnkUserCd);
	}
}
