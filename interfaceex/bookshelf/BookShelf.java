package _0830.interfaceex.bookshelf;
// BookShelf Ŭ���� ����
public class BookShelf extends Shelf implements Queue {

	@Override // �迭�� ��� �߰�
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override // �� ó�� ��Ҹ� �迭���� �����ϰ� ��ȯ
	public String deQueue() {
		return shelf.remove(0);
	}

	@Override // �迭 ��� ���� ��ȯ
	public int getSize() {
		return getCount();
	}

}
