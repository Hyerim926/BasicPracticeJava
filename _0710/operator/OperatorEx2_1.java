package _0710.operator;
// 증가, 감소 연산자 사용 값 연산_1분 복습
public class OperatorEx2_1 {

	public static void main(String[] args) {
		int gameScore = 150; 
		
		int lastScore1 = gameScore++; 
		System.out.println(lastScore1);
		
		int lastScore2 = gameScore--;
		System.out.println(lastScore2);
		
	}

}
