package com.hh.bean;

public class Project {
private int PROJECT_NO;
private String PROJECT_NAME_TEMP;
private String CUSTOMER_NAME;
private String ORDER_CD;
private String RELATE_ORDER_CD;
private String PRODUCT_SECT_NM;
private String PRODUCT_USER_FULLNAME;
private String BRANCH_QUALITY_MANAGER;
private String SECTION_QUALITY_MANAGER;
private String GROUP_QUALITY_MANAGER;
public int getPROJECT_NO() {
	return PROJECT_NO;
}
public void setPROJECT_NO(int pROJECT_NO) {
	PROJECT_NO = pROJECT_NO;
}
public String getPROJECT_NAME_TEMP() {
	return PROJECT_NAME_TEMP;
}
public void setPROJECT_NAME_TEMP(String pROJECT_NAME_TEMP) {
	PROJECT_NAME_TEMP = pROJECT_NAME_TEMP;
}
public String getCUSTOMER_NAME() {
	return CUSTOMER_NAME;
}
public void setCUSTOMER_NAME(String cUSTOMER_NAME) {
	CUSTOMER_NAME = cUSTOMER_NAME;
}
public String getORDER_CD() {
	return ORDER_CD;
}
public void setORDER_CD(String oRDER_CD) {
	ORDER_CD = oRDER_CD;
}
public String getRELATE_ORDER_CD() {
	return RELATE_ORDER_CD;
}
public void setRELATE_ORDER_CD(String rELATE_ORDER_CD) {
	RELATE_ORDER_CD = rELATE_ORDER_CD;
}
public String getPRODUCT_SECT_NM() {
	return PRODUCT_SECT_NM;
}
public void setPRODUCT_SECT_NM(String pRODUCT_SECT_NM) {
	PRODUCT_SECT_NM = pRODUCT_SECT_NM;
}
public String getPRODUCT_USER_FULLNAME() {
	return PRODUCT_USER_FULLNAME;
}
public void setPRODUCT_USER_FULLNAME(String pRODUCT_USER_FULLNAME) {
	PRODUCT_USER_FULLNAME = pRODUCT_USER_FULLNAME;
}
public String getBRANCH_QUALITY_MANAGER() {
	return BRANCH_QUALITY_MANAGER;
}
public void setBRANCH_QUALITY_MANAGER(String bRANCH_QUALITY_MANAGER) {
	BRANCH_QUALITY_MANAGER = bRANCH_QUALITY_MANAGER;
}
public String getSECTION_QUALITY_MANAGER() {
	return SECTION_QUALITY_MANAGER;
}
public void setSECTION_QUALITY_MANAGER(String sECTION_QUALITY_MANAGER) {
	SECTION_QUALITY_MANAGER = sECTION_QUALITY_MANAGER;
}
public String getGROUP_QUALITY_MANAGER() {
	return GROUP_QUALITY_MANAGER;
}
public void setGROUP_QUALITY_MANAGER(String gROUP_QUALITY_MANAGER) {
	GROUP_QUALITY_MANAGER = gROUP_QUALITY_MANAGER;
}
@Override
public String toString() {
	return "Project [PROJECT_NO=" + PROJECT_NO + ", PROJECT_NAME_TEMP=" + PROJECT_NAME_TEMP + ", CUSTOMER_NAME="
			+ CUSTOMER_NAME + ", ORDER_CD=" + ORDER_CD + ", RELATE_ORDER_CD=" + RELATE_ORDER_CD + ", PRODUCT_SECT_NM="
			+ PRODUCT_SECT_NM + ", PRODUCT_USER_FULLNAME=" + PRODUCT_USER_FULLNAME + ", BRANCH_QUALITY_MANAGER="
			+ BRANCH_QUALITY_MANAGER + ", SECTION_QUALITY_MANAGER=" + SECTION_QUALITY_MANAGER
			+ ", GROUP_QUALITY_MANAGER=" + GROUP_QUALITY_MANAGER + "]";
}
}