package _0724.inheritance;

public class VIPCustomer extends Customer {

	// ���� Customer Ŭ������ �ߺ����� �ʴ� ��� ����
	// VIPCustomer Ŭ������ CustomerŬ������ ��ӹ���
	private int agentID; // VIP �� ���� ���̵�
	double saleRatio; // ������

	public VIPCustomer() {
		customerGrade = "VIP"; // ���� Ŭ�������� private�����̹Ƿ� ���� �߻�
		bonusRatio = 0.05; // ��� ����
		saleRatio = 0.1; // ��� ����
	}

	public int getAgentID() {
		return agentID;
	}

}
