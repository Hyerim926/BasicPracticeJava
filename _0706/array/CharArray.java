package _0706.array;

public class CharArray {

	public static void main(String[] args) {

		char[] alph = new char[26];
		char ch = 'a';
		
		for (int i = 0; i < alph.length; i++, ch++) {
			System.out.println(ch);			
		} // 알파벳 출력하기
		
		for (int i = 0; i < alph.length; i++, ch++) {
		 alph[i] = ch;
		} // 아스키 값으로 각 요소에 저장
		
		for (int i = 0; i < alph.length; i++) {
			System.out.println(alph[i] + "," + (int)alph[i]); /* alph[i]에 해당하는 값을 출력, 
			                                (int)alph[i]는 아스키값(char)을 정수형(int)로 변환  */ 
		}
		
		
	}

}
