package javaCh11.object;

// �� ���ڿ� �����ϱ�
public class StringTest2 {

	public static void main(String[] args) {
		String javaStr = new String("java");
		String androidStr = new String("android");
		System.out.println(javaStr);
		System.out.println("ó�� ���ڿ� �ּ� ��: " + System.identityHashCode(javaStr));
		
		// ���ڿ� javaStr�� ���ڿ� androidStr�� �����Ͽ� javaStr�� ����
		javaStr = javaStr.concat(androidStr);
		
		// �� ���ڿ��� ����� ���ο� ���ڿ� ���
		System.out.println(javaStr);
		// �� ���ڿ��� ����Ǿ� ���� ���� �ּҰ��� �����
		System.out.println("����� ���ڿ� �ּ� ��: " + System.identityHashCode(javaStr));

	}

}
