package _0715.object02.staticex;
// Ŭ���� �̸�(student1)�� static ���� �����ϱ�
public class StudentTest6 {
	public static void main(String[] args) {
		
		Student3 studentLee = new Student3();
		studentLee.setStudentName("������");
		System.out.println(studentLee.cardNum);

		Student3 studentSon = new Student3();
		studentSon.setStudentName("�����");
		System.out.println(studentSon.cardNum);
	}

}
