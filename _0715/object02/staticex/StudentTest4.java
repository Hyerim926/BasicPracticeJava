package _0715.object02.staticex;
// Ŭ���� �̸�(student1)�� static ���� �����ϱ�
public class StudentTest4 {
	public static void main(String[] args) {

		Student2 studentLee = new Student2();
		studentLee.setStudentName("������");
		System.out.println(Student2.getSerialNum()); // serialNum���� �������� ���� get()�޼��带 Ŭ���� �̸����� ���� ȣ��
		System.out.println(studentLee.studentName + " �й�:" + studentLee.studentID);
		
		Student2 studentSon = new Student2();
		studentSon.setStudentName("�����");
		System.out.println(Student2.getSerialNum()); // serialNum���� �������� ���� get()�޼��带 Ŭ���� �̸����� ���� ȣ��
		System.out.println(studentLee.studentName + " �й�:" + studentSon.studentID);
	}

}
