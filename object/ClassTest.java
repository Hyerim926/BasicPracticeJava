package javaCh11.object;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {

		// Object�� getClass() �޼��� ���
		Person person = new Person();
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());

		// ���� class ���� �����ϱ�
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());

		// 3. Ŭ���� �̸����� ��������
		Class pClass3 = Class.forName("javaCh11.object.Person");
		System.out.println(pClass3.getName());

	}

}
