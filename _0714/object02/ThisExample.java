package _0714.object02;
//�� ���Ͽ� Ŭ������ �� ��
class Birthday { // ��ü�� �ڵ�� ���� Ŭ���� 
	int day;
	int month;
	int year;
	
	public void setYear(int year) { // �¾ ������ ����
		this.year = year; // bDay.year = year;�� ����
	}
	
	public void printThis() { // ���
		System.out.println(this); // System.out.println(b.Day);�� ����, �ּҰ� ���
	}
}
public class ThisExample { // this ��°��� �ǹ̸� �˱� ���� main()�Լ��� ������ ���� �׽�Ʈ�� Ŭ����
	public static void main(String[] args) {
		Birthday bDay = new Birthday();
		bDay.setYear(2021); // �¾ ������ 2021���� ����
		System.out.println(bDay); // ���� ��(�ؽ��ڵ� �ּҰ�) ���
		bDay.printThis(); // this ��¸޼��� ȣ��
	}

}
