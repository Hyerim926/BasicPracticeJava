package _0706.objectArray;

public class ObjectCopy1 {

	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥", "조정래");
		bookArray1[1] = new Book("데미안", "헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3); 
		// bookArray1를 bookArray2에 그대로 복사 => 시작 = 0, 붙이는 첫 지점 = 0, 복사 요소 수 = 3
		
		for (int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showInfoBook(); // array1 전체가 복사된 array2 출력
		}
	}

}
