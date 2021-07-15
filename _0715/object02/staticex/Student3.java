package _0715.object02.staticex;
// static ���� ����� �й� �����ϱ�
public class Student3 {
	private static int serialNum = 1000; // private ������ ����, �ٸ� Ŭ�������� �����ؼ� �� ��� get/set�޼��嵵 �����ؾ���
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	public int cardNum = serialNum + 100;
	
	public Student3() { // ������ 
		serialNum++; // �л��� ������ ������ ����
		studentID = serialNum; // ������ ���� �й� �ν��Ͻ� ������ �ο�
		cardNum++;
		studentID = cardNum;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName = name;
	}

	public static int getSerialNum() { // serialNum�� get()�޼���
		int i = 10;
		return serialNum;
	}

	public static void setSerialNum(int serialNum) { // serialNum�� set()�޼���
		Student3.serialNum = serialNum;
	}

	public int getCardNum() {
		return cardNum;
	}

	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}
	
	
}
