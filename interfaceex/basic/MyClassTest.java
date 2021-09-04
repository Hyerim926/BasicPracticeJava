package _0830.interfaceex.basic;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass mc = new MyClass(); // MyClass의 인스턴스 생성
		
		X xClass = mc; // 생성한 인스턴스에 상위 인터페이스 X형으로 대입
		xClass.x(); // 인터페이스 X의 추상메서드만 호출 가능
		
		Y yClass = mc; // 생성한 인스턴스에 상위 인터페이스 Y형으로 대입
		yClass.y(); // 인터페이스 Y의 추상메서드만 호출 가능
		
		MyInterface iClass = mc; // 인터페이스 X, Y를 모두 상속 받은 MyInterface 인터페이스 대입
		iClass.myMethod(); // MyInterface에서 상속 받은 모든 메서드 호출 가능
		iClass.x();
		iClass.y();
			
	}

}
