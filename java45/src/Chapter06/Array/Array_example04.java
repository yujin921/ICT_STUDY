package Chapter06.Array;

import java.util.Random;
import java.util.Scanner;

public class Array_example04 {
	public static void main(String[] args) {
		
		//클래스 입력
		Scanner scan = new Scanner(System.in);
		Random random = new Random();

		//게임 갯수 입력
		System.out.print("로또를 몇 개 구매할 것입니까? : "); 
		int num = scan.nextInt();

		System.out.println("===================================");
		
		int lotto[] = new int[6]; //lotto 숫자 넣을 배열 생성
		
		for(int i=0; i<num; i++) { // 게임 갯수만큼 반복
			for(int j = 0; j<6; j++) {	// 한 게임 당 랜덤 숫자 6개 발생
				
				//중복제거
				int ran;
				boolean duplicate; //중복일 때 true 값을 내는 boolean값
				do {
					
					duplicate = false; // 중복이 아니다
					ran = random.nextInt(45)+1; //1~45 난수 발생
					for(int s=0; s<lotto.length; s++) {
						if(ran == lotto[s]) {
							duplicate = true; //중복 걸림
							break;
						}
					}
				}while(duplicate);{
					lotto[j] = ran;
				}
			}
			System.out.printf("%d번째 게임 : ", i);
			
		     //큰 수 비교
	         // 1 5 3 6 9 4  
	         int temp;
	         for(int s =0; s<lotto.length; s++) {
	            for(int k=s+1; k<lotto.length; k++) {
	               if(lotto[s]>lotto[k]) {
	                  temp = lotto[s];
	                  lotto[s] = lotto[k];
	                  lotto[k] = temp;
	               }
	            }
	         }
			
			for(int s:lotto) {
				System.out.print(s + " ");
			}
			System.out.println("");
		}
		scan.close();
	}
} 