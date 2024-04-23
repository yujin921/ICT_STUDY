package Chapter08.Class;

import java.util.Scanner;

/*
 * 극장 좌석 예약 프로그램 만들기
 * 		1. Theater, Theater_Method 두개의 클래스를 생성하여 기능을 분리한다.
 * 		2. Theater클래스에서는 main()메서드를 포함하며 출력문구를 사용하지 않는다. sysout을 안쓴다
 * 		3. Theater_Method의 멤버변수 혹은 멤버메서드를 호출하여 출력문구 및 로직을 처리한다.
 * 
 * Theater
 *    main() : 메뉴를 종료를 선택하기 전까지 반복하여 보여주고 선택된 번호에 따라 기능을 수행한다.
 * 
 * Theater_Method
 * 	   멤버 변수
 * 		외부에서의 데이터의 접근을 막기 위해 다음과 같이 선언한다.
 * 		private int[][] seats = new int[7][7];
 * 
 * 	   멤버 메서드
 * 		1. printMenu() : 극장 좌석의 예약 현황을 보여준다.
 * 		2. inputCnt() : 예약할 좌석의 개수를 입력받아 반환한다.
 * 		3. seatInfo() : 2차원배열을 이용하여 극장 좌석의 예약현황을 보여준다.
 * 				(예약 X : 1, 예약 O : 0)
 * 		4. reservationSeats(int cnt) : 예약할 좌석의 개수를 매개변수(parameter)로 받고
 * 				그 횟수만큼 행과 열의 값을 입력받는다.
 * 				a. 예약이 되어 있지 않을 경우(해당 행과 열의 값이 0일때), 
 * 				      해당 행과 열의 값을 1로 변경하고, "예약되었습니다."라는 문구를 출력한다.
 * 				b. 예약이 되어 있는 경우(해당 행과 열의 값이 0일때),
 * 				   "x행x열은 예약된 좌석입니다."라는 문구를 출력하고, 다시 행과 열을 입력 받는다.
 * */

class Teater {
	public static void main(String[] args) {
		Teater_Method te = new Teater_Method();

		do {
			te.printMenu();
			
		}while(te.printMenu()!=3);{
			
		}
	}
}

class Teater_Method{
	private int[][] seats = new int[7][7];
	Scanner scan = new Scanner(System.in);
	public int printMenu(){
		System.out.println("메뉴의 번호를 선택해주세요.");
		System.out.println("=====================================");
		System.out.println("1. 좌석 확인 \n2. 좌석 예약 \n3. 종료");
		System.out.println("=====================================");
		System.out.print("번호를 선택하세요 : ");
		int choice = scan.nextInt();
		return choice;
	}
	/* Theater_Method
	 * 	   멤버 변수
	 * 		외부에서의 데이터의 접근을 막기 위해 다음과 같이 선언한다.
	 * 		private int[][] seats = new int[7][7];
	 * 
	 * 	   멤버 메서드
	 * 		1. printMenu() : 극장 좌석의 예약 현황을 보여준다.
	 * 		2. inputCnt() : 예약할 좌석의 개수를 입력받아 반환한다.
	 * 		3. seatInfo() : 2차원배열을 이용하여 극장 좌석의 예약현황을 보여준다.
	 * 				(예약 X : 1, 예약 O : 0)
	 * 		4. reservationSeats(int cnt) : 예약할 좌석의 개수를 매개변수(parameter)로 받고
	 * 				그 횟수만큼 행과 열의 값을 입력받는다.
	 * 				a. 예약이 되어 있지 않을 경우(해당 행과 열의 값이 0일때), 
	 * 				      해당 행과 열의 값을 1로 변경하고, "예약되었습니다."라는 문구를 출력한다.
	 * 				b. 예약이 되어 있는 경우(해당 행과 열의 값이 0일때),
	 * 				   "x행x열은 예약된 좌석입니다."라는 문구를 출력하고, 다시 행과 열을 입력 받는다.
	 * */
	public void inputCnt(){
		System.out.print("몇개의 좌석을 예약하시겠습니까? : ");
		int user_seat = scan.nextInt();
		
	}
	
	public void seatInfo() {
		System.out.println("*좌석 예약 정보");
		System.out.println("-------------------------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println("-------------------------------------");
		for(int i = 1; i<=7; i++) {
			for(int j=0; i<seats.length;j++) {
				System.out.print("%d| "+seats[i][j]);
			}
		}
	}
	
	public void reservationsSeats(int cnt) {
		for(int i=0; i<cnt; i++);{
			System.out.print("예약된 좌석의 행 : ");
			int row = scan.nextInt();
			System.out.print("예약한 좌석의 열 :");
			int col = scan.nextInt();
			if(seats[row][col] == 1) {
				System.out.println();
			}
		}
	}

}
public class Homework {

}
