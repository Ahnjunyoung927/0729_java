package com.kh.chap02.model.vo;

// 부모클래스  >상속>  자식클래스
// 슈퍼클래스  >상속>  서브클래스
// 상위클래스  >상속>  하위클래스
// 조상클래스  >상속>  후손클래스
// 확장클래스  >상속>  파생클래스

public class KoreaFood extends Food {
	// 필드부
	// foodName, material, cookingTime, spicy
	// [ 앞의 3가지 필드는 Food클래스가 가지고 있음 ]
	
	private int spicy;
	
	
	// 생성자부
	public KoreaFood() {
		super(); // 부모객체의 주소값을 의미하는 키워드 => 부모클래스의 객체생성
		System.out.println("나 태어남");
	}
	
	//메소드부
	public int getSpicy() {
		return spicy;
	}
	public void setSpicy(int spicy) {
		this.spicy = spicy;
	}
	

}
