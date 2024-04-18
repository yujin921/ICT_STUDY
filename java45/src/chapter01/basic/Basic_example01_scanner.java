package chapter01.basic;
import java.util.Scanner; //scanner 설치

/* scanner
in.nextByte()		// byte 형 입력 및 리턴
in.nextShort()		// short 형 입력 및 리턴
in.nextInt()		// int 형 입력 및 리턴
in.nextLong()		// long 형 입력 및 리턴
 
in.nextFloat()		// float 형 입력 및 리턴
in.nextDouble()		// double 형 입력 및 리턴
 
in.nextBoolean()	// boolean 형 입력 및 리턴
 
in.next()			// String 형 입력 및 리턴	(공백을 기준으로 한 단어를 읽음)
in.nextLine()		// String 형 입력 및 리턴 (개행을 기준으로 한 줄을 읽음) */

public class Basic_example01_scanner {

	public static void main(String[] args) {
		// 이름, 나이, 키를 입력받아 출력
		Scanner scan = new Scanner(System.in); //scanner 이름 및 속성 scan 짓기 : new Scanner(System.in)
		
		System.out.print("이름 : ");
		String name = scan.next(); //string 입력
		
		
		
		System.out.print("나이 : ");
		int age = scan.nextInt(); //int 입력
		
		
		System.out.print("키 : ");
		float hight = scan.nextFloat(); //float 입력
		
		
		System.out.printf("이름은 %s이고 나이는 %d세, 키는 %.1fcm 입니다.\n",name,age,hight);
		System.out.println("이름은 " + name +"이고 나이는" + age + "세,키는 " + hight +"cm 입니다." );
		scan.close();
	}
}
