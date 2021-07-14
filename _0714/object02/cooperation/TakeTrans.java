package _0714.object02.cooperation;
// 버스와 지하철 타기 클래스 구현
public class TakeTrans {
	public static void main(String[] args) {
		// 학생 두 명 생성
		Student studentJames = new Student("James", 5000);
		Student studentTomas = new Student("Tomas", 10000);
		Student studentEdward = new Student("Edward", 20000);
		
		Bus bus100 = new Bus(100); // 노선 번호가 100번인 버스 생성
		studentJames.takeBus(bus100); // james가 100번 버스를 탐
		studentJames.showInfo(); // james 정보 출력
		bus100.showInfo(); // 버스 정보 출력
		
		Subway subwayGreen = new Subway("2호선"); // 노선이 2호선인 지하철 생성
		studentTomas.takeSubway(subwayGreen); // tomas가 2호선 탐
		studentTomas.showInfo(); // tomas 정보 출력
		subwayGreen.showInfo(); // 지하철 정보 출력
		
		Taxi taxi567 = new Taxi(567); // 567번 택시 생성
		studentEdward.takeTaxi(taxi567); // edward가 567번 택시 탐
		studentEdward.showInfo(); // edward 정보 출력
		taxi567.showInfo(); // 택시 정보 출력
}
}
