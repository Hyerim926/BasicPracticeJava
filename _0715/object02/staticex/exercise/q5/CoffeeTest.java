package _0715.object02.exercise.q5;

public class CoffeeTest {

	public static void main(String[] args) {

		Person kim = new Person("Kim", 10000);
		Person lee = new Person("lee", 15000);
		StarCoffee starCoffee = new StarCoffee();
		
		BeanCoffee beanCoffee = new BeanCoffee();
		
		kim.goStarCoffee(starCoffee, 4000);
		lee.goBeanCoffee(beanCoffee, 4500);
	}

}
