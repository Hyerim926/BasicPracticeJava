package _0724.inheritance;
//super() 예약어로 매개변수가 있는 상위클래스 호출받기 
public class VIPCustomer3 extends Customer3 {

	// 기존 Customer 클래스와 중복되지 않는 멤버 변수
	// VIPCustomer 클래스는 Customer클래스를 상속받음
	private int agentID; // VIP 고객 상담원 아이디
	double saleRatio; // 할인율

	
//	public VIPCustomer3(int customerID, String customerName, int agentID) {
//		// 오류 발생하므로 하위 클래스에서도 동일하게 매개변수를 추가해줌
//		super(int ); // 컴파일러가 자동으로 추가하는 코드, 상위 클래스의 Customer()가 호출됨
//		customerGrade = "VIP"; // 상위 클래스에서 private변수이므로 오류 발생
//		bonusRatio = 0.05; // 상속 받음
//		saleRatio = 0.1; // 상속 받음
//		System.out.println("VIPCustomer() 생성자 호출"); // 하위 클래스 생성 시 콘솔 출력문
//	}

	public VIPCustomer3(int customerID, String customerName, int agentID) {
		super(customerID, customerName); // 상위클래스 생성자 호출
		customerGrade ="VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		System.out.println("VIPCustomer(int, String, int) 생성자 호출");
	}


	public int getAgentID() {
		return agentID;
	}
	
	public String showVIPInfo() {
		// 상위 클래스의 showCustomerInfo() 호출 후 추가 정보 값 입력해주기
		return super.showCustomerInfo() + "담당 상담원 아이디는 " + agentID + "입니다."; 
	}

}
