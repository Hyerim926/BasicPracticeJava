package _0715.object02.staticex;
// �й� Ȯ���ϱ�
public class StudentTest2 {
	public static void main(String[] args) {
		Student1 studentLee = new Student1();
		studentLee.setStudentName("������");
		System.out.println(studentLee.serialNum); //serialNum������ �ʱ갪 ���
		System.out.println(studentLee.studentName + " �й�:" + studentLee.studentID);
		
		Student1 studentSon = new Student1();
		studentSon.setStudentName("�����");
		System.out.println(studentSon.serialNum);
		System.out.println(studentSon.studentName + " �й�:" + studentSon.studentID);
	}

}
