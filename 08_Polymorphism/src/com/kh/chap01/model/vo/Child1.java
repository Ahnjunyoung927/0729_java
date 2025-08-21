package com.kh.chap01.model.vo;

public class Child1 extends Parent {
	
	// 필드부
	// int x, int y는 부모클래스에 있음
	private int z;
	
	// 생성자부
	public Child1() {}
	public Child1(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	
	// 메소드부
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	public void printChild1() {
		System.out.println("난 첫째 자식클래스 Child1");
	}
	
	@Override
	public void print() {
		System.out.println("첫째 클래스");
	}
	
	
	
}