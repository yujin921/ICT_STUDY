package Chapter04.Condition;
import java.util.Scanner;
public class If_example03 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("정수 입력 : ");
		
		int a = scan.nextInt();
		if(a%2==0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다. ");
		}
		scan.close();
		
		
		
		
	}
}
