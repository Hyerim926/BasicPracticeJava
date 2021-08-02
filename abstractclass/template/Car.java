package _0802.abstractclass.template;

public abstract class Car { 
	public abstract void drive(); // 추상 메서드
	public abstract void stop(); // 추상 메서드
	
	public void startCar() { // 일반 메서드
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() { // 일반 메서드
		System.out.println("시동을 끕니다.");
	}
	
	final public void run() { // 템플릿 메서드
		startCar();
		drive();
		stop();
		turnOff();
	}
	
}
