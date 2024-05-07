package Algorithm;

import java.util.Scanner;

public class Sugar {
	public static void main(String[] args) {
		int a=0, b=0;
		int c=0, d=0;
		Scanner scan = new Scanner(System.in);
		int kilo = scan.nextInt();
		if(kilo>=3) {
			a = kilo/5;
			b = kilo%5;
			System.out.println(b);
			if(b/3==0) {
				c = b/3;
			}else {
				d=-1;
			}
			
		}
		if(d==-1) {
			System.out.println(d);
		}else {
			System.out.println(a+c);
		}
		scan.close();
	}
}
