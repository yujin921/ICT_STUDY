package chapter02.data;
import java.util.Scanner;
import java.util.Random;
public class Constant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		System.out.println("Let's go 가위바위보!");
		Scanner sc = new Scanner(System.in);
		System.out.print("당신 : ");
		input = sc.next();
		Random random = new Random();
		int computer = random.nextInt(3);
		//computer 0 가위, 1 바위, 2 보
		if(computer == 0) {
			System.out.println("컴퓨터 : 가위");
		}else if(computer == 1) {
			System.out.println("컴퓨터 : 바위");
		}else {
			System.out.println("컴퓨터 : 보");
		}
		if (input.equals("가위")) {
			if (computer ==0) {
				System.out.println("비겼습니다.");
			}else if (computer ==1) {
				System.out.println("졌습니다.");
			}else {
				System.out.println("이겼습니다.");
			}}
		else if (input.equals("바위")) {
			if (computer ==0) {
				System.out.println("이겼습니다.");
			}else if (computer ==1) {
				System.out.println("비겼습니다.");
			}else {
				System.out.println("졌습니다.");
			}
		}
		else if (input.equals("보")) {
			if (computer ==0) {
				System.out.println("졌습니다.");
			}else if (computer ==1) {
				System.out.println("이겼습니다.");
			}else {
				System.out.println("비겼습니다.");
			}
		}
		sc.close();
	}
}
