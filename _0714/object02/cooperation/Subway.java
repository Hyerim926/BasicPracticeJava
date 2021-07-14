package _0714.object02.cooperation;
// 지하철 클래스 구현
public class Subway {
	String subwayNumber; // 지하철 노선
	int passengerCount; // 승객 수
	int money; // 수입액
	
	public Subway(String subwayNumber) { // 지하철 노선 번호를 매개변수로 받는 생성자
		this.subwayNumber = subwayNumber;
	}
	
	public void take(int money) { // 승객이 지하철에 탄 경우를 구현한 메서드
		this.money += money; // 수입 증가
		passengerCount++; // 승객 수 증가
	}
	
	public void showInfo() { // 지하철 정보를 출력하는 메서드
		System.out.println("지하철 " + subwayNumber + "의 승객은 " + passengerCount + "명이고, 수입은 " 
				+ money + "입니다.");
	}
}
