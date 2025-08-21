package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	
	/*
	 * 삼항 연산자 : 피 연산자가 3개 => 값 3개와 1개의 연산자로 이루어짐(조건문의 형식으로 쓰임)
	 * 
	 * 조건문 : 값에 따라 연산을 처리하는 방식
	 *        결과값이 true일 경우 첫 번째 문장을 처리
	 *        결과값이 false일 경우 두 번째 문장을 처리 
	 * 
	 * [ 표현식 ] 
	 * 조건식 ? 조건식이 true일 경우 결과값 : 조건식이 false일 경우 결과값
	 * 
	 */
	
	public void method1() {
		
		System.out.println("시즌 메뉴판 : ");
		System.out.println("1. 프라푸치노");
		System.out.println("2. 망고 주스");
		System.out.println("3. 스초생");
		
		// 메뉴번호 가지고 주문받기
		
		// ctrl + shift + o -> import 자동생성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("메뉴 번호를 입력해주세요 > ");
		int menuNo = sc.nextInt();
		
		String selectedMenu = (menuNo == 1) ? "프라푸치노를 주문하셨습니다."
                            : (menuNo == 2) ? "망고 주스를 주문하셨습니다."
                            : (menuNo == 3) ? "스초생을 주문하셨습니다."
                            : "올바르지 않은 메뉴번호입니다.";
                            // 삼항 연산자의 연속사용
                            	
		// 조건식 ? 조건식이 true일 경우 결과값 : 조건식이 false일 경우 결과 값
		
		// 선택한 번호에 따라 메뉴명을 출력
		// 1번 == 입력시 "프라푸치노를 주문하셨습니다"
		
		System.out.println(selectedMenu);
	}
	
	// 홀짝 구하기
	public void method2( ) {
		
		// 사용자에게 정수 값을 하나 입력받아서
		// 입력받은 정수가 홀/짝 인지 판별해서 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값을 입력하세요 > ");
		int num = sc.nextInt();
		
		
		char oddEven = ((num % 2) == 0) ? '짝' : '홀' ; 
		
		System.out.println("입력하신 " + num + "은(는) " + oddEven + "수 입니다.");
		
		
	}
	
	public void practice() {
		
		// 사용자에게 알파벳 한 글자를 입력 받아서
		// 입력받은 알파벳이 소문자인지 / 대문자인지 판별 후 출력하기
		
		// 출력형식
		// XXX(사용자가 입력한 알파벳)은 소문자 / 대문자 입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳을 입력해주세요 > ");
		char alphabet = sc.nextLine().charAt(0);
		
		//String up = (65 <= (int) alphabet) && ((int) alphabet <= 90) ? "대"
		//		       :(97 <= (int) alphabet) && ((int) alphabet <= 122) ? "소"
		//		       : "잘못된 유형의 입력 ";
		
		String up = ('A' <= alphabet) && (alphabet <= 'A') ? "대"
			       :('a' <= alphabet) && (alphabet <= 'z') ? "소"
			       : "잘못된 유형의 입력 ";
		
		
		System.out.println("입력하신 " + alphabet + "은(는) " + up + "문자입니다.");
		
		
		
	}

}
