package _0715.object02.staticex;
// static 변수 사용해 학번 생성하기
public class Student3 {
	private static int serialNum = 1000; // private 예약어로 변경, 다른 클래스에서 참조해서 쓸 경우 get/set메서드도 생성해야함
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	public int cardNum = serialNum + 100;
	
	public Student3() { // 생성자 
		serialNum++; // 학생이 생성될 떄마다 증가
		studentID = serialNum; // 증가된 값을 학번 인스턴스 변수에 부여
		cardNum++;
		studentID = cardNum;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName = name;
	}

	public static int getSerialNum() { // serialNum의 get()메서드
		int i = 10;
		return serialNum;
	}

	public static void setSerialNum(int serialNum) { // serialNum의 set()메서드
		Student3.serialNum = serialNum;
	}

	public int getCardNum() {
		return cardNum;
	}

	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}
	
	
}
