package test;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
/*
		Ex.2 (40점)
		[ 비밀번호 변경 프로그램 ] 
		계정의 비밀번호를 변경하는 프로그램.
		새롭게 생성된 계정의 비밀번호와 일치하는 비밀번호를 입력한 경우
		비밀번호를 변경할 수 있도록 한다.
		
		* 필수 사항
		* User 클래스에 명시적 생성자, toString, getter/setter 생성할 것.
 */
		Scanner scan = new Scanner(System.in);
		int num = 1;
		User user = null;
		
		do {
			System.out.println();
			System.out.println("""
					= = = 메뉴 = = =
					1. new계정 생성
					2. 비밀번호 변경
					3. 계정정보 출력
					0. 프로그램 종료
					= = = = = = = =
					""");
			System.out.print("* 번호를 입력하세요: ");
			num = scan.nextInt();
			
			switch (num) {
				case 1 -> {
					// ID, PW 를 입력받아 인스턴스 생성
			    	System.out.print("ID : ");
			    	String userId = scan.next();
			    	System.out.printf("PW : ");
			    	String userPw = scan.next();
					user = new User(userId, userPw);
				}
				case 2 -> {
					// 비밀번호 변경 로직 작성
					System.out.print("기존 비밀번호 : ");
					String origin = scan.next();
					if(user == null) {
						System.out.println("계정이 없거나 변경되지 않았습니다.");
						continue;
					}else if(origin.equals(user.getUserPw())) {
						System.out.print("변경하려는 비밀번호 : ");
						String new_pw = scan.next();
						user.setUserPw(new_pw);
						System.out.println("* 변경되었습니다. ");
					}else {
						System.out.println("계정이 없거나 변경되지 않았습니다.");
					}
				}
				case 3 -> {
					// 계정 정보 출력
					if(user == null) {
						System.out.println("계정이 없습니다. ");
					}else {
					System.out.println(user.toString());
					}
				}
				case 0 -> {
					// 프로그램 종료(반복문 종료)
					System.out.println("프로그램을 종료합니다. ");
					System.exit(0);
				}
				default -> System.out.println("잘못 입력했습니다.");

			}
		} while(true);
		
	}

}

// User 클래스
class User {
	private String userId;
	private String userPw;
	
	// 명시적 생성자 생성
	public User(String userId, String userPw) {
		this.userId = userId;
		this.userPw = userPw;
	}
	
	// toString 생성
	public String toString() {
		return "[ID : " + userId + ", PW : " + userPw + "]";
	}
	
	
	// Getter & Setter 생성
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPw() {
        return userPw;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }
    
}


