package javaCh11.object;

// �ּҰ� ���ϱ�
public class StringTest1 {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		// �ν��Ͻ��� �Ź� ���� �����ǹǷ� str1�� str2�� �ּҰ��� �ٸ�
		System.out.println(str1 == str2);
		// ���ڿ� ���� �����Ƿ� true ��ȯ
		System.out.println(str1.equals(str2));
		
		String str3 = "abc";
		String str4 = "abc";
		
		// ���ڿ� abc�� ��� Ǯ�� ����Ǿ� �����Ƿ� str3�� str4�� ����Ű�� �ּ� ���� ����
		System.out.println(str3 == str4);
		// ���ڿ� ���� �����Ƿ� true ��ȯ, �� �񱳽ÿ��� equals() �޼��带 �����
		System.out.println(str3.equals(str4));

	}

}
