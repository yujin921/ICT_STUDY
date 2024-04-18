package Chapter05.For;

import java.util.Scanner;

public class For_example03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 조건문으로 해보기
		System.out.println("조건문으로");
		System.out.print("숫자 입력 : ");
		int a = scan.nextInt();
		System.out.print("숫자 입력 : ");
		int b = scan.nextInt();
		int num;
		if (a>b) {
			num=a-b;
		}else {
			num=b-a;
		}
		int result;
		if (num-2!=0) {
			result = (a+b)*(num-2);
		}else {
			result = a+b+a+1;
		}
		System.out.println(result);
		
		
		//for문으로 해보기
		System.out.println("\nfor문으로");
		System.out.print("숫자 입력 : ");
		int c = scan.nextInt();
		System.out.print("숫자 입력 : ");
		int d = scan.nextInt();
		int e;
		if (c>d) {
			e=c;
			c=d;
			d=e;
		}
		int sum=0;
		for (int i = c;i<=d;i++) {
			sum +=i;
		}
		System.out.println(sum);
		
		
		//while문으로 해보기
		System.out.println("\nwhile문으로");
		int max;
		System.out.print("숫자 입력 : ");
		int q = scan.nextInt();
		System.out.print("숫자 입력 : ");
		int w = scan.nextInt();
		if (q>w) {
			max = q;
			q = w;
			w = max;
		}
		int sum3=0;
		while(q<=w) {
			sum3 +=q;
			q++;
		}
		System.out.println(sum3);
		scan.close();
	}
}
