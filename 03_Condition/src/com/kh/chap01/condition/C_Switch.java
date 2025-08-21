package com.kh.chap01.condition;

import java.util.Scanner;

public class C_Switch {
	
	public void method0() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 층 가세요?(B1 / B2 / B3)");
		String floor = sc.nextLine();
		// System.out.println(floor);
		
		// floor에 들어올 경우의 수는 3개
		switch(floor) {
		case "B1" : System.out.println("지하 1층입니다. 문이 열립니다."); break;
		case "B2" : System.out.println("지하 2층입니다. 문이 열립니다."); break;
		case "B3" : System.out.println("지하 3층입니다. 문이 열립니다."); break;
		}
		
		/* switch 문
		 * 
		 * [ 표현식 ]
		 * switch(case문에 기술할 동등비교를 할 대상) {
		 * case 정수, 문자, 실수, 문자열 : 실행할 코드; 
		 * break;
		 * case 정수, 문자, 실수, 문자열 : 실행할 코드; 
		 * }
		 * 
		 * switch(정수 || 실수 || 문자 || 문자열){
		 * case 값1 : 실행코드a; break; (동등비교대상 == 값1이 true일 경우 실행할 코드 a를 수행); break;
		 * case 값2 : 실행코드b; break; (동등비교대상 == 값2가 true일 경우 실행할 코드 b를 수행); break;
		 * case 값n : 실행코드n; (동등비교대상 == 값n이 true일 경우 실행할 코드 n를 수행); break;
		 * 
		 * default : 실행할 코드; // == else (위의 모든 case가 false일 경우 실행)
		 * }
		 * 
		 * break; 가 없다면 실행할 첫 코드와 그 아래 코드들이 모두 실행되므로 
		 * 대부분의 경우 마지막 case제외하고는 break를 쓰는 편
		 */
	}
	
	// 메뉴 주문
	// 부대찌개, 떡갈비, 제육볶음, 칼국수, 수제비
	public void method1() {
		
		// 사용자에게 구매할 음식의 이름을 입력 받아
		// 각 음식마다 가격을 출력해줄 것
		
		// 부대찌개,  떡갈비,  제육볶음,  칼국수,  수제비
		// 11000,  13000,  9000,   8000,  8000
		
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴를 선택해주세요.(부대찌개, 떡갈비, 제육볶음, 칼국수, 수제비) > ");
		String menu = sc.nextLine();
		
		/*
		switch(menu) {
		case "부대찌개" : System.out.println("11,000원입니다."); break;
		case "제육볶음" : System.out.println("9,000원입니다."); break;
		case "떡갈비" : System.out.println("13,000원입니다."); break;
		case "칼국수" : System.out.println("8,000원입니다."); break;
		case "수제비" : System.out.println("8,000원입니다."); break;
		default : System.out.println("존재하지 않는 메뉴입니다.");
		}
		*/
		// 중복제거하기
		// 1. 중복된 부분은 하나로 빼기
		// 2. 중복이 아닌 부분은 변수로 처리
		
		int price = 0;
		switch(menu) {
		case "부대찌개" : price = 11000; break;
		case "제육볶음" : price = 9000; break;
		case "떡갈비" : price = 13000; break;
		case "칼국수" : price = 8000; break;
		case "수제비" : price = 8000; break;
		default : System.out.println("존재하지 않는 메뉴입니다.");
		return; // 현재 실행되고 있는 메소드 영역을 아예 빠져나간다
		        // 즉, 메소드를 호출한 곳으로 돌아감
	    } //break; 를 만나면 빠져나오는 부분
		
		//if(price > 0) {
		System.out.println(price + "원입니다.");
	//}
		
		/*int result = switch(menu) {
		case "제육", "수제비", "칼국수" -> 3000;
		case "떡갈비", "부대찌개" -> 5000;
		default -> 0;
		}*/
		
	} // return을 만나면 빠져나오는 부분 (메소드 밖으로)
	
	public void login() {
		
		// 로그인 구현하기
		// 기획 / 설계
		
		// 기획 -> 뭘 만들지?
		// 설계 -> 어떻게 만들지?
		
		// 로그인 사용 -> 분석 -> 이해
		// 로그인이란 무엇인가..?
		
		// 아이디 비밀번호
		//    입력
		
		// 로그인 구현할 때 필요한 값 : 
		// 1. 사용자가 입력한 아이디 값   -> 문자열
		// 2. 사용자가 입력한 비밀번호 값  -> 문자열
		
		// 로그인 시 필요한 선행 작업 : 회원가입
		
		// 1. 회원가입 시 사용자가 원하는 아이디값과 비밀번호 값을 입력하여 진행
		// 2. 가입 시 입력했던 아이디와 비밀번호를 둘 다 정확히 입력한다면 로그인 성공 화면 출력
		// 3. 가입 시 입력했던 아이디 또는 비밀번호가 하나라도 일치하지 않다면 로그인 실패 화면 출력
		
		// 하단의 정보로 회원가입을 진행했다고 가정
		String id = "user01";
		String password = "pass01";
		String name = "홍길동";
		
		//------------------------------------------------------------------
		
		System.out.println("          KH업텐");
		System.out.println("============================");
		System.out.println("      로그인 서비스 입니다.");
		System.out.println("============================");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----------------------------");
		System.out.print("아이디 > ");
		String userId = sc.nextLine();
		
		System.out.println("----------------------------");
		System.out.print("비밀번호 > ");
		String userPwd = sc.nextLine();
		
		System.out.println("----------------------------");
		
		
		// 만약에 사용자가 로그인 시 입력한 아이디값과 회원가입시 가입한 아이디값이 동일하고
		// 사용자가 로그인 시 입력한 비밀번호 값과 회원가입 시 가입한 비밀번호 값이 동일하다면
		
		if(userId.equals(id) && userPwd.equals(password)) {
			System.out.println("로그인 성공! " + name + "님 환영합니다.");
		} else {
			System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
		}
		
		// 기본자료형 : boolean, char, byte, short, int, long, float, double
		// => 기본자료형의 경우 동등비교 연산자를 수행하는데 있어 문제가 없음
		
		// 참조자료형 : 그외
		// => 동등비교 연산자등를 통해서 값을 비교하는것이 불가능
		// 실제 변수에 담기는 값이 '주소값'이기 때문
		// 문자열의 값을 비교 : .equals() => true / false
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
