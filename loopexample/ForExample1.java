package _0712.loopexample;
// 1~10 합
public class ForExample1 {

	public static void main(String[] args) {
		int i;
		int sum;
		for(i = 1, sum = 0; i <= 10; i++) {
			sum += 1;
		}
		System.out.println("1부터 10까지 합은 " + sum + "입니다.");
	}

}
