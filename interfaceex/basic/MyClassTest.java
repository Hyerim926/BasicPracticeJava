package _0830.interfaceex.basic;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass mc = new MyClass(); // MyClass�� �ν��Ͻ� ����
		
		X xClass = mc; // ������ �ν��Ͻ��� ���� �������̽� X������ ����
		xClass.x(); // �������̽� X�� �߻�޼��常 ȣ�� ����
		
		Y yClass = mc; // ������ �ν��Ͻ��� ���� �������̽� Y������ ����
		yClass.y(); // �������̽� Y�� �߻�޼��常 ȣ�� ����
		
		MyInterface iClass = mc; // �������̽� X, Y�� ��� ��� ���� MyInterface �������̽� ����
		iClass.myMethod(); // MyInterface���� ��� ���� ��� �޼��� ȣ�� ����
		iClass.x();
		iClass.y();
			
	}

}
