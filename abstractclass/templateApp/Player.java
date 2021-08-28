package _0822.templateApp;

public class Player {
	private PlayerLevel level; // Player�� ������ level ���� ����
	
	public Player() { // ����Ʈ ������, ó�� �����Ǹ� BeginnerLevel�� �����ϸ� ���� �޽��� ���
		level = new BeginnerLevel(); 
		level.showLevelMessage();
	}

	public PlayerLevel getLevel() {
		return level;
	}
	// �Ű����� �ڷ����� ��� ������ ��ȯ ������ PlayerLevel
	// ���� ���� �޼���. ���� �ڽ��� level�� �Ű������� ���� level�� �����ϰ� ���� �޽��� ���
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count); // PlayerLevel�� ���ø� �޼��� go() ȣ��
	}
	
	

}
