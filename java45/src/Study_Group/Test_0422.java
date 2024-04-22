package Study_Group;
/*문제 1 - 다음을 만족하는 Student 클래스를 작성하시오.

· String형의 학과와 정수형의 학번을 필드로 선언

· Student 클래스의 main() 메소드에서 Student 객체를 생성하여 학과와 학번 필드에 사용자가 적당한 값을 입력 후 출력*/

import java.util.Scanner;

class Student{
	String major;
	int number;
	Student(String major, int number){
		this.major = major;
		this.number = number;
		System.out.printf("학과 : %s  학번 : %d",major,number);
	}
}
public class Test_0422 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("학과 입력해주세요 : ");
		String user1 = scan.next();
		System.out.print("학번 입력해주세요 : ");
		int user2 = scan.nextInt();
		Student student = new Student(user1,user2);

	}
}

