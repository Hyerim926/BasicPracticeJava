package javaCh11.object;

public class IntegerEx {
	public static void main(String[] args) {
		Integer iValue = new Integer(100);
		int myValue = iValue.intValue();
		
		System.out.println(myValue);
		
		Integer number1 = Integer.valueOf("100"); // 문자열 100을 정수형 100으로 출력
		Integer number2 = Integer.valueOf(100); // 정수형 100을 그대로 출력
		
		System.out.println(number1);
		System.out.println(number2);
		
		int num = Integer.parseInt("100");
		System.out.println(num);
	}

}
