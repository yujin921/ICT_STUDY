package Chapter06.Array;
//다시 올리기
import java.util.Random;

public class Array_Class6 {
	public static void main(String[] args) {
		//난수 2가지 방법
		
		//Math 메서드 이용
		double num = Math.random();
		int num2 = (int)(Math.random()*10 +1);
		System.out.println(num);
		System.out.println(num2);
		
		//random 이용
		Random r = new Random();
		int num3 = r.nextInt(100);
		System.out.println(num3);
	}
}
