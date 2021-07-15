package _0715.object02.exercise.q5;

public class Person {
	public String personName;
	public int money;
	
	public Person(String personName, int money) {
		this.personName = personName;
		this.money = money;
	}
	
	public void goStarCoffee(StarCoffee sCoffee, int money) {
		String message = sCoffee.brewing(4000);
		if(message != null) {
			this.money -= money;
			System.out.println(personName + "는 " + money +"원을 내고 " + message);
		}
	}
	public void goBeanCoffee(BeanCoffee bCoffee, int money) {
		String message = bCoffee.brewing(4500);
		if(message != null) {
			this.money -= money;
			System.out.println(personName + "는 " + money +"원을 내고 " + message);
		}
	}
	
}
