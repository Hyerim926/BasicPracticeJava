package _0830.interfaceex.basic;
// 인터페이스
public interface Buy {
	void buy();
	
	default void order() {
		System.out.println("구매주문");
	}

}
