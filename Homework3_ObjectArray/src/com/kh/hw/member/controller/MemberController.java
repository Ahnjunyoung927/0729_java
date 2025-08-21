package com.kh.hw.member.controller;

import java.util.Scanner;

import com.kh.hw.member.model.vo.Member;

public class MemberController {

	private Member[] m = new Member[SIZE];
	public static final int SIZE = 10;
	
	//static 블럭
	//정적초기화 - 가장 먼저 실행
	static{
		
	}
	
	{ // 초기화블럭=> 아래 어떤 생성자로 호출하던 모두 적용됨 - 2번째로 실행
	m[0] = new Member("admin", "관리자", "ad1234", "admin@kh.com", 'M', 100);
	}
	
	public MemberController() {
		// 3번째로 실행
	}

	public Member[] getM() {
		return m;
	}
	
	
	
	public int existMemberNum() {
		int count = 0;
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null) {
				count++;
			}
		}
		return count;
	}

	public boolean checkId(String inputId) {

		for(int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].getId().equals(inputId)) {
				return true;
			}
		}
		return false;
	}

	public void insertMember(String id, String name, String password, 
			                 String email, char gender, int age) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] == null) {
				 m[i] = new Member(id, name, password, email, gender, age);
				break;
			}
		}
	}
	

	public Member searchId(String id) {
		
		for(int i = 0 ; i < m.length; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
				// 아이디 똑같은거 있어요~
				return m[i];
			}
		}
		return null;
	}

	public Member[] searchName(String name) {
		int count = existMemberNum();
		Member[] members = new Member[count];
		int index = 0;
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getName().equals(name)) {
				members[index++] = m[i];
			}
		}
		return members;
	}

	public Member[] searchEmail(String email) {
		return null;
	}
	
	
	
	public void updateMember() {
		
		return ;
	}
	
	public boolean updatePassword(String userId, String userPwd, String newPwd) {
		// 전달받은 3개의 값을 가지고
		// 비밀번호를 바꿔주거나 바꿔주지 않거나
		
		for(int i = 0; i < m.length; i++) {
		if(m[i] != null && 
		   m[i].getId().equals(userId) && 
		   m[i].getPassword().equals(userPwd)) {
			m[i].setPassword(newPwd);
			return true;
			}
		}
		return false;
	}

	public boolean updateEmail(String id, String email) {
		boolean result = false;
		for(int p = 0; p < m.length; p++) {
			if(!(m[p] == null) && (m[p].getId()).equals(id)) {
				m[p].setEmail(email);
				result = true;
				break;
			} 
		}
		return result;
	}

	public int deleteMember (String userId, String userPwd) {
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getId().equals(userId) 
					&& m[i].getPassword().equals(userPwd)) {
				m[i] = null;
				return 1;
			}
		}
		return 0;
	}

	

	public Member[] printAll() {

		return m;
	}

}
