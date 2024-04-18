package Chapter03.operater;
import java.util.Scanner;
public class Operater_example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*과목 3개를 입력하여 함수에 따른 합격 여부 출력
 * 합격 조건   1. 세 과목의 평균점수가 60점 이상일것
 * 			2. 한 과목이라도 40점 미만일 경우 과락으로 불합격
 * 출력 결과 : 국어 80, 영어 ㅣ 80 수학 ㅣ 35
 */
		Scanner scan = new Scanner(System.in);
		System.out.print("국어 : ");
		int korean = scan.nextInt();
		System.out.print("영어 : ");
		int english = scan.nextInt();
		System.out.print("수학 : ");
		int math = scan.nextInt();
		boolean value = (((korean+english+math)/3)>=60)&&((korean>=40)&&(english>=40)&&(math>=40));
		System.out.println("합격여부 : "+value);
		scan.close();
		
		//float middle = (korean + english + math)/3;
		/*조건문 사용시
		 * if (middle>=60) {
			if((korean>=40)&&(english>=40)&&(math>=40)) {
				System.out.println("합격입니다!");
			}else {
				System.out.println("탈락입니다~");
			}
		}else {
			System.out.println("탈락입니다~");
		}
		scan.close();*/
	}

}
