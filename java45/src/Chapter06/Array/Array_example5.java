package Chapter06.Array;

import java.util.Random;
import java.util.Scanner;

public class Array_example5 {
	public static void main(String[] args) {
		
		//클래스 입력
		Scanner scan = new Scanner(System.in);
		Random random = new Random();

		//게임 갯수 입력
		System.out.print("로또를 몇 개 구매할 것입니까? : "); 
		int num = scan.nextInt();

		System.out.println("===================================");
		

        for (int i = 0; i < num; i++) {
            int[] lotto = new int[6]; // lotto 숫자 넣을 배열 생성
            int[] usedNumbers = new int[45]; // 중복 체크를 위한 배열

            for (int j = 0; j < 6; j++) {
                int pi = random.nextInt(45) + 1; // 1부터 45까지 난수 발생

                if (usedNumbers[pi - 1] != 0) { // 이미 사용된 숫자인 경우
                    j--; // 현재 인덱스를 유지하고 다시 반복
                    continue; // 다음 반복으로 이동
                }

                lotto[j] = pi;
                usedNumbers[pi - 1] = 1; // 중복 체크 배열에 해당 숫자를 표시
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