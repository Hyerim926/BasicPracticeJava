package _0706.array;
// 이차원 배열의 길이 출력하기
public class TwoDimension2 {
	public static void main(String[] args) {

		int [][] arr = new int[2][3]; // 2행 3열 이차원 배열 선언
		
		for (int i = 0; i < arr.length; i++) { // 행길이(바깥 for문)
			for (int j = 0; j < arr[i].length; j++) { // 열길이(안쪽 for문)
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
배열에 담아준 값이 없기때문에 각 요소의 값들은 모두 0 */