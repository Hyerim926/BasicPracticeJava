package _0830.interfaceex.basic;
// 두 인터페이스를 구현하는 클래스, 이 클래스는 Buy형이자 Sell형이기도 함
public class Customer implements Buy, Sell{

	@Override
	public void sell() {
		System.out.println("구매하기");
	}

	@Override
	public void buy() {
		System.out.println("판매하기");
		
	}

	@Override
	public void order() {
		System.out.println("고객 판매 주문");
	}
	
}
