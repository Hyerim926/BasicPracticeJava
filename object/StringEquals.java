package javaCh11.object;

public class StringEquals {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		// �� �ν��Ͻ� �ּ� ���� ������ ���Ͽ� ���
		System.out.println(str1 == str2); // �ν��Ͻ� �ּҰ��� �ٸ�
		// String Ŭ������ equals()�޼��� ���. �� �ν��Ͻ��� ���ڿ� ���� ������ ���Ͽ� ���
		System.out.println(str1.equals(str2)); // ������ ���ڿ� ���� ����
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		// �� �ν��Ͻ� �ּҰ��� ������ ���Ͽ� ���
		System.out.println(i1 == i2); // �ν��Ͻ� �ּҰ��� �ٸ�
		// Integer Ŭ������ equals() �޼��� ���. �� �ν��Ͻ��� ���� ���� ������ ���Ͽ� ���
		System.out.println(i1.equals(i2)); // ������ ���� ���� ����

	}

}
