package _0706.array;

public class CharArray {

	public static void main(String[] args) {

		char[] alph = new char[26];
		char ch = 'a';
		
		for (int i = 0; i < alph.length; i++, ch++) {
			System.out.println(ch);			
		} // ���ĺ� ����ϱ�
		
		for (int i = 0; i < alph.length; i++, ch++) {
		 alph[i] = ch;
		} // �ƽ�Ű ������ �� ��ҿ� ����
		
		for (int i = 0; i < alph.length; i++) {
			System.out.println(alph[i] + "," + (int)alph[i]); /* alph[i]�� �ش��ϴ� ���� ���, 
			                                (int)alph[i]�� �ƽ�Ű��(char)�� ������(int)�� ��ȯ  */ 
		}
		
		
	}

}
