package _0830.interfaceex.basic;

public class MyClass implements MyInterface {

	@Override // X �������̽����� ��� ���� x() �޼��� ����
	public void x() {
		System.out.println("x()");
	}

	@Override // Y �������̽����� ��� ���� y() �޼��� ����
	public void y() {
		System.out.println("y()");
	}

	@Override // MyInterface �������̽��� myMethod() �޼��� ����
	public void myMethod() {
		System.out.println("myMethod()");
	}
	
}
