package com.kh.plant.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.plant.controller.PlantController;
import com.kh.plant.model.vo.Plant;

// View : 시각적인 부분 담당, 화면 입/출력
public class PlantView {
	private Scanner sc = new Scanner(System.in);
	private PlantController pc = new PlantController();
	// 상속이 아닌 합성을 이용한 것
	
	// 프로그램 실행 시 보여줄 화면을 출력해주는 기능
	public void mainMemu() {
		// 저장소 : ArrayList
		while(true) {
			System.out.println();
			System.out.println("식물 관리 프로그램입니다.");
			// 식물 CRUD 하기
			// Create : 사용자에게 입력받은 값을 가지고 새로운 식물을 추가하는 작업
			// Read   : 만들어진 식물을 조회하는 작업
			// Update : 기존의 식물을 수정하는 작업
			// Delete : 기존의 식물을 삭제하는 작업
			System.out.println("1. 식물 추가하기");
			System.out.println("2. 식물 전체조회");
			System.out.println("3. 특정 식물 검색");
			System.out.println("4. 특정 식물 삭제");
			System.out.println("5. 특정 식물 수정");
			System.out.println("6. 식물 목록을 파일로 저장");
			System.out.println("0. 프로그램 종료");
			System.out.println();
			
			System.out.print("어떤 기능을 이용하시겠어요 > ");
			try {
				int menuNo = sc.nextInt();
				sc.nextLine();
				
				switch(menuNo) {
				case 1 : createPlant(); break;
				case 2 : readAll(); break;
				case 3 : findByKeyword(); break;
				case 4 : deletePlant(); break;
				case 5 : updatePlant(); break;
				case 6 : pc.outputFile(); break;
				case 0 : System.out.println("프로그램을 종료합니다."); return;
				default : System.out.println("없는 메뉴입니다. 다시 선택해주세요");
				}
			} catch(InputMismatchException e) {
				System.out.println("숫자만 입력해주세요");
				sc.nextLine();
			}
		}
	}
	
	// 1. 새롭게 식물을 추가할 수 있는 화면을 보여주는 메소드
	private void createPlant() {
		
		System.out.println("\n식물추가 서비스입니다.");
		System.out.print("식물명을 입력해주세요 : ");
		String name = sc.nextLine();
		System.out.print("종류를 입력해주세요 : ");
		String type = sc.nextLine();
		
		// 식물 VO클래스에 대입할 값 두개를 입력받았음
		// View는 일단 할 일이 끝남
		
		// 사용자가 입력한 식물명이랑 종류를 가지고 식물목록에 추가해줘 => 요청
		pc.createPlant(name, type);
	}
	
	// 2. 전체 식물 목록을 출력해주는 기능
	private void readAll() {
		System.out.println();
		System.out.println("전체 식물 목록입니다.");
		pc.readAll();
		List<Plant> plants = pc.readAll();
		// 경우의 수
		// case 1. 값이 없을 경우
		// case 2. 값이 하나일 경우
		// case 3. 값이 여러개일 경우
		
		// List의 요소가 하나도 존재하지 않을 경우
		if(plants.isEmpty()) { // plants.size() == 0 과 같은 조건
			System.out.println("식물이 존재하지 않습니다.");
			System.out.println("새로운 식물을 추가해보세요.");
		} else {
			// 최소한 하나라도 있을 경우
			for(Plant p : plants) {
				System.out.println("식물이름 : " + p.getName() + ", 식물종 : " + p.getType());
			}
		}
	}
	
	// 3. 사용자가 식물에 대한 키워드를 입력할 수 있는 화면을 출력해주는 기능
	private void findByKeyword() {
		System.out.println();
		// 1. 사용자가 입력한 키워드가 이름에 포함되어 있다면 출력
		// 2. 사용자가 입력한 키워드가 타입에 포합되어 있다면 출력
		// 3. 사용자가 입력한 키워드가 이름 또는 타입에 포함되어 있다면 출력
		// 4. 사용자가 입력한 키워드가 제목과 타입에 둘다 포함되어 있다면 출력
		
		// 3)
		System.out.println("식물검색 서비스입니다.");
		System.out.print("검색어를 입력해주세요.");
		String keyword = sc.nextLine();
		
		
		List<Plant> searched = pc.findByKeyword(keyword);
		System.out.println();
		if(searched.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			System.out.println("검색결과가 총 " + searched.size() + "건이 존재합니다.");
			for(Plant p : searched) {
				System.out.println("================================");
				System.out.println("이름 : " + p.getName() + ", 종류 : " + p.getType());
			}
		}
		System.out.println();
	}
	
	// 4. 특정 식물을 삭제할 수 있는 화면을 출력해주는 기능
	private void deletePlant() {
		System.out.println();
		System.out.println("식물정보 삭제 서비스입니다.");
		// 삭제를 어떻게 할 것인가?
		// 1. 식물이름을 입력받아서 삭제
		// 2. 식물타입을 입력받아서 삭제
		// 3. 식물이름과 타입을 입력받아서 삭제
		// 4. 아무것도 입력안받고 전체 삭제
		
		// 3. 이름 및 타입을 입력 받아서 삭제
		// 1) 이름만 일치하면 삭제
		// 2) 타입만 일치하면 삭제
		// 3) 둘다 일치해야 삭제
		// 4) 이름 키워드가 포함되어 있으면 삭제
		// 5) 타입 키워드가 포함되어 있으면 삭제
		// 6) 이름 또는 타입에 키워드가 포함되어 있으면 삭제
		
		// 3-3) 이름하고 타입을 입력받고 둘다 일치하는 값이 있을때만 삭제
		System.out.print("식물의 이름을 입력해주세요 : ");
		String name = sc.nextLine();
		System.out.print("식물종을 입력해주세요 : ");
		String type = sc.nextLine();
		
		int count = pc.deletePlant(name, type);
		
		if(count > 0) {
			System.out.println("삭제 성공");
			System.out.println(name + "을(를) 총" + count + "개 삭제했습니다.");
		} else {
			System.out.println("삭제할 식물을 찾지 못했습니다.");
		}
		System.out.println();
	}
	
	// 5. 특정 식물의 정보를 수정할 수 있는 화면을 출력해주는 기능
	private void updatePlant() {
		System.out.println();
		// 1. 이름 -> 이름
		// 2. 타입 -> 타입
		// 3. 이름,타입 -> 이름
		// 4. 이름,타입 -> 타입
		// 5. 이름 -> 타입
		// 6. 타입 -> 이름
		// 7. 이름, 타입 -> 이름, 타입
		
		// 사용자에게 식물의 이름 및 타입을 입력받아서
		// 일치하는 식물을 찾아서
		// 새로운 식물의 이름 및 타입으로 갱신
		System.out.println("식물정보 수정 서비스입니다.");
		// 4개를 입력받아야함
		System.out.print("기존 식물 이름 : ");
		String name = sc.nextLine();
		System.out.print("기존 식물종 : ");
		String type = sc.nextLine();
		
		System.out.println("새 식물 이름 : ");
		String newName = sc.nextLine();
		System.out.println("새 식물종 : ");
		String newType = sc.nextLine();
		// 1절 끝
		
		boolean result = pc.updatePlant(name, type, newName, newType);
		if(result) {
			System.out.println("식물 정보 갱신 성공");
		} else {
			System.out.println("식물이 존재하지 않습니다.");
		}
		
		System.out.println();
	}
	
	
	
	
	
	
}
