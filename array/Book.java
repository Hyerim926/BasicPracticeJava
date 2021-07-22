package _0706.array;

public class Book {

	private String bookName;
	private String author;
	
	public Book() {}
	
	public Book(String bookName, String author) {
//		super(); 여기서는 없어도 됨
		this.bookName = bookName;
		this.author = author;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	public void showInfoBook() {
		System.out.println(bookName + "," + author);
	}
	
}
