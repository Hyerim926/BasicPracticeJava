package _0712.loopexample;
// 1~10까지 합
public class DoWhileExample {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		do {
			sum += num;
			num++;
		} while(num <= 10);
		
		System.out.println("1부터 10까지 합은 " + sum + "입니다.");
	}

}
