package com.kh.chap05.counstructor.run;

import java.util.Scanner;

import com.kh.chap05.counstructor.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Member member = new Member();
		
		Member member2 = new Member("하히후헤호");
		
		Member member3 = new Member("user01", "1q2w3e");
		System.out.println(member3.info());
		
		Member member4 = new Member("아이디", "비밀번호", "별명");
		System.out.println(member4.info());
		
		
		
	}

}
