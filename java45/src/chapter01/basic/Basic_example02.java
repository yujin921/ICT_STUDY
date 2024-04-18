package chapter01.basic;

public class Basic_example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 변수의 교환
		 * 교환전 x = 200;
		 * 교환전 y = 100;
		 * 교환후 x = 100;
		 * 교환후 y = 100;
		 */
		int x = 200;
		int y = 100;
		int c = x;
		x = y;
		y = c;
		System.out.println("교환 후");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}

}
