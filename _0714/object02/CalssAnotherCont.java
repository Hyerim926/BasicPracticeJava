package _0714.object02;
// this�� ����Ͽ� �ּҰ� ��ȯ

class Person0 {
	String name;
	int age;
	
	Person0() {
		this("�̸�����", 1); // Person(String, int) ������ ȣ�� ���ϸ� ���� �߻�
	}

	Person0(String name, int age) {
		this.name = name;
		this.age = age;
	}
	Person0 returnItSelf() { // ��ȯ���� Ŭ������
		return this; // this ��ȯ
	}
}
public class CalssAnotherCont {
	public static void main(String[] args) {
		Person0 noName = new Person0();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person0 p = noName.returnItSelf(); // this ���� Ŭ���� ������ ����
		System.out.println(p); // noName.returnItSelf()�� ��ȯ �� ���
		System.out.println(noName); // ������ ���
	}

}
