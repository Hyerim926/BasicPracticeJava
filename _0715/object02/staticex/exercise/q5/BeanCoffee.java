package _0715.object02.exercise.q5;

public class BeanCoffee {
	
	int money;
	
	public String brewing(int money) {
		this.money += money;
		if(money == Menu.BEANLATTE) {
			return "��ٹ濡�� ��� �� ���̽��ϴ�.";
		} else if(money == Menu.BEANAMERICANO) {
			return "��ٹ濡�� �Ƹ޸�ī�븦 �� ���̽��ϴ�.";
		} else {
			return null;
		}
	}
}
