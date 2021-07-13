package _0713.object01.hiding;

public class MyDate {
	private int month; // 아래 public setDay() 메서드를 추가해주지 않으면 오류 발생
	private int day;
	private int year; 
	
	public void setDay(int day) {
		if(month == 2) {
			if(day < 1 || day > 28) {
				System.out.println("오류");
			} else {
				this.day = day;
			}
		}
	}
}
