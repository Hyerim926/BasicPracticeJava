package _0724.vertualfunction;
// 가상 메서드 호출하기
public class TestA {
	int num;
	void aaa() {
		System.out.println("aaa() 출력");
	}
	public static void main(String[] args) {
		TestA a1 = new TestA();
		a1.aaa();
		TestA a2 = new TestA();
		a2.aaa();
		
		
	}

}

/* 
 * aaa() 출력
 * aaa() 출력
 */