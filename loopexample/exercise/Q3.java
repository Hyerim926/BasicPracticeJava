package _0712.loopexample.exercise;
// �������� �ܺ��� ���ϴ� ���� �۰ų� ���� �������� ��� -break��
public class Q3 {

	public static void main(String[] args) {
		int dan;
		int times;
		
		for(dan = 2;dan <= 9;dan++) {
			for(times = 1;times <= 9;times++) {
				if(times > dan) // ���ϴ� ���� �ܺ��� �� ũ��
					break; // Ż��
				System.out.println(dan + "X" + times + "=" + dan*times);
			} System.out.println();
		}
	}

}
