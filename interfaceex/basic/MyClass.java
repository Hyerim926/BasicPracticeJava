package _0830.interfaceex.basic;

public class MyClass implements MyInterface {

	@Override // X 인터페이스에서 상속 받은 x() 메서드 구현
	public void x() {
		System.out.println("x()");
	}

	@Override // Y 인터페이스에서 상속 받은 y() 메서드 구현
	public void y() {
		System.out.println("y()");
	}

	@Override // MyInterface 인터페이스의 myMethod() 메서드 구현
	public void myMethod() {
		System.out.println("myMethod()");
	}
	
}
