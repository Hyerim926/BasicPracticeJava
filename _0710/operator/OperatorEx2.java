package _0710.operator;
// ����, ���� ������ ����� �� ����
public class OperatorEx2 {

	public static void main(String[] args) {
		int gameScore = 150; // ���ӿ��� ȹ���� ������ 150��
		
		int lastScore1 = ++gameScore;// gamescore���� 1��ŭ ���� ���� lastscore1�� ����
		System.out.println(lastScore1); // 151
		
		int lastScore2 = --gameScore; // gamescore���� 1��ŭ �� ���� lastscore2�� ����
		System.out.println(lastScore2); // 150
		
	}

}
