package _0724.inheritance;
//super() ������ �Ű������� �ִ� ����Ŭ���� ȣ��ޱ� 
public class VIPCustomer3 extends Customer3 {

	// ���� Customer Ŭ������ �ߺ����� �ʴ� ��� ����
	// VIPCustomer Ŭ������ CustomerŬ������ ��ӹ���
	private int agentID; // VIP �� ���� ���̵�
	double saleRatio; // ������

	
//	public VIPCustomer3(int customerID, String customerName, int agentID) {
//		// ���� �߻��ϹǷ� ���� Ŭ���������� �����ϰ� �Ű������� �߰�����
//		super(int ); // �����Ϸ��� �ڵ����� �߰��ϴ� �ڵ�, ���� Ŭ������ Customer()�� ȣ���
//		customerGrade = "VIP"; // ���� Ŭ�������� private�����̹Ƿ� ���� �߻�
//		bonusRatio = 0.05; // ��� ����
//		saleRatio = 0.1; // ��� ����
//		System.out.println("VIPCustomer() ������ ȣ��"); // ���� Ŭ���� ���� �� �ܼ� ��¹�
//	}

	public VIPCustomer3(int customerID, String customerName, int agentID) {
		super(customerID, customerName); // ����Ŭ���� ������ ȣ��
		customerGrade ="VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		System.out.println("VIPCustomer(int, String, int) ������ ȣ��");
	}


	public int getAgentID() {
		return agentID;
	}
	
	public String showVIPInfo() {
		// ���� Ŭ������ showCustomerInfo() ȣ�� �� �߰� ���� �� �Է����ֱ�
		return super.showCustomerInfo() + "��� ���� ���̵�� " + agentID + "�Դϴ�."; 
	}

}
