package _0724.inheritance;
// 클래스형에 기반하여 지불 금액 계산하기
public class OverridingTest3 {
	public static void main(String[] args) {
		int price = 10000;
		
		// Customer 인스턴스 생성
		Customer3 customerLee = new Customer3(10010, "이순신");
		System.out.println(customerLee.getCustomerName() + " 님이 지불해야하는 금액은 " +
							customerLee.calcPrice(price) + "원 입니다.");
		
		// VIPCustomer 인스턴스 생성
		VIPCustomer4 customerKim = new VIPCustomer4(10020, "김유신", 12345);
		System.out.println(customerKim.getCustomerName() + " 님이 지불해야하는 금액은 " +
				customerKim.calcPrice(price) + "원 입니다.");
		
		// 묵시적 형 변환으로 인스턴스 생성
		Customer3 vc = new VIPCustomer4(10030, "나몰라", 2000);
		System.out.println(vc.getCustomerName() + " 님이 지불해야하는 금액은 " +
				vc.calcPrice(price) + "원 입니다.");
		
		
		
	}

}
