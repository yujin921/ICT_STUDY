package Chapter04.Condition;
import java.util.Scanner;
public class If_example02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자1 : ");
		int a = scan.nextInt();
		System.out.print("숫자2 : ");
		int b = scan.nextInt();
		System.out.print("숫자3 : ");
		int c = scan.nextInt();
		int max;
		if(a>=b) {
			if(a>=c) {
				max = a;
			}else {
				max = c;
			}
		}else {
			if(b>=c) {
				max = b;
			}else {
				max = c;
			}
		}
		System.out.println("최댓값 : "+max);
		scan.close();
	}
}
