package _0830.interfaceex.basic;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		// Customer Ŭ�������� customer�� Buy �������̽��� buyer��� ������ ���� ������ ������
		// buyer�� Buy �������̽��� �޼��常 ȣ�� ����
		Buy buyer = customer;
		buyer.buy(); // �����ϱ�
		buyer.order(); // �����ǵ� �޼��� ȣ�� �� �Ǹ� �ֹ�
		
		// Customer Ŭ�������� customer�� Sell �������̽��� seller��� ������ ���� ������ ������
		// seller�� Sell �������̽��� �޼��常 ȣ�� ����
		Sell seller = customer; 
		seller.sell(); // �Ǹ��ϱ�
		buyer.order(); // �����ǵ� �޼��� ȣ�� �� �Ǹ� �ֹ�
		
		if(seller instanceof Customer) {
			Customer customer2 = (Customer)seller; // seller�� ���� Ŭ�������� Customer�� �ٽ� �� ��ȯ(�ٿ�ĳ����)
			customer2.buy(); // �����ϱ�
			customer2.sell(); // �Ǹ��ϱ�
		}
		customer.order(); // �����ǵ� �޼��� ȣ�� �� �Ǹ� �ֹ�
	}

}
