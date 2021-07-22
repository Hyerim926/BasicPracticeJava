package _0706.array.objectArray;

public class ObjectDeepCopy {

	public static void main(String[] args) {
		
		// �� �迭 ����
		Book[] bookArray1 = new Book[3]; 
		Book[] bookArray2 = new Book[3]; 
		
		// bookArray1�� �迭��Ұ� ����
		bookArray1[0] = new Book("�¹���", "������");
		bookArray1[1] = new Book("���̾�", "�츣�� �켼");
		bookArray1[2] = new Book("��� �� ���ΰ�", "���ù�");
		
		// bookArray2 �ν��Ͻ� ����
		bookArray2[0] = new Book(); // Book Ŭ������ public���� ������ ��������
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		// bookArray1 ��Ҹ� ���� ������ Array2 �ν��Ͻ��� ����, set���� array1�� �� ����
		for (int i = 0; i < bookArray1.length; i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		
		// �ν��Ͻ��� �������� �� ������ Array2 ��ҵ�
		for (int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showInfoBook();
		}
		
		// array1�� ù��° �� �缳��
		bookArray1[0].setBookName("����");
		bookArray1[0].setAuthor("�ڿϼ�");
		
		System.out.println("==== bookArray1 ====");
		// array1 ��Ұ���(bookArray[i]) ���
		for (int i = 0; i < bookArray1.length; i++) {
			bookArray1[i].showInfoBook();
		}
		
		System.out.println("==== bookArray2 ===="); 
		// array2�� ���� ��Ұ��� ���, ���� ����� ���� �迭�� ���氪�� ������� ����
		for (int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showInfoBook();	

			}
		}
	}
	
