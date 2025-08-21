package com.kh.chap06.run;

import com.kh.chap06.controller.Human;
import com.kh.chap06.controller.MethodController;
import com.kh.chap06.controller.OverloadingController;

public class Run {

	public static void main(String[] args) {
		
		Human ahn = new Human();
		
		/*
		MethodController mc = new MethodController();
		int a = mc.add(1, 2);
		int b = mc.add(7, 10);
		int c = mc.add(6,7);
		int d = mc.add(a, b);
		int e = mc.add(c, d);
		System.out.println("총합 : " + e);
		*/
		
		MethodController mc = new MethodController();
		// int[] dd = new int[3];
		// mc.method1();
		// String returnValue = mc.method2();
		// System.out.println(returnValue);
		// System.out.println(mc.method2());
		// mc.println("method3 호출결과 : " + mc.method3());
		
		// mc.method4(2);
		
		// int result = mc.method5(7);
		// System.out.println(result);
		
		// mc.test(mc); // MethodController에 있는 test메소드와 같은 대상을 가리킴
		                // (heap메모리상 객체의 주소가 같다)
		                // 얕은 복사
		// MethodController mc = mc;
		// ☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
		
		// 복습복습
		// static 메소드
		// 객체생성 없이 메소드를 호출할 수 있다
		
		// MethodController.staticMethod(); // 위의 다른 메소드처럼 mc만들고 (객체생성) 할 필요가 없다.
		/*
		System.out.println(1);
		System.out.println(1.1);
		System.out.println("???");
		*/ //==> ()안에 다 다른 타입의 값이 입력되는데 어떻게? > 메소드 오버로딩
		
		OverloadingController oc = new OverloadingController();
		
		// 정적 바인딩(Static Binding)
		// 컴파일이 끝난 시점에 어떤 메소드가 호출될지 결정
		// 컴파일러가 알아서 코드를 분석하여 메소드를 호출 연결
		oc.test();
		oc.test(2); 
		oc.test("아이오"); // 메소드 호출부에서는 ()안의 값을 인자값이라고 표현(arguments)
		oc.test(2, 4);
		
		
		
	}

}
