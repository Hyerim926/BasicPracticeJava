package _0822.templateApp;
// 각 레벨에서 수행할 공통 기능(추상클래스)
public abstract class PlayerLevel {
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	final public void go(int count) { // 재정의되면 안되므로 final로 선언
		run();
		for (int i = 0; i < count; i++) {
			jump();
		}
		turn();
	}
	
}
