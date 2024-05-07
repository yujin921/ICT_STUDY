package Chapter15.exception;

import java.util.Scanner;

class IDFormatException extends Exception { //예외 메세지를 호출하는 클래스 생성
	public IDFormatException(String message) {
		super(message); //메세지 넣기
	}
}

public class IDFormatTest {
	String userID;
	public void checkUserID(String userID) throws IDFormatException {
		// 사용자 정의 예외 클래스 IDFormatException 생성
		// userID가 null일 경우
		// => ERR " 아이디는 null일 수 없습니다." 출력
		// userID가 8~20자가 아닐 경우
		// => ERR"아이디는 8자 이상 20자 이하로 쓰세요." 출력

     // userID가 null인 경우
		if (userID == null || userID.equals("null")) {
			throw new IDFormatException("아이디는 null일 수 없습니다.");
		}
     // userID의 길이가 8보다 작거나 20보다 큰 경우
		else if (userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 쓰세요.");
		}
		System.out.println(userID);
		
	}
	public static void main(String[] args) throws IDFormatException {
		Scanner scan = new Scanner(System.in);
		IDFormatTest test = new IDFormatTest();
		
		System.out.print("ID : ");
		String userID = scan.next();
		test.checkUserID(userID);
		scan.close();
	}

}
