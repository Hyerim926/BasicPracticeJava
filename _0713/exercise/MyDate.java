package _0713.object01.exercise;

public class MyDate {
	private int month; // 아래 public setDay() 메서드를 추가해주지 않으면 오류 발생
	private int day;
	private int year; 
	
	public boolean isValid = true;
	
	public MyDate(int day, int month, int year) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: // 31일인 달
			if(day < 0 || day > 31) {
				isValid = false;
			} else {
				this.day = day;
			} break;
		case 4: case 6: case 9: case 11: // 30일인 달
			if(day < 0 || day > 30) {
				isValid = false;
			} else {
				this.day = day;
			} break;
		case 2:
			if((year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
				if(day < 0 || day > 29) {
					isValid = false;
				} else {
					this.day = day;
				}
			} break;
			default:
				isValid = false;
		}
	}
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	public String isValid() {
		if(isValid) {
			return "유효한 날짜입니다.";
		} else {
			return "유효하지 않은 날짜입니다.";
		}
	}


}
