package _0715.object02.staticex;
// 학번 확인하기
public class StudentTest2 {
	public static void main(String[] args) {
		Student1 studentLee = new Student1();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum); //serialNum변수의 초깃값 출력
		System.out.println(studentLee.studentName + " 학번:" + studentLee.studentID);
		
		Student1 studentSon = new Student1();
		studentSon.setStudentName("손흥민");
		System.out.println(studentSon.serialNum);
		System.out.println(studentSon.studentName + " 학번:" + studentSon.studentID);
	}

}
