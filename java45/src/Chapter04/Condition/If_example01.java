package Chapter04.Condition;
import java.util.Scanner;
public class If_example01 {
	public static void main(String[] args) {
		/*사각형의 넓이 구하기
		 * 가로, 세로의 길이를 입력받아 넓이를 구하시오.
		 * 단, 가로와 세로의  길이를 비교하여 정사각형 or 직사각형을 출력한다.
		 * 출력결과 :
		 * 가로길이:5, 세로길이 :4., 직사각형의 넓이는 20입니다."
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("가로 길이 : ");
		int garo = scan.nextInt();
		System.out.print("세로 길이 : ");
		int sero = scan.nextInt();
		int nu = garo*sero;
		if(garo==sero) {
			System.out.printf("정사각형의 넓이는 %d입니다.",nu);
		}else {
			System.out.printf("직사각형의 넓이는 %d입니다.",nu);
		}
		scan.close();
		}
}
