package _0724.inheritance;
// 클래스 형 변환과 재정의 메서드 호출
public class OverridingTest2 {
	public static void main(String[] args) {
		// 묵시적 형 변환에 의해 VIPCustomer가 Customer형으로 변환됨
		Customer3 vc = new VIPCustomer4(10030, "나몰라", 2000);
		vc.bonusPoint = 1000;
		
		// calcPrice() 메서드 호출, Customer3에서 정의된 메서드이지만 VIPCustomer에서 재정의된 것으로 호출됨 
		System.out.println(vc.getCustomerName() + " 님이 지불해야하는 금액은 " + vc.calcPrice(10000) + "원 입니다.");
		
	}

}
