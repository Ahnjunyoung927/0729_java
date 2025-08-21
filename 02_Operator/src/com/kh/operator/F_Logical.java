package com.kh.operator;

import java.util.Scanner;

public class F_Logical {
	
	/*
	 * 논리 연산자 : 두 개의 논리값을 연산하는 연산자
	 * 
	 * [ 표현법 ]
	 * 
	 * 논리값 논리연산자 논리값 => 결과도 논리값
	 * 
	 * 종류
	 * 
	 * 1. AND연산자 : 논리값 && 논리값
	 * 좌항과 우항의 값이 모두 true여야만 최종 결과값이 true
	 * 
	 * 2. OR연산자 : 논리값 || 논리값
	 * 좌항과 우항의 값 중 하나라도 true일 경우 최종 결과값이 true
	 * 
	 */
	
	
	public void method1() {
		
		// AND
		// 
		// 계획
		//
		// 1. 사용자에게 정수값을 하나 입력받은 후
		// 2. 사용자가 입력한 정수 값이 0보다 크면서 짝수인지 판별
		// 3. 그리고 나서 결과를 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값을 입력하세요. > ");
		int num = sc.nextInt();
		
		boolean andResult = (num > 0) && ((num % 2) == 0);
		
		System.out.print("입력한 값이 0보다 크면서 짝수입니까? : " + andResult);
		
		
	}
	
	public void method2() {
		//사용자에게 정수값받아서 변수에 대입한뒤 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값을 입력하세요 : ");
		int num = sc.nextInt();
		
		// System.out.println("입력받은 값은 " + num + "입니다.");
		
		// 사용자가 입력한 값이 1~100사이의 값인지를 판별하여 출력해줄 것
		
		// boolean result = (num > 0) && (num < 101);
		// boolean result = (num >= 1) && (num <= 100);
		boolean result = (1 <= num) && (num <= 100); // --->> 가장 가독성이 좋다.
		System.out.println("입력받은 값이 1에서 100사이의 수 입니까? : " + result);
		
	}
	
	// OR
	public void method3() {
		
		// 사용자에게 한글자를 입력 받아서
		// 입력 받은 값이 'A' 또는 'a'인지 확인해서 출력하기
		// 1_1. 사용자가 입력한 한 글자 == letter
		// 1_2. 'A'
		// 1_3. 'a'
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("한 글자만 입력하세요 : ");
		char letter = sc.nextLine().charAt(0);
		/*charAt : 문자열 저장공간(인덱스)에서 0번부터 몇번째 칸에 있는 한글자를 가지고 옴.
		 *         0이면 첫번째 글자인것.
		*/ 
		
		boolean result = (letter == 'a') || (letter == 'A');
		        // == 동등비교 연산
				// 단일문자의 경우 동등비교 연산이 가능한가?
				// 가능하다
				// char형이 int형으로 자동변환(오토캐스팅) 일어난 뒤 연산 을 함
		
		System.out.println("사용자가 입력한 값이 'A' 또는 'a'인가요? > " + result);
		
	}
	
	public void tip() {
		
		int num = 10;
		
		boolean result = false && (num > 0);
		// ---> 둘다 true여야 하는데 이미 앞항에서 false라 답이 정해져 있다.
		
		boolean result2 = (num < 0) && (num == 10);
		// ---> 이때 앞항에서 거짓이 떴기 때문에 뒷항에 대해선 연산을 하지 않고 생략한다.
		// shortCircuit
		
		
		
	}

}
