package _0706.array;
// �迭 �ʱ�ȭ�ϰ� �� ���ϱ�
public class ArrayTest01 {

	public static void main(String[] args) {

		int[] arr = {3, 6, 9, 12}; // {} �� new int[]�� ���� ����
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}

}
