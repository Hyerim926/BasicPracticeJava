package _0715.object02.exercise.q6_7;

public class CardTest {
	public static void main(String[] args) {

		Card card1 = new Card();
		card1.setCardName("신한카드");
		System.out.println(card1.serialNum);
		System.out.println(card1.cardName + "의 카드번호는 " + card1.serialNum );
		
		Card card2 = new Card();
		card2.setCardName("하나카드");
		System.out.println(card2.serialNum);
		System.out.println(card2.cardName + "의 카드 번호는 " + card2.serialNum);
	}

}
