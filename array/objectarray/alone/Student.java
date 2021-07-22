package _0706.array.objectarray.alone;

public class Student {
	
	int studentID;
	String name;
	
	public Student(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}

	public int getStudentID() {
		return studentID;
	}

	public String getName() {
		return name;
	}
	
	public void showStudentInfo() {
		System.out.println(studentID + ", " + name);
	}

}
