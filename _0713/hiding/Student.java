package _0713.object01.hiding;

public class Student {
	int studentID;
	public String studentName; // private���� ����, get/set�޼��� ��������� ���� �߻� ����
	int grade;
	String address;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}
