package _0706.array.student;
// �л� ������ ���� Student Ŭ���� ����
import java.util.ArrayList;

public class Student {

	// StudentŬ������ �������
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList; // ArrayList ����
	
	// ������
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>(); // ArrayList ����
	}
	// �л��� �����ϴ� ������ subjectList�迭�� �ϳ��� �߰��ϴ� �޼���
	public void addSubject(String name, int score) {
		Subject subject = new Subject(); // Subject �����ϱ�
		subject.setName(name); // �����̸� �߰��ϱ�
		subject.setScorePoint(score); // ���� �߰��ϱ�
		subjectList.add(subject); // �迭�� �����ϱ�
	}
	
	public void showStudentInfo() {
		int total = 0;
		// �迭 ��� �� ���
		for (Subject s : subjectList) {
			total += s.getScorePoint(); // ���� ���ϱ�
			System.out.println("�л� " + studentName + "�� " + s.getName() + " ���� ������ " + s.getScorePoint() + "�Դϴ�."); 
		}
		System.out.println("�л� " + studentName + "�� ������ " + total + " �Դϴ�.");
	}
	
	
}
