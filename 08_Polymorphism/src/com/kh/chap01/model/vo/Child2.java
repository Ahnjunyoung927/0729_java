package com.kh.chap01.model.vo;

public class Child2 extends Parent {
	
	private int n;
	
	public Child2() {}
	public Child2(int x, int y, int n) {
		super(x, y);
		this.n = n;
	}
	
	public int getN() {
		return n;
	}
	public void serN(int n) {
		this.n = n;
	}
	
	
	public void printChild2() {
		System.out.println("나는 둘째 자식클래스 Child2");
	}
	
	@Override
	public void print() {
		System.out.println("둘째클래스");
	}

}
