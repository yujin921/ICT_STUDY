package Game;
import java.util.Scanner;
public class Gugudan {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("1)원하는 구구단 출력  2) 전체 구구단 출력   3)종료 : ");
	int num = scan.nextInt();
	switch(num) {
		case 1: 
			System.out.print("몇 단을 출력하시겠습니까? : ");
			int user = scan.nextInt();
			for(int k = 1; k<=9; k++) {
				int multi = user*k;
				System.out.printf("  %d * %d = %d \n",user,k,multi);
			}
			break;
		case 2:
			for(int i=1; i<=9; i++) {
				for(int j=1; j<=9; j++) {
					int multi2 = i*j;
					System.out.printf("  %d * %d = %d \n ", i, j, multi2);
				}
			}
			break;
		case 3:
			System.out.print("종료합니다");
			break;}
		scan.close();
	}
}
