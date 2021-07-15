package _0715.singleton;
// 4. 실제 사용하는 코드 만들기
public class CompanyTest {
	public static void main(String[] args) {
		// 클래스 이름으로 getInstance() 호출해 참조 변수에 대입
		Company myCompany1 = Company.getInstance(); 
		Company myCompany2 = Company.getInstance();
		System.out.println(myCompany1 == myCompany2); // 두 변수가 같은 주소인지 확인
	}

}
