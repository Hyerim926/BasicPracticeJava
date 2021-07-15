package _0715.singleton.alone;

public class Car {
	
	private static int serialNum = 10000;
	private int cardNum;
	
	public Car() {
		serialNum++;
		cardNum = serialNum;
	}

	public int getCardNum() {
		return cardNum;
	}

	public void setCardNum(int carNum) {
		this.cardNum = cardNum;
	}


	
}
