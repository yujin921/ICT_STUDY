package Chapter04.Condition;

import java.util.Scanner;

public class Switch_example02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("연산자 (+,-,*,/) : ");
		String cal = scan.next();
		System.out.print("정수1 입력 : ");
		int a = scan.nextInt();
		System.out.print("정수2 입력 : ");
		int b = scan.nextInt();
		int result = 0;
		switch(cal) {
			case("+"):
				result = a+b;
				break;
			case("-"):
				result = a-b;
				break;
			case("*"):
				result = a*b;
				break;
			case("/"):
				if(b==0) {
					System.out.println("0으로 나눌 수 없습니다. ");
					System.exit(0);
				}else {
					result = a/b;
				}
				break;
			default:
				System.out.println("잘못 입력했습니다. ");
				break;
		}
		System.out.print(result);
		scan.close();
	}
}
