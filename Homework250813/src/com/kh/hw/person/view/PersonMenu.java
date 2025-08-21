package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonMenu {
	
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
	
	public void mainMenu() {
		
		int[] count = pc.personCount();
		
		while(true) {
		System.out.println("학생은 최대 " + pc.SSIZE + "명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 학생은 " + count[0] +"명입니다.");
		System.out.println("사원은 최대 " + pc.ESIZE + "명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 사원은 " + count[1] + "명입니다.");
		System.out.println("=====================================");
		System.out.println("1. 학생 메뉴");
		System.out.println("2. 사원 메뉴");
		System.out.println("9. 끝내기");
		System.out.print("메뉴 번호 : ");
		
		int menuNo = 0;
		try {
		menuNo = sc.nextInt();
		sc.nextLine();
		} catch (RuntimeException e) {
			System.out.println("잘못된 입력값입니다. 다시 입력해주세요");
			continue;
		}
		
		switch(menuNo) {
		case 1 : studentMenu(); break;
		case 2 : employeeMenu(); break;
		case 9 : System.out.println("종료합니다."); return;
		default : break;
		}
		
		
		}
		
	}
	
	public void studentMenu() {
		int[] count = pc.personCount();
		
		while(true) {
		System.out.println("=======================");
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 보기");
		System.out.println("9. 메인으로 돌아갑니다.");
		System.out.print("메뉴 번호 : ");
		
		int menuNo = 0;
		try {
		menuNo = sc.nextInt();
		sc.nextLine();
		} catch (RuntimeException e) {
			System.out.println("잘못된 입력값입니다. 다시 입력해주세요");
			continue;
		} finally {
			// try 예외발생 여부와 상관없이 무조건 한번 실행되는 코드
		}
		
		int j = 0;
		
		switch(menuNo) {
		case 1 : if(count[0] == pc.SSIZE && j == 0) {
			System.out.println("현재 학생저장 공간이 가득 차 학생추가 메뉴는 더 이상 활성화 되지 않습니다.");
			j++; break;
		} else if(count[0] == pc.SSIZE && j > 0) {
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); break;
		} insertStudent(); break;
		case 2 : printStudent(); break;
		case 9 : System.out.println("메인으로 돌아갑니다."); return;
		}
		
		}
	}
	
	public void employeeMenu() {
		int[] count = pc.personCount();
		
		while(true) {
		System.out.println("=======================");
		System.out.println("1. 사원 추가");
		System.out.println("2. 사원 보기");
		System.out.println("9. 메인으로 돌아갑니다.");
		System.out.print("메뉴 번호 : ");
		
		int menuNo = 0;
		try {
		menuNo = sc.nextInt();
		sc.nextLine();
		} catch (RuntimeException e) {
			System.out.println("잘못된 입력값입니다. 다시 입력해주세요");
			continue;
		}
		
		int j = 0;
		
		switch(menuNo) {
		case 1 : if(count[1] == pc.ESIZE && j == 0) {
			System.out.println("현재 사원저장 공간이 가득 차 사원추가 메뉴는 더 이상 활성화 되지 않습니다.");
			j++; break;
		} else if(count[1] == pc.ESIZE && j > 0) {
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); break;
		} insertEmployee(); break;
		case 2 : printEmployee(); break;
		case 9 : System.out.println("메인으로 돌아갑니다."); return;
		}
		
		}
		
		
		
		
	}
	
	public void insertStudent() {
		int[] count = pc.personCount();
		
		boolean result = true;
		while(result) {
			
		System.out.print("학생 이름 : ");
		String name = sc.nextLine();
		System.out.print("학생 나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("학생 키 : ");
		double height = sc.nextDouble();
		sc.nextLine();
		System.out.print("학생 몸무게 : ");
		double weight = sc.nextDouble();
		sc.nextLine();
		System.out.print("학생 학년 : ");
		int grade = sc.nextInt();
		sc.nextLine();
		System.out.print("학생 전공 : ");
		String major = sc.nextLine();
		
		if(count[0] == pc.SSIZE) {
			System.out.println("현재 학생저장 공간이 가득 차 학생추가를 종료하고 학생메뉴로 돌아갑니다.");
			return;
		} 
		if (count[0] < pc.SSIZE) {
			System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요. : ");
			String anyKey = sc.nextLine();
			if(anyKey.equals("n") || anyKey.equals("N")) {
				continue;
			} 
		}
		pc.insertStudent(name, age, height, weight, grade, major);
		return;
		}
		
	}
	
	public void printStudent() {
		Student[] students = pc.getStudentArray();
		
		int[] count = pc.personCount();
		
		
		System.out.println("등록된 학생 정보입니다.");
		System.out.println("등록된 총 학생 수는 " + count[0] + "명 입니다.");
		if(count[0] > 0) {
			for(int i = 0; i < count[0]; i++ ) {
				System.out.println("학생 이름 : " + students[i].getName());
				System.out.println("학생 나이 : " + students[i].getAge());
				System.out.println("학생 키 : " + students[i].getHeight());
				System.out.println("학생 몸무게 : " + students[i].getWeight());
				System.out.println("학생 학년 : " + students[i].getGrade());
				System.out.println("학생 전공 : " + students[i].getMajor());
			}
		}
	}
	
	public void insertEmployee() {
		int[] count = pc.personCount();
		
		boolean result = true;
		while(result) {
			
		System.out.print("사원 이름 : ");
		String name = sc.nextLine();
		System.out.print("사원 나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("사원 키 : ");
		double height = sc.nextDouble();
		sc.nextLine();
		System.out.print("사원 몸무게 : ");
		double weight = sc.nextDouble();
		sc.nextLine();
		System.out.print("사원 월급 : ");
		int salary = sc.nextInt();
		sc.nextLine();
		System.out.print("사원 직급 : ");
		String dept = sc.nextLine();
		
		if(count[0] == pc.ESIZE) {
			System.out.println("현재 사원저장 공간이 가득 차 사원추가를 종료하고 학생메뉴로 돌아갑니다.");
			return;
		} 
		if (count[0] < pc.ESIZE) {
			System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요. : ");
			String anyKey = sc.nextLine();
			if(anyKey.equals("n") || anyKey.equals("N")) {
				continue;
			} 
		}
		pc.insertStudent(name, age, height, weight, salary, dept);
		return;
		}
		
	}
	
	public void printEmployee() {
		Employee[] employees = pc.getEmployeeArray();
		
		int[] count = pc.personCount();

		
		System.out.println("등록된 사원 정보입니다.");
		System.out.println("등록된 총 사원 수는 " + count[1] + "명 입니다.");
		if(count[0] > 0) {
			for(int i = 0; i < count[1]; i++ ) {
				System.out.println("사원 이름 : " + employees[i].getName());
				System.out.println("사원 나이 : " + employees[i].getAge());
				System.out.println("사원 키 : " + employees[i].getHeight());
				System.out.println("사원 몸무게 : " + employees[i].getWeight());
				System.out.println("사원 학년 : " + employees[i].getSalary());
				System.out.println("사원 전공 : " + employees[i].getDept());
			}
		}
	}

}
