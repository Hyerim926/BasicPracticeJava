package _0714.object02;
// this를 사용하여 주소값 반환

class Person0 {
	String name;
	int age;
	
	Person0() {
		this("이름없음", 1); // Person(String, int) 생성자 호출 안하면 오류 발생
	}

	Person0(String name, int age) {
		this.name = name;
		this.age = age;
	}
	Person0 returnItSelf() { // 반환형은 클래스형
		return this; // this 반환
	}
}
public class CalssAnotherCont {
	public static void main(String[] args) {
		Person0 noName = new Person0();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person0 p = noName.returnItSelf(); // this 값을 클래스 변수에 대입
		System.out.println(p); // noName.returnItSelf()의 반환 값 출력
		System.out.println(noName); // 참조값 출력
	}

}
