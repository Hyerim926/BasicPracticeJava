package _0715.object02.staticex;
// Ŭ���� �̸�(student1)�� static ���� �����ϱ�
public class StudentTest3 {
	public static void main(String[] args) {

		Student1 studentLee = new Student1();
		studentLee.setStudentName("������");
		System.out.println(Student1.serialNum); // serialNum ������ ���� Ŭ���� �̸����� ����
		System.out.println(studentLee.studentName + " �й�:" + studentLee.studentID);
		
		Student1 studentSon = new Student1();
		studentSon.setStudentName("�����");
		System.out.println(Student1.serialNum);
		System.out.println(studentLee.studentName + " �й�:" + studentSon.serialNum);
	}

}
