package _0830.interfaceex.bookshelf;
// BookShelf 클래스 구현
public class BookShelf extends Shelf implements Queue {

	@Override // 배열에 요소 추가
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override // 맨 처음 요소를 배열에서 삭제하고 반환
	public String deQueue() {
		return shelf.remove(0);
	}

	@Override // 배열 요소 개수 반환
	public int getSize() {
		return getCount();
	}

}
