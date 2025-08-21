package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedException  {
	/*
	 * CheckedException
	 * 
	 * 문법적으로 반드시 예외처리를 해야하는 예외들
	 * => 주로 외부 매체 입/출력 시
	 * 
	 * 
	 */
	public void method1() throws IOException {
		// 사용자에게 문자열을 하나 입력받아서
		// 입력받은 문자열의 길이를 출력
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		
		// 방법 1. try - catch문
		/*
		
		try {
		    str = br.readLine();
		} catch(IOException e) {
			e.printStackTrace();
		}
		*/
		
		// 방법 2. throws : 코드 작성부 말고 메소드를 호출하는 부분으로 예외처리를 위임
		// 메소드 식별자 뒤에 throws + 예외처리 해줄 곳
		// 메소드를 부른 곳에서 try catch 예외처리를 해야 함
		str = br.readLine();
		
		
		
		
		
	}
	
	
	
	
}
