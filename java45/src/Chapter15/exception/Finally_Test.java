package Chapter15.exception;

import java.util.Scanner;

public class Finally_Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("접속");
		try {
			System.out.println("전송");
			System.out.print("입력 : ");
			int a = scan.nextInt();
			System.out.println(a);
			
			throw new Exception();
		} catch (Exception e) {
			System.out.println("예외 처리");
		} finally {
			System.out.println("해제");
		}
		System.out.println("프로그램 종료");
		scan.close();
	}
}
