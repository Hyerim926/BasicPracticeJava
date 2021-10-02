package javaCh11.object;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {

		// Object의 getClass() 메서드 사용
		Person person = new Person();
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());

		// 직접 class 파일 대입하기
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());

		// 3. 클래스 이름으로 가져오기
		Class pClass3 = Class.forName("javaCh11.object.Person");
		System.out.println(pClass3.getName());

	}

}
