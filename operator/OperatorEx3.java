package _0710.operator;
// �ܶ� ȸ�� ��
public class OperatorEx3 {

	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10); // �� ������ �� ���� �����̱⶧���� �� �� ����ȵ� i=2 
		System.out.println(value);// false
		System.out.println(num1); // 20
		System.out.println(i); // 2
		
		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) > 10); // �� �տ��� �� ���� ���̸� �� �� ���� �ȵ� i=2
		System.out.println(value); // true
		System.out.println(num1); // 30 ������ num1�� 20�� �Ǿ��⋚���� ���⼭ 20���� ����
		System.out.println(i); // 2
		
	}

}
