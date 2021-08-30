package _0830.interfaceex.scheduler;

import java.io.IOException;

// �Է� ���ڿ� ���� ��� ��å �����ϱ�
public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		System.out.println("��ȭ ��� �Ҵ� ����� �����ϼ���.");
		System.out.println("R : �Ѹ� ���ʷ� �Ҵ�");
		System.out.println("L : ���� �ְų� ��Ⱑ ���� ���� �������� �Ҵ�");
		System.out.println("P : �켱������ ���� �� ���� �Ҵ�");
		
		// �Ҵ� ����� �Է¹޾� ch������ ����
		int ch = System.in.read();
		Scheduler scheduler = null;
		
		// �Է¹��� ���� R �Ǵ� r�̸� RoundRobin Ŭ���� ����
		if(ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin();
		}
		// �Է¹��� ���� L �Ǵ� l�̸� RoundRobin Ŭ���� ����
		else if(ch == 'L' || ch == 'l') {
			scheduler = new LeastJob();
		}
		// �Է¹��� ���� P �Ǵ� p�̸� RoundRobin Ŭ���� ����
		else if(ch == 'P' || ch == 'p') {
			scheduler = new PriorityAllocation();
		}
		else if(ch == 'A' || ch == 'a') {
			scheduler = new AgentGetCall();
		}
		else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
			return;
		}
		// � ��å�ΰ��� ������� �������̽��� ������ �޼��� ȣ��
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}
