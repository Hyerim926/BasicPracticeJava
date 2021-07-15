package _0715.object02.staticex;
// static 변수 사용해 학번 생성하기
public class Student1 {
	public static int serialNum = 1000; // static 변수는 인스턴스 생성과 상관없이 먼저 생성
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public Student1() { // 생성자 
		serialNum++; // 학생이 생성될 떄마다 증가
		studentID = serialNum; // 증가된 값을 학번 인스턴스 변수에 부여
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName = name;
	}
	
	
}
