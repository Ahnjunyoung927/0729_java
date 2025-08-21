package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
	
	private Student[] s = new Student[SSIZE];
	private Employee[] e = new Employee[ESIZE];
	
	public static final int SSIZE = 3;
	public static final int ESIZE = 10;
	
	public int[] personCount() {
		int count[] = new int[2];
		for(int i = 0; i < s.length; i++) {
			if(s[i] != null) {
				count[0]++;
			}	
		for(int j = 0; j < e.length; j++) {
			if(e[j] != null) {
				count[1]++;
			}
		}
	}
		return count;
	}
	
	public Student[] getStudentArray() {
		return s;
	}
	public Employee[] getEmployeeArray() {
		return e;
	}
	
	
	// 학생
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		for(int i = 0; i < s.length; i++) {
			if(s[i] == null) {
				s[i] = new Student(name, age, height, weight, grade, major);
				break;
			}
		}
	}
	
	public Student[] printStudent() {
		
		return s;
	}
	
	// 노동자
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		for(int i = 0; i < e.length; i++) {
			if(s[i] == null) {
				s[i] = new Student(name, age, height, weight, salary, dept);
				break;
			}
		}
		
	}
	
	public Employee[] printEmployee() {
		return e;
	}
	

}
