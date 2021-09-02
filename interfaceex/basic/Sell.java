package _0830.interfaceex.basic;
// 인터페이스
public interface Sell {
	void sell();
	
	default void order() {
		System.out.println("구매주문");
	}
}
