package _0715.singleton;
// 4. ���� ����ϴ� �ڵ� �����
public class CompanyTest {
	public static void main(String[] args) {
		// Ŭ���� �̸����� getInstance() ȣ���� ���� ������ ����
		Company myCompany1 = Company.getInstance(); 
		Company myCompany2 = Company.getInstance();
		System.out.println(myCompany1 == myCompany2); // �� ������ ���� �ּ����� Ȯ��
	}

}
