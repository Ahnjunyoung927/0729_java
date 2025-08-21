package com.kh.chap02.encapsulation.model.vo;

// 필드부, 생성자부, 메소드부
public class Cafe {
	
	// 필드부(Field)
	/*
	 * 객체가 가질 수 있는 속성
	 * 
	 * 정보(Data)를 담는 부분
	 * 
	 * 필드 == 멤버변수
	 * 
	 * 접근제한자 자료형 필드식별자;
	 * 
	 */
	private String name;
	private String address;
	// private String signaturemenu;
	private int signatureMenuPrice;
	
	// 생성자(Constructor)부
	// 메소드(Method)부
	/*
	 * 기능(method)를 구현하는 부분
	 * 필드부값과 관련된 메소드가 들어가야함
	 * 
	 * 접근제한자 (예약어) 반환형 메소드식별자(매개변수) {
	 *     메소드 호출시 실행할 코드;
	 * }
	 * 
	 * 접근제한자 : 호출할수 있는 범위를 제한할 수 있음
	 * 반환형 : void => return할때 돌려줄 값이 없음
	 *           반환이 필요하다면, 반환 시 결과값의 자료형을 명시해준다.
	 * 매개변수 : 메소드 호출 시 전달 값을 받아주는 변수
	 *         메소드 범위에서만 사용 가능. 생략 가능
	 */
	
	public void open() {
		dishWash();
		cleaning();
		windowCleaning();
	}
	
	private void dishWash() {
		System.out.println("깨끗하게 빡빡");
	}
	
	private void cleaning() {
		System.out.println("청소도 빡빡");
	}
	
	private void windowCleaning() {
		System.out.println("유리도 빡빡");
	}
	
	// 데이터를 기록 및 수정하는 기능의 메소드 : setter()
	/*
	 * DTO -> setter를 만들어줌
	 * VO  -> 일반적으로 setter메소드를 구현하지 않음
	 * 
	 * DTO는 2달뒤에 학습예정 / 그전까지만 VO클래스에 setter를 구현해서 사용
	 * 
	 * setter 만들기 규칙
	 * 
	 * 1. setter메소드는 외부에서 접근이 가능해야하기 때문에 접근제한자를 public 사용
	 * 2. set필드명으로 식별자를 작성하며 낙타봉표기법(camelCase)을 꼭 지킨다.
	 * 
	 * 3. (예외상황)우리는 당분간 항상 모든 필드에 대해서 setter를 구현한다.
	 * 
	 */
	
	// 고유메뉴의 가격정보를 기록 및 수정할 수 있는 메소드
	// signatureMenuPrice
	                                  //매개변수(parameter)
	public void setSignatureMenuPrice(int signatureMenuPrice) {
		// System.out.println("setter에서 전달 받은 정수값 : " + signatureMenuPrice);
		
		// signatureMenuPrice = signatureMenuPrice;
		// Scope안에서는 해당 영역안에 있는 지역변수에 대한 우선권이 있음
		// this => 해당객체의 heap메모리 주소를 가리키는 역할
		// System.out.println("내주소는 ? " + this);
		if(signatureMenuPrice <= 1000) {
			System.out.println("정상적이지 않은 값을 입력하셨습니다. 1000이상의 정수를 입력하세요.");
		} else {
			this.signatureMenuPrice = signatureMenuPrice;
		}
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	/*
	 * 두개이상의 필드값을 한번에 변경하는 메소드는 set이 붙으면 안된다
	 * public void changeNameAndAddress(String name, String address0{
	 *    setName(name);
	 *    setAddress(address);
	 * }
	 */
	
	// 이렇게 입력한 private으로 숨김처리된 필드값을 가져오려면?
			// getter : 데이터를 반환해주는 기능의 메소드
			
			/*
			 * 1. getter()는 접근제한자 public을 사용한다
			 * 2. get+필드명으로 짓되, 낙타봉 표기법(camelCase)를 사용한다.
			 * 3. 모든 필드에 대해서 반드시 무조건 꼭 다 절대로 만들어준다.
			 */
			
			// 메소드를 호출한 곳으로 name필드값을 돌려주고 싶음
	
	// 이름을 반환해주는 메소드
	public String getName() {
		return name;
	}
	
	// 주소지를 반환해주는 메소드
	public String getAddress() {
		return address;
		// return value;
		// value를 메소드 호출 부분으로 반환하겠다.
		// 메소드의 반환형과 반환하고자 하는 값의 자료형이 일치하는가를 꼭 잘 확인해야함
	}
	
	public int getSignatureMenuPrice() {
		return signatureMenuPrice;
	}
	
	// getter() setter() => 캡슐화 (문법적 관례)
			/*
			 * 1. 값을 숨긴다 => 필드의 접근제한자를 public대신 private으로 선언한다.
			 * 2. 메소드를 통해 필드에 접근할 수 있도록 만들어준다 => gettet() / setter() 구현
			 * 
			 * 
			 * 장점. 데이터를 숨김 -> 객체간의 결합도를 낮춤 -> 책임을 분리시킨다.
			 */
			
			// 모든 필드 값을 확인할 수 있도록 반환해주는 메소드
	
	public String info() {
		// return 할 때 반환할 수 있는 값은 단 한개
		String info = "[name 필드값 : " + name + ", address 필드값 : " + address
				      + ", signatureMenuPrice : " + signatureMenuPrice + " ]";
		return info;
	}
	
	
	

	
	
}
