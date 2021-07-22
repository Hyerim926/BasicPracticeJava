package _0706.array.student;
// 학생 성적 출력하기
public class StudentTest {
	public static void main(String[] args) {

		Student studentLee = new Student(1001, "Lee");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 96);
		
		Student studentKim = new Student(1002, "Kim");
		studentKim.addSubject("국어", 76);
		studentKim.addSubject("수학", 89);
		studentKim.addSubject("영어", 100);
		
		studentLee.showStudentInfo();
		System.out.println("======================");
		studentKim.showStudentInfo();
		
		

	}

}
