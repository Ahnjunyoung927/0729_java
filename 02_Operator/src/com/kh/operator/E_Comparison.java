package com.kh.operator;

public class E_Comparison {
	
	/*
	 * 비교 연산자(관계 연산자)
	 * 
	 * 두 개의 값을 가지고 비교, 이항 연산자
	 * 비교연산을 한 결과 -> 참인 경우 true, 거짓인 경우 false
	 * 특정 조건을 제시할 수 있는 조건문에서 조건식으로 사용할 예정
	 * 
	 */
	
	/*
	 * 종류
	 * 
	 * 동등비교, 대소비교
	 * 
	 * 1. 동등비교 : 일치함을 비교
	 * a == b : a와 b가 일치 합니까?      의문문으로 생각할 것
	 * a != b : a와 b가 일치하지 않습니까?
	 * 
	 * 2. 대소비교 : 값의 크고 작음을 비교
	 * a < b : a가 b보다 작습니까?
	 * a > b : a가 b보다 큽니까?
	 * a <= b : a가 b보다 작거나 같습니까?
	 * a >= b : a가 b보다 크거나 같습니까?
	 * 
	 * 결과값은 true / false
	 */
	
	public void method() {
		
		int firstNum = 10;
		int secondNum = 25;
		
		System.out.println("firstNum < secondNum : " + (firstNum < secondNum));
		
		System.out.println("두 값이 같은가? : " + (firstNum == secondNum));
		
		System.out.println("firstNum가 짝수입니까? : " + ((firstNum % 2) == 0));
		System.out.println("firstNum가 짝수가 아닙니까? : " + ((firstNum % 2) != 0));
		System.out.println("secondNum가 짝수입니까? : " + ((secondNum % 2) == 0));
		System.out.println("secondNum가 짝수가 아닙니까? : " + ((secondNum % 2) != 0));
		
		System.out.println("firstNum가 홀수입니까? : " + ((firstNum % 2) == 1));
		System.out.println("firstNum가 홀수가 아닙니까? : " + ((firstNum % 2) != 1));
		System.out.println("secondNum가 홀수입니까? : " + ((secondNum % 2) == 1));
		System.out.println("secondNum가 홀수가 아닙니까? : " + ((secondNum % 2) != 1));
	}
	

}
