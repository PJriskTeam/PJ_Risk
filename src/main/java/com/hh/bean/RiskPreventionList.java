package com.hh.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;


public class RiskPreventionList {
	private Integer project_id;
	private Integer seq_no;
	private String report_category;
	private String check_date;
	private Integer process_no;
	private Integer discuss_phase_no;
	private Integer sender_user_id;
	private String sender_user_cd;
	private String sender_user_fullname;

//	@JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
	private String open_date;
	private String open_time;
	private String open_round;
	private String open_place;
	private String review_point;
	private String reviewer_plan;
	private String reviewer;
	private String review_remark;
	private String remark;
	private Date created_on;
	private String created_user_cd;
	private Integer created_user_id;
	private String created_user_name;
	private Date modified_on;
	private String modified_user_cd;
	private Integer modified_user_id;
	private String modified_user_name;
	public Integer getProject_id() {
		return project_id;
	}
	public void setProject_id(Integer project_id) {
		this.project_id = project_id;
	}
	public Integer getSeq_no() {
		return seq_no;
	}
	public void setSeq_no(Integer seq_no) {
		this.seq_no = seq_no;
	}
	public String getReport_category() {
		return report_category;
	}
	public void setReport_category(String report_category) {
		this.report_category = report_category;
	}
	public String getCheck_date() {
		return check_date;
	}
	public void setCheck_date(String check_date) {
		this.check_date = check_date;
	}
	public Integer getProcess_no() {
		return process_no;
	}
	public void setProcess_no(Integer process_no) {
		this.process_no = process_no;
	}
	public Integer getDiscuss_phase_no() {
		return discuss_phase_no;
	}
	public void setDiscuss_phase_no(Integer discuss_phase_no) {
		this.discuss_phase_no = discuss_phase_no;
	}
	public Integer getSender_user_id() {
		return sender_user_id;
	}
	public void setSender_user_id(Integer sender_user_id) {
		this.sender_user_id = sender_user_id;
	}
	public String getSender_user_cd() {
		return sender_user_cd;
	}
	public void setSender_user_cd(String sender_user_cd) {
		this.sender_user_cd = sender_user_cd;
	}
	public String getSender_user_fullname() {
		return sender_user_fullname;
	}
	public void setSender_user_fullname(String sender_user_fullname) {
		this.sender_user_fullname = sender_user_fullname;
	}
	
	public String getOpen_time() {
		return open_time;
	}
	public void setOpen_time(String open_time) {
		this.open_time = open_time;
	}
	public String getOpen_round() {
		return open_round;
	}
	public void setOpen_round(String open_round) {
		this.open_round = open_round;
	}
	public String getOpen_place() {
		return open_place;
	}
	public void setOpen_place(String open_place) {
		this.open_place = open_place;
	}
	public String getReview_point() {
		return review_point;
	}
	public void setReview_point(String review_point) {
		this.review_point = review_point;
	}
	public String getReviewer_plan() {
		return reviewer_plan;
	}
	public void setReviewer_plan(String reviewer_plan) {
		this.reviewer_plan = reviewer_plan;
	}
	public String getReviewer() {
		return reviewer;
	}
	public void setReviewer(String reviewer) {
		this.reviewer = reviewer;
	}
	public String getReview_remark() {
		return review_remark;
	}
	public void setReview_remark(String review_remark) {
		this.review_remark = review_remark;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Date getCreated_on() {
		return created_on;
	}
	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}
	public String getCreated_user_cd() {
		return created_user_cd;
	}
	public void setCreated_user_cd(String created_user_cd) {
		this.created_user_cd = created_user_cd;
	}
	public Integer getCreated_user_id() {
		return created_user_id;
	}
	public void setCreated_user_id(Integer created_user_id) {
		this.created_user_id = created_user_id;
	}
	public String getCreated_user_name() {
		return created_user_name;
	}
	public void setCreated_user_name(String created_user_name) {
		this.created_user_name = created_user_name;
	}
	public Date getModified_on() {
		return modified_on;
	}
	public void setModified_on(Date modified_on) {
		this.modified_on = modified_on;
	}
	public String getModified_user_cd() {
		return modified_user_cd;
	}
	public void setModified_user_cd(String modified_user_cd) {
		this.modified_user_cd = modified_user_cd;
	}
	public Integer getModified_user_id() {
		return modified_user_id;
	}
	public void setModified_user_id(Integer modified_user_id) {
		this.modified_user_id = modified_user_id;
	}
	public String getModified_user_name() {
		return modified_user_name;
	}
	public void setModified_user_name(String modified_user_name) {
		this.modified_user_name = modified_user_name;
	}
	public String getOpen_date() {
		return open_date;
	}
	public void setOpen_date(String open_date) {
		this.open_date = open_date;
	}
	@Override
	public String toString() {
		return "RiskPreventionList [project_id=" + project_id + ", seq_no=" + seq_no + ", report_category="
				+ report_category + ", check_date=" + check_date + ", process_no=" + process_no + ", discuss_phase_no="
				+ discuss_phase_no + ", sender_user_id=" + sender_user_id + ", sender_user_cd=" + sender_user_cd
				+ ", sender_user_fullname=" + sender_user_fullname + ", open_date=" + open_date + ", open_time="
				+ open_time + ", open_round=" + open_round + ", open_place=" + open_place + ", review_point="
				+ review_point + ", reviewer_plan=" + reviewer_plan + ", reviewer=" + reviewer + ", review_remark="
				+ review_remark + ", remark=" + remark + ", created_on=" + created_on + ", created_user_cd="
				+ created_user_cd + ", created_user_id=" + created_user_id + ", created_user_name=" + created_user_name
				+ ", modified_on=" + modified_on + ", modified_user_cd=" + modified_user_cd + ", modified_user_id="
				+ modified_user_id + ", modified_user_name=" + modified_user_name + ", getProject_id()="
				+ getProject_id() + ", getSeq_no()=" + getSeq_no() + ", getReport_category()=" + getReport_category()
				+ ", getCheck_date()=" + getCheck_date() + ", getProcess_no()=" + getProcess_no()
				+ ", getDiscuss_phase_no()=" + getDiscuss_phase_no() + ", getSender_user_id()=" + getSender_user_id()
				+ ", getSender_user_cd()=" + getSender_user_cd() + ", getSender_user_fullname()="
				+ getSender_user_fullname() + ", getOpen_time()=" + getOpen_time() + ", getOpen_round()="
				+ getOpen_round() + ", getOpen_place()=" + getOpen_place() + ", getReview_point()=" + getReview_point()
				+ ", getReviewer_plan()=" + getReviewer_plan() + ", getReviewer()=" + getReviewer()
				+ ", getReview_remark()=" + getReview_remark() + ", getRemark()=" + getRemark() + ", getCreated_on()="
				+ getCreated_on() + ", getCreated_user_cd()=" + getCreated_user_cd() + ", getCreated_user_id()="
				+ getCreated_user_id() + ", getCreated_user_name()=" + getCreated_user_name() + ", getModified_on()="
				+ getModified_on() + ", getModified_user_cd()=" + getModified_user_cd() + ", getModified_user_id()="
				+ getModified_user_id() + ", getModified_user_name()=" + getModified_user_name() + ", getOpen_date()="
				+ getOpen_date() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
