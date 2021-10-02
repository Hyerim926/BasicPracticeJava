package javaCh11.object;

public class StringEquals {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		// 두 인스턴스 주소 값이 같은지 비교하여 출력
		System.out.println(str1 == str2); // 인스턴스 주소값은 다름
		// String 클래스의 equals()메서드 사용. 두 인스턴스의 문자열 값이 같은지 비교하여 출력
		System.out.println(str1.equals(str2)); // 하지만 문자열 값은 같음
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		// 두 인스턴스 주소값이 같은지 비교하여 출력
		System.out.println(i1 == i2); // 인스턴스 주소값은 다름
		// Integer 클래스의 equals() 메서드 사용. 두 인스턴스의 정수 값이 같은지 비교하여 출력
		System.out.println(i1.equals(i2)); // 하지만 정수 값은 같음

	}

}
