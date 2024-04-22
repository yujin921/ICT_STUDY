package Chapter06.Array;

import java.util.Scanner;

public class Array_example01 {
	public static void main(String[] args) {
		
		

		/*변경하고 싶은 위치 1 입력
		 * 변경하고 싶은 위치 2 입력
		 * 1위치와 2위치의 배열값이 교환이 되도록
		 */
	
		
		int arr1[] = {10,20,30,40,50,60,70,80,90,100};
		System.out.print("Original : ");
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.print("\n변경하고 싶은 위치1을 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		int user1 = scan.nextInt(); //10
		System.out.print("변경하고 싶은 위치2를 입력하세요 : ");
		int user2 = scan.nextInt(); //100
		
		
		int k = arr1[user1-1]; //10
		arr1[user1-1] = arr1[user2-1];
		arr1[user2-1] = k;
		
		System.out.print("New : ");
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		scan.close();
	}
}
