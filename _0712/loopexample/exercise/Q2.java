package _0712.loopexample.exercise;
// 구구단 짝수단만 출력 - continue문 사용
public class Q2 {

	public static void main(String[] args) {
		int dan;
		int times;
		
		for(dan = 2; dan <= 9; dan++) {
			for(times = 1; times <= 9; times++ ) {
				if(dan % 2 != 0)
					continue;
				System.out.println(dan + "x" + times + "=" + dan*times );
			} System.out.println();
	}
	}
}
