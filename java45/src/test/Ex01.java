package test;

import java.util.Scanner;


public class Ex01 {

	public static void main(String[] args) {
/*
		Ex.1 (40점)
		[ 사용자 정보 확인 PRORGRAM ]
		이름, 나이, 주소를 입력받고, 
		해당 정보를 출력하는 메서드를 작성하세요.
		
		필수 사항
		* main 메서드에서는 userInfo()를 호출하기만 할 것.
		* 주소는 공백을 포함하여 입력 및 출력할 것.
			- Ex. 주소 입력: 삼성동 코엑스 4층 ICT교육센터  
 */
		userInfo();

	}
	
	// userInfo() 생성
	static void userInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = scan.next();
		System.out.print("나이 입력 : ");
		int age = scan.nextInt();
		scan.nextLine(); //nextLine을 사용하기 위해 엔터값 없애기
		System.out.print("주소 입력 : ");
		String adr = scan.nextLine();
		
		
		System.out.printf("\n이름 : %s \n나이 : %d \n주소 : %s",
				name, age, adr);
		
		scan.close();

	}
}
