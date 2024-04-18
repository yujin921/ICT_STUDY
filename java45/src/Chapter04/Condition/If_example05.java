package Chapter04.Condition;

import java.util.Scanner;

public class If_example05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//윤년구하기
		System.out.print("연도 : ");
		int a = scan.nextInt();
		if(a%4==0) {
			if(a%100==0) {
				if(a%400==0) {
					System.out.println("윤년");
				}else {
					System.out.println("평년");
				}
			}else {
				System.out.println("윤년");
			}
		}else {
			System.out.println("평년");
		}
		scan.close();
		
	}
	
	
	
}
