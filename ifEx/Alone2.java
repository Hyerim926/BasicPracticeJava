package _0711.ifEx;
// 5�� �ǹ� �� �� ������ ���� �߰�
public class Alone2 {

	public static void main(String[] args) {
		int floor = 5;
		String ment;
		
		switch(floor) {
		case 1:
			ment = "1�� �౹";
			break;
		
		case 2: 
			ment = "2�� �����ܰ�";
			break;
			
		case 3: 
			ment = "3�� �Ǻΰ�";
			break;
			
		case 4: 
			ment = "4�� ġ��";
			break;

		case 5: 
			ment = "5�� �ｺ Ŭ��";
			break;
		default:
			ment = "�������� �ʴ� ��";
			break;
			
		} System.out.println(ment + "�Դϴ�.");
	}

}
