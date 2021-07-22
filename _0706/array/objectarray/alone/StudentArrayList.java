package _0706.array.objectarray.alone;

import java.util.ArrayList;

public class StudentArrayList {
	public static void main(String[] args) {

		ArrayList<Student> std = new ArrayList<Student>();
		
		std.add(new Student(1001, "James"));
		std.add(new Student(1002, "Tomas"));
		std.add(new Student(1003, "Edward"));
		
		for (int i = 0; i < std.size(); i++) {
			Student student = std.get(i);
			student.showStudentInfo();
		}
		System.out.println();
		
		System.out.println("===향상된 for문===");
		for (Student student : std) {
			student.showStudentInfo();
		}
		
	}

}
