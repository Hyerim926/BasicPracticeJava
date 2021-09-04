package _0712.loopexample.exercise;
// 사칙연산 수행하는 프로그램 if-else문과 if문과 switch-case문 사용해 풀기
public class Q1 {

	public static void main(String[] args) {
		int num1 = 10; // 인수1변수 설정
		int num2 = 2; // 인수2변수 설정
		char operator = '+'; // 연산 기호 설정, 일일히 바꿔줘야함
		
		int result = 0; // 결과변수 설정
		
		if(operator == '+') { // 대입이 아니라 같다는 의미기 때문에 ==을 사용
			result = num1 + num2;

		} else if(operator == '-') {
			result = num1 - num2;
		
		} else if(operator == '*') {
			result = num1 * num2;
		
		} else if(operator == '/') {
			result = num1 / num2;
		} else {
			System.out.println(result);
			return;
		} 
		System.out.println("num1과 num2의 연산 결과는 " + result + "입니다.");
		System.out.println("=========== switch-case문 ============");
		
		int result1 = 0;
		switch(operator){
		 case '+':
			 result1 = num1 + num2;
			 System.out.println("num1과 num2의 합은 " + result1 + "입니다.");
			 break;
		 case '-':
			 result1 = num1 - num2;
			 System.out.println("num1과 num2의 차는 " + result1 + "입니다.");
			 break;
		 case '*':
			 result1 = num1 * num2;
			 System.out.println("num1과 num2의 곱은 " + result1 + "입니다.");
			 break;
		 case '/':
			 result1 = num1 / num2;
			 System.out.println("num1과 num2의 몫은 " + result1 + "입니다.");
			 break;
		default:
			System.out.println("연산값이 없습니다.");
			break;
		}
	}


}
