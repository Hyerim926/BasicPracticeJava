package _0724.inheritance;
// Ŭ���� �� ��ȯ�� ������ �޼��� ȣ��
public class OverridingTest2 {
	public static void main(String[] args) {
		// ������ �� ��ȯ�� ���� VIPCustomer�� Customer������ ��ȯ��
		Customer3 vc = new VIPCustomer4(10030, "������", 2000);
		vc.bonusPoint = 1000;
		
		// calcPrice() �޼��� ȣ��, Customer3���� ���ǵ� �޼��������� VIPCustomer���� �����ǵ� ������ ȣ��� 
		System.out.println(vc.getCustomerName() + " ���� �����ؾ��ϴ� �ݾ��� " + vc.calcPrice(10000) + "�� �Դϴ�.");
		
	}

}
