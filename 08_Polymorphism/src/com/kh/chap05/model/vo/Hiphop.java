package com.kh.chap05.model.vo;
                                  // 상속과는 다르게 다중구현을 허용
public class Hiphop extends Music implements MusicI, MakeNew {
	
	@Override
	public void play() {
		System.out.println("힙합을 재생합니다.");
	}
	

	
	
	
	
}
