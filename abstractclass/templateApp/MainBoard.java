package _0822.templateApp;

public class MainBoard {

	public static void main(String[] args) {
		Player player = new Player(); // 처음 생성하면 BeginnerLevel 
		player.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel); // player 클래스의 upgradeplay() 메서드를 불러와서 새 변수 aLevel을 대입
		player.play(2); // aLevel이 대입된 상태인 player 클래스의 paly()메서드를 실행
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
	}

}
