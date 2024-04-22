package Chapter06.Array;
//다시 올리기
import java.util.Scanner;

public class Array_example02 {
	public static void main(String[] args) {
		
		//원하는 배열의 크기 입력
		// 1이하일 경우 에러발생
		// 2이상일 때 유저에게 배열값 입력받기
		// 배열의 값 합계 구하기
		
		// 1차원 배열 : [0],[1],[2],[3]... 
		
		Scanner scan = new Scanner(System.in);
		int user;
		int sum = 0;
		
		do {
			System.out.print("배열 크기 : ");
			user = scan.nextInt();
			
			if(user<2) {
				System.out.println("에러 발생");
			}
		}while(user<2);{}
		
		int arr[] = new int[user];
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("arr[%d] = ",i);
			int num = scan.nextInt();
			arr[i] = num;
			sum += arr[i];
		}
		
		for(int i=0; i<arr.length; i++) {
			if(i==(arr.length)-1) {
				System.out.print(arr[i]+"=");
			}else {
				System.out.print(arr[i]+"+");
			}
		}
		System.out.println(sum);
		scan.close();
	}
}
