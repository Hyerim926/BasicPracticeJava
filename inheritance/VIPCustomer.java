package _0724.inheritance;

public class VIPCustomer extends Customer {

	// 기존 Customer 클래스와 중복되지 않는 멤버 변수
	// VIPCustomer 클래스는 Customer클래스를 상속받음
	private int agentID; // VIP 고객 상담원 아이디
	double saleRatio; // 할인율

	public VIPCustomer() {
		customerGrade = "VIP"; // 상위 클래스에서 private변수이므로 오류 발생
		bonusRatio = 0.05; // 상속 받음
		saleRatio = 0.1; // 상속 받음
	}

	public int getAgentID() {
		return agentID;
	}

}
