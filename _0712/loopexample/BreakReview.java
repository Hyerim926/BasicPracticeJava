package _0712.loopexample;
// 1부터 더했을 때 그 합이 500 넘는 자연수는?
public class BreakReview {

	public static void main(String[] args) {
		int sum = 0;
		int num;
		
		for(num = 1; ; num++) {
			sum += num;
			if(sum >= 500) 
				break;
		}
		System.out.println(sum);
		System.out.println(num);
	}

}
