package Chapter06.Array;

public class Array_test2 {
	public static void main(String[] args) {
		int[] ary1 = {1, 2, 3, 4, 5};
		int[] ary2;
		// 얕은 복사
		ary2 = ary1;
		ary2[1] = 200;
		for(int temp : ary1) 
		System.out.print(temp + " ");
	}
}
