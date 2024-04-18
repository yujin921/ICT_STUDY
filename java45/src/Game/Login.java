package Game;
import java.util.Scanner;
public class Login {
	public static void main(String[] args) {
		System.out.println("1.회원가입 2.로그인 3.종료");
		Scanner scan = new Scanner(System.in);
		int user = scan.nextInt();
		switch(user) {
			case 1:
				System.out.print("ID를 입력해주세요 : ");
				String id = scan.next();
				System.out.println("패스워드를 입력해주세요 : ");
				String pass = scan.next();
				
		}
		
	}
}
