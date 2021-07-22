package _0706.array;

public class TwoDimension {
	public static void main(String[] args) {

		int[][] arr = {{1,2,3}, {4,5,6}}; // 이차원 배열 선언과 동시에 초기화
		
		for (int i = 0; i < arr.length; i++) { // arr.length는 행의 개수
			for (int j = 0; j < arr[i].length; j++) { // arr[i].length는 열의 개수
													// j의 범위로 arr[i]의 길이를 설정해줘야하는 점
				System.out.println(arr[i][j]);
			}
			System.out.println( );
		}
	}

}
