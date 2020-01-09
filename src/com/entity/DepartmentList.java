package com.entity;

public class DepartmentList {

	private String ddlBranch_id;
	private String ddlBranch;
	private String ddlDept;
	private String txtSectCd;
	private String txtSectNm;
	
	private String lnkSectCd;
	private String lblBranch_id;
	private String lblBranch;
	private String lblSectNm;
	private String lblSectAlias;
	
	private String list;
	private String downList;
	private String department_id;
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
	public String getTxtSectCd() {
		return txtSectCd;
	}
	public void setTxtSectCd(String txtSectCd) {
		this.txtSectCd = txtSectCd;
	}
	public String getTxtSectNm() {
		return txtSectNm;
	}
	public void setTxtSectNm(String txtSectNm) {
		this.txtSectNm = txtSectNm;
	}
	public String getLnkSectCd() {
		return lnkSectCd;
	}
	public void setLnkSectCd(String lnkSectCd) {
		this.lnkSectCd = lnkSectCd;
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
	public String getLblSectNm() {
		return lblSectNm;
	}
	public void setLblSectNm(String lblSectNm) {
		this.lblSectNm = lblSectNm;
	}
	public String getLblSectAlias() {
		return lblSectAlias;
	}
	public void setLblSectAlias(String lblSectAlias) {
		this.lblSectAlias = lblSectAlias;
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
	public String getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(String department_id) {
		this.department_id = department_id;
	}
	@Override
	public String toString() {
		return "DepartmentList [ddlBranch_id=" + ddlBranch_id + ", ddlBranch=" + ddlBranch + ", ddlDept=" + ddlDept
				+ ", txtSectCd=" + txtSectCd + ", txtSectNm=" + txtSectNm + ", lnkSectCd=" + lnkSectCd
				+ ", lblBranch_id=" + lblBranch_id + ", lblBranch=" + lblBranch + ", lblSectNm=" + lblSectNm
				+ ", lblSectAlias=" + lblSectAlias + ", list=" + list + ", downList=" + downList + ", department_id="
				+ department_id + "]";
	}
	
	
}
