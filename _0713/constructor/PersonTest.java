package _0713.object01.constructor;

public class PersonTest {

	public static void main(String[] args) {
		// 디폴트 생성자로 클래스를 생성한 후 인스턴스 변수 값을 따로 초기화
		Person personLee = new Person(); // Person() -> 생성자를 선언해줘야 인스턴스 생성됨
		personLee.name = "이마크";
		personLee.height = 180.0F;
		personLee.weight = 55.5F;
		
		Person personKim = new Person("김정우", 180, 58);
		
		// 인스턴스 변수 초기화와 동시에 클래스 생성
		System.out.println(personKim.name);
		System.out.println(personKim.height);
		System.out.println(personKim.weight);
	}

}
