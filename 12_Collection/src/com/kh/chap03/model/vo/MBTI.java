package com.kh.chap03.model.vo;

import java.util.Objects;

public class MBTI {

	private String introExtro;
	private String sensingIntuition;
	private String thinkFeel;
	private String judgePerceive;
	
	public MBTI(String introExtro, String sensingIntuition, String thinkFeel, String judgePerceive) {
		super();
		this.introExtro = introExtro;
		this.sensingIntuition = sensingIntuition;
		this.thinkFeel = thinkFeel;
		this.judgePerceive = judgePerceive;
	}
	
	public MBTI() {
		super();
	}
	public String getIntroExtro() {
		return introExtro;
	}
	public void setIntroExtro(String introExtro) {
		this.introExtro = introExtro;
	}
	public String getSensingIntuition() {
		return sensingIntuition;
	}
	public void setSensingIntuition(String sensingIntuition) {
		this.sensingIntuition = sensingIntuition;
	}
	public String getThinkFeel() {
		return thinkFeel;
	}
	public void setThinkFeel(String thinkFeel) {
		this.thinkFeel = thinkFeel;
	}
	public String getJudgePerceive() {
		return judgePerceive;
	}
	public void setJudgePerceive(String judgePerceive) {
		this.judgePerceive = judgePerceive;
	}
	
	
	// 결론적으로 우리가 해야할 일 
	// 필드의 값이 동일하다면
	// equals()와 hashCode()를 오버라이딩해서 동일한 결과값이 출력되도록 구현해야함
	// Alt + Shift + s 에 단축키로 구현되어 있음
	
	@Override
	public String toString() {
		return "MBTI [introExtro=" + introExtro + ", sensingIntuition=" + sensingIntuition + ", thinkFeel=" + thinkFeel
				+ ", judgePerceive=" + judgePerceive + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(introExtro, judgePerceive, sensingIntuition, thinkFeel);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MBTI other = (MBTI) obj;
		return Objects.equals(introExtro, other.introExtro) && Objects.equals(judgePerceive, other.judgePerceive)
				&& Objects.equals(sensingIntuition, other.sensingIntuition)
				&& Objects.equals(thinkFeel, other.thinkFeel);
	}
	
	/*
	@Override
	public boolean equals(Object obj) {
		MBTI mbti = (MBTI)obj;
		// 필드값 비교
		// ei, sn, tf, jp 넷 중 하나라도 다르면 false를 반환
		// 내필드랑 매개변수로 받아온 필드를 비교
		if(!this.introExtro.equals(mbti.introExtro) ||
		   !this.sensingIntuition.equals(mbti.sensingIntuition) ||
		   !this.thinkFeel.equals(mbti.thinkFeel) ||
		   !this.judgePerceive.equals(mbti.judgePerceive)) {
			return false;
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		// 객체를 가지고 알아서 10진수로 만들어서 반환
		// 필드값이 똑같으면 똑같은 해시코드 나오게 하고 싶다.
		
		return (introExtro + sensingIntuition + thinkFeel + judgePerceive).hashCode();
		// String 클래스에 hashCode()가 오버라이딩 되어 있으므로 이용할 수 있다.
	}
	*/
	
	
}
