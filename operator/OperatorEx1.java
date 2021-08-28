package _0710.operator;
// 산술 연산자 사용해 총점과 평균 구하기
public class OperatorEx1 {

	public static void main(String[] args) {
		int mathScore = 90;
		int engScore = 70;
		
		// 총점 구하기
		int totalScore = mathScore + engScore;
		System.out.println(totalScore);
		
		// 평균 구하기
		double avgScore = totalScore/2;
		System.out.println(avgScore);
		
	}

}
