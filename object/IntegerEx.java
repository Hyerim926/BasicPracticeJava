package javaCh11.object;

public class IntegerEx {
	public static void main(String[] args) {
		Integer iValue = new Integer(100);
		int myValue = iValue.intValue();
		
		System.out.println(myValue);
		
		Integer number1 = Integer.valueOf("100"); // ���ڿ� 100�� ������ 100���� ���
		Integer number2 = Integer.valueOf(100); // ������ 100�� �״�� ���
		
		System.out.println(number1);
		System.out.println(number2);
		
		int num = Integer.parseInt("100");
		System.out.println(num);
	}

}
