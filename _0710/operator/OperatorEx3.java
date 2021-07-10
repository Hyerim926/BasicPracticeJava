package _0710.operator;
// 단락 회로 평가
public class OperatorEx3 {

	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10); // 논리 곱에서 앞 항이 거짓이기때문에 뒷 항 실행안됨 i=2 
		System.out.println(value);// false
		System.out.println(num1); // 20
		System.out.println(i); // 2
		
		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) > 10); // 논리 합에서 앞 항이 참이면 뒷 항 실행 안됨 i=2
		System.out.println(value); // true
		System.out.println(num1); // 30 위에서 num1이 20이 되었기떄문에 여기서 20으로 대입
		System.out.println(i); // 2
		
	}

}
