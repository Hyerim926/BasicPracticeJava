package _0713.object01.alone;

public class OrderTest {

	public static void main(String[] args) {
		Order o = new Order();
		
		o.OrderNum = 202107130001L;
		o.Id = "abc123";
		o.OrderDate = "2021�� 7�� 13��";
		o.OrderName = "ȫ�浿";
		o.ProductNum = "PD0345-12";
		o.Address = "����� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ���ȣ: " + o.getOrderNum());
		System.out.println("�ֹ��� ���̵�: " + o.getId());
		System.out.println("�ֹ� ��¥: " + o.getOrderDate());
		System.out.println("�ֹ��� �̸�: " + o.getOrderName());
		System.out.println("�ֹ� ��ǰ ��ȣ: " + o.getProductNum());
		System.out.println("��� �ּ�: " + o.getAddress());
		
		
	}

}
