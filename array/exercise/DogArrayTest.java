package _0706.array.exercise;

import java.util.ArrayList;

public class DogArrayTest {
	public static void main(String[] args) {

		ArrayList<Dog> dogList = new ArrayList<Dog>();

		dogList.add(new Dog("����", "�ͽ�"));
		dogList.add(new Dog("����", "��Ƽ��"));
		dogList.add(new Dog("����", "���"));
		dogList.add(new Dog("����", "Ǫ��"));
		dogList.add(new Dog("������", "�ͽ�"));
		
		for (int i = 0; i < dogList.size(); i++) {
			Dog dog = dogList.get(i);
			System.out.println(dog.showDogInfo());
		}
		System.out.println();
		
		System.out.println("=== ���� for�� ===");
		for (Dog dog : dogList) {
			System.out.println(dog.showDogInfo());
	}
	}
}
