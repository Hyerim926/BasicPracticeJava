package _0724.inheritance;

public class CustomerTest2 {
	public static void main(String[] args) {
		
		VIPCustomer2 customerKim = new VIPCustomer2();
		// customerID�� customerName�� protected �����̹Ƿ� set()�޼���� ȣ��
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("������");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
	}

}
/*Customer() ������ ȣ�� - ��ӹ��� ���� Ŭ������ ������ ���� ȣ��
VIPCustomer() ������ ȣ��
������ ���� ����� VIP�̸�, ���ʽ� ����Ʈ�� 10000�Դϴ�.
*/