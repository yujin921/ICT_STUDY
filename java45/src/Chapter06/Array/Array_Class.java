package Chapter06.Array;

public class Array_Class {
	public static void main(String[] args) {
		int[] arr1= new int[5];
		int arr2[] = new int[5];
		
		int[] arr3 = new int[] {0,1,2,3,4};
		int arr4[] = {0,1,2,3,4};
		
		int[] arr5;
		arr5 = new int[] {6,7,8};
		
		int arr6[];
		//arr6 = {9,10,11}; 배열이 먼저 선언될 경우 new int[]를 생략할 수 없음.
		
		for(int i=0; i<arr3.length; i++) {
			System.out.println(arr3[i]+" ");
		}
		System.out.println();
		System.out.println("길이 : " + arr3.length);
		
		
		
	}
}
