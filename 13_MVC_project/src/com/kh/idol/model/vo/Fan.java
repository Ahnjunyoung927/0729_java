package com.kh.idol.model.vo;

public class Fan {
	
	
	private String userId;
	private String usedrPwd;
	private String nickName;
	
	public Fan() {
	}
	public Fan(String userId, String usedrPwd, String nickName) {
		super();
		this.userId = userId;
		this.usedrPwd = usedrPwd;
		this.nickName = nickName;
	}

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUsedrPwd() {
		return usedrPwd;
	}
	public void setUsedrPwd(String usedrPwd) {
		this.usedrPwd = usedrPwd;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	@Override
	public String toString() {
		return "Fan [userId=" + userId + ", usedrPwd=" + usedrPwd + ", nickName=" + nickName + "]";
	}


	
	

}
