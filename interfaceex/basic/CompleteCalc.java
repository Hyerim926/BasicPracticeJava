package _0830.interfaceex.basic;
// 계산기 클래스 만들기, times()와 divide() 메서드 추가해서
public class CompleteCalc extends Calculator {

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0)
			return num1 / num2;
		else
			return Calc.ERROR; // num2가 0, 즉 나누는 수가 0인 경우에 대해 오류 반환
	}
	
	@Override
	public int square(int num) {
		return num*num;
	}

	public void showInfo() {
		// CompleteCalc에서 추가로 구현한 메서드
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}

	@Override // 디폴트 메서드 재정의
	public void description() {
		super.description();
	}
	
	
}
