package com.kh.chap07.remote.model.vo;

// 필요한 값들을 저장하는 역할
public class Television {
	
	private boolean on;
	private String[] channel;
	
	public Television() {
		channel = new String[5];
		channel[0] = "대한민국 24 뉴스채널";
		channel[1] = "무한도전";
		channel[2] = "1박2일";
		channel[3] = "100분 토론";
		channel[4] = "쇼 음악중심";
	}
	
	public String[] getChannel() {
		return channel;
	}
	
	// boolean 자료형에서는 get이아닌 is로 표현
	public boolean isOn() {
		return on;
	}
	
	public void setOn(boolean on) {
		this.on = on;
	}
	
	
	
	
}
