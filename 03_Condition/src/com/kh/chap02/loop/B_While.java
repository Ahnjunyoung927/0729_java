package com.kh.chap02.loop;

public class B_While {
	
	/*
	 * while문
	 * 
	 * [ 표현법 ]
	 * 
	 * 초기식;               // 필수는 아님
	 * 
	 * while(조건식){
	 *      반복적으로 실행하고자 하는 코드;
	 *      증감식;          // 필수는 아님
	 * }
	 * 
	 * while문의 조건식의 결과값이 true일 경우 반복적으로 실행하고자 하는 코드가 실핼
	 * 
	 * 
	 * for        => 개발자가 반복의 횟수를 명확하게 알고 있을때 사용.
	 * while      => 개발자가 반복의 횟수를 가늠할 수 없음.
	 * 
	 *  
	 */
	
	public void method1() {
		
		while(true) { // 무한반복의 용도
			System.out.println("계속 반복");
		}
		
	}
	
	public void method2() {
		
		// 초기식, 조건식, 증감식
		
		int i = 0; //초기식
		
		while(i < 3) /*조건문*/ {
			System.out.println(i);
			i++; // 증감식, scope내에서 어느 위치든 붙을 수 있다.
		}
		
	}
	
	public void method3() {
		
		// 1 ~ 10까지의 정수 중 짝수의 합 출력
		
		// 1단계 1부터 10까지의 합계값 출력
		
		int i = 1;
		int sum = 0; // 합계를 저장해둘 변수
		
		while(i <= 10) {
			if(i % 2 == 0) {
			sum += i;
			}
			i++;
		}
		System.out.println("합계 : " + sum);
		
	}
	
	public void method4() {
		
		// 1부터 시작해서 
		// 1 ~ 10사이의 랜덤한 정수까지를 모두 더한 합계를 출력
		// random : 무작위
		// Random이라는 클래스가 존재
		// Math라는 클래스가 가지고 있는 random()를 호출해서 만들어 볼 예정
		
	    // Math math = new Math();    >> import 없이 사용할 수 있는 클래스
		// Math.random();
		// System.out.println(Math.random());
		
		// random()의 결과값 : 0.0 ~ 0.9999999999999999 (소수점 16자리)
		
		// 1단계. random() 호출 결과 체크
		
		// double num = Math.random();
		// System.out.println(num * 10);
		
		// 2단계 num에 10을 곱한 후 강제 형 변환
		
		// double num = Math.random();
		// System.out.println((int)(num * 10));
		
		// 3단계
		// +1
		
		int randomNum = (int)(Math.random() * 10) + 1;
		System.out.println("1부터 10까지 무작위 정수 : " + randomNum);
		// (int)(Math.random() * 몇개의 랜덤값) + 시작값;
		
		
		// 누적합계 구하기
		// 1부터 랜덤한 수 (1~10)까지를 모두 더한 합계
		
		int i = 1;
		int sum = 0;
		
		while(i <= randomNum) {
			sum += i;
			i++;
		}
		System.out.println("1부터 " + randomNum + "까지 더한 결과 : " + sum);
		
	}
	
	public void lotto() {
		
		// 로또 번호 생성기 ver_0.1
		// 범위 : 1 ~ 45
		// 6개 선택
		int num1 = (int)(Math.random() * 45) + 1;
		int num2 = (int)(Math.random() * 45) + 1;
		int num3 = (int)(Math.random() * 45) + 1;
		int num4 = (int)(Math.random() * 45) + 1;
		int num5 = (int)(Math.random() * 45) + 1;
		int num6 = (int)(Math.random() * 45) + 1;
		
		System.out.println("금주 로또 도전 번호");
		System.out.printf("%d, %d, %d, %d, %d, %d", num1, num2, num3, num4, num5, num6);
		
		
		
	}
	
	/*
	 * do-while 문 
	 * 별도의 조건검사 없이 무조건 한 번은 실행함
	 * 조건이 true값이 아니더라도 한 번은 꼭 수행
	 * 
	 * [ 표현법 ] 
	 * 
	 * 초기식; // 필수X
	 * 
	 * do{
	 *   실행할 코드;
	 *   증감식;  // 필수X
	 * } while(조건식);
	 */
	
	public void method5() {
		
		do {
			System.out.println("");
		} while(false);
		
		
	}
	
}
