package _0830.interfaceex.basic;
// times()�� divide() �޼��带 �������� �ʾ����Ƿ� Calculator�� �߻� Ŭ������
public class Calculator implements Calc {

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

}
