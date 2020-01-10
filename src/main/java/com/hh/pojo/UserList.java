package com.hh.pojo;

public class UserList {

	private String ddlBranch_id;
	private String ddlBranch;
	private String ddlDept;
	private String txtUserCd;
	private String txtFullName;
	
	private String lnkUserCd;
	private String lblFullName;
	private String lblBranch_id;
	private String lblBranch;
	private String lblSect;
	private String lblPostCls;
	
	private String list;
	private String downList;
	private String user_id;
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getDdlBranch_id() {
		return ddlBranch_id;
	}
	public void setDdlBranch_id(String ddlBranch_id) {
		this.ddlBranch_id = ddlBranch_id;
	}
	public String getDdlBranch() {
		return ddlBranch;
	}
	public void setDdlBranch(String ddlBranch) {
		this.ddlBranch = ddlBranch;
	}
	public String getDdlDept() {
		return ddlDept;
	}
	public void setDdlDept(String ddlDept) {
		this.ddlDept = ddlDept;
	}
	public String getTxtUserCd() {
		return txtUserCd;
	}
	public void setTxtUserCd(String txtUserCd) {
		this.txtUserCd = txtUserCd;
	}
	public String getTxtFullName() {
		return txtFullName;
	}
	public void setTxtFullName(String txtFullName) {
		this.txtFullName = txtFullName;
	}
	public String getLnkUserCd() {
		return lnkUserCd;
	}
	public void setLnkUserCd(String lnkUserCd) {
		this.lnkUserCd = lnkUserCd;
	}
	public String getLblFullName() {
		return lblFullName;
	}
	public void setLblFullName(String lblFullName) {
		this.lblFullName = lblFullName;
	}
	public String getLblBranch_id() {
		return lblBranch_id;
	}
	public void setLblBranch_id(String lblBranch_id) {
		this.lblBranch_id = lblBranch_id;
	}
	public String getLblBranch() {
		return lblBranch;
	}
	public void setLblBranch(String lblBranch) {
		this.lblBranch = lblBranch;
	}
	public String getLblSect() {
		return lblSect;
	}
	public void setLblSect(String lblSect) {
		this.lblSect = lblSect;
	}
	public String getLblPostCls() {
		return lblPostCls;
	}
	public void setLblPostCls(String lblPostCls) {
		this.lblPostCls = lblPostCls;
	}
	public String getList() {
		return list;
	}
	public void setList(String list) {
		this.list = list;
	}
	public String getDownList() {
		return downList;
	}
	public void setDownList(String downList) {
		this.downList = downList;
	}
	@Override
	public String toString() {
		return "UserList [ddlBranch_id=" + ddlBranch_id + ", ddlBranch=" + ddlBranch + ", ddlDept=" + ddlDept
				+ ", txtUserCd=" + txtUserCd + ", txtFullName=" + txtFullName + ", lnkUserCd=" + lnkUserCd
				+ ", lblFullName=" + lblFullName + ", lblBranch_id=" + lblBranch_id + ", lblBranch=" + lblBranch
				+ ", lblSect=" + lblSect + ", lblPostCls=" + lblPostCls + ", list=" + list + ", downList=" + downList
				+ "]";
	}
	
}
