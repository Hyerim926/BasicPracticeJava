package javaCh11.object;

public class NewInstanceTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		// �����ڷ� �����ϱ�
		Person person1 = new Person();
		System.out.println(person1);
		
		Class pClass = Class.forName("javaCh11.object.Person");
		// Class Ŭ������ newInstance() �޼���� �����ϱ�
		Person person2 = (Person)pClass.newInstance();
		System.out.println(person2);

	}

}
