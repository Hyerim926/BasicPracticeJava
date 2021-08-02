package _0802.abstractclass.template;

public abstract class Car { 
	public abstract void drive(); // �߻� �޼���
	public abstract void stop(); // �߻� �޼���
	
	public void startCar() { // �Ϲ� �޼���
		System.out.println("�õ��� �մϴ�.");
	}
	
	public void turnOff() { // �Ϲ� �޼���
		System.out.println("�õ��� ���ϴ�.");
	}
	
	final public void run() { // ���ø� �޼���
		startCar();
		drive();
		stop();
		turnOff();
	}
	
}
