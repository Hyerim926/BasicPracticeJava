package _0724.inheritance;

public class Customer {

	// 멤버 변수
	protected int customerID; // 고객 아이디
	protected String customerName; // 고객 이름
	protected String customerGrade; // 고객 등급
	int bonusPoint; // 보너스 포인트
	double bonusRatio; // 적립 비율
	
	// 디폴트 생성자
	// 고객 한명이 새로 생성되면 customerGrade는 SILVER이고 bonusPoint는 1%로 지정
	public Customer() {
		customerGrade = "SILVER"; // 기본 등급 
		bonusRatio = 0.01; // 보너스 포인트 기본 적립 비율
	}
	// 보너스 포인트 적립, 지불 가격 계산 메서드
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; // 보너스 포인트 계산
		return price; // 제품에 대해 지불해야하는 금액을 계산해 반환
	}
	
	// 고객 정보 출력, 고객 이름과 등급, 현재 적립된 포인트 보여줌
	public String showCustomerInfo() {
		return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}
	
	// protected 예약어로 선언한 변수를 외부에서 사용할 수 있도록 get(), set() 메서드 추가
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
}
