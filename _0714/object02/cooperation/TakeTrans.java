package _0714.object02.cooperation;
// ������ ����ö Ÿ�� Ŭ���� ����
public class TakeTrans {
	public static void main(String[] args) {
		// �л� �� �� ����
		Student studentJames = new Student("James", 5000);
		Student studentTomas = new Student("Tomas", 10000);
		Student studentEdward = new Student("Edward", 20000);
		
		Bus bus100 = new Bus(100); // �뼱 ��ȣ�� 100���� ���� ����
		studentJames.takeBus(bus100); // james�� 100�� ������ Ž
		studentJames.showInfo(); // james ���� ���
		bus100.showInfo(); // ���� ���� ���
		
		Subway subwayGreen = new Subway("2ȣ��"); // �뼱�� 2ȣ���� ����ö ����
		studentTomas.takeSubway(subwayGreen); // tomas�� 2ȣ�� Ž
		studentTomas.showInfo(); // tomas ���� ���
		subwayGreen.showInfo(); // ����ö ���� ���
		
		Taxi taxi567 = new Taxi(567); // 567�� �ý� ����
		studentEdward.takeTaxi(taxi567); // edward�� 567�� �ý� Ž
		studentEdward.showInfo(); // edward ���� ���
		taxi567.showInfo(); // �ý� ���� ���
}
}
