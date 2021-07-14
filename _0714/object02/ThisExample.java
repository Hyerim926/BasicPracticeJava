package _0714.object02;
//한 파일에 클래스가 두 개
class Birthday { // 객체를 코드로 만든 클래스 
	int day;
	int month;
	int year;
	
	public void setYear(int year) { // 태어난 연도를 지정
		this.year = year; // bDay.year = year;와 동일
	}
	
	public void printThis() { // 출력
		System.out.println(this); // System.out.println(b.Day);와 동일, 주소값 출력
	}
}
public class ThisExample { // this 출력값의 의미를 알기 위해 main()함수를 포함해 만든 테스트용 클래스
	public static void main(String[] args) {
		Birthday bDay = new Birthday();
		bDay.setYear(2021); // 태어난 연도를 2021으로 지정
		System.out.println(bDay); // 참조 값(해시코드 주소값) 출력
		bDay.printThis(); // this 출력메서드 호출
	}

}
