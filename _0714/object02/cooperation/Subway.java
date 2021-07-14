package _0714.object02.cooperation;
// ����ö Ŭ���� ����
public class Subway {
	String subwayNumber; // ����ö �뼱
	int passengerCount; // �°� ��
	int money; // ���Ծ�
	
	public Subway(String subwayNumber) { // ����ö �뼱 ��ȣ�� �Ű������� �޴� ������
		this.subwayNumber = subwayNumber;
	}
	
	public void take(int money) { // �°��� ����ö�� ź ��츦 ������ �޼���
		this.money += money; // ���� ����
		passengerCount++; // �°� �� ����
	}
	
	public void showInfo() { // ����ö ������ ����ϴ� �޼���
		System.out.println("����ö " + subwayNumber + "�� �°��� " + passengerCount + "���̰�, ������ " 
				+ money + "�Դϴ�.");
	}
}
