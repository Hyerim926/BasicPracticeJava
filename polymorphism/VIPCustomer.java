package _0724.polymorphism;

//super() ������ �Ű������� �ִ� ����Ŭ���� ȣ��ޱ� 
public class VIPCustomer extends Customer {

	// ���� Customer Ŭ������ �ߺ����� �ʴ� ��� ����
	// VIPCustomer Ŭ������ CustomerŬ������ ��ӹ���
	private int agentID; // VIP �� ���� ���̵�
	double saleRatio; // ������


	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName); // ����Ŭ���� ������ ȣ��
		customerGrade ="VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}

	@Override // ���� ���� �޼��� ������
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; // ���ʽ� ����Ʈ ����
		return price - (int)(price * saleRatio); // ���ε� ���� ����� ��ȯ
	}




	public int getAgentID() {
		return agentID;
	}
	
	// �� ���� ��� �޼��� ������ 
	public String showVIPInfo() {
		// ���� Ŭ������ showCustomerInfo() ȣ�� �� �߰� ���� �� �Է����ֱ�
		return super.showCustomerInfo() + "��� ���� ���̵�� " + agentID + "�Դϴ�."; 
	}

}
