package com.hh.bean;

public class LiSiKuList {
	
	private	String	a01m002_sect_nm	;
	
	private	String	product_sect_nm	;
	
	private	String	process_name	;
	
	private	String	open_date	;
	
	private	String	order_cd	;

	public String getA01m002_sect_nm() {
		return a01m002_sect_nm;
	}

	public void setA01m002_sect_nm(String a01m002_sect_nm) {
		this.a01m002_sect_nm = a01m002_sect_nm;
	}

	public String getProduct_sect_nm() {
		return product_sect_nm;
	}

	public void setProduct_sect_nm(String product_sect_nm) {
		this.product_sect_nm = product_sect_nm;
	}

	public String getProcess_name() {
		return process_name;
	}

	public void setProcess_name(String process_name) {
		this.process_name = process_name;
	}

	public String getOpen_date() {
		return open_date;
	}

	public void setOpen_date(String open_date) {
		this.open_date = open_date;
	}

	public String getOrder_cd() {
		return order_cd;
	}

	public void setOrder_cd(String order_cd) {
		this.order_cd = order_cd;
	}

	@Override
	public String toString() {
		return "LiSiKuList [a01m002_sect_nm=" + a01m002_sect_nm + ", product_sect_nm=" + product_sect_nm
				+ ", process_name=" + process_name + ", open_date=" + open_date + ", order_cd=" + order_cd + "]";
	}

	

}
