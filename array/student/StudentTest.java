package _0706.array.student;
// �л� ���� ����ϱ�
public class StudentTest {
	public static void main(String[] args) {

		Student studentLee = new Student(1001, "Lee");
		studentLee.addSubject("����", 100);
		studentLee.addSubject("����", 96);
		
		Student studentKim = new Student(1002, "Kim");
		studentKim.addSubject("����", 76);
		studentKim.addSubject("����", 89);
		studentKim.addSubject("����", 100);
		
		studentLee.showStudentInfo();
		System.out.println("======================");
		studentKim.showStudentInfo();
		
		

	}

}
