package com.hh.bean;

import java.io.Serializable;

public class LawCase implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String A01M002_SECT_NM;
	private String A01M002_SECT_CD;
	private String A01M002_APLSTA_YMD;
	private String A01M002_SECT_ALIAS;
	private String A01M002_ALLSECT_CD;
	public String getA01M002_SECT_NM() {
		return A01M002_SECT_NM;
	}
	public void setA01M002_SECT_NM(String a01m002_SECT_NM) {
		A01M002_SECT_NM = a01m002_SECT_NM;
	}
	public String getA01M002_SECT_CD() {
		return A01M002_SECT_CD;
	}
	public void setA01M002_SECT_CD(String a01m002_SECT_CD) {
		A01M002_SECT_CD = a01m002_SECT_CD;
	}
	public String getA01M002_APLSTA_YMD() {
		return A01M002_APLSTA_YMD;
	}
	public void setA01M002_APLSTA_YMD(String a01m002_APLSTA_YMD) {
		A01M002_APLSTA_YMD = a01m002_APLSTA_YMD;
	}
	public String getA01M002_SECT_ALIAS() {
		return A01M002_SECT_ALIAS;
	}
	public void setA01M002_SECT_ALIAS(String a01m002_SECT_ALIAS) {
		A01M002_SECT_ALIAS = a01m002_SECT_ALIAS;
	}
	public String getA01M002_ALLSECT_CD() {
		return A01M002_ALLSECT_CD;
	}
	public void setA01M002_ALLSECT_CD(String a01m002_ALLSECT_CD) {
		A01M002_ALLSECT_CD = a01m002_ALLSECT_CD;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "LawCase [A01M002_SECT_NM=" + A01M002_SECT_NM + ", A01M002_SECT_CD=" + A01M002_SECT_CD
				+ ", A01M002_APLSTA_YMD=" + A01M002_APLSTA_YMD + ", A01M002_SECT_ALIAS=" + A01M002_SECT_ALIAS
				+ ", A01M002_ALLSECT_CD=" + A01M002_ALLSECT_CD + "]";
	}
}