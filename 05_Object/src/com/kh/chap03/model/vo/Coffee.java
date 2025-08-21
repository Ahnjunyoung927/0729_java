package com.kh.chap03.model.vo;

public class Coffee {
	// 상품명, 가격, 원두, 사이즈
	
	// 필드부
	private String name;
	private String bean;
	private String size;
	private int price;
	
	// 생성자부
	
	
	
	// 메소드부 gettet / setter / info
	// 필드값을 반환해주는 메소드 == getter
	// 필드값을 
	public String getName() {
		return name;
	}
	
	public String getBean() {
		return bean;
	}
	
	public String getSize() {
		return size;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBean(String bean) {
		this.bean = bean;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	//info()
	
	public String info() {
		String info = "상품명 : " + name
				    + ", 원두 : " + bean
				    + ", 사이즈 : " + size
				    + ", 가격 : " + price + "원";
		return info;
	}
	
	
}
