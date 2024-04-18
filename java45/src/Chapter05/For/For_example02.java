package Chapter05.For;

import java.util.Scanner;

public class For_example02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		System.out.println("[for 반복문]");
		for(int i=0; i<5; i++) {
			System.out.print("정수 입력 : ");
			int a = scan.nextInt();
			sum += a;
		}
		System.out.println(sum);
		
		int i =1;
		sum=0;
		System.out.println("[while 반복문]");
		while(i<=5) {
			System.out.print("정수 입력 : ");
			int b = scan.nextInt();
			sum +=b;
			i++;
		}
		System.out.println(sum);
		scan.close();
	}
}
