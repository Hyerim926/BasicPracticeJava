package javaCh11.object;

class Student {
	int studentId;
	String studentName;

	// 매개변수가 있는 생성자
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return studentId + "," + studentName;
	}

	@Override // equals() 메서드 재정의
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student std = (Student) obj;
			// 재정의한 equals()메서드는 학생의 학번이 같으면 true 반환
			if (this.studentId == std.studentId) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	// 해시 코드 값으로 학번을 반환하도록 메서드 재정의
	@Override
	public int hashCode() {
		return studentId;
	}

}

public class EqualsTest {

	public static void main(String[] args) {

		Student studentLee = new Student(100, "이상원");
		Student studentLee2 = studentLee;
		Student studentSang = new Student(100, "이상원");

		// 동일한 주소의 두 인스턴스 비교
		// == 기호로 비교
		if (studentLee == studentLee2) {
			System.out.println("studentLee와 studentLee2의 주소는 같습니다");
		} else {
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
		}

		// equals() 메서드로 비교
		if (studentLee.equals(studentLee2)) {
			System.out.println("studentLee와 studentLee2은 동일합니다");
		} else {
			System.out.println("studentLee와 studentLee2는 동일하지 않습니다.");
		}

		// 동일인이지만 인스턴스의 주소가 다른 경우
		// == 기호로 비교
		if (studentLee == studentSang) {
			System.out.println("studentLee와 studentSang의 주소는 같습니다");
		} else {
			System.out.println("studentLee와 studentSang의 주소는 다릅니다.");
		}

		// equals() 메서드로 비교
		if (studentLee.equals(studentSang)) {
			System.out.println("studentLee와 studentSang은 동일합니다");
		} else {
			System.out.println("studentLee와 studentSang는 동일하지 않습니다.");
		}
		
		// hashCode() 메서드를 오버라이딩해서 가져온 학번 값을 같지만
		System.out.println("studentLee의 hashCode :" + studentLee.hashCode());
		System.out.println("studentSang의 hashCode :" + studentSang.hashCode());
		
		// 인스턴스의 주소값은 다름
		System.out.println("studentLee의 실제 주소값:" + System.identityHashCode(studentLee));
		System.out.println("studentSang의 실제 주소값:" + System.identityHashCode(studentSang));

	}

}
