package _0830.interfaceex.basic;
// �������̽�
public interface Buy {
	void buy();
	
	default void order() {
		System.out.println("�����ֹ�");
	}

}
