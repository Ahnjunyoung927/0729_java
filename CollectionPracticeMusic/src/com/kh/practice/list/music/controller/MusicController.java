package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	private List<Music> list = new ArrayList();
	
	public int addList(Music music) {
		int result = 0;
		if(music != null) {
			list.add(music);
			result = 1;
		}
		return result;
	}
	
	public int addAtZero(Music music) {
		int result = 0;
		if(music != null) {
			list.add(0, music);
			result = 1;
		}
		return result;
	}
	
	public List<Music> printAll() {
		return list;
	}
	
	public List<Music> searchMusic(String title) {
		
		List<Music> result = new ArrayList();
		for(int i = 0; i < list.size(); i++) {
			if(title.equals(list.get(i).getTitle())) {
				result.add(list.get(i));
			}
		}
		return result;
	}
	
    public Music removeMusic(Music music) {
    	
    	Music removeMusic = new Music();
    	for(int i = 0; i < list.size(); i++) {
    		if(music.getTitle().equals(list.get(i).getTitle())
    			&& music.getSinger().equals(list.get(i).getSinger())) {
    			return removeMusic = list.get(i);
    		}
    	}
		return null;
	}
	
	public Music setMusic(String title, String singer, String newTitle, String newSinger) {
		
		Music newMusic = new Music(newTitle, newSinger);
		Music music = new Music(title, singer);
		for(int i = 0; i < list.size(); i++) {
			if(title.equals(list.get(i).getTitle())
					&& singer.equals(list.get(i).getSinger())) {
				list.set(i, newMusic);
				return music;
			}
		}
		return null;
	}
	
	public int ascTitle() {
		
		return 0;
	}
	
	public int descSinger() {
		
		return 0;
	}
	

}
