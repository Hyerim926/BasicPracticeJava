package _0713.object01.hiding;

public class MyDate {
	private int month; // �Ʒ� public setDay() �޼��带 �߰������� ������ ���� �߻�
	private int day;
	private int year; 
	
	public void setDay(int day) {
		if(month == 2) {
			if(day < 1 || day > 28) {
				System.out.println("����");
			} else {
				this.day = day;
			}
		}
	}
}
