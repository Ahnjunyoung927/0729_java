package com.kh.chap06.run;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 랜덤으로 정수 생성 후 사용자에게 두수의 합 물어본뒤 맞는지
		
		int cnt1 = 0;
		int cnt2 = 0;
		int quizCount = 1;
		
		while(true) {
			System.out.println("더하기 퀴즈(그만하고 싶으면 그만하고싶어요 를 입력하세요)");
			System.out.print("난이도를 선택해주세요(상/중/하) : ");
			String level = sc.nextLine();
			
			int bound = 0;
			
			if(level.equals("상")) {
				System.out.println("난이도 (상)을 선택하셨습니다. 1 ~ 3000 사이의 범위로 출제됩니다.");
				bound = 3000;
			} else if(level.equals("중")) {
				System.out.println("난이도 (중)을 선택하셨습니다. 1 ~ 200 사이의 범위로 출제됩니다.");
				bound = 200;
			} else if(level.equals("하")) {
				System.out.println("난이도 (하)를 선택하셨습니다. 1 ~ 10 사이의 범위로 출제됩니다.");
				bound = 10;
			} else if(level.equals("그만하고 싶어요")) {
				System.out.println("안녕히가세요.");
				break;
			} else {
				System.out.println("존재하지 안는 난이도 입니다.");
				System.out.println("처음부터 다시 선택해주세요.");
				continue;
			}
			
			int firstNumber = (int)(Math.random() * bound) + 1;
			int secondNumber = (int)(Math.random() * bound) + 1;
			
			System.out.println(quizCount + "번 문제 ★");
			System.out.println(firstNumber + " + " + secondNumber + " = ?");
			System.out.print("정답을 입력해주세요 > ");
			int answer = sc.nextInt();
			sc.nextLine();
			
			if(answer == (firstNumber + secondNumber)) {
				System.out.println("정답입니다.");
				cnt1++;
			} else {
				System.out.println("오답입니다.");
				cnt2++;
			}
			
			quizCount++;
			
			System.out.println("정답 횟수 : " + cnt1 + "번 / 오답횟수 : " + cnt2 + "번");
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
	}

}
