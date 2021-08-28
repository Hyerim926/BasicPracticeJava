package _0822.finalex;

public class UsingDefine {

	public static void main(String[] args) {
		System.out.println(Define.GOOD_MORNING); // static으로 선언했으므로 인스턴스 생성 없이 클래스 이름으로 참조 가능
		System.out.println("최소값은 " + Define.MIN + "입니다.");
		System.out.println("최대값은 " + Define.MAX + "입니다.");
		System.out.println("수학 과목 코드 값은 " + Define.MATH + "입니다.");
		System.out.println("영어 과목 코드 값은 " + Define.ENG + "입니다.");
	}

}
