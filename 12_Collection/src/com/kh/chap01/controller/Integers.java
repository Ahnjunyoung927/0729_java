package com.kh.chap01.controller;

import java.util.Arrays;

public class Integers {
	
	private int[] integers;
	private int size;
	
	public Integers() {
		integers = new int[3];
	}
	
	public void add(int element) {
		if(integers.length == size + 1) {
		integers = Arrays.copyOf(integers, (integers.length * 2));
		} // 배열이 가득 차면 배열을 길이를 두배로 만든다
		integers[size++] = element;
	}
	
	public int get(int index) {
		return integers[index];
	}
	
	
	
	@Override
	public String toString() {
		return Arrays.toString(integers);
	}
	
	
	
	
	
}
