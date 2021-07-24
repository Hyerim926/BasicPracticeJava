package _0724.inheritance;

public class Customer {

	// ��� ����
	protected int customerID; // �� ���̵�
	protected String customerName; // �� �̸�
	protected String customerGrade; // �� ���
	int bonusPoint; // ���ʽ� ����Ʈ
	double bonusRatio; // ���� ����
	
	// ����Ʈ ������
	// �� �Ѹ��� ���� �����Ǹ� customerGrade�� SILVER�̰� bonusPoint�� 1%�� ����
	public Customer() {
		customerGrade = "SILVER"; // �⺻ ��� 
		bonusRatio = 0.01; // ���ʽ� ����Ʈ �⺻ ���� ����
	}
	// ���ʽ� ����Ʈ ����, ���� ���� ��� �޼���
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; // ���ʽ� ����Ʈ ���
		return price; // ��ǰ�� ���� �����ؾ��ϴ� �ݾ��� ����� ��ȯ
	}
	
	// �� ���� ���, �� �̸��� ���, ���� ������ ����Ʈ ������
	public String showCustomerInfo() {
		return customerName + " ���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�.";
	}
	
	// protected ������ ������ ������ �ܺο��� ����� �� �ֵ��� get(), set() �޼��� �߰�
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
}
