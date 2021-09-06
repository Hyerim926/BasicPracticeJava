package _0711.ifEx;
// 5Ãþ °Ç¹° °¢ Ãþ ´©¸£¸é Á¤º¸ ¶ß°Ô
public class Alone2 {

	public static void main(String[] args) {
		int floor = 5;
		String ment;
		
		switch(floor) {
		case 1:
			ment = "1Ãþ ¾à±¹";
			break;
		
		case 2: 
			ment = "2Ãþ Á¤Çü¿Ü°ú";
			break;
			
		case 3: 
			ment = "3Ãþ ÇÇºÎ°ú";
			break;
			
		case 4: 
			ment = "4Ãþ Ä¡°ú";
			break;

		case 5: 
			ment = "5Ãþ Çï½º Å¬·´";
			break;
		default:
			ment = "Á¸ÀçÇÏÁö ¾Ê´Â Ãþ";
			break;
			
		} System.out.println(ment + "ÀÔ´Ï´Ù.");
	}

}
