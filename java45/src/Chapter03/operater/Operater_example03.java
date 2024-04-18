package Chapter03.operater;
import java.util.Scanner;
public class Operater_example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*각 자리수의 합 구하기
 * 출력결과 : 0~999 사이의 정수를 입력하세요
 * 315
 * 각 자리수의 합 : 9
 */
		Scanner scan = new Scanner(System.in);
		System.out.print("0~999 사이의 정수를 입력하세요 : ");
		int number = scan.nextInt();
		int n1 = number/100; //100의자리 9
		int n2 = number/10 - n1*10; // 10자리 99-90=9
		int n3 = number - (n1*100) - (n2*10);//1의자리 999-990=9  
		int sum = n1+n2+n3;
		System.out.println("각 자리수의 합 : "+ sum);
		scan.close();
	}

}
