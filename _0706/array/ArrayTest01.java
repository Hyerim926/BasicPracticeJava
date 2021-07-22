package _0706.array;
// 배열 초기화하고 합 구하기
public class ArrayTest01 {

	public static void main(String[] args) {

		int[] arr = {3, 6, 9, 12}; // {} 앞 new int[]는 생략 가능
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}

}
