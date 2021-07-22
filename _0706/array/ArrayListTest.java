package _0706.array;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {

		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("태백산맥", "조정래"));
		library.add(new Book("데미안", "헤르만헤세"));
		library.add(new Book("어떻게 살 것인가", "유시민"));
		library.add(new Book("토지", "박경리"));
		library.add(new Book("어린왕자", "생택쥐페리"));
		
		for (int i = 0; i < library.size(); i++) { // 배열의 길이는 size()메서드로, 문자열의 길이는 length()메서드로
			Book book = library.get(i); // i번째째 요소값을 get()메서드로 가져옴
			book.showInfoBook();
		}
		System.out.println();
		
		System.out.println("=====향상된 for문 사용=====");
		for (Book book : library) {
			book.showInfoBook();
		}
	}

}
