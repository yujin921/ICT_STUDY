package Chapter04.Condition;

import java.util.Scanner;

public class Switch_example01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("연도를 입력하세요 : ");
		int user = scan.nextInt();
		int i = user%12;
		String result;
		switch(i){
		case 0 :
			result = "원숭이";
			break;
		case 1:
			result ="닭";
			break;
		case 2:
			result ="개";
			break;
		case 3:
			result = "돼지";
			break;
		case 4:
			result = "쥐";
			break;
		case 5:
			result = "소";
			break;
		case 6:
			result = "호랑이";
			break;
		case 7:
			result = "토끼";
			break;
		case 8:
			result = "용";
			break;
		case 9:
			result = "뱀";
			break;
		case 10:
			result = "말";
			break;
		case 11:
			result = "양";
			break;
		default:
			result = "잘못입력했습니다";
			break;
		}
		System.out.printf("%d년생은 %s띠입니다.",user,result);
		scan.close();
	}
}
