package _0724.inheritance;

public class OverridingTest1 {

	public static void main(String[] args) {
		Customer3 customerLee = new Customer3(10010, "�̼���");
		customerLee.bonusPoint = 1000;
		
		VIPCustomer4 customerKim = new VIPCustomer4(10020, "������", 12345);
		customerKim.bonusPoint = 10000;
		
		int price = 10000;
		System.out.println(customerLee.getCustomerName() + " ���� �����ؾ��ϴ� �ݾ��� " + customerLee.calcPrice(price) + "�� �Դϴ�.");
		System.out.println(customerKim.getCustomerName() + " ���� �����ؾ��ϴ� �ݾ��� " + customerKim.calcPrice(price) + "�� �Դϴ�.");
		
		
	}

}
