package _0711.ifEx;
// 예제, 문자열 비교
public class SwitchCase2 {

	public static void main(String[] args) {
		String medal = "Gold";
		
		switch(medal) {
		case "Gold" :
			System.out.println("금메달입니다.");
			break;
		case "Silver" :
			System.out.println("은메달입니다.");
			break;
		case "Bronze" :
			System.out.println("동메달입니다.");
			break;
		default :
			System.out.println("메달이 없습니다.");
			break;
		}
	}

}
