package _0802.abstractclass;

public abstract class Computer {

	public abstract void display(); // 추상 메서드
	public abstract void typing(); // 추상 메서드
	public void turnOn() { // 일반 메서드
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() { // 일반 메서드
		System.out.println("전원을 끕니다.");
	}
}
