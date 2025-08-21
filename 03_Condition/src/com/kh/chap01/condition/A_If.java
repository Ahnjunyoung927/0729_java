package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	
	/*
	 * (단일) if문
	 * 
	 * [ 표현법 ] 
	 * 
	 * if(조건식) {
	 *   조건식이 true일 경우 실행하고자 하는 코드;
	 *   
	 * }
	 * 
	 * => 조건식의 결과가 true일 경우 : if문 Scope{}안의 코드가 실행
	 * => 조건식의 결과가 false일 경우 : if문 Scope{}를 건너뜀
	 * 
	 */
	
	public void method1() {
		
		if(0 < 1) {
			System.out.println("0은 1보다 작다");
		}
		// if문의 조건식 자리에는 결론적으로 true 아니면 false값이 들어가도록 만들어야함.
		
		if(false) {
			System.out.println("출력될 일이 없다");
		}
		
		if(true) {
				System.out.println("true여야만 발동");
		}
	}
	
	public void method2() {
		
		boolean loginCheck = false; // 로그인 상태를 저장해둔 변수라 가정
		
		if(!loginCheck) {
			System.out.println("네이버를 더 안전하고 편리하게 이용해보세요.");
			System.out.println("NAVER 로그인");
			System.out.println("아이디 찾기 | 비밀번호 찾기 | 회원가입");
		}
		
		if(loginCheck) {
			System.out.println("홍길동님 환영합니다.");
			System.out.println("메일 | 카페 | 블로그 | 쇼핑 | 예약");
		}
	}
	
	public void lunchMenu() {
		
		// 오늘의 날씨르 입력받아서
		// 점심메뉴를 추천해주는 프로그램
		// 더움 / 맑음 / 비옴
		// 비옴을 입력했다면 파전을 추천
		// 사용자가 입력한 값과 "비옴"이라는 문자열값을 동등비교해서 일치하는지 비교
		// => 하지만 문자열은 동등비교연산자( == )를 사용할 수 없음
		// => 대신 이걸 판단해줄 수 있는 .equals()를 호출해야함
		// => .equals() 사용시 t/f 값을 내므로 조건식에 사용 가능
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("오늘의 날씨는 어떤가요? (더움 / 맑음 / 비옴) 中 택1 > ");
		String weather = sc.nextLine();
		
		
		if(weather.equals("더움")) {
			System.out.println("오늘의 점메추는 냉면입니다.");
		}
		else if(weather.equals("맑음")) {
			System.out.println("오늘의 점메추는 비빔밥입니다.");
		}
		else if(weather.equals("비옴")) {
			System.out.println("오늘의 점메추는 파전입니다.");
		}
		else {
			System.out.println("제시된 단어내에서 입력해주세요.");
		}
		
	}
	
	public void method3() {
		
		// 사용자에게 정수 값을 입력받아서 홀 / 짝 판별
		// if문을 이용해서 출력
		// 단, 입력받은 정수가 0qhek 클 경우에만 조건문을 실행할 것
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0보다 큰 정수값을 입력해주세요. > ");
		int num = sc.nextInt();
		
		boolean flag = num > 0;
		
		if(flag && num % 2 == 0) {
			System.out.println("짝수입니다.");
		}
		
		if(flag && num % 2 != 0) {
			System.out.println("홀수입니다.");
		}
		
		//if문 중첩
		if(num > 0) {
			if(num % 2 == 0) {
				System.out.println("짝수");
				}
			if(num % 2 != 0) {
				System.out.println("홀수");
				}
			
		}
		
	}
	
	public void method4() {
		
		// 1. 메뉴판 보여주기
		//출력문
		
		// 2. 메뉴번호로 메뉴 입력받기
		// Scanner로
		
		// 3. 수량 입력받기
		// Scanner
		
		// 4. 조건문
		// if문을 이용해서 입력한 메뉴번호에 따라 메뉴명 대입하기
		// 혹시 없는 메뉴 번호를 입력했다면 없는 메뉴라고 대입하기
		
		// 5. XXX메뉴를 XXX잔 주문하셨습니다. 출력해주기
		
		// 6. 진짜 주문할건지 물어보기
		// Y / N 받아서 확인하기
		
		// 7. 6번에서 입력받은 단일 문자가 Y또는 y와 일치한다면
		// 메뉴명과 수령과 가격 출력하기 if문 + 중첩 if문 + 출력문
		
		System.out.println("======메뉴판======");
		System.out.println("1. 초콜릿라떼 2500원");
		System.out.println("2. 아메리카노 2000원");
		System.out.print("메뉴를 선택해주세요 > ");
		
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		
		System.out.print("수량을 입력해주세요 > ");
		int count = sc.nextInt();
		
		String menuName = "";
		if(menu == 1) menuName = "초콜릿라떼";
		if(menu == 2) menuName = "아메리카노";
	    if(!(menu == 1) && !(menu ==2)) menuName = "없는 메뉴";
	    
	    System.out.println("============== 주 문 내 역 ==============");
	    System.out.println();
	    System.out.println(menuName + "을(를) " + count + "잔 주문하셨습니다.");
	    System.out.println();
	    System.out.println("======================================");
	    
	    System.out.print("\n위 주문내역으로 주문하시겠습니까? ( Y / N ) > ");
	    sc.nextLine();
	    char answer = sc.nextLine().charAt(0);
	    //System.out.println(answer);
	    System.out.println();
	    
	    if(answer == 'Y' || answer == 'y') {
	    	int price = 0;
	    	if(menu == 1) price = 2500;
	    	if(menu == 2) price = 2000;
	    	System.out.println("총 결제 금액은 " + (price * count) + "원 입니다.");
	    	
	    	
	    }
			
	}
		
}


