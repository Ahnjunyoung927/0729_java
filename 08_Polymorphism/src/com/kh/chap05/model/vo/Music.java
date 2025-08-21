package com.kh.chap05.model.vo;

public abstract class Music {
	
	// 클라이언트 요구사항에 따라서 기획 및 설계해야함
	private String code;
	private String title;
	private String runningTime;
	
	public Music() {}
	public Music(String code, String title, String runningtime) {
		this.code = code;
		this.title = title;
		this.runningTime = runningTime;
	}
	
	
	public String getCode() {
		return code;
	}
	public String getTitle() {
		return title;
	}
	public String getRunningTime() {
		return runningTime;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setRunningTime(String runningTime) {
		this.runningTime = runningTime;
	}
	
	
	
	
	
	
}
