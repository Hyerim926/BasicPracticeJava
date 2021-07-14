package _0714.object02;
// this로 다른 생성자 호출하기
class Person {
	String name;
	int age;
	
	public Person() { // this를 사용해 Person(String, int) 생성자 호출 
		this("이름 없음", 1); 
	}
	
	Person(String name, int age){ // 생성자 호출에 쓰이는 this(매개변수를 가지는 생성자)
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
