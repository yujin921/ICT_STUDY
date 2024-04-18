package Chapter04.Condition;

import java.util.Scanner;

public class If_example04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int a = scan.nextInt();
		if (a<0||a>100) {
			System.out.println("잘못 입력했습니다.");
			System.exit(0);
		}
		//조건문을 할 경우
		if(a>=90) {
			System.out.println("수");
		}else if(a>=80) {
			System.out.println("우");
		}else if(a>=70) {
			System.out.println("미");
		}else if(a>=60) {
			System.out.println("양");
		}else {
			System.out.println("가");
		}
		
		
		//삼항연산자로 했을 경우
		String result = (a>=90)? "수":((a>=80)? "우":((a>=70)?"미":((a>=60)?"양":"가")));
		System.out.println(result);
		scan.close();
	}
	
	
}
