package _0830.interfaceex.basic;
// times()와 divide() 메서드를 구현하지 않았으므로 Calculator는 추상 클래스임
public class Calculator implements Calc {

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

}
