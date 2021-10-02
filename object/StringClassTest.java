package javaCh11.object;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// String Ŭ���� ���� ��������
public class StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		// Ŭ���� �̸����� ��������
		Class strClass = Class.forName("java.lang.String");
		
		System.out.println("��� ������ ��������");
		// ��� ������ ��������
		Constructor[] cons = strClass.getConstructors();
		for (Constructor c : cons) {
			System.out.println(c);
		}
		
		System.out.println("��� ��� ����(�ʵ�) ��������");
		// ��� ��� ����(�ʵ�) ��������
		Field[] fields = strClass.getFields();
		for (Field f : fields) {
			System.out.println(f);
		}
		System.out.println();
		
		System.out.println("��� �޼��� ��������");
		// ��� �޼��� ��������
		Method[] methods = strClass.getMethods();
		for (Method m : methods) {
			System.out.println(m);
		}
		

	}

}
