package _0714.object02;
// this�� �ٸ� ������ ȣ���ϱ�
class Person {
	String name;
	int age;
	
	public Person() { // this�� ����� Person(String, int) ������ ȣ�� 
		this("�̸� ����", 1); 
	}
	
	Person(String name, int age){ // ������ ȣ�⿡ ���̴� this(�Ű������� ������ ������)
		this.name = name;
		this.age = age;
	}
}
public class CallAnotherConst {
	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
	}

}
