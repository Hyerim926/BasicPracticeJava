package _0830.interfaceex.basic;
// Calc 인터페이스 만들기
public interface Calc {
	// 인터페이스에서 선언한 변수는 컴파일 과정에서 상수로 변환됨
	double PI = 3.14;
	int ERROR = -999999999;
	
	// 인터페이스에서 선언한 메서드는 컴파일 과정에서 추상 메서드로 변환됨
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	int square(int num);
	
	default void description() { // 디폴트 메서드 선언
		System.out.println("정수 계산기를 구현합니다.");
		myMethod(); // 디폴트 메서드에서 private메서드 호출
	}
		
	static int total(int[] arr) { // 인터페이스에 정적 메서드 total() 구현
		int total = 0;
		
		for (int i : arr) {
			total += i;
		}
		myStaticMethod(); // 정적 메서드에서 private static 메서드 호출
		return total;
	}
	
	private void myMethod() {
		System.out.println("private 메서드입니다."); // private 메서드
	}
	
	private static void myStaticMethod() {
		System.out.println("private static 메서드입니다."); // private static 메서드
	}
}
