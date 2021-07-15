package _0715.singleton.alone;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance(); // �̱��� ����
		Car mySonata = factory.createCar(); // �޼��忡�� Car ����
		Car yourSonata = factory.createCar(); 
		System.out.println(mySonata.getCardNum()); // 10001 ���
		System.out.println(yourSonata.getCardNum()); // 10002 ���
	}

}
