package _0706.array.exercise;
// 배열 길이가 5, 1~10 중 짝수만 배열에 저장 후 그 합 출력
public class Q3 {
	public static void main(String[] args) {

		int [] arr = {2, 4, 6, 8, 10};
		int total = 0;
		
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		System.out.println("2부터 10까지 짝수의 합은 " + total + "입니다.");
	}

}
