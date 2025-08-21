package com.kh.chap06.controller;

public class OverloadingController {
	
	/*
	 * 메소드 오버로딩(Method Overloading)
	 * 
	 * - 하나의 클래스 안에 동일한 메소드 식별자로 여러 개의 메소드들을 정의할 수 있는 기술
	 * - 매개변수 자료형의 개수, 순서, 종류 다르게 작성해야함
	 * - 참고로 매개변수 식별자, 접근제한자, 반환타입은 메소드 오버로딩에 아무런 영향을 끼치지 않음
	 */

	// 정적 바인딩(Static Binding)
	// 컴파일이 끝난 시점에 어떤 메소드가 호출될지 결정
	// 컴파일러가 알아서 코드를 분석하여 메소드를 호출 연결
	public void test() {
		System.out.println("메소드 오버로딩 테스트 1");
	}
	
	public void test(int num) {
		System.out.println("메소드 오버로딩 테스트 2");
	}
	
	public void test(String str) {
		System.out.println("메소드 오버로딩 테스트 3");
	}
	
	public void test(int a, int b) {
		System.out.println("메소드 오버로딩 테스트 4");
	}
	
	public void test(int a, String b) {}
	public void test(String b, int a) {}
	
	/*
	public void test(int c, int d) {
		
	}
	*/
	// 매개변수 식별자와는 상관없이 자료형의 개수, 순서가 동일하기 때문에 구현이 불가능함
	// 그 외 접근제한자, 반환형이 다르다 하더라도 값을 받아들이는 매개변수가 같다면 
	// 값을 대입하는 단계에선 구분할수 없으므로 불가능
	
	
	
}
