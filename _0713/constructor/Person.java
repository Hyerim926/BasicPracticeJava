package _0713.object01.constructor;

public class Person {
	String name;
	float height;
	float weight;
	
	public Person() { // ����Ʈ ������
	}
	public Person(String pname) { // �̸��� �Ű������� �Է¹޴� ������
		name = pname;
	}
	public Person(String pname, float pheight, float pweight) { // ����� ���� ������, �̸�, Ű, �����Ը� �Ű������� �Է¹޴� ������
		name = pname;
		height = pheight;
		weight = pweight;
	}
}

