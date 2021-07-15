package _0715.object02.staticex;
// 클래스 이름(student1)로 static 변수 참조하기
public class StudentTest6 {
	public static void main(String[] args) {
		
		Student3 studentLee = new Student3();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.cardNum);

		Student3 studentSon = new Student3();
		studentSon.setStudentName("손흥민");
		System.out.println(studentSon.cardNum);
	}

}
