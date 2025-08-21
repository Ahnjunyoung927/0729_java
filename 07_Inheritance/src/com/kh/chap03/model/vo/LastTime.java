package com.kh.chap03.model.vo;

// 1절
/*
 * import.java.lang.String;
 * import.java.lang.System;
 * import.java.lang.*;
 */



public class LastTime extends Object {
	
	// 모든 클래스의 최상위 부모클래스 => Object => 생략가능
	private String name;
	
	public LastTime() {
		// super(); 생략되어 있음
	}
	
	public LastTime(String name) {
		// super(); 생략되어 있음
		this.name = name;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		// return; 생략되어 있음
	}
	
	/*
	 * Overriding
	 * 
	 * - 상속받고 있는 부모클래스의 메소드를 자식클래스에서 재정의(다시 씀)하는 것
	 * - 부모클래스가 제공하고 있는 메소드를 자식이 고쳐서 사용하겠다는 의미
	 * - 자식클래스에 존재하는 오버라이딩 된 메소드가 우선원을 가져서 호출되게 됨
	 * 
	 * 오버라이딩 성립 조건
	 * 1. 부모메소드와 메소드명 동일
	 * 2. 매개변수의 자료형, 갯수, 순서가 동일(변수명과는 무관)
	 * 3. 반환형이 동일
	 * 4. 부모메소드의 접근제한자보다 공유범위가 같거나 넓게 선언
	 * 
	 * -- 개발자들간의 약속
	 * 
	 * *** 오버라이딩한 메소드에는 반드시 @Override 에노테이션을 붙여주자
	 * 
	 * @Override
	 * annotation
	 * 일종의 주석
	 * - 생략 가능
	 * - 꼭 붙이지 않더라도 부모메소드와 형태가 같으면 오버라이딩으로 판단
	 * 
	 * 왜 붙여야 하는가?
	 *          => 실수를 줄여준다
	 *          => 가독성 증가
	 */
	
	@Override //부모클래스에 동일한 메소드가 없다면 주의표시를 줌
	public String toString() {
		return "LastTime [name = " + name + "]";
	}

}
