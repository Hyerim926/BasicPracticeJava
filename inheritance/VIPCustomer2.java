package _0724.inheritance;

public class VIPCustomer2 extends Customer2 {

	// ���� Customer Ŭ������ �ߺ����� �ʴ� ��� ����
	// VIPCustomer Ŭ������ CustomerŬ������ ��ӹ���
	private int agentID; // VIP �� ���� ���̵�
	double saleRatio; // ������

	public VIPCustomer2() {
		super(); // �����Ϸ��� �ڵ����� �߰��ϴ� �ڵ�, ���� Ŭ������ Customer()�� ȣ���
		customerGrade = "VIP"; // ���� Ŭ�������� private�����̹Ƿ� ���� �߻�
		bonusRatio = 0.05; // ��� ����
		saleRatio = 0.1; // ��� ����
		System.out.println("VIPCustomer() ������ ȣ��"); // ���� Ŭ���� ���� �� �ܼ� ��¹�
	}

	public int getAgentID() {
		return agentID;
	}

}
