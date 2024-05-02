package Chapter12.object;

public class MathTest {
	public static void main(String[] args) {
		System.out.println(Math.E);
		System.out.println(Math.PI);
	
		System.out.println("왼쪽 = " + Math.floor(1.6));
		System.out.println("오른쪽 = " + Math.floor(-1.6));
		System.out.println("왼쪽 = " + Math.ceil(1.6));
		System.out.println("왼쪽 = " + Math.ceil(-1.6));
		System.out.println("자름 = " + (int)1.6);
		System.out.println("자름 = " + (int)-1.6);

		System.out.println("반올림 = " + Math.round(1.6));
		System.out.println("반올림 = " + Math.round(1.4));
	}
}
