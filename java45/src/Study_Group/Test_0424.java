package Study_Group;

class Order{
	public int ordernum;
	public String id;
	public 	String day;
	public String name;
	public String productnum;
	public String address;
	
	public void orderInfo() {
		System.out.println("주문 번호 : " + ordernum);
		System.out.println("주문자 아이디 : " + id);
		System.out.println("주문 날짜 : " + day);
		System.out.println("주문자 이름 : " + name);
		System.out.println("주문 상품 번호 : " + productnum);
		System.out.println("배송 주소 : " + address);
	}
	
}




public class Test_0424 {
	public static void main(String[] args) {
		Order order01 = new Order();
		
		order01.ordernum = 20240424;
		order01.id = "abc123";
		order01.day = "2019년 7월 21일";
		order01.name = "홍길순";
		order01.productnum = "PD-345-12";
		order01.address = "서울시 영등포구 여의도동 20번지";

		order01.orderInfo();
	}

}
