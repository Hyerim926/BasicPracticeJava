package _0713.object01.alone;

public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person();
		
		p.age = 40;
		p.name = "James";
		p.isMarried = true;
		p.childNum = 3;
		
		System.out.println("�� ����� ����: " + p.getAge());
		System.out.println("�� ����� �̸�: " + p.getName());
		System.out.println("�� ����� ��ȥ ����: " + p.isMarried());
		System.out.println("�� ����� �ڳ� ��: " + p.getChildNum());
		
	}

}
