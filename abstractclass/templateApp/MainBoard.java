package _0822.templateApp;

public class MainBoard {

	public static void main(String[] args) {
		Player player = new Player(); // ó�� �����ϸ� BeginnerLevel 
		player.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel); // player Ŭ������ upgradeplay() �޼��带 �ҷ��ͼ� �� ���� aLevel�� ����
		player.play(2); // aLevel�� ���Ե� ������ player Ŭ������ paly()�޼��带 ����
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
	}

}
