package _0711.ifEx;
// 성적에 따라 학점 부여하기
public class Alone1 {

	public static void main(String[] args) {
		int score = 87;
		char grade;
		
		if(score >= 90) {
			grade = 'A';
			System.out.println(grade);	
		} else if(score > 80) {
			grade = 'B';
			System.out.println(grade);
		} else if(score > 70) {
			grade = 'C';
			System.out.println(grade);
		} else if(score > 60) {
			grade = 'D';
			System.out.println(grade);
		} else {
			grade = 'F';
			System.out.println(grade);
		}
			
	}

}
