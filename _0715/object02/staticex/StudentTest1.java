package _0715.object02.staticex;

public class StudentTest1 {
	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.setStudentName("������");
		System.out.println(studentLee.serialNum); //serialNum������ �ʱ갪 ���
		studentLee.serialNum++; // static������ ����
		
		Student studentSon = new Student();
		studentSon.setStudentName("�����");
		// ������ �� ���
		System.out.println(studentLee.serialNum);
		System.out.println(studentSon.serialNum);
	}

}