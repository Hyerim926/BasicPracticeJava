package _0724.inheritance;

public class CustomerTest1 {
	public static void main(String[] args) {
		Customer customerLee = new Customer();
		// customerID와 customerName은 protected 변수이므로 set()메서드로 호출
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer();
		// customerID와 customerName은 protected 변수이므로 set()메서드로 호출
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
	}

}
