package _0715.singleton;

public class Company {

	// 2. Ŭ���� ���ο� static���� ������ �ν��Ͻ� �����ϱ�
	private static Company instance = new Company(); // �����ϰ� ������ �ν��Ͻ�
	// 1. �����ڸ� private���� �����

	private Company() {
	}

	// 3. �ܺο��� ������ �� �ִ� public �޼��� ����� (public get()�޼��� ����)
	public static Company getInstance() { // getInstance()�޼���� �ν��Ͻ� ������ ������� ȣ���ؾ��ϱ� ������ static���� �����ؾ���
		if (instance == null) {
			instance = new Company();
		}
		return instance; // �����ϰ� ������ �ν��Ͻ� ��ȯ
	}

}
