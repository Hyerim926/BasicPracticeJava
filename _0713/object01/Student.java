package _0713.object01;

public class Student { //����� - class Ŭ���� �̸� - student
	// �������
	int studentID; // �й�
	String studentName; // �̸�
	int grade; // �г�
	String address; // ��� ��
	
	public void showStudentInfo() { // �л� �̸��� �ּ� ����ϴ� showStudentInfo �޼���
		System.out.println(studentName + "," + address); // �̸� �ּ� ���
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public static void main(String[] args) {
		Student studentAhn = new Student();
		// ��������(�ν��Ͻ�)�� ������ "Ŭ�����̸� ������ = new Ŭ�����̸�();" 
		studentAhn.studentName = "�ȿ���";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
