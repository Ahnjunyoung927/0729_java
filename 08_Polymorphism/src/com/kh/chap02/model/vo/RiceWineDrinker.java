package com.kh.chap02.model.vo;

public class RiceWineDrinker extends Drinker {
	
	private int age;
	
	public RiceWineDrinker() {}
	public RiceWineDrinker(int age) {
		this.age = age;
	}
	
	@Override
	public void drink() {
		System.out.println("막걸리 흔들어 마십니다.");
	}
	@Override
	public void eat() {
		System.out.println("파전을 한 입 먹습니다.");
	}
	
	
}
