package _0715.object02.staticex;
// static ���� ����� �й� �����ϱ�
public class Student1 {
	public static int serialNum = 1000; // static ������ �ν��Ͻ� ������ ������� ���� ����
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public Student1() { // ������ 
		serialNum++; // �л��� ������ ������ ����
		studentID = serialNum; // ������ ���� �й� �ν��Ͻ� ������ �ο�
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName = name;
	}
	
	
}