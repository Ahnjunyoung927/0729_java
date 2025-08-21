package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {
	
	public void method0() {
		/*
		System.out.println("월요일 좋아~");
		System.out.println("월요일 좋아~");	
		System.out.println("월요일 좋아~");
		*/
		//반복해야하는 수가 많아진다면..?
		
		
		for(int i = 0; i < 5; i++) {
			System.out.println("5번 반복!");
			
		}
		
		
	}
	
	/*
	 * for문
	 * 
	 * [ 표현법 ] 
	 * for(초기식; 조건식; 증감식) {
	 *      반복적으로 실행하고자 하는 코드
	 * }
	 * 
	 * ()에서 몇번 반복할것 인지를 지정함
	 * 초기식; 조건식; 증감식 세 가지로 이루어짐
	 * 각각을 세미콜론;으로 구분함
	 * 
	 * - 초기식 : 반복문을 시작할 때 "초기에 단 한번만 실행"될 구문
	 *          반복을 할때 필요한 변수를 선언하고 초기화 하는 구문(제어변수) => int i = 0;
	 * - 조건식 : "반복문이 실행될 조건"을 작성하는 구문
	 *          조건식의 결과가 true면 scope안의 코드를 실행
	 *          조건식의 결과가 false면 반복을 멈추고 블럭을 빠져나옴      => i < 5;
	 * - 증감식 : "반복문을 제어하는 변수에 대입된 값"을 증감하는 구문
	 *          보통 초기식에서 선언된 변수를 가지고 증감식 작성
	 *          이 때, 보편적으로 증감연산자를 사용함                   => i++
	 */
	
	public void method1() {
		
		// 1
		// 2
		// 3
		// 4
		// 5
		// 의 표현방법은?
		/*
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		
		System.out.println("1\n2\n3\n4\n5");
		*/
		
		/* ==>
		for(int i = 0; i < 10; i++) {
			System.out.println(i+1);
		}
		*/
		
		for(/*1번*/int i = 0;/*2번*/ i < 5;/*4번*/ i++) {
			/*3번*/System.out.println(i + "번 반복");
		}  // 1번을 최초 1회에만 시행 한 후 2번, 3번, 4번을 반복하다가 
		   // 2번(조건식)이 false가 나오는 순간 scope 탈출
		
		
	}
	
	public void method2() {
		
		// for문을 이용해서 반복을 3번 한다고 가정
		// i,j,k 을 일반적으로 사용
		/*
		for(int i = 0; i < 3; i++) {
			System.out.println(i);
		}
		
		for(int i = 100; i > 0; i--) {
			System.out.println(i);
		}
		
		for(int i = 0; i < 5; i += 2) {
			System.out.println(i);
		}
		*/
	}
	
	public void gugudan() {
		
		// 구구단 프로그램
		// 사용자에게 정수를 입력 받아서
		// 사용자가 입력한 정수를 이용해서 구구단을 출력해보기
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단 몇단을 출력하시겠습니까?. > ");
		int num = sc.nextInt();
		System.out.println(num + "단을 출력하겠습니다.");
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(num + " X " + i + " = " + num * i);
		}
		
	}
	
	public void method3() {
		
		// ★★★
		// ★★★
		// ★★★
		
		/*
		  for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
			System.out.print("★");	
		}
			System.out.println();
		}
		*/
		
		// 출력 : X번째 반복입니다.
		//     : 10번째 반복마다 ♡를 하나씩 찍어주기
		for(int i = 0; i < 100; i++) {
			System.out.println((i+1) + "번째 반복입니다.");
			
			if((i+1) % 10 == 0) {
				System.out.println("♡");
			}
		}
	}
	
	public void method4() {
		
		for(;;){
		/*무한 반복 구문으로 유지가능, 여기선 159행의 return이 나오는 순간 나가게 됨 */
		System.out.println("구구단 프로그램");
		System.out.println("1. 구구단 프로그램 시작하기");
		System.out.println("2. 구구단 프로그램 설명보기");
		System.out.println("3. 프로그램 종료하기");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("메뉴를 선택해주세요 > ");
		int menuNo = sc.nextInt();
		sc.nextLine();
		
		if(menuNo == 1) {
			gugudan();
		} else if(menuNo == 2) {
			System.out.println("구구단 작동시키는 프로그램");
			System.out.println();
		} else if(menuNo == 3) {
			System.out.println("프로그램을 종료합니다.");
			return;
		} else {
			System.out.println("이런 메뉴는 없어요");
		}
		
	}
		
	}
}

