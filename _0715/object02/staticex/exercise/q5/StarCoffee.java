package _0715.object02.exercise.q5;

public class StarCoffee {
	
	int money;
	
	public String brewing(int money) {
		this.money += money;
		if(money == Menu.STARLATTE) {
			return "���ٹ濡�� ��� �� ���̽��ϴ�.";
		} else if(money == Menu.STARAMERICANO) {
			return "���ٹ濡�� �Ƹ޸�ī�븦 �� ���̽��ϴ�.";
		} else {
			return null;
		}
	}
}
