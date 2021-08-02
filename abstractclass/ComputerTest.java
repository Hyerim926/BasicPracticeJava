package _0802.abstractclass;

public class ComputerTest {
// Computer()는 추상클래스이기 때문에 인스턴스 생성 불가
// 그러나, 추상 클래스에서 형 변환을 사용하는 것은 가능하며, DeskTop, NoteBook, MyNoteBook 클래스는 상위 클래스 Computer형으로 선언 가능
	public static void main(String[] args) {
		Computer c1 = new Computer();
		Computer c2 = new Computer();
		Computer c3 = new Computer();
		Computer c4 = new Computer();
		
		
	}

}
