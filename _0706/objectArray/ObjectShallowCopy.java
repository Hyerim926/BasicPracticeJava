package _0706.objectArray;
// ���� ����� array1�� ������ ����ִ� array2�� �ٿ��ֱ�
public class ObjectShallowCopy {

	public static void main(String[] args) {

		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("�¹���", "������"); 
		bookArray1[1] = new Book("���̾�", "�츣���켼"); 
		bookArray1[2] = new Book("��� �� ���ΰ�", "���ù�"); 
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for (int i = 0; i < bookArray2.length; i++) {
		bookArray2[i].showInfoBook(); // ���� array1 ��ҵ��� ���
		}
		
		bookArray1[0].setBookName("����"); // array1 �迭�� ù ��° ��� �� ����
		bookArray1[0].setAuthor("�ڿϼ�");
		
		System.out.println("==== bookArray1 ====");
		for (int i = 0; i < bookArray2.length; i++) {
			bookArray1[i].showInfoBook();
		}
		
		System.out.println("==== bookArray2 ====");
		for (int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showInfoBook(); // array1 ���� ���濡 ���� array2�� ����Ǿ� ���
		}
	}

}
