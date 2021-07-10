package _0710.operator;

public class Exercise {

	public static void main(String[] args) {
		System.out.println("==== Q1 ====");
		int myAge = 26;
		int teacherAge = 38;
		
		boolean value = (myAge > 28);
		System.out.println(value); // False
		
		System.out.println(myAge <= 28); // true
		System.out.println(myAge == teacherAge); // false
		
		char ch;
		ch = (myAge > teacherAge)?'T':'F'; // F
		System.out.println(ch); // F
		
		System.out.println("==== Q2 ====");
		int num;
		num = -5 + 3 * 10 / 2;
		System.out.println(num); // 10
		
		System.out.println("==== Q3 ====");
		int num1 = 10;
		
		System.out.println(num1); // 10
		System.out.println(num1++); // 10
		System.out.println(num1); // 11
		System.out.println(--num1); // 10
		
		System.out.println("==== Q4 ====");
		int num2 = 10;
		int num3 = 20;
		boolean result;
		
		result = ((num2 > 10) && (num3 > 10));
		System.out.println(result); // false
		
		result = ((num2 > 10) || (num3 > 10)); 
		System.out.println(result); // true
		System.out.println(!result); // false

		System.out.println("==== Q5 ====");
		int a = 2;
		int b = 10;
		
		System.out.println(a & b); // 2
		System.out.println(a | b); // 10
		System.out.println(a ^ b); // 8
		System.out.println(~a); // -3
		
		System.out.println("==== Q6 ====");
		int c = 8;
		
		System.out.println(c += 10); // 18
		System.out.println(c -= 10); // 8
		System.out.println(c >>= 10); // 2
		
		System.out.println("==== Q7 ====");
		int d = 10;
		int e = 20;
		
		int result1 = (d >= 10)?e+10:2-10;
		System.out.println(result1); // 30
	}

}
