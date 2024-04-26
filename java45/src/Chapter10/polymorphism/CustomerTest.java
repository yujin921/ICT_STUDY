package Chapter10.polymorphism;

public class CustomerTest {
	public static void main(String[] args) {
		Customer[] customerList = new Customer[5];
		
		customerList[0] = new Customer(10010, "이순신");
		customerList[1] = new Customer(10020,"신사임당");
		customerList[2] = new Customer(10030,"홍길동");
		customerList[3] = new Customer(10040,"이율곡");
		customerList[3].bonusPoint = 1000;
		customerList[4] = new VIPCustomer(10050,"김유신",1588);
		customerList[4].bonusPoint = 2000;
		
		System.out.println("======고객 정보 출력 ======");
		for(Customer c : customerList) {
			System.out.println(c.showCustomerInfo());
		}
		
		System.out.println("\n=====할인율과 보너스 포인트 계산=====");
		int price = 10000;
		for(Customer c : customerList) {
			int cost = c.calcPrice(price);
			System.out.println(c.getCustomerName() + "님이" + cost + "원을 지불하셨습니다.");
			System.out.println(c.getCustomerName() + "님의 현재 보너스 포인트는 "+ c.bonusPoint+"점 입니다.");
		}
	}
}
