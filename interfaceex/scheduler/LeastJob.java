package _0830.interfaceex.scheduler;
// ª�� ��⿭ ���� ����ϱ�
// ���� ��� ������ ���ų� ��� ��Ⱑ ���� ���� �������� ���
public class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� ��� ������ ���ų� ��⳪ ���� ���� �������� �Ҵ��մϴ�.");
	}

}
