package _0706.objectArray;

public class BookArray {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		
		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]); /* array�� new ���� library[i]�� ���� ���
			      							������, ���� ��(bookName�� author���� ���� ���� �ʾ����Ƿ� null ��� */ 
		}
	}

}
