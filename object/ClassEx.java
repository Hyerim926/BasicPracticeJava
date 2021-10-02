package javaCh11.object;

public class ClassEx {
	public static void main(String[] args) throws ClassNotFoundException {
		// 1. Object 클래스의 getClass() 메서드 이용하기
		String s = new String();
		Class c = s.getClass(); // getClass()메서드의 반환형은 Class
		
		System.out.println(c); // 결과 : class java.lang.String
		
		// 2. 클래스 파일 이름을 Class 변수에 직접 대입하기
		Class c2 = String.class;
		System.out.println(c2); // 결과 : class java.lang.String
		
		// 3. Class.forName("클래스 이름") 메서드 사용하기 대신 예외처리가 필요함(ClassNotFoundException)
		Class c3 = Class.forName("java.lang.String");
		System.out.println(c3);
	}
}
