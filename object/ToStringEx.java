package javaCh11.object;

// 생성된 인스턴스의 클래스 이름과 주소값을 보여줌

class Book {
	int bookNumber;
	String bookTitle;

	// 책 번호와 제목을 매개변수로 입력받는 생성자
	public Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	@Override // toString() 메서드 재정의
	public String toString() {
		return bookTitle + "," + bookNumber;
	}
	

}

public class ToStringEx {

	public static void main(String[] args) {
		Book book1 = new Book(200, "개미");

		System.out.println(book1); // 인스턴스 정보(클래스 이름.주소 값)
		System.out.println(book1.toString()); // toString() 메서드로 인스턴스 정보(클래스 이름.주소 값)를 보여줌

	}

}
