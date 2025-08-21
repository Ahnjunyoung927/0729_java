package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	
	// 변수 Variable
	// 변수란?
	// 메모리(RAM) 공간에 data(value)값을 저장하는 공간
	
	/* 변수의 특징
	 * 
	 * 1. 고유한 식별자를 가진다
	 * 2. 공간에 새로운 값을 대입해서 사용할 수 있다
	 * 3. 자료형이 정해져 있다
	 * 4. 지역변수의 경우 메모리의 Stack영역에 올라간다
	 * 5. **하나의 변수공간에는 하나의 값만 대입될 수 있다.**
	 * 6. 초기화를 해야만 사용 가능하다
	 * 7. 초기화는 한 번만 가능하다
	 * 8. 자료형은 크기가 정해져있다.
	 * 9. 자료형끼리의 변환이 가능하다
	 * 10. 선언된 Scope안에서만 사용이 가능하다
	 * 11. 변수끼리 연산도 가능하다.
	 */
	
	/*
	 * 배열(Array) : 하나의 배열에 '여러 개'의 값을 담을 수 있음.
	 *              단, '같은 자료형의 값들'만 담을 수 있음
	 *              동종 모음(homogeneous collection)이라고도 함
	 * 
	 *              자바라는 '언어 자체에 내장된' 유일한 자료구조
	 *              
	 *              => 배열의 각 인덱스에 실제 값이 담김.
	 *                 index는 '0'부터 시작한다.
	 *               
	 */
	
	public void method1() {
		// 임의의 정수 5개를 선언하고 초기화를 진행해야지!
		/*
		int num1 = 12;
		int num2 = 15;
		int num3 = 234;
		int num4 = 46;
		int num5 = 94;
		int sum = num1 + num2 + num3 + num4 + num5;
		System.out.println(sum);
		*/
		
		// 배열
 
		// 1. 배열 선언
		
		/*
		 * 변수 선언 방법
		 * 
		 * 자료형 변수식별자;
		 * 
		 * 배열 선언 방법
		 * 
		 * 1) 자료형 배열식별자[];
		 * 2) 자료형[] 배열식별자;  ----> 이 방법을 사용할 것!!!
		 * 
		 * 
		 */
		
		// 변수 선언!
		// int num;
		
		// 배열 선언!
		// int[] nums;
		
		// 2. 배열 할당
		
		/*
		 * 배열에 몇 개의 값이 들어갈지 배열의 크기를 정해주는 과정
		 * 지정한 개수만큼 값이 들어갈 공간이 할당됨
		 * 
		 * 
		 * [ 표현법 ]
		 * 
		 * int[] nums;        // 배열 선언
		 * nums = new int[5]; // 할당 왼쪽의 예는 5칸 할당 받음
		 * 
		 * int[] arr = new int[5]; // 선언과 동시에 할당
		 * 
		 * 배열은 참조 자료형이다. 자료형안에 들어갈 값들이 주소값을 가진다
		 */
		
		// int[] nums = new int[2];
		
		// nums라는 정수형 배열을 선언하고 5칸 할당받아보기
		int[] nums = new int[5];
		
		// 3. 배열의 각 인덱스에 값 대입
		/*
		 * [ 표현법 ]
		 * 
		 * 배열식별자[인덱스] = 값;
		 */
		
		nums[0] = 67;
		nums[1] = 49;
		nums[2] = 6;
		nums[3] = 3;
		nums[4] = 28;
		
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);
		System.out.println(nums[4]);
		
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			sum += nums[i];
		}
		System.out.println(sum);
		// 현시점에서 우리가 배열을 사용해서 얻을 수 있는 장점 : 반복문에 대입하여 사용 가능
	}
	
	public void methodA() {
		// 배열을 공부해보자
		
		// 1. 배열선언 및 할당
		int[] integers = new int[3];         // 인덱스 3개 : 0,1,2
		double[] doubles = new double[2];    // 인덱스 2개 : 0,1
		
		// 배열식별자.length : 배열의 크기(길이) => 정수
		System.out.println(integers.length); //=> 3
		System.out.println(doubles.length);  //=> 2
		
		int i;
		
		// System.out.println(i); 초기화를 진행하지 않으면 사용할 수 없음
		
		i = 1;
		System.out.println(i);
		System.out.println(integers);
		System.out.println(integers[0]); // 배열의 인덱스에는 항상 값이 들어있음, int형의 경우 0 
		integers[0] = 1; // 배열의 상세주소에 값을 입력할 수 있다.
		
		/*
		 * 기본자료형 : boolean, char, byte, short, int, long, float, double
		 *            => 변수 공간에 실제 값을 바로 담을 수 있음 : (지역)변수
		 *            
		 * 참조자료형 : boolean[], char[], byte[], ... String
		 *            => 주소값을 담고 있는 변수 : 참조 변수(레퍼런스)
		 */
		
		// 인포, A강의장, B강의장, C강의장, 사무실
		
		String[] khAcademy = new String[5];
		khAcademy[0] = "인포";
		khAcademy[1] = "A강의장";
		khAcademy[2] = "B강의장";
		khAcademy[3] = "C강의장";
		khAcademy[4] = "사무실";
		
		// C강의장 출력
		// System.out.println(khAcademy[3]);
		System.out.println(khAcademy[0]);
		System.out.println(khAcademy[1]);
		System.out.println(khAcademy[2]);
		System.out.println(khAcademy[3]);
		System.out.println(khAcademy[4]);
		
		// 위를 반복문 형태로 바꾼다면?
		System.out.println("----반복문----");
		
		for(int index = 0; index < 5; index++) {
			System.out.println(khAcademy[index]);
		}
		
		int number1 = 3;
		int number2 = 3;
		System.out.println(number1 == number2); // -> true
		
		int[] numbers1 = new int[3];
		int[] numbers2 = new int[3];
		System.out.println(numbers1 == numbers2); // -> false
		// 각 배열이 heap메모리상에 위치하는 주소가 다르기 때문에 거짓!
		// 참조자료형에서는 ==(동등비교 연산자) 사용 시, 주소값을 비교하기 때문에 원하는 결과를 얻을수 없음
		// 문자열.equals("비교할 문자열");
		
		// 해시코드 : 주소값을 10진수(int형태)로 나타낸 것 // hash - 암호화의 한 종류
		System.out.println(numbers1.hashCode());
		System.out.println(numbers2.hashCode());
	}
	
	public void lotto() {
		
		// 로또번호 생성기 ver_0.2
		
		int[] lottery = new int[6];
		/*
		lottery[0] = (int)(Math.random() * 45) + 1;
		lottery[1] = (int)(Math.random() * 45) + 1;
		lottery[2] = (int)(Math.random() * 45) + 1;
		lottery[3] = (int)(Math.random() * 45) + 1;
		lottery[4] = (int)(Math.random() * 45) + 1;
		lottery[5] = (int)(Math.random() * 45) + 1;
		*/
		
		for(int i = 0; i < 6; i++) {
			lottery[i] = (int)(Math.random() * 45) + 1;
			System.out.print(lottery[i] + " ");
		}
		
		// Arrays.toString(배열식별자)
		System.out.println(Arrays.toString(lottery)); // -> [0번 인덱스 벨류부터 끝까지 나옴]
	}
	
	public void methodB() {
		
		// 5개의 요소를 담을 수 있는 String형 배열을 선언 및 할당하시오.
		// 동물 5총사
		
		// 1. 배열 선언 및 할당
		String[] animals = new String[5];
		
		// 2. 배열 인덱스에 동물 대입
		animals[0] = "말";
		animals[1] = "사자";
		animals[2] = "개";
		animals[3] = "고양이";
		animals[4] = "독수리";
		// animals[5] = "호랑이"; <-- 문법적으로는 문제가 없음.
		
		/*                                    ArrayIndexOutOfBounds:배열의 인덱스가 범위를 넘어섰다
		 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
	     at com.kh.array.Array.methodB(Array.java:228)   -> com.kh.array패키지 > Array클래스 > 메소드B 228행
  	     at com.kh.array.Run.main(Run.java:11)           -> com.kh.array패키지 > Run클래스   > 메인메서드의 11행
	    */
	}
	
	public void methodC() {
		
		// 사용자에게 세 개의 정수를 입력 받아서 입력받은 정수 중에 최소값 구하기
		
		// 현 시점에서 배열을 선택할때의 기준
		// 1. 두 개 이상의 같은 자료형 값을 다룰 것
		// 2. 다룰 값의 개수가 명확하게 정해져 있을 것
		
		// 1) 사용자로부터 값을 입력받아서 배열의 각 인덱스에 대입
		
		Scanner sc = new Scanner(System.in); // 입력도구
		int[] nums = new int[3];             // 저장공간
		
		// 배열은 물리적인 구조와 논리적인 구조가 동일함.
		/*
		System.out.print("첫 번째 정수를 입력해주세요 > ");
		nums[0] = sc.nextInt();
		System.out.print("두 번째 정수를 입력해주세요 > ");
		nums[1] = sc.nextInt();
		System.out.print("세 번째 정수를 입력해주세요 > ");
		nums[2] = sc.nextInt();
		*/
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print("정수를 입력하세요 > ");
			nums[i] = sc.nextInt();
			// System.out.println("nums라는 배열의" + i + "번째 인덱스 값 : " + nums[i]);
		}
		
		System.out.println(Arrays.toString(nums));
		
		int min = nums[0];
		/*
		if(min > nums[1]) {
			min = nums[1];
		} else if(min > nums[2]) {
			min = nums[2];
		}
		*/
		for(int i = 1; i < nums.length; i++) {
			if(min > nums[i]) {
				min = nums[i];
			}
		}
		System.out.println("배열의 요소 중 가장 작은 값 : " + min);
	}
	
	public void methodD() {
		
		/*
		 * 한 번 할당받은 배열의 크기를 변경할 수 없음
		 * 
		 */
		String[] name = new String[3];
		
		name[0] = "안";
		name[1] = "준";
		name[2] = "영";
		System.out.println(Arrays.toString(name));
		name[2] = "형";
		System.out.println(Arrays.toString(name));
		System.out.println(name.hashCode());
		
		name = new String[4]; 
		name[3] = "굿";
		System.out.println(Arrays.toString(name)); 
		System.out.println(name.hashCode());
		
		/*
		 * 연결이 끊긴 기존의 배열은
		 * 일정 시간이 지나면 G.C가 알아서 삭제 해준다. : 자동 메모리 관리
		 * 
		 * 기존배열식별자에 할당만 새롭게 한다면
		 * => 기존 참조하고 있던 연결이 끊기고 새로운 배열을 참조함
		 */
		
		// null : 아무것도 존재하지 않음을 의미하는 값
		/*
		 * 기본값
		 * 정수 = 0
		 * 실수 = 0.0
		 * 문자 = ' '
		 * boolea = false
		 * 
		 * 참조자료형
		 * 
		 * 참조자료형에는 null이라는 값이 들어가는데
		 * 주소값이 존재하는가 그렇지 않은가
		 */
		
		name = null; // 현재 heap메모리상의 연결고리를 끊겠다.
		System.out.println(name);
		name[0] = "안준영"; //=> 주소자체가 사라졌으므로 heap메모리상에 값을 대입할수 없어 오류발생
		
	}
	
	public void methodE() {
		
		// 배열은 어디에서 쓰는가?
		// 배열은 보통 어떻게 쓰는가?
		/*
		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		System.out.println(Arrays.toString(arr));
		*/
		
		// 배열 : 보통 선언과 동시에 요소를 대입해서 사용함
		int[] arr1 = new int[] {1, 2, 3};
		System.out.println(Arrays.toString(arr1));
		
		int[] arr2 = {100, 200, 300};
		System.out.println(Arrays.toString(arr2));
	}
	
	/*
	 * 배열 복사
	 * 1. 얕은 복사 ☆★☆★
	 * 
	 * 2. 깊은 복사
	 */
	
	// 얕은 복사
	public void methodF() {
		
		int[] origin = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(origin));
		
		// 얕은 복사로 배열을 복사
		int[] copy = origin; 
		System.out.println(Arrays.toString(copy));
		
		origin[2] = 33;
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copy));
		// 얕은 복사 => 주소값을 대입하는 것이기 때문에 가리키고 있는 대상이 같이
		System.out.println(origin.hashCode());
		System.out.println(copy.hashCode());
	}
	
	// 깊은 복사
	
	public void methodG() {
		
		int[] origin = {1, 2, 3, 4, 5};
		
		int[] copy = new int[6];
		/*
		copy[0] = origin[0];
		copy[1] = origin[1];
		copy[2] = origin[2];
		copy[3] = origin[3];
		copy[4] = origin[4];
		*/
		
		for(int i = 0; i < origin.length; i++) {
			copy[i] = origin[i];
		}
		// 깊은 복사의 경우 기존 배열의 크기보다 큰 배열로 복사하는 경우가 많음
		
		// alt + ↑, ↓ (행 이동)
		// ctrl + alt + ↑, ↓ (행 복사)
		// ctrl + d (행 삭제)
		// ctrl + / (행 주석처리)
		// ctrl + shift + f (코드정리)
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copy));
		
		int[] copy2 = new int[10];
		
		System.arraycopy(origin, 0, copy2, 0, 5);
		System.out.println(Arrays.toString(copy2));
		// 깊은 복사
		// System.arraycopy(원본배열 식별자, 원본배열 복사 시작할 인덱스,
		//                  복사받을 배열식별자, 복사받은 배열 시작 인덱스, 복사할 개수);
		
		/*
		 * 네이밍컨벤션 == 첫글자가 대문자 == 클래스 / 인터페이스
		 * arraycopy() ==> System클래스
		 */
		
		// Arrays클래스에서 제공하는 copyOf()
		int[] copy3 = Arrays.copyOf(origin, 15);
		// 원본배열을 뒤에 적은 숫자만큼의 복사배열을 만든 다음 0번 인덱스부터 순차적으로 복사
		System.out.println(Arrays.toString(copy3));
		
		// clone()
		int[] copy4 = origin.clone(); // 동일한 구성의 배열을 복사하여 생성
		System.out.println(Arrays.toString(copy4));
		
		
		
		
	}
	
}
