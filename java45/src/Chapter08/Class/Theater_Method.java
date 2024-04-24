package Chapter08.Class;

import java.util.Scanner;

public class Theater_Method {
	//멤버 변수
	private int[][] seats = new int[7][7];
	Scanner scan = new Scanner(System.in);

	public void printMenu(){
		System.out.println("메뉴의 번호를 선택해주세요.");
		System.out.println("====================");
		System.out.println("1. 좌석 확인 \n2. 좌석 예약 \n0.종료");
		System.out.println("====================");
		System.out.print("번호를 선택하세요 : ");
	}
	
	public void checkMenu() {
		System.out.println("*좌석 예약 정보");
		System.out.println("--------------------");
		for(int i = 1; i<=seats[0].length;i++) {
			if(i==1) {
				System.out.print("   "+i+" ");
			}else {
				System.out.print(i+ " ");
			}
		}
		System.out.println("");
		System.out.println("--------------------");
		for(int i=0;i<seats[0].length;i++) {
			for(int j=0; j<seats[0].length;j++) {
				if(j==0) {
					System.out.print((i+1)+"| "+ seats[i][j]+" ");
				}else {
					System.out.print(seats[i][j]+" ");
				}
			}
			System.out.println("");
		}
	}
	public void SeatChoice() {
		System.out.print("몇 개의 좌석을 예약하시겠습니까? : ");
		int num = scan.nextInt();
		for(int i=0; i<num; i++) {
			System.out.print("예약할 좌석의 행 : ");
			int row = scan.nextInt();
			System.out.print("예약할 좌석의 열 : ");
			int col = scan.nextInt();
			
			if(seats[row-1][col-1]==0) {
				System.out.println("예약되었습니다.");
				seats[row-1][col-1] =1;
				
			}else {
				System.out.printf("%d행 %d열은 예약된 좌석 입니다.\n",row,col);
				i--;
			}

		}
	}
	
	public void Error() {
		System.out.println("잘못입력하셨습니다");
	}
	
	public void Exit() {
		System.out.println("프로그램을 종료합니다.");
	}
}
