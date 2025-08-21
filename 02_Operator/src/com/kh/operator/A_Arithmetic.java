package com.kh.operator;

import java.util.Scanner;

public class A_Arithmetic {
	
	// 산술연산자 -> 이항연산자, 우선순위가 산수와 같다.
	// + : 덧셈
	// - : 뺄셈
	// * : 곱셈
	// / : 나눗셈
	// % : 모듈러(Moduler) => 나눗셈에서의 나머지를 구함
	
	public void method() {
		
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		// test();
		
		System.out.println("num1 + num2 : " + num1 + num2);
						// -> num1 + num2 : 103 => 우선순위상 문자열과의 
		                //       연산이 먼저 되면서 전체가 하나의 문자열로 묶임
	    // -> 연산우선순위를 지정하고 싶다면 ()를 이용해서 아래처럼 묶어줘야 함
		System.out.println("num1 + num2 : " + (num1 + num2));
		                // -> num1 + num2 : 13
		
		// -> 혹은 더 윗줄에서 두 값을 미리 합친 변수를 만들거나
		int sum = num1 + num2;
		System.out.println("두 수의 합계 : " + sum);
		System.out.printf("num1+ num2 : %d\n", num1 + num2);
		
		System.out.println("num1 - num2 : " + (num1 - num2));
		
		
		System.out.println("num1 X num2 : " + (num1 * num2));
		System.out.println("num1 / num2 : " + (num1 / num2));
		System.out.println("num1 mod num2 : " + (num1 % num2));
		// *, /, % 는 우선순위가 높기때문에 묶어주지 않더라도 먼저 연산해서
		// 결과를 얻을 수 있음
		// 다만, 가독성 향상을 위해 괄호를 사용하는 것을 권장
		
		// 조심해야할 부분
		// 0으로 나눌 순 없다.
		// System.out.println(10 / 0);
		
		
				
		
	}
	
	public void test() {
		
		System.out.println("꼭 메인메소드에서 호출해야 하는 것은 아님");
		
		
	}
	
	public void presentToStudent() {
		
		// 사탕 개수 구하기 프로그램을 구현하시오.
		
		// 메소드 : presentToStudent <== 메소드 선언
		
		// 사용자에게 값을 입력받기 <== Scanner
		// 1. 나눠줄 학생의 수
		// 2. 사탕 개수
		
		// 1인당 받을 수 있는 사탕의 개수 : 사탕 개수 / 학생의 수
		// 남은 사탕의 개수 : 사탕 개수 % 학생의 수
		
		// 출력형식
		// 학생 한 명당 받을 수 있는 사탕의 개수 : X개
		// 남은 사탕 개수 : X개
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("사탕의 개수를 입력하세요. > ");
		int candies = sc.nextInt();
		
		System.out.println();
		
		System.out.print("학생의 수를 입력하세요. > ");
		int students = sc.nextInt();
		
		System.out.println();
		
		int result = candies / students;
		int mod = candies % students;
		
		System.out.println("1인당 받을 수 있는 사탕의 개수는 " + (result) + "개 입니다.");
		System.out.println("남은 사탕의 개수는 " + (mod) + "개 입니다.");
		
		
	}
	
	
	

}
