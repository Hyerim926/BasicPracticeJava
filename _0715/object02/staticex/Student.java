package _0715.object02.staticex;
// static 변수 사용해 학번 생성하기
public class Student {
	public static int serialNum = 1000; // static 변수는 인스턴스 생성과 상관없이 먼저 생성
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName = name;
	}
	
	
}
