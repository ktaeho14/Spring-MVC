package com.mvc.upgrade.model.dto;

import java.util.Date;

public class SampleDto {
	private int spNo;
	private String spName;
	private String spTitle;
	private String spContent;
	private Date spDate;
	public SampleDto(int spNo, String spName, String spTitle, String spContent, Date spDate) {
		super();
		this.spNo = spNo;
		this.spName = spName;
		this.spTitle = spTitle;
		this.spContent = spContent;
		this.spDate = spDate;
	}
	public SampleDto() {
		super();
		
	}
	public SampleDto(String spName, String spTitle, String spContent) {
		super();
		this.spName = spName;
		this.spTitle = spTitle;
		this.spContent = spContent;
	}
	public int getSpNo() {
		return spNo;
	}
	public void setSpNo(int spNo) {
		this.spNo = spNo;
	}
	public String getSpName() {
		return spName;
	}
	public void setSpName(String spName) {
		this.spName = spName;
	}
	public String getSpTitle() {
		return spTitle;
	}
	public void setSpTitle(String spTitle) {
		this.spTitle = spTitle;
	}
	public String getSpContent() {
		return spContent;
	}
	public void setSpContent(String spContent) {
		this.spContent = spContent;
	}
	public Date getSpDate() {
		return spDate;
	}
	public void setSpDate(Date spDate) {
		this.spDate = spDate;
	}
	
	
}
