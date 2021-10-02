package javaCh11.object;

public class ClassEx {
	public static void main(String[] args) throws ClassNotFoundException {
		// 1. Object Ŭ������ getClass() �޼��� �̿��ϱ�
		String s = new String();
		Class c = s.getClass(); // getClass()�޼����� ��ȯ���� Class
		
		System.out.println(c); // ��� : class java.lang.String
		
		// 2. Ŭ���� ���� �̸��� Class ������ ���� �����ϱ�
		Class c2 = String.class;
		System.out.println(c2); // ��� : class java.lang.String
		
		// 3. Class.forName("Ŭ���� �̸�") �޼��� ����ϱ� ��� ����ó���� �ʿ���(ClassNotFoundException)
		Class c3 = Class.forName("java.lang.String");
		System.out.println(c3);
	}
}
