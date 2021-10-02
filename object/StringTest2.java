package javaCh11.object;

// 두 문자열 연결하기
public class StringTest2 {

	public static void main(String[] args) {
		String javaStr = new String("java");
		String androidStr = new String("android");
		System.out.println(javaStr);
		System.out.println("처음 문자열 주소 값: " + System.identityHashCode(javaStr));
		
		// 문자열 javaStr와 문자열 androidStr를 연결하여 javaStr에 대입
		javaStr = javaStr.concat(androidStr);
		
		// 두 문자열이 연결된 새로운 문자열 출력
		System.out.println(javaStr);
		// 두 문자열이 연결되어 새로 생긴 주소값을 출력함
		System.out.println("연결된 문자열 주소 값: " + System.identityHashCode(javaStr));

	}

}
