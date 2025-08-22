package com.kh.practice.list.music.view;

import java.util.List;
import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {
	
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("====***** 메인메뉴 *****====");
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 출력");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 수정");
			System.out.println("7. 곡 명 오름차순 정렬");
			System.out.println("8. 가수 명 내림차순 정렬");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 입력 : ");
			int menuNo;
			try {
				menuNo = sc.nextInt();
				sc.nextLine();
			} catch(Exception e) {
				System.out.println("올바른 번호를 입력해주세요.");
				sc.nextLine();
				continue;
			}
			
			switch(menuNo) {
			case 1 : addList(); break;
			case 2 : addAtZero(); break;
			case 3 : printAll(); break;
			case 4 : searchMusic(); break;
			case 5 : removeMusic(); break;
			case 6 : setMusic(); break;
			case 7 : break;
			case 8 : break;
			case 9 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("올바른 번호를 입력해주세요."); continue;
			}
			
			
			
			
			
		}
		
		
		
		
	}
	
	public void addList() {
		System.out.println("****** 마지막 위치에 곡 추가 ******");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();
		
		Music music = new Music(title, singer);
		
		int result = mc.addList(music);
		
		if(result == 1) {
			System.out.println("추가 성공");
		} else { 
			System.out.println("추가 실패");
		}
	}
	
	public void addAtZero() {
		System.out.println("****** 첫 위치에 곡 추가 ******");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();
		
		Music music = new Music(title, singer);
		
		int result = mc.addAtZero(music);
		
		if(result == 1) {
			System.out.println("추가 성공");
		} else { 
			System.out.println("추가 실패");
		}
		
	}
	
	public void printAll() {
		System.out.println("****** 전체 곡 목록 출력 ******");
		
		List<Music> list = mc.printAll();
		
		if(list != null) {
			System.out.print("[");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getSinger() + " - " 
							+ list.get(i).getTitle());
			if(i < list.size() - 1) {
				System.out.print(", ");
			}
		}
			System.out.println("]");
		}
	}
	
	public void searchMusic() {
		System.out.println("****** 특정 곡 검색 ******");
		System.out.print("검색할 곡 명 : ");
		String title = sc.nextLine();
		List<Music> result = mc.searchMusic(title);
		
		if(result != null) {
			System.out.println("곡 검색 결과입니다.");
			System.out.println("곡 명 : " + title);
			for(int i = 0; i < result.size(); i++) {
				System.out.println("가수명 : " + result.get(i).getSinger());
			}
		} else {
			System.out.println("검색한 곡이 없습니다.");
		}
	}
	
	public void removeMusic() {
		System.out.println("특정 곡 삭제");
		System.out.print("삭제할 곡 명 : ");
		String title = sc.nextLine();
		System.out.print("삭제할 곡의 가수명 : ");
		String singer = sc.nextLine();
		
		Music music = new Music(title, singer);
		music = mc.removeMusic(music);
		
		if(music != null) {
			System.out.println(music.getSinger() + " - " + music.getTitle() + "을(를) 삭제했습니다.");
		} else {
			System.out.println("검색한 곡이 없습니다.");
		}
	}
	
	public void setMusic() {
		System.out.println("****** 특정 곡 수정 ******");
		System.out.print("검색할 곡 명 : ");
		String title = sc.nextLine();
		System.out.print("검색할 가수 명 : ");
		String singer = sc.nextLine();
		System.out.println();
		System.out.print("수정할 곡 명 : ");
		String newTitle = sc.nextLine();
		System.out.print("수정할 가수 명 : ");
		String newSinger = sc.nextLine();
		
		Music music = mc.setMusic(title, singer, newTitle, newSinger);
		
		if(music != null) {
			System.out.println(singer + " - " + title + "이(가) " 
					      + newSinger + " - " + newTitle + "(으)로 변경되었습니다.");
		} else {
			System.out.println("검색한 곡이 존재하지 않습니다.");
		}
		
	}
	
	public void ascTitle () {
		
	}
	
	public void descSinger() {
		
	}
	
}
