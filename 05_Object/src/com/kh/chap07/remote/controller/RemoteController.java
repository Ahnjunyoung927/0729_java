package com.kh.chap07.remote.controller;

import com.kh.chap07.remote.model.vo.Television;

// 데이터(VO)와 화면(View)의 중간다리 역할
public class RemoteController {

	private Television tv = new Television();
	private int channelNo; // = 0; int형 필드의 기본값은 0이라 생략 가능

	public int getChannelNo() {
		return channelNo;
	}

	public int powerOn() {
		if (!tv.isOn()) {
			tv.setOn(true);
			return 1;
		}
		return 0;
	}

	public String channelUp() {
		if (tv.isOn()) {
			// Television의 getter메소드를 호출해서 값 받아오기
			String[] channel = tv.getChannel();
			if (channelNo < (channel.length - 1)) {
				return channel[++channelNo];
			}
			channelNo = 0;
			return channel[0];
		} else {
			return null;
		}

	}
}
