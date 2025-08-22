package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	
	private List<Book> list = new ArrayList();

	public BookController() {
	}
	
	{
		list.add(new Book("자바의 정석", "남궁 성", "기타", 20000));
		list.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
		list.add(new Book("대화의 기술", "강보람", "인문", 17500));
		list.add(new Book("암정복기", "박신우", "의료", 20000));
	}
	
	public void insertBook(Book bk) {
		list.add(bk);
	}
	
	public List<Book> selectList() {
		return list;
	}
	
	public List<Book> searchBook(String keyword) {
		List<Book> keywordList = new ArrayList();
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().contains(keyword)) {
				keywordList.add(list.get(i));
			}
		}
		return keywordList;
	}
	
	public Book deleteBook(String title, String author) {
		/*
		List<Book> remove = new ArrayList();
		for(int i = 0; i < list.size(); i++) {
			if(title.equals(list.get(i).getTitle()) 
			 && author.equals(list.get(i).getAuthor())){
				remove.add(list.remove(i));
			}
		}
		*/
		Book remove = new Book();
		remove = null;
		for(int i = 0; i < list.size(); i++) {
			if(title.equals(list.get(i).getTitle())
				&& author.equals(list.get(i).getAuthor())) {
				remove = list.remove(i);
			}
		}
		return remove;
	}
	
	public int ascBook() {
		
		return 0;
	}
	
	
	
}
