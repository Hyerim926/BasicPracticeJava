package _0706.array;
// ������ �迭�� ���� ����ϱ�
public class TwoDimension2 {
	public static void main(String[] args) {

		int [][] arr = new int[2][3]; // 2�� 3�� ������ �迭 ����
		
		for (int i = 0; i < arr.length; i++) { // �����(�ٱ� for��)
			for (int j = 0; j < arr[i].length; j++) { // ������(���� for��)
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println(arr.length);
		System.out.println(arr[0].length);
	}

}
/*
0
0
0

0
0
0

2
3
�迭�� ����� ���� ���⶧���� �� ����� ������ ��� 0 */