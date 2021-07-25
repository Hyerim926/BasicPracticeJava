package _0724.inheritance;

public class CustomerTest2 {
	public static void main(String[] args) {
		
		VIPCustomer2 customerKim = new VIPCustomer2();
		// customerID와 customerName은 protected 변수이므로 set()메서드로 호출
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
	}

}
/*Customer() 생성자 호출 - 상속받은 상위 클래스의 생성자 먼저 호출
VIPCustomer() 생성자 호출
김유신 님의 등급은 VIP이며, 보너스 포인트는 10000입니다.
*/