package _0713.object01.hiding;

public class Student {
	int studentID;
	public String studentName; // private으로 선언, get/set메서드 선언해줘야 오류 발생 안함
	int grade;
	String address;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}
