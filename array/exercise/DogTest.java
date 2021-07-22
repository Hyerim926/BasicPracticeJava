package _0706.array.exercise;

public class DogTest {
	public static void main(String[] args) {

		Dog[] dogArray = new Dog[5];
		
		dogArray[0] = new Dog("µ¿±¸", "¹Í½º");
		dogArray[1] = new Dog("µþ±â", "¸»Æ¼Áî");
		dogArray[2] = new Dog("·ÎÁö", "ºñ¼õ");
		dogArray[3] = new Dog("¸ùÀÚ", "Çªµé");
		dogArray[4] = new Dog("¼ö´ÞÀÌ", "¹Í½º");
		
		for (int i = 0; i < dogArray.length; i++) {
			System.out.println(dogArray[i].showDogInfo());
		}
		for (Dog dog : dogArray) {
			System.out.println(dog.showDogInfo());
		}
	}

}
