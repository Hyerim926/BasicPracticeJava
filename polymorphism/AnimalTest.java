package _0724.polymorphism;

import java.util.ArrayList;

// ������ �׽�Ʈ�ϱ�, Animal Ŭ������ ��ӹ޴� 3���� Ŭ����
// ���� Ŭ���� Animal
class Animal{
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}
// Animal�� ��ӹ��� Human Ŭ����
class Human extends Animal {
	public void move() {
		System.out.println("����� �� �߷� �Ƚ��ϴ�.");
	}
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}
// Animal�� ��ӹ��� Tiger Ŭ����
class Tiger extends Animal{
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�.");
	}
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
}
// Animal�� ��ӹ��� Eagle Ŭ����
class Eagle extends Animal{
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
	public void flying() {
		System.out.println("�������� ������ �� ��� �ָ� ���ư��ϴ�.");
	}
}

public class AnimalTest {
	ArrayList<Animal> aniList = new ArrayList<Animal>();
	
	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		aTest.addAnimal();
		System.out.println("���� ������ �ٿ� ĳ����");
		aTest.testCasting();
		
	}
	public void addAnimal() {
		// ArrayList�� �߰��Ǹ鼭 Animal������ �� ��ȯ
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		// �迭 ��Ҹ� Animal���� ������ move()�� ȣ���ϸ� �����ǵ� �Լ��� ȣ���
		for (Animal ani : aniList) {
			ani.move();
		}
		
	}
	
	public void testCasting() {
		for (int i = 0; i < aniList.size(); i++) { // ��� �迭 ��Ҹ� �ϳ��� ���鼭
			Animal ani = aniList.get(i); // Animal������ ������
			if (ani instanceof Human) { // Human�̸�
				Human h = (Human)ani; // Human���� �ٿ�ĳ����
				h.readBook();
			}
			else if (ani instanceof Tiger) {
				Tiger t = (Tiger)ani;
				t.hunting();
			}
			else if (ani instanceof Eagle) {
				Eagle e = (Eagle)ani;
				e.flying();
			}
			else {
				System.out.println("�������� �ʴ� ���Դϴ�.");
			}
		}
		
	}

}
/*����� �� �߷� �Ƚ��ϴ�.
ȣ���̰� �� �߷� �ݴϴ�.
�������� �ϴ��� ���ϴ�.
--- ���δ� �������̵�(������) ---
���� ������ �ٿ� ĳ����
--- �Ʒ��δ� �������̵� ���� ---
����� å�� �н��ϴ�.
ȣ���̰� ����� �մϴ�.
�������� ������ �� ��� �ָ� ���ư��ϴ�.
*/
