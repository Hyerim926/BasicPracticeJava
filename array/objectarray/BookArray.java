package _0706.objectArray;

public class BookArray {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		
		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]); /* array의 new 변수 library[i]의 값을 출력
			      							하지만, 아직 값(bookName과 author값이 설정 되지 않았으므로 null 출력 */ 
		}
	}

}
