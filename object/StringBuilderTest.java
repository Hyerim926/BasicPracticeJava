package javaCh11.object;

public class StringBuilderTest {

	public static void main(String[] args) {
		String javaStr = new String("Java");
		// �ν��Ͻ��� ó�� �������� �� �޸� �ּ�
		System.out.println("javaStr ���ڿ� �ּ� :" + System.identityHashCode(javaStr));
		
		// String���κ��� StringBuilder ����(�ּҰ� �ٸ�)
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println("���� �� buffer �޸� �ּ�: " + System.identityHashCode(buffer));
		
		// ���ڿ� �߰�
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming is fun!!");
		
		// String Ŭ������ ��ȯ���� �ʰ� �ٷ� buffer ������ ����ص� ���� ���� ���´�. �ٸ� �������� ������ �ٸ� �� ����.
		// �޸𸮴� ���̳ʸ� ���ڵ��� �����Ͽ� �޸𸮿� �ִ� �������̰� ���ڿ��� �ܼ� ���ڿ����� ����Ų��.
		System.out.println(buffer);
		System.out.println("���� �� buffer �޸� �ּ�: " + System.identityHashCode(buffer));
		
		// String Ŭ������ ��ȯ
		javaStr = buffer.toString();
		System.out.println(javaStr);
		System.out.println("����� javaStr ���ڿ� �ּ�: " + System.identityHashCode(javaStr));

	}

}
