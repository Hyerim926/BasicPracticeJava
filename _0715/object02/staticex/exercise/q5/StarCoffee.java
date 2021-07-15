package _0715.object02.exercise.q5;

public class StarCoffee {
	
	int money;
	
	public String brewing(int money) {
		this.money += money;
		if(money == Menu.STARLATTE) {
			return "별다방에서 라뗴를 사 마셨습니다.";
		} else if(money == Menu.STARAMERICANO) {
			return "별다방에서 아메리카노를 사 마셨습니다.";
		} else {
			return null;
		}
	}
}
