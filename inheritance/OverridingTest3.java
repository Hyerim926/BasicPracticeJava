package _0724.inheritance;
// Ŭ�������� ����Ͽ� ���� �ݾ� ����ϱ�
public class OverridingTest3 {
	public static void main(String[] args) {
		int price = 10000;
		
		// Customer �ν��Ͻ� ����
		Customer3 customerLee = new Customer3(10010, "�̼���");
		System.out.println(customerLee.getCustomerName() + " ���� �����ؾ��ϴ� �ݾ��� " +
							customerLee.calcPrice(price) + "�� �Դϴ�.");
		
		// VIPCustomer �ν��Ͻ� ����
		VIPCustomer4 customerKim = new VIPCustomer4(10020, "������", 12345);
		System.out.println(customerKim.getCustomerName() + " ���� �����ؾ��ϴ� �ݾ��� " +
				customerKim.calcPrice(price) + "�� �Դϴ�.");
		
		// ������ �� ��ȯ���� �ν��Ͻ� ����
		Customer3 vc = new VIPCustomer4(10030, "������", 2000);
		System.out.println(vc.getCustomerName() + " ���� �����ؾ��ϴ� �ݾ��� " +
				vc.calcPrice(price) + "�� �Դϴ�.");
		
		
		
	}

}
