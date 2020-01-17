package com.hh.pojo;

public class UserList {

	private String ddlBranch_id;
	private String ddlBranch;
	private String ddlDept;
	private String txtUserCd;
	private String txtFullName;
	@Override
	public String toString() {
		return "UserList [ddlBranch_id=" + ddlBranch_id + ", ddlBranch=" + ddlBranch + ", ddlDept=" + ddlDept
				+ ", txtUserCd=" + txtUserCd + ", txtFullName=" + txtFullName + "]";
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
	public UserList(String ddlBranch_id, String ddlBranch, String ddlDept, String txtUserCd, String txtFullName) {
		super();
		this.ddlBranch_id = ddlBranch_id;
		this.ddlBranch = ddlBranch;
		this.ddlDept = ddlDept;
		this.txtUserCd = txtUserCd;
		this.txtFullName = txtFullName;
	}
	
	/*
	 * private String lnkUserCd; private String lblFullName; private String
	 * lblBranch_id; private String lblBranch; private String lblSect; private
	 * String lblPostCls;
	 * 
	 * private String list; private String downList; private String user_id;
	 */
	
	
}
