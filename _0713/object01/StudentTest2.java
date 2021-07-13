package _0713.object01;

public class StudentTest2 {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.studentName = "안연수";
		
		Student student2 = new Student();
		student2.studentName = "안승연";
		
		System.out.println(student1); // 참조변수값 출력 => 메모리 주소 출력
		System.out.println(student2);
	}

}
