package Game;
import java.util.Scanner;
public class Least {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("두 수를 입력하세요 : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int min = 0;
		int max = 0;
		for(int i=1; i<=num1*num2;i++) {
			if((i%num1==0)&&(i%num2==0)) {
				min = i;
				break;
			}
		}
		System.out.println("최소공배수 = "+ min);
		int n;
		if(num1>=num2) {
			n = num1;
		}else {
			n = num2;
		}
		for(int i = n; i>=1; i--) {
			if((num1%i ==0)&&(num2%i==0)) {
				max = i;
				break;
			}
		}
		System.out.println("최대공약수 = "+ max);
		scan.close();
	}
}
