package _0706.array.exercise;
// �迭 ���̰� 5, 1~10 �� ¦���� �迭�� ���� �� �� �� ���
public class Q3 {
	public static void main(String[] args) {

		int [] arr = {2, 4, 6, 8, 10};
		int total = 0;
		
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		System.out.println("2���� 10���� ¦���� ���� " + total + "�Դϴ�.");
	}

}
