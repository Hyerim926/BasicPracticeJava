package _0724.inheritance;

public class CustomerTest3 {
	public static void main(String[] args) {
		
		VIPCustomer3 customerKim = new VIPCustomer3(10020, "������", 12345);
		// customerID�� customerName�� protected �����̹Ƿ� set()�޼���� ȣ��
//		customerKim.setCustomerID(10020);
//		customerKim.setCustomerName("������");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showVIPInfo());
		
	}

}
/*Customer() ������ ȣ�� - ��ӹ��� ���� Ŭ������ ������ ���� ȣ��
VIPCustomer() ������ ȣ��
������ ���� ����� VIP�̸�, ���ʽ� ����Ʈ�� 10000�Դϴ�.
*/