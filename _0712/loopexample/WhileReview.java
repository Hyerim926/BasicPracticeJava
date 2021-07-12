package _0712.loopexample;
// 1~50 합
public class WhileReview {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		while(num <= 50) {
			sum += num;
			num++;
		} System.out.println("1부터 50까지의 합은 " + sum + "입니다.");
	}

}
