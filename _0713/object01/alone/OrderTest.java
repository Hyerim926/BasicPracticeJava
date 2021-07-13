package _0713.object01.alone;

public class OrderTest {

	public static void main(String[] args) {
		Order o = new Order();
		
		o.OrderNum = 202107130001L;
		o.Id = "abc123";
		o.OrderDate = "2021년 7월 13일";
		o.OrderName = "홍길동";
		o.ProductNum = "PD0345-12";
		o.Address = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문번호: " + o.getOrderNum());
		System.out.println("주문자 아이디: " + o.getId());
		System.out.println("주문 날짜: " + o.getOrderDate());
		System.out.println("주문자 이름: " + o.getOrderName());
		System.out.println("주문 상품 번호: " + o.getProductNum());
		System.out.println("배송 주소: " + o.getAddress());
		
		
	}

}
