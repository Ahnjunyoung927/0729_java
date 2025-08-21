package com.kh.idol.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.kh.idol.model.Idol;
import com.kh.idol.model.vo.Board;
import com.kh.idol.model.vo.Fan;

public class IdolController {
	
	private List<Fan> fans = new ArrayList();
	private List<Board> boards = new ArrayList();
	private List<Idol> aespa = new ArrayList();
	private int boardNo;
	
	{ // 초기화블럭 미리 정보 담아두기
		aespa.add(new Idol("카리나", "리더", "로켓펀처"));
		aespa.add(new Idol("지젤", "외국인1", "xenoglossy"));
		aespa.add(new Idol("원터", "행동대장", "Armamenter"));
		aespa.add(new Idol("닝닝", "외국인2", "E.D Hacker"));
	}
	
	public Idol findMember(int memberNo) {
		return aespa.get(memberNo - 1);
	}
	
	public List<Idol> findAll() {
		return aespa;
	}
	
	
	// 사용자가 아이디를 입력했을 때 1.입력한 아이디가
	// 2.fan들이 들어가는 List의 요소의 userId필드값과 중복되는 게 있는지
	// 확인을 한뒤에 결과를 View로 다시 반환
	public boolean checkId(String userId) {
		// 1. userId
		// 2. fans
		// 3. fans.get(i).getUserId()
		// 4. equals()
		
		for(int i = 0; i < fans.size(); i++) {
			if(userId.equals(fans.get(i).getUserId())) {
				return true;
			}
		}
		return false;
	}
	
	// 사용자가 입력한 아이디, 비밀번호, 닉네임을 View로부터 전달받아
	// 새로운 Fan이라는 객체를 생성하면서 필드에 값을 대입해주고
	// 생성된 Fan객체의 주소값을 내가 가지고 있는 Fan들이 들어가는 List의 요소로
	// 추가를 해주는 메소드를 구현해야함
	public boolean signUp(String userId, String userPwd, String nickName) {
		// 1. 데이터 가공
		Fan fan = new Fan(userId, userPwd, nickName);
		
		// 2. 요청 처리(아직 요청 처리하는 계층을 안배웠으므로 컨트롤러에서 처리)
		boolean result = checkId(userId);
		
		if(!result) {
			fans.add(fan);
		}
		// 3. 결과값 반환
		return result;
	}
	
	
	// 사용자가 로그인 요청시 호출되는 메소드
	public Fan login(String userId, String userPwd) {
		// Fan의 정보를 필드에 저장하는 Fan객체들의 주소를 가지고 있는
		// fans라는 리스트의 요소에 하나하나 접근해서
		// Fan객체의 userId필드 및 userPwd필드를
		// 사용자가 입력한 userId + userPwd 값과 각각 비교하여
		// 둘 다 일치하는 Fan객체가 존재한다면 사용자의 정보가 담겨있는 Fan을 반환
		for(int i = 0; i < fans.size(); i++) {
			// 반복하면서 순차적으로 접근할 요소 객체를 변수로 선언
			Fan fan = fans.get(i);
			
			if(userId.equals(fan.getUserId()) && 
			   userPwd.equals(fan.getUsedrPwd())) {
				// 사용자가 입력한 아이디, 비밀번호와 일치하는 Fan객체가 존재함
				return fan;
			}
		}
		return null;
	}
	
	// 로그인에 성공한 사용자가 게시글 작성 요청을 할 때 마다 호출이 되는 메소드
	public void post(String boardTitle, String boardContent, String UserId) {
		// 기존 BoardNo보다 1증가 시킨 값
		// 사용자가 입력한 게시글 제목, 내용 값과
		// 현재 로그인된 사용자의 아이디 값과
		// 현재 게시글 작성 요청이 들어온 시간 값을 가지고
		// Board객체를 만들어서 Board타입들이 들어가는 List의 요소로 추가
		
		// 1. 데이터 가공
		Board board = new Board();
		board.setBoardTitle(boardTitle);
		board.setBoardContent(boardContent);
		board.setUserId(UserId);
		board.setBoardNo(++boardNo);
		String createDate = 
		new SimpleDateFormat("yyyy년 MM월 dd일").format(new Date());
		board.setCreateDate(createDate);
		
		// 2. 요청처리
		boards.add(board);
	}
	
	public List<Board> selectBoardList() {
		// View의 요청에 의해 호출되며
		// 게시글 목록이 담겨있는 것을 되돌려주어야함
		return boards;
	}
	
	
}
