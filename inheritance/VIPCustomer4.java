package _0724.inheritance;

//super() 예약어로 매개변수가 있는 상위클래스 호출받기 
public class VIPCustomer4 extends Customer3 {

	// 기존 Customer 클래스와 중복되지 않는 멤버 변수
	// VIPCustomer 클래스는 Customer클래스를 상속받음
	private int agentID; // VIP 고객 상담원 아이디
	double saleRatio; // 할인율


	public VIPCustomer4(int customerID, String customerName, int agentID) {
		super(customerID, customerName); // 상위클래스 생성자 호출
		customerGrade ="VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		System.out.println("VIPCustomer(int, String, int) 생성자 호출");
	}

	@Override // 재정의한 calcPrice() 메서드
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; // 보너스 포인트 적립
		return price - (int)(price * saleRatio); // 할인된 가격 계산해 반환
	}




	public int getAgentID() {
		return agentID;
	}
	
	public String showVIPInfo() {
		// 상위 클래스의 showCustomerInfo() 호출 후 추가 정보 값 입력해주기
		return super.showCustomerInfo() + "담당 상담원 아이디는 " + agentID + "입니다."; 
	}

}
