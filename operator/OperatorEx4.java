package _0710.operator;
// 조건 연산자 사용해 부모님 나이 비교
public class OperatorEx4 {

	public static void main(String[] args) {
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;
		 ch = (fatherAge > motherAge) ? 'T' : 'F';
		 
		 System.out.println(ch);
		
	}

}
