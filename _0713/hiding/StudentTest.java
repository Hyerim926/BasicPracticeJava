package _0713.object01.hiding;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		// studentLee.studentName = "�̻��"; �����߻� why? private���� ������ �ܺ�Ŭ�������� ���� �����
		studentLee.setStudentName("�̻��"); // ���� ��°� set���� �������ְ�
		
		System.out.println(studentLee.getStudentName()); // ���� ��°� get���� �ҷ�����
	}

}
