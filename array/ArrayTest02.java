package _0706.array;
// �迭 ���̸�ŭ ���
public class ArrayTest02 {

	public static void main(String[] args) {

		double [] data = new double[5];
		
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		System.out.println("=================");
// �迭�� ��
		double total = 0.0;
		
		for (int i = 0; i < data.length; i++) {
			total *= data[i];
		}
		System.out.println("total= " + total); /* ��¹��� for�� ������ ������ ���� �ݺ��Ǿ� ��µ�
											 �ѹ��� ����ϱ� ���ؼ��� for�� ������ ������ */	
	}
}
