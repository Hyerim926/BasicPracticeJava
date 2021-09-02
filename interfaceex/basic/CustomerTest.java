package _0830.interfaceex.basic;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		// Customer 클래스형인 customer에 Buy 인터페이스의 buyer라는 변수를 새로 생성해 대입함
		// buyer는 Buy 인터페이스의 메서드만 호출 가능
		Buy buyer = customer;
		buyer.buy(); // 구매하기
		buyer.order(); // 재정의된 메서드 호출 고객 판매 주문
		
		// Customer 클래스형인 customer에 Sell 인터페이스의 seller라는 변수를 새로 생성해 대입함
		// seller는 Sell 인터페이스의 메서드만 호출 가능
		Sell seller = customer; 
		seller.sell(); // 판매하기
		buyer.order(); // 재정의된 메서드 호출 고객 판매 주문
		
		if(seller instanceof Customer) {
			Customer customer2 = (Customer)seller; // seller를 하위 클래스형인 Customer로 다시 형 변환(다운캐스팅)
			customer2.buy(); // 구매하기
			customer2.sell(); // 판매하기
		}
		customer.order(); // 재정의된 메서드 호출 고객 판매 주문
	}

}
