package com.hh.bean;

public class ProcessListForm {
	private String process_no;
	private String process_name;
	public String getProcess_no() {
		return process_no;
	}
	public void setProcess_no(String process_no) {
		this.process_no = process_no;
	}
	public String getprocess_name() {
		return process_name;
	}
	public void setprocess_name(String process_name) {
		this.process_name = process_name;
	}
	@Override
	public String toString() {
		return "ProcessListForm [process_no=" + process_no + ", process_name=" + process_name + "]";
	}
}
