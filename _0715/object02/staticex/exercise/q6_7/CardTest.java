package _0715.object02.exercise.q6_7;

public class CardTest {
	public static void main(String[] args) {

		Card card1 = new Card();
		card1.setCardName("����ī��");
		System.out.println(card1.serialNum);
		System.out.println(card1.cardName + "�� ī���ȣ�� " + card1.serialNum );
		
		Card card2 = new Card();
		card2.setCardName("�ϳ�ī��");
		System.out.println(card2.serialNum);
		System.out.println(card2.cardName + "�� ī�� ��ȣ�� " + card2.serialNum);
	}

}
