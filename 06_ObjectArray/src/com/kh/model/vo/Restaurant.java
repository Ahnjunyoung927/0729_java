package com.kh.model.vo;

public class Restaurant {
	
	// 상호, 주소, 메인메뉴
	
	private String storeName;
	private String address;
	private String mainMenu;
	
	
	public Restaurant() {
		
	}
	
	public Restaurant(String storeName, String address, String mainMenu) {
		this.storeName = storeName;
		this.address = address;
		this.mainMenu = mainMenu;
	}
	
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setMainMenu(String mainMenu) {
		this.mainMenu = mainMenu;
	}
	
	public String getStoreName() {
		return storeName;
	}
	public String getAddress() {
		return address;
	}
	public String getMainMenu() {
		return mainMenu;
	}
	
	public String information() {
		return "======식당 정보입니다======\n상호명 : " + storeName
			 + "\n주소 : " + address
			 + "\n메인메뉴 : " + mainMenu + "\n======================";
	}
	
	
	// 기본생성자
	// 모든필드를 매개변수로 갖는 생성자
	// getter / setter
	// information
	
	
	
	

}
