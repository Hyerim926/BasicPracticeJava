package _0713.object01.hiding;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		// studentLee.studentName = "이상원"; 오류발생 why? private으로 선언해 외부클래스에서 접근 비허용
		studentLee.setStudentName("이상원"); // 변수 출력값 set으로 지정해주고
		
		System.out.println(studentLee.getStudentName()); // 변수 출력값 get으로 불러오고
	}

}
