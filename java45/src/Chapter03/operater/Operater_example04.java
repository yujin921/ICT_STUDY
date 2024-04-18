package Chapter03.operater;
import java.util.Scanner;
public class Operater_example04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* 정수 3개를 입력한 뒤 각 변수 값을 넣고, 총합과 평균을 출력, 평균은 실수,
 * kor :80, eng : 75, mat : 35 
 */
		Scanner scan = new Scanner(System.in);
		System.out.print("kor 점수 : ");
		int kor = scan.nextInt();
		System.out.print("eng 점수 : ");
		int eng = scan.nextInt();
		System.out.print("mat 점수 : ");
		int mat = scan.nextInt();
		int sum = kor + eng + mat;
		System.out.println("총합 : " + sum);
		double middle = sum/3.0;
		System.out.println("평균 : "+ middle);
		scan.close();
	}

}
