package Chapter03.operater;
import java.util.Scanner;
public class Operater_example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 상품가격과 받은 금액을 입력받아서 거스름돈 출력
		출력결과 : 받은 금액 : 10000
		상품 가격 : 1500
		거스름돈 : 8500*/
		Scanner scan = new Scanner(System.in);
		System.out.print("받은 금액 : ");
		int money = scan.nextInt();
		System.out.print("상품 가격 : ");
		int value = scan.nextInt();
		int jan = money - value;
		System.out.print("거스름돈 : "+ jan);
		scan.close();
		
	}

}
