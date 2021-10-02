package javaCh11.object;

// ������ �ǹ��ϴ� Point Ŭ����
class Point {
	int x;
	int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "x = " + x + "." + "y = " + y;
	}

}

// ��ü�� �����ص� �ȴٴ� �ǹ̷� Cloneable �������̽��� �Բ� ����
class Circle implements Cloneable {
	Point point;
	int radius;

	Circle(int x, int y, int radius) {
		this.radius = radius;
		point = new Point(x, y);
	}

	@Override
	public String toString() {
		return "������ " + point + "�̰�, " + "�������� " + radius + "�Դϴ�.";
	}

	@Override // clone() �޼��带 ����� �� �߻��� �� �ִ� ������ ���� ó����
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

public class ObjectCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle = new Circle(10, 20, 30);
		// clone() �޼��带 ����� circle �ν��Ͻ��� copyCircle�� ������
		Circle copyCircle = (Circle)circle.clone();
		
		System.out.println(circle);
		System.out.println(copyCircle);
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(copyCircle));

	}

}
