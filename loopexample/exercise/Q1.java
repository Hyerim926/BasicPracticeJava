package _0712.loopexample.exercise;
// ��Ģ���� �����ϴ� ���α׷� if-else���� if���� switch-case�� ����� Ǯ��
public class Q1 {

	public static void main(String[] args) {
		int num1 = 10; // �μ�1���� ����
		int num2 = 2; // �μ�2���� ����
		char operator = '+'; // ���� ��ȣ ����, ������ �ٲ������
		
		int result = 0; // ������� ����
		
		if(operator == '+') { // ������ �ƴ϶� ���ٴ� �ṉ̀� ������ ==�� ���
			result = num1 + num2;

		} else if(operator == '-') {
			result = num1 - num2;
		
		} else if(operator == '*') {
			result = num1 * num2;
		
		} else if(operator == '/') {
			result = num1 / num2;
		} else {
			System.out.println(result);
			return;
		} 
		System.out.println("num1�� num2�� ���� ����� " + result + "�Դϴ�.");
		System.out.println("=========== switch-case�� ============");
		
		int result1 = 0;
		switch(operator){
		 case '+':
			 result1 = num1 + num2;
			 System.out.println("num1�� num2�� ���� " + result1 + "�Դϴ�.");
			 break;
		 case '-':
			 result1 = num1 - num2;
			 System.out.println("num1�� num2�� ���� " + result1 + "�Դϴ�.");
			 break;
		 case '*':
			 result1 = num1 * num2;
			 System.out.println("num1�� num2�� ���� " + result1 + "�Դϴ�.");
			 break;
		 case '/':
			 result1 = num1 / num2;
			 System.out.println("num1�� num2�� ���� " + result1 + "�Դϴ�.");
			 break;
		default:
			System.out.println("���갪�� �����ϴ�.");
			break;
		}
	}


}
