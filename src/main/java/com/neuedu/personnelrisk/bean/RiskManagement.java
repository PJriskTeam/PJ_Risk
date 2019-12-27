package com.neuedu.personnelrisk.bean;

import java.util.Date;

public class RiskManagement
{
	private Integer projectno;
	private Integer processno;
	private String projectnametemp;
	private String customername;
	private String ordercd;
	private String relateordercd;
	private Integer customertypeno;
	private Integer productsectid;
	private String productsectcd;
	private String productsectnm;
	private Integer productuserid;
	private String productusercd;
	private String productuserfullname;
	private char branchtransactionflg;
	private String supportbranchid;
	private String supportbranchnm;
	private String branchqualitymanager;
	private String sectionqualitymanager;
	private String groupqualitymanager;
	private String projectqualitymanager;
	private String riskpreventionmanager;
	private char rpm500milflg;
	private char rpmfirstproductflg;
	private Integer firstproductno;
	private String rpmfirstproductcause;
	private char rpmspecialproductflg;
	private Integer specialproductno;
	private String rpmspecialproductcause;
	private char rpmtype;
	private String smchecksheetfilename;
	private Integer projecttypeno;
	private char projectcompleteflg;
	private Date createdon;
	private String createdusercd;
	private Integer createduserid;
	private String createdusernamee;
	private Date modifiedon;
	private String modifiedusercd;
	private Integer modifieduserid;
	private String modifiedusername;
	private String usernamee;
	public RiskManagement() {
	}
	public RiskManagement(Integer projectno, Integer processno, String projectnametemp, String customername,
			String ordercd, String relateordercd, Integer customertypeno, Integer productsectid, String productsectcd,
			String productsectnm, Integer productuserid, String productusercd, String productuserfullname,
			char branchtransactionflg, String supportbranchid, String supportbranchnm, String branchqualitymanager,
			String sectionqualitymanager, String groupqualitymanager, String projectqualitymanager,
			String riskpreventionmanager, char rpm500milflg, char rpmfirstproductflg, Integer firstproductno,
			String rpmfirstproductcause, char rpmspecialproductflg, Integer specialproductno,
			String rpmspecialproductcause, char rpmtype, String smchecksheetfilename, Integer projecttypeno,
			char projectcompleteflg, Date createdon, String createdusercd, Integer createduserid,
			String createdusernamee, Date modifiedon, String modifiedusercd, Integer modifieduserid,
			String modifiedusername, String usernamee) {
		super();
		this.projectno = projectno;
		this.processno = processno;
		this.projectnametemp = projectnametemp;
		this.customername = customername;
		this.ordercd = ordercd;
		this.relateordercd = relateordercd;
		this.customertypeno = customertypeno;
		this.productsectid = productsectid;
		this.productsectcd = productsectcd;
		this.productsectnm = productsectnm;
		this.productuserid = productuserid;
		this.productusercd = productusercd;
		this.productuserfullname = productuserfullname;
		this.branchtransactionflg = branchtransactionflg;
		this.supportbranchid = supportbranchid;
		this.supportbranchnm = supportbranchnm;
		this.branchqualitymanager = branchqualitymanager;
		this.sectionqualitymanager = sectionqualitymanager;
		this.groupqualitymanager = groupqualitymanager;
		this.projectqualitymanager = projectqualitymanager;
		this.riskpreventionmanager = riskpreventionmanager;
		this.rpm500milflg = rpm500milflg;
		this.rpmfirstproductflg = rpmfirstproductflg;
		this.firstproductno = firstproductno;
		this.rpmfirstproductcause = rpmfirstproductcause;
		this.rpmspecialproductflg = rpmspecialproductflg;
		this.specialproductno = specialproductno;
		this.rpmspecialproductcause = rpmspecialproductcause;
		this.rpmtype = rpmtype;
		this.smchecksheetfilename = smchecksheetfilename;
		this.projecttypeno = projecttypeno;
		this.projectcompleteflg = projectcompleteflg;
		this.createdon = createdon;
		this.createdusercd = createdusercd;
		this.createduserid = createduserid;
		this.createdusernamee = createdusernamee;
		this.modifiedon = modifiedon;
		this.modifiedusercd = modifiedusercd;
		this.modifieduserid = modifieduserid;
		this.modifiedusername = modifiedusername;
		this.usernamee = usernamee;
	}
	public Integer getProjectno() {
		return projectno;
	}
	public void setProjectno(Integer projectno) {
		this.projectno = projectno;
	}
	public Integer getProcessno() {
		return processno;
	}
	public void setProcessno(Integer processno) {
		this.processno = processno;
	}
	public String getProjectnametemp() {
		return projectnametemp;
	}
	public void setProjectnametemp(String projectnametemp) {
		this.projectnametemp = projectnametemp;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getOrdercd() {
		return ordercd;
	}
	public void setOrdercd(String ordercd) {
		this.ordercd = ordercd;
	}
	public String getRelateordercd() {
		return relateordercd;
	}
	public void setRelateordercd(String relateordercd) {
		this.relateordercd = relateordercd;
	}
	public Integer getCustomertypeno() {
		return customertypeno;
	}
	public void setCustomertypeno(Integer customertypeno) {
		this.customertypeno = customertypeno;
	}
	public Integer getProductsectid() {
		return productsectid;
	}
	public void setProductsectid(Integer productsectid) {
		this.productsectid = productsectid;
	}
	public String getProductsectcd() {
		return productsectcd;
	}
	public void setProductsectcd(String productsectcd) {
		this.productsectcd = productsectcd;
	}
	public String getProductsectnm() {
		return productsectnm;
	}
	public void setProductsectnm(String productsectnm) {
		this.productsectnm = productsectnm;
	}
	public Integer getProductuserid() {
		return productuserid;
	}
	public void setProductuserid(Integer productuserid) {
		this.productuserid = productuserid;
	}
	public String getProductusercd() {
		return productusercd;
	}
	public void setProductusercd(String productusercd) {
		this.productusercd = productusercd;
	}
	public String getProductuserfullname() {
		return productuserfullname;
	}
	public void setProductuserfullname(String productuserfullname) {
		this.productuserfullname = productuserfullname;
	}
	public char getBranchtransactionflg() {
		return branchtransactionflg;
	}
	public void setBranchtransactionflg(char branchtransactionflg) {
		this.branchtransactionflg = branchtransactionflg;
	}
	public String getSupportbranchid() {
		return supportbranchid;
	}
	public void setSupportbranchid(String supportbranchid) {
		this.supportbranchid = supportbranchid;
	}
	public String getSupportbranchnm() {
		return supportbranchnm;
	}
	public void setSupportbranchnm(String supportbranchnm) {
		this.supportbranchnm = supportbranchnm;
	}
	public String getBranchqualitymanager() {
		return branchqualitymanager;
	}
	public void setBranchqualitymanager(String branchqualitymanager) {
		this.branchqualitymanager = branchqualitymanager;
	}
	public String getSectionqualitymanager() {
		return sectionqualitymanager;
	}
	public void setSectionqualitymanager(String sectionqualitymanager) {
		this.sectionqualitymanager = sectionqualitymanager;
	}
	public String getGroupqualitymanager() {
		return groupqualitymanager;
	}
	public void setGroupqualitymanager(String groupqualitymanager) {
		this.groupqualitymanager = groupqualitymanager;
	}
	public String getProjectqualitymanager() {
		return projectqualitymanager;
	}
	public void setProjectqualitymanager(String projectqualitymanager) {
		this.projectqualitymanager = projectqualitymanager;
	}
	public String getRiskpreventionmanager() {
		return riskpreventionmanager;
	}
	public void setRiskpreventionmanager(String riskpreventionmanager) {
		this.riskpreventionmanager = riskpreventionmanager;
	}
	public char getRpm500milflg() {
		return rpm500milflg;
	}
	public void setRpm500milflg(char rpm500milflg) {
		this.rpm500milflg = rpm500milflg;
	}
	public char getRpmfirstproductflg() {
		return rpmfirstproductflg;
	}
	public void setRpmfirstproductflg(char rpmfirstproductflg) {
		this.rpmfirstproductflg = rpmfirstproductflg;
	}
	public Integer getFirstproductno() {
		return firstproductno;
	}
	public void setFirstproductno(Integer firstproductno) {
		this.firstproductno = firstproductno;
	}
	public String getRpmfirstproductcause() {
		return rpmfirstproductcause;
	}
	public void setRpmfirstproductcause(String rpmfirstproductcause) {
		this.rpmfirstproductcause = rpmfirstproductcause;
	}
	public char getRpmspecialproductflg() {
		return rpmspecialproductflg;
	}
	public void setRpmspecialproductflg(char rpmspecialproductflg) {
		this.rpmspecialproductflg = rpmspecialproductflg;
	}
	public Integer getSpecialproductno() {
		return specialproductno;
	}
	public void setSpecialproductno(Integer specialproductno) {
		this.specialproductno = specialproductno;
	}
	public String getRpmspecialproductcause() {
		return rpmspecialproductcause;
	}
	public void setRpmspecialproductcause(String rpmspecialproductcause) {
		this.rpmspecialproductcause = rpmspecialproductcause;
	}
	public char getRpmtype() {
		return rpmtype;
	}
	public void setRpmtype(char rpmtype) {
		this.rpmtype = rpmtype;
	}
	public String getSmchecksheetfilename() {
		return smchecksheetfilename;
	}
	public void setSmchecksheetfilename(String smchecksheetfilename) {
		this.smchecksheetfilename = smchecksheetfilename;
	}
	public Integer getProjecttypeno() {
		return projecttypeno;
	}
	public void setProjecttypeno(Integer projecttypeno) {
		this.projecttypeno = projecttypeno;
	}
	public char getProjectcompleteflg() {
		return projectcompleteflg;
	}
	public void setProjectcompleteflg(char projectcompleteflg) {
		this.projectcompleteflg = projectcompleteflg;
	}
	public Date getCreatedon() {
		return createdon;
	}
	public void setCreatedon(Date createdon) {
		this.createdon = createdon;
	}
	public String getCreatedusercd() {
		return createdusercd;
	}
	public void setCreatedusercd(String createdusercd) {
		this.createdusercd = createdusercd;
	}
	public Integer getCreateduserid() {
		return createduserid;
	}
	public void setCreateduserid(Integer createduserid) {
		this.createduserid = createduserid;
	}
	public String getCreatedusernamee() {
		return createdusernamee;
	}
	public void setCreatedusernamee(String createdusernamee) {
		this.createdusernamee = createdusernamee;
	}
	public Date getModifiedon() {
		return modifiedon;
	}
	public void setModifiedon(Date modifiedon) {
		this.modifiedon = modifiedon;
	}
	public String getModifiedusercd() {
		return modifiedusercd;
	}
	public void setModifiedusercd(String modifiedusercd) {
		this.modifiedusercd = modifiedusercd;
	}
	public Integer getModifieduserid() {
		return modifieduserid;
	}
	public void setModifieduserid(Integer modifieduserid) {
		this.modifieduserid = modifieduserid;
	}
	public String getmodifiedusername() {
		return modifiedusername;
	}
	public void setmodifiedusername(String modifiedusername) {
		this.modifiedusername = modifiedusername;
	}
	public String getUsernamee() {
		return usernamee;
	}
	public void setUsernamee(String usernamee) {
		this.usernamee = usernamee;
	}
	@Override
	public String toString() {
		return "RiskManagement [projectno=" + projectno + ", processno=" + processno + ", projectnametemp="
				+ projectnametemp + ", customername=" + customername + ", ordercd=" + ordercd + ", relateordercd="
				+ relateordercd + ", customertypeno=" + customertypeno + ", productsectid=" + productsectid
				+ ", productsectcd=" + productsectcd + ", productsectnm=" + productsectnm + ", productuserid="
				+ productuserid + ", productusercd=" + productusercd + ", productuserfullname=" + productuserfullname
				+ ", branchtransactionflg=" + branchtransactionflg + ", supportbranchid=" + supportbranchid
				+ ", supportbranchnm=" + supportbranchnm + ", branchqualitymanager=" + branchqualitymanager
				+ ", sectionqualitymanager=" + sectionqualitymanager + ", groupqualitymanager=" + groupqualitymanager
				+ ", projectqualitymanager=" + projectqualitymanager + ", riskpreventionmanager="
				+ riskpreventionmanager + ", rpm500milflg=" + rpm500milflg + ", rpmfirstproductflg="
				+ rpmfirstproductflg + ", firstproductno=" + firstproductno + ", rpmfirstproductcause="
				+ rpmfirstproductcause + ", rpmspecialproductflg=" + rpmspecialproductflg + ", specialproductno="
				+ specialproductno + ", rpmspecialproductcause=" + rpmspecialproductcause + ", rpmtype=" + rpmtype
				+ ", smchecksheetfilename=" + smchecksheetfilename + ", projecttypeno=" + projecttypeno
				+ ", projectcompleteflg=" + projectcompleteflg + ", createdon=" + createdon + ", createdusercd="
				+ createdusercd + ", createduserid=" + createduserid + ", createdusernamee=" + createdusernamee
				+ ", modifiedon=" + modifiedon + ", modifiedusercd=" + modifiedusercd + ", modifieduserid="
				+ modifieduserid + ", modifiedusername=" + modifiedusername + ", usernamee=" + usernamee + "]";
	}
}
