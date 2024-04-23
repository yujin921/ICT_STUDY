package Chapter08.Class;

import java.util.Scanner;

public class Theater {
	public static void main(String[] args) {
		Theater_Method tm = new Theater_Method();
		Scanner scan = new Scanner(System.in);
		int num = 0, row = 0, col =0, cnt =0;
		
		while(true) {
			tm.printMenu();
			num = scan.nextInt();
			switch(num){
				case 1: //좌석 정보를 출력하는 메서드
					tm.checkMenu();
					break;
				case 2: //좌석 예약을 실행하는 메서드
					tm.SeatChoice();
					break; 
				case 0:
					tm.Exit();
					System.exit(0);
				default:
					//입력 1,2,0이 아닐 경우 메시지를 출력하는 메서드
					break;
			}
		}
	}
}
