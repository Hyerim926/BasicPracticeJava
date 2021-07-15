package _0715.singleton;

public class Company {

	// 2. 클래스 내부에 static으로 유일한 인스턴스 생성하기
	private static Company instance = new Company(); // 유일하게 생성한 인스턴스
	// 1. 생성자를 private으로 만들기

	private Company() {
	}

	// 3. 외부에서 참조할 수 있는 public 메서드 만들기 (public get()메서드 구현)
	public static Company getInstance() { // getInstance()메서드는 인스턴스 생성과 상관없이 호출해야하기 때문에 static으로 선언해야함
		if (instance == null) {
			instance = new Company();
		}
		return instance; // 유일하게 생성한 인스턴스 반환
	}

}
