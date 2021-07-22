package _0706.array.exercise;

import java.util.ArrayList;

public class DogArrayTest {
	public static void main(String[] args) {

		ArrayList<Dog> dogList = new ArrayList<Dog>();

		dogList.add(new Dog("동구", "믹스"));
		dogList.add(new Dog("딸기", "말티즈"));
		dogList.add(new Dog("로지", "비숑"));
		dogList.add(new Dog("몽자", "푸들"));
		dogList.add(new Dog("수달이", "믹스"));
		
		for (int i = 0; i < dogList.size(); i++) {
			Dog dog = dogList.get(i);
			System.out.println(dog.showDogInfo());
		}
		System.out.println();
		
		System.out.println("=== 향상된 for문 ===");
		for (Dog dog : dogList) {
			System.out.println(dog.showDogInfo());
	}
	}
}
