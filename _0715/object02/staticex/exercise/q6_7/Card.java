package _0715.object02.exercise.q6_7;

public class Card {
	private static int serialNum = 10000;
	public String cardName;
	private int cardNum;
	
	public Card() {
		serialNum++;
		cardNum = serialNum;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public int getCardNum() {
		return cardNum;
	}

	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}

	
}
