package _0830.interfaceex.basic;
// Calc �������̽� �����
public interface Calc {
	// �������̽����� ������ ������ ������ �������� ����� ��ȯ��
	double PI = 3.14;
	int ERROR = -999999999;
	
	// �������̽����� ������ �޼���� ������ �������� �߻� �޼���� ��ȯ��
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	int square(int num);
}