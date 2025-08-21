package com.kh.second;

public class Run {
	
	public static void main(String[] args) {
		
		// printMyName();
		// 외부 클래스에 존재하는 메소드들을 호출하고 싶다면?
		/*
		 * 호출할 메소드가 존재하는 클래스를 생성(new) 해줘야 함
		 * 
		 * [표현법]
		 * "클래스 이름" "클래스명을 대신할 별칭" = "클래스 이름"();
		 * 
		 */
		
		PrintController pc = new PrintController();
		
		pc.printMyName();
		
	}

}
