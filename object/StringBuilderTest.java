package javaCh11.object;

public class StringBuilderTest {

	public static void main(String[] args) {
		String javaStr = new String("Java");
		// 인스턴스가 처음 생성됐을 때 메모리 주소
		System.out.println("javaStr 문자열 주소 :" + System.identityHashCode(javaStr));
		
		// String으로부터 StringBuilder 생성(주소가 다름)
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println("연산 전 buffer 메모리 주소: " + System.identityHashCode(buffer));
		
		// 문자열 추가
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming is fun!!");
		
		// String 클래스로 변환하지 않고 바로 buffer 변수를 출력해도 같은 값이 나온다. 다만 데이터의 종류가 다른 것 같다.
		// 메모리는 바이너리 문자들을 포함하여 메모리에 있는 데이터이고 문자열은 단순 문자열만을 가리킨다.
		System.out.println(buffer);
		System.out.println("연산 후 buffer 메모리 주소: " + System.identityHashCode(buffer));
		
		// String 클래스로 반환
		javaStr = buffer.toString();
		System.out.println(javaStr);
		System.out.println("연결된 javaStr 문자열 주소: " + System.identityHashCode(javaStr));

	}

}
