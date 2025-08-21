package com.kh.chap01.run;

import com.kh.chap01.controller.Integers;

public class Run {

	public static void main(String[] args) {
		
		// 정수 값을 여러 개 다루고 싶음, 정확히 몇 개의 정수를 다룰지 알 수 없음
		/*
		int[] integers = new int[3];
		integers[0] = 1;
		integers[1] = 5;
		integers[2] = 9;
		int[] integers = new int[5];  >>  기존에 입력된 배열은 날아간다
		*/
		
		Integers integers = new Integers();
		integers.add(10);
		integers.add(60);
		integers.add(30);
		integers.add(30);
		integers.add(30);
		System.out.println(integers);
		
		int element = integers.get(2);
		System.out.println(element);
		
		
		
	}

}
