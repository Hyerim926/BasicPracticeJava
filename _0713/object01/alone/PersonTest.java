package _0713.object01.alone;

public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person();
		
		p.age = 40;
		p.name = "James";
		p.isMarried = true;
		p.childNum = 3;
		
		System.out.println("이 사람의 나이: " + p.getAge());
		System.out.println("이 사람의 이름: " + p.getName());
		System.out.println("이 사람의 결혼 여부: " + p.isMarried());
		System.out.println("이 사람의 자녀 수: " + p.getChildNum());
		
	}

}
