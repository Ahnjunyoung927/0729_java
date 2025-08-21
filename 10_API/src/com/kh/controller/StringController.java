package com.kh.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

import com.kh.run.Run;

public class StringController {
	
	// String 클래스 => 불변(변하지 않음을 의미)
	/* 
	 * String 클래스 사용방법
	 * 
	 * 1. new 연산자를 사용해서 String클래스의 생성자를 호출하는 방법
	 * 2. 대입연산자를 이용해서 문자열 리터럴값을 대입하는 방법
	 * 
	 */
	
	// 생성자를 호출해서 문자열 객체를 생성하는 방법
	public void method1() {
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		Run run = new Run();
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(run/*.toString()*/); // run클래스가 상속하고 있는 부모클래스인 Object의 toStirng
		
		// 1. String 클래스의 toString()의 경우
		// 실제 담겨있는 문자열 리터럴 value값을 반환하게끔 오버라이딩
		
		Run run2 = new Run();
		System.out.println(run.equals(run2)); // false
		
		
		// 2. String 클래스의 equals()
		System.out.println(str1.equals(str2));
		// true ==> 같다
		// 주소값 비교는 물론이고 문자열 값도 비교하도록 오버라이딩
		
		
		// 3. String 클래스의 hasCode()
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println("hello".hashCode());
		// 주소값을 해싱하는 것이 아니라 실제 담긴 문자열값을 기반으로 해시코드 값을 만들도록 오버라이딩
		
		
		// 진짜 저 참조형 변수들을 식별할 수 있는 값을 알아내는법
		// System.indentityHashCode(참조형 변수)
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		System.out.println(str1 == str2);
		
	}
	
	// 문자열 리터럴 대입 방식
	public void method2() {
		
		String str1 = "hello";
		String str2 = "hello";
		// 문자열 리터럴로 입력시 상수풀에 저장됨
		// 문자열이 같다면 상수풀내에서 같은 공간을 공유
		
		// toString()
		System.out.println(str1);
		System.out.println(str2);
		
		// equals()
		System.out.println(str1.equals(str2));
		
		// hashCode()
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		// System.identityHashCode()
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		System.out.println(str1 == str2);
	}
	
	// String (Constant) Pool 스트링 (상수) 풀
	public void method3() {
		String exam = new String("hello");
		String str = "hello";
		System.out.println(System.identityHashCode(str));
		// 문자열 리터럴은 대입 연산자를 사용해 대입할 때
		// String Constant Pool 영역에 등록됨
		// 특 : 동일한 내용의 문자열 리터럴이 존재할 수 없음
		
		str = "bye";
		System.out.println(System.identityHashCode(str));
		
		str += "!!";
		System.out.println(System.identityHashCode(str));
		
		System.out.println(str);
		
	}
	
	public void method4() {
		
		// 1. StringBuffer
		// Buffer == 임시저장공간
		// 문자열은 불변객체라서 내용물이 변경될 때 마다 새로운 공간을 할당해서 집어넣는다.
		// 이를 해결하기 위해서 임시공간(Buffer)을 준비해서
		// 임시공간에 차곡차곡 담았다가 한번에 처리해주는 클래스
		
		// System.out.println("hello" + "world"); 
		// >> 이렇게 하면 hello 한번 hello world 한번 > 총 두번공간 할당 받아야함
		
		// 1. StringBuffer 동시제어 기능이 있다.
		StringBuffer sb = new StringBuffer();
		sb.append("hello ");
		sb.append("world!");
		System.out.println(sb);
		
		
		// 2. StringBuilder 동시제어 기능이 없으나 대신 더 연산이 빠르다
		StringBuilder sr = new StringBuilder();
		sb.append("hello ");
		sb.append("world!");
		System.out.println(sb);
		
		// 동시제어기능(Tread-Safe)이
		// 외부에서 제공이 많이 되고 있기 때문에
		// 충돌환경이 아니라면 굳이 구현할 필요가 없음
	}
	
	// 문자열과 관련된 메소드들
	public void stringMethod() {
		
		String str1 = "경실련하이텔 아카데미";
		
		// 1. 문자열.length() : int
		// 문자열의 길이를 반환
		System.out.println("str1의 길이 : " + str1.length());

		// 2. 문자열.charAt(int index): char
		char ch = str1.charAt(3);
		System.out.println("하 : " + ch);
		
		// 3. 문자열.dubstring(int beginindex) : String
		// => 문자열의 beginindex 위치에서 문자열 끝까지의 문자열을 추출해서 반환
		String phoneNumber = "010-1234-5678";
		System.out.println(phoneNumber.substring(4));
		System.out.println(phoneNumber.substring(4, 8));
		
		// 4. 문자열.indexOf(str) : int
		System.out.println(str1.indexOf("텔"));
		
		
		String[] emails = {"go@naver.com", "kim@naver.com", "KH@naver.com", "ahn@naver.com"};
		
		for(int i = 0; i < emails.length; i++) {
			System.out.println(emails[i].substring(0, emails[i].indexOf("@")));
		}
		
		
		// 5. 문자열.toCharArray() : char[]
		// 문자열의 각 문자들을 char[]로 반환해주는 메소드
		char[] chArr = emails[0].toCharArray();
		
		for(int i = 0; i < chArr.length; i++) {
			System.out.println(chArr[i]);
		}
		for(char c : chArr) {
			System.out.println(c);
		}
		
		// char[] -> String
		System.out.println(String.valueOf(chArr));
		
		// 6. 문자열.replace(char old, char new) : String
		System.out.println(emails[0].replace("naver", "kh"));
		
		
		// 7. 공백 날리기
		String str3 = "              Java                ";
		System.out.println(str3.trim());
		
		// 8. 문자열.toUpperCase() : String -> 전부 대문자로 바꾸기
		//    문자열.toLowerCase() : String -> 전부 소문자로 바꾸기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정말 하시겠어요?(Y/N) > ");
		String answer = sc.nextLine(); //.toUpperCase();
		// String upperAnswer = answer.toUpperCase();
		
		if(answer.toUpperCase().equals("Y")) {
			// 수행할 코드
		}
	}
	
	public void split() {
		// 문자열 분리시키기
		String str = "배고파, 졸려, 하기싫어, 즐거워";
		
		// 문자열.split(String 구분자) : String[]
		
		String[] arr = str.split(", ");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println();
		
		
		// 향상된 for문
		for(String s : arr) {
			System.out.println(s);
		}
		// 초기식, 조건식, 증감식 안씀
		// for(값을 받아줄 변수 선언 : 순차적으로 요소에 접근할 배열or컬렉션) {}
		// 배열의 요소를 수정할 순 없음
		
		
		// java.util.StringTokenizer 클래스를 이용하는 방법
		StringTokenizer stn = new StringTokenizer(str, ", ");
		System.out.println();
		System.out.println("토크나이저로 뽑기");
		
		while(stn.hasMoreTokens()) {
			// 남아있는 토큰이 있다면 true, 없다면 false
		System.out.println(stn.nextToken());
		}
		
	}
	
	
	
	
	
	
	
	
}
