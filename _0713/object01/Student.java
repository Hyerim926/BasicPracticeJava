package _0713.object01;

public class Student { //예약어 - class 클래스 이름 - student
	// 멤버변수
	int studentID; // 학번
	String studentName; // 이름
	int grade; // 학년
	String address; // 사는 곳
	
	public void showStudentInfo() { // 학생 이름과 주소 출력하는 showStudentInfo 메서드
		System.out.println(studentName + "," + address); // 이름 주소 출력
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public static void main(String[] args) {
		Student studentAhn = new Student();
		// 참조변수(인스턴스)의 형식은 "클래스이름 변수명 = new 클래스이름();" 
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
