package _0830.interfaceex.scheduler;
// ������� ����ϱ�
// ���� �� �� ���ư��� �����ϰ� ��� ���� ���
public class RoundRobin implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� ���� �������� ����մϴ�.");
	}
	
}
