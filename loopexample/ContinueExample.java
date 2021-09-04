package _0712.loopexample;
// 1~100 합 단, 짝수는 더하지 않기
public class ContinueExample {

	public static void main(String[] args) {
		int total = 0;
		int num;
		
		for(num=1; num <= 100; num++) { // 100까지 반복
			if(num % 2 == 0) // num값이 짝수인 경우
				continue; //이후 수행 생략하고 num++ 수행
			total += num; // num값이 홀수인 경우에만 수행
		}
		System.out.println("1~100의 홀수 합은 " + total + "입니다.");
	}

}
