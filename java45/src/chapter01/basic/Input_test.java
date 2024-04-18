package chapter01.basic;
import java.util.Scanner;
public class Input_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Byte : ");
		byte a = scan.nextByte();
		System.out.print("Short : ");
		short b = scan.nextShort();
		System.out.print("Int : ");
		int c = scan.nextInt();
		System.out.print("Long : ");
		long d = scan.nextLong();
		System.out.print("Float : ");
		float e = scan.nextFloat();
		System.out.print("Double : ");
		double f = scan.nextDouble();
		System.out.print("String : ");
		String s = scan.next();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(s);
		
		
		scan.close();
	}

}
