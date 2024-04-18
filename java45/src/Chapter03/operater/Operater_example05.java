package Chapter03.operater;
import java.util.Scanner;
public class Operater_example05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* 정수 3개를 입력받아 각 변수에 값을 넣고, 입력받은 값 중 최댓값을 출력하세요.*/
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int n1 = scan.nextInt();
		System.out.print("두번째 정수 : ");
		int n2 = scan.nextInt();
		System.out.print("세번째 정수 : ");
		int n3 = scan.nextInt();
		
		int max = (n1>n2)? n1:n2;
		max=(max>n3)?max:n3;
		
		//int max = (n1>n2)?((n1>n3)? n1:n3):((n2>n3)?n2:n3);
		/*if(n1>=n2) {
			if(n1>=n3) {
				max = n1;
			}else {
				max = n3;
			}
		}else if(n2>=n1) {
			if(n2>=n3) {
				max = n2;
			}else {
				max = n3;
			}
		}*/
		System.out.println("최댓값 : "+max);
		scan.close();
		
	}

}
