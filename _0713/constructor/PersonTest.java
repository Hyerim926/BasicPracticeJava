package _0713.object01.constructor;

public class PersonTest {

	public static void main(String[] args) {
		// ����Ʈ �����ڷ� Ŭ������ ������ �� �ν��Ͻ� ���� ���� ���� �ʱ�ȭ
		Person personLee = new Person(); // Person() -> �����ڸ� ��������� �ν��Ͻ� ������
		personLee.name = "�̸�ũ";
		personLee.height = 180.0F;
		personLee.weight = 55.5F;
		
		Person personKim = new Person("������", 180, 58);
		
		// �ν��Ͻ� ���� �ʱ�ȭ�� ���ÿ� Ŭ���� ����
		System.out.println(personKim.name);
		System.out.println(personKim.height);
		System.out.println(personKim.weight);
	}

}
