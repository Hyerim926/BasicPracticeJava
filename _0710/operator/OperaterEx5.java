package _0710.operator;
// ��Ʈ �̵� �����ڸ� ����� ����
public class OperaterEx5 {

	public static void main(String[] args) {
		int num = 0B00000101; // 5�� 8��Ʈ 2������ ��Ÿ��
		
		System.out.println(num << 2); // �������� 2��Ʈ �̵� 000010100(20)
		System.out.println(num >> 2); // ���������� 2��Ʈ �̵� 00000001(1)
		System.out.println(num >>> 2); // ���������� 2��Ʈ �̵� 00000001(1)

		System.out.println(num); // ��Ʈ �̵� ���� ���� ���� �� �״�� ���
		
		num = num << 2; // �������� 2��Ʈ �̵��� ���� �ٽ� num�� ����
		System.out.println(num);
		
		
	}

}
