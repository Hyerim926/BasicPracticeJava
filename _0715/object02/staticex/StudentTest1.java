package _0715.object02.staticex;

public class StudentTest1 {
	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum); //serialNum변수의 초깃값 출력
		studentLee.serialNum++; // static변수값 증가
		
		Student studentSon = new Student();
		studentSon.setStudentName("손흥민");
		// 증가된 값 출력
		System.out.println(studentLee.serialNum);
		System.out.println(studentSon.serialNum);
	}

}
