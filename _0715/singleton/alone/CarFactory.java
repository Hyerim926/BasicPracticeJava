package _0715.singleton.alone;

public class CarFactory {

	private static CarFactory instance = new CarFactory();

	private CarFactory() {

	}

	public static CarFactory getInstance() {
		return instance;
	}

	public Car createCar() {
		Car car = new Car();
		return car;
	}

}
