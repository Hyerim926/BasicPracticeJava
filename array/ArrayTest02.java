package _0706.array;
// 배열 길이만큼 출력
public class ArrayTest02 {

	public static void main(String[] args) {

		double [] data = new double[5];
		
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		System.out.println("=================");
// 배열의 곱
		double total = 0.0;
		
		for (int i = 0; i < data.length; i++) {
			total *= data[i];
		}
		System.out.println("total= " + total); /* 출력문을 for문 안으로 넣으면 값이 반복되어 출력됨
											 한번만 출력하기 위해서는 for문 밖으로 빼야함 */	
	}
}
