package _0706.objectArray;

public class BookArrayTest {

	public static void main(String[] args) {

		Book[] library = new Book[5];

		library[0] = new Book("태백산맥", "조정래"); // 생성자 호출해서 인스턴스 생성하고 library배열에 저장 
		library[1] = new Book("데미안", "헤르만 헤세"); 
		library[2] = new Book("어떻게 살 것인가", "유시민"); 
		library[3] = new Book("토지", "박경리"); 
		library[4] = new Book("어린왕자", "생텍쥐페리"); 

		for (int i = 0; i < library.length; i++) {
			library[i].showInfoBook(); // 메모리주소값 출력
		}
		
		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]); // library[i] 배열값들 출력하는 것을 배열의 길이만큼 반복
		}
	}

}
