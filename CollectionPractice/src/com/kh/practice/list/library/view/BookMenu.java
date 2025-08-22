package com.kh.practice.list.library.view;

import java.util.List;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("==Welcome KH Libary==");
			System.out.println();
			System.out.println("**** 메인 메뉴 ****");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 명 오름차순 정렬");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			try {
				int menuNo = sc.nextInt();
				sc.nextLine();
				switch(menuNo) {
				case 1 : insertBook(); break;
				case 2 : selectList(); break;
				case 3 : searchBook(); break;
				case 4 : deleteBook(); break;
				case 5 : break;
				case 9 : System.out.println("프로그램을 종료합니다."); return;
				default : System.out.println("잘못 입력하였습니다. 다시 입력해주세요."); continue;
				} 
			}catch(Exception e) {
				System.out.println("정수만 입력해주세요");
				sc.nextLine();
			}
		}
	}
	
	
	public void insertBook() {
		
		
		System.out.println("==== 새 도서 추가 ====");
		System.out.println("책 정보를 입력해주세요.");
		System.out.print("도서 명 : ");
		String book = sc.nextLine();
		System.out.print("저자 명 : ");
		String author = sc.nextLine();
		String category = null;
		
		while(true) {
			try{
				System.out.print("장르(1.인문 / 2.과학 / 3. 외국어 / 4. 기타) : ");
				int categoryNum = sc.nextInt();
				sc.nextLine();
				if(categoryNum == 1) {
					category = "인문"; break;
				} else if(categoryNum == 2) {
					category = "과학"; break;
				} else if(categoryNum == 3) {
					category = "외국어"; break;
				} else if(categoryNum == 4) {
					category = "기타"; break;
				} else {
					System.out.println("잘못된 번호입니다. 제시된 4가지 번호중 선택해주세요.");
				}
			} catch(Exception e) {
				System.out.println("정수만 입력해주세요");
				continue;
			} 
		}
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		bc.insertBook(new Book(book, author, category, price));
		
		
	}
	
	public void selectList() {
		List<Book> list = bc.selectList();
		if(list.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
		} else {
			for(int i = 0; i < list.size(); i++) {
				System.out.println("(도서명 : " + list.get(i).getTitle()
						         + " / 저자 : " + list.get(i).getAuthor()
						         + " / 장르 : " + list.get(i).getCategory()
						         + " / 가격 : " + list.get(i).getPrice() + ")");
			}
		}
	}
	
	public void searchBook() {
		System.out.println("================");
		System.out.print("검색 키워드 : ");
		String keyword = sc.nextLine();
		
		List<Book> result = bc.searchBook(keyword);
		
		if(result.isEmpty()) {
			System.out.println("검색결과가 없습니다.");
		} else {
			for(int i = 0; i < result.size(); i++) {
				System.out.println("(도서명 : " + result.get(i).getTitle()
						        + " / 저자 : " + result.get(i).getAuthor()
				                + " / 장르 : " + result.get(i).getCategory()
				                + " / 가격 : " + result.get(i).getPrice() + ")");
			}
		}
	}
	
	public void deleteBook() {
		System.out.println("==== 도서 삭제 ====");
		System.out.print("삭제할 도서 명 : ");
		String book = sc.nextLine();
		System.out.print("삭제할 저자 명 : ");
		String author = sc.nextLine();
		
		Book remove = bc.deleteBook(book, author);
		
		if(remove != null){
			System.out.println("성공적으로 삭제되었습니다.");
		} else {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		}
		
	}
	
	public int ascBook() {
		
		return 0;
	}

	
}
