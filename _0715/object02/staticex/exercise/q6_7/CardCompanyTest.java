package _0715.object02.exercise.q6_7;

public class CardCompanyTest {
	public static void main(String[] args) {

		CardCompany cCompany = CardCompany.getInstance();
		Card myCard = cCompany.createCard();
		Card yourCard = cCompany.createCard();
		
		System.out.println(myCard.getCardNum());
		System.out.println(yourCard.getCardNum());
	}

}
