package com.kh.plant.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.plant.model.dao.PlantDao;
import com.kh.plant.model.vo.Plant;

// Controller : 사용자가 view를 통해 요청했을 때
// 요청을 받아 처리해준 뒤 다시 처리결과를 View로 반환해줌
public class PlantController {
	// 식물저장소
	private List<Plant> plants = new ArrayList();
	private PlantDao pd = new PlantDao();
	
	// 초기화블록 > 생성자블록 호출 이전에 처리된다.
	{
		plants.add(new Plant("안시리움", "분재"));
	}
	
	// View에서 식물 추가 요청을 할 때마다 호출되는 메소드
	public void createPlant(String name, String type) {
		// 1절 => 객체 생성
		// 식물저장소에 새로운 식물을 추가
		// 필드로 가지고 있는 List의 필드로 가지고 있는 Object[]의 요소로 추가
		plants.add(new Plant(name, type));
		
		System.out.println("축하합니다.");
		System.out.println("새로운 식물이 추가되었습니다.");
	}
	
	
	// view에서 전체 식물조회 요청이 왔을때 호출되는 메소드
	public List<Plant> readAll() {
		// Plant타입의 객체들의 주소가 요소로 존재하는 Object[]을 View에게 반환
		return plants;
	}
	
	// view에서 식물삭제요청이 왔을때 호출되는 메소드
	public int deletePlant(String name, String type) {
		// 사용자가 입력한 식물이름 + 식물종류가 일치하는 필드값을 가진 Plant객체를 제거
		// case 1. 동일한 이름 및 종류를 가진 식물이 존재하지 않았다.
		// case 2. 동일한 이름 및 종류를 가진 식물이 딱 한개 존재했다.
		// case 3. 동일한 이름 및 종류를 가진 식물이 여러 개 존재했다.
		// 성공 실패 여부에 따라서 View에게 반환값을 다르게 돌려주어야 함.
		
		// 식물을 제거한 후 Plant객체를 담아서 반환
		
		// 요소가 삭제될 때 마다 정수값을 증가시키고
		// 증가된 정수만 반환
		int count = 0;
		
		for(int i = 0; i < plants.size(); i++) {
			
			if(name.equals(plants.get(i).getName()) &&
			   type.equals(plants.get(i).getType())) {
				// 요소를 제거
				plants.remove(i);
				i--; // remove할때 배열크기 자체가 줄어듦으로 그에 맞춰서 i값도 같이 줄여준다.
				count++;
			}
			
		}
		return count;
	}
	
	// view에서 식물검색 요청이 왔을 때 호출되는 메소드
	public List<Plant> findByKeyword(String keyword) {
		
		// 1. Plant[] => 배열 몇 칸짜리?
		// 2. List<Plant>
		List<Plant> searched = new ArrayList();
		
		// 식물의 이름 또는 타입에 사용자가 입력한 키워드가 포함되어있을 경우
		// 모두 가져가서 출력
		
		// 조회 => 사용자가 입력한 keyword가 포함된 Plant객체의 필드값을 확인
		// plants의 요소를 전부 다 하나하나 확인하면서 체크
		
		// 1. plants의 요소의 개수만큼 반복
		for(int i = 0; i < plants.size(); i++) {
			// 2. 요소를 변수에 대입
			Plant plant = plants.get(i);
			// 2_2. plant객체의 name필드 꼬는 type필드에
			//      사용자가 입력한 keyword가 포함되어 있다면 contains (포함여부확인)
			if(plant.getName().contains(keyword) || 
			   plant.getType().contains(keyword)) {
				searched.add(plant);
			}
		}
		return searched;
	}
	
	public boolean updatePlant(String name, String type, String newName, String newType) {
		// 요청 처리
		int count = 0;
		for(int i = 0; i < plants.size(); i++) {
			Plant p = plants.get(i);
			if(name.equals(p.getName()) && type.equals(p.getType())) {
				// 방법1
				// plants.set(i, new Plant(newName, newType));
				
				// 방법2
				p.setName(newName);
				p.setType(newType);
				return true;
			}
		}
		return false;
	}
	
	public void outputFile() {
		pd.outputFile(plants);
	}
	
	
	
	
}
