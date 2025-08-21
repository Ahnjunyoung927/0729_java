package com.kh.run;

import com.kh.variable.A_Variable;

import com.kh.variable.B_KeyboardInput;
import com.kh.variable.Casting;

public class Run {

	public static void main(String[] args) {
		
		// 외부 클래스에 존재하는 메소드를 호출해야 한다.
		
		// 클래스이름 클래스별칭 = new 클래스이름();
		// 패키지명+클래스명 = 풀클래스 네임
		A_Variable a = new A_Variable();
		// a.findSeasonMenu();
		// a.declareVariable();
		
		// com.kh.variable.B_KeyboardInput b = new com.kh.variable.B_KeyboardInput();
		// 패키지 아래칸에 import로 풀클래스명을 미리 끌어오면 아래에선 생략 가능
		// 중복코드가 많을수록 실수할 확률도 증가, 유지보수가 힘들어질 수 있다
		B_KeyboardInput b = new B_KeyboardInput();
		//b.inputTest();
		
		Casting cst = new Casting();
		//cst.autoCasting();
		cst.forceCasting();
		
		

	}

}
