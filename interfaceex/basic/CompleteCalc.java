package _0830.interfaceex.basic;
// ���� Ŭ���� �����, times()�� divide() �޼��� �߰��ؼ�
public class CompleteCalc extends Calculator {

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0)
			return num1 / num2;
		else
			return Calc.ERROR; // num2�� 0, �� ������ ���� 0�� ��쿡 ���� ���� ��ȯ
	}
	
	@Override
	public int square(int num) {
		return num*num;
	}

	public void showInfo() {
		// CompleteCalc���� �߰��� ������ �޼���
		System.out.println("Calc �������̽��� �����Ͽ����ϴ�.");
	}

	@Override // ����Ʈ �޼��� ������
	public void description() {
		super.description();
	}
	
	
}
