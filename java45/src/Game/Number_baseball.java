package Game;
import java.util.Random;
import java.util.Scanner;
public class Number_baseball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int a[] = new int[3];
		int num[]= new int[3];
		int try1 = 1;
		for(int i = 0; i<3;i++) { //정답 배열
			a[i] = random.nextInt(10);
		}
		Scanner scan = new Scanner(System.in);
		while (try1<=10) { //시도는 10번
			int s = 0;
			int b = 0;
			System.out.printf("시도 %d번째 : 숫자 3개를 입력해주세요 : ", try1);
			for(int i =0; i<3; i++) { //유저가 입력한 숫자 배열
				num[i] = scan.nextInt();
			}
			
			//비교하기
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					if(a[i]==num[j]) {
						if(i==j) {
							s++;
						}
						else {
							b++;
						}
					}
				}
			}
			System.out.printf("S : %d  B : %d \n",s,b);
			if (s==3) {
			System.out.println("정답입니다!");
			break;
		}
		try1++;
	}
	if(try1 > 10) {
		System.out.println("모든 기회를 소진했습니다.");
	}
	scan.close();//Scanner 닫기
}}
