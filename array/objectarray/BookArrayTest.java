package _0706.array.objectArray;

public class BookArrayTest {

	public static void main(String[] args) {

		Book[] library = new Book[5];

		library[0] = new Book("�¹���", "������"); // ������ ȣ���ؼ� �ν��Ͻ� �����ϰ� library�迭�� ���� 
		library[1] = new Book("���̾�", "�츣�� �켼"); 
		library[2] = new Book("��� �� ���ΰ�", "���ù�"); 
		library[3] = new Book("����", "�ڰ渮"); 
		library[4] = new Book("�����", "�������丮"); 

		for (int i = 0; i < library.length; i++) {
			library[i].showInfoBook(); // �޸��ּҰ� ���
		}
		
		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]); // library[i] �迭���� ����ϴ� ���� �迭�� ���̸�ŭ �ݺ�
		}
	}

}