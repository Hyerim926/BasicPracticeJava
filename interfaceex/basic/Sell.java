package _0830.interfaceex.basic;
// �������̽�
public interface Sell {
	void sell();
	
	default void order() {
		System.out.println("�����ֹ�");
	}
}
