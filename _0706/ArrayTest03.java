package _0706;
// null 값을 제외한 유효한 값(배열에 들어가있는 값)과 그 값들의 곱 출력하기
// length()가 아닌 size()를 사용
public class ArrayTest03 {

	public static void main(String[] args) {

		int size = 0;
		double [] data = new double[5];
		
		data[0] = 10.0; size++;
		data[1] = 20.0; size++;
		data[2] = 30.0; size++;
		
		double total = 1;
		
		for (int i = 0; i < size; i++) {
			System.out.println(data[i]);
			
			total *= data[i];
		}
		System.out.println();
		System.out.println("total= " + total);
	}

}
