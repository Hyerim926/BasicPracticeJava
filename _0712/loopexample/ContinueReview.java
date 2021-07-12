package _0712.loopexample;
// 1~100 3의 배수만 출력
public class ContinueReview {

	public static void main(String[] args) {
		int num;
		
		for(num = 1; num <= 100; num++) {
			if(num % 3 !=0)
				continue;
			System.out.println(num);
		} 
	}

}
