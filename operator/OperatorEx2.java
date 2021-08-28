package _0710.operator;
// 증가, 감소 연산자 사용해 값 연산
public class OperatorEx2 {

	public static void main(String[] args) {
		int gameScore = 150; // 게임에서 획득한 점수는 150점
		
		int lastScore1 = ++gameScore;// gamescore에서 1만큼 더한 값을 lastscore1에 대입
		System.out.println(lastScore1); // 151
		
		int lastScore2 = --gameScore; // gamescore에서 1만큼 뺀 값을 lastscore2에 대입
		System.out.println(lastScore2); // 150
		
	}

}
