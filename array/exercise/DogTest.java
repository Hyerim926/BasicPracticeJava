package _0706.array.exercise;

public class DogTest {
	public static void main(String[] args) {

		Dog[] dogArray = new Dog[5];
		
		dogArray[0] = new Dog("����", "�ͽ�");
		dogArray[1] = new Dog("����", "��Ƽ��");
		dogArray[2] = new Dog("����", "���");
		dogArray[3] = new Dog("����", "Ǫ��");
		dogArray[4] = new Dog("������", "�ͽ�");
		
		for (int i = 0; i < dogArray.length; i++) {
			System.out.println(dogArray[i].showDogInfo());
		}
		for (Dog dog : dogArray) {
			System.out.println(dog.showDogInfo());
		}
	}

}
