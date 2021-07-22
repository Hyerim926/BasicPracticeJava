package _0706.array;
// 알파벳 소문자를 2글자씩 13줄(13행 2열)로 출력하는 프로그램을 이차원 배열로 구현
public class Alphabets {
	public static void main(String[] args) {

		char[][] alphabets = new char[13][2];
		char ch = 'a';
		
		for (int i = 0; i < alphabets.length; i++) {
			for (int j = 0; j < alphabets[i].length; j++) {
			alphabets[i][j] = ch;
			System.out.print(alphabets[i][j]+ " ");
			ch++;
		}
		System.out.println();

		}
		
	}
}
