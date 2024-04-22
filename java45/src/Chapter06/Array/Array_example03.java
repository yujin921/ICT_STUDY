package Chapter06.Array;
//다시 올리기
import java.lang.reflect.Array;

public class Array_example03 {
	public static void main(String[] args) {
		String arr[] = {"브래드", "윌크", "초코","소세지","치즈"};
		System.out.print("원래 배열 -> ");
		for(String i : arr) {
			System.out.print(i+ " ");
		}
		
		int num=1;
		String arr2[] = new String[arr.length];
		for(String i : arr) { //arr원래 배열 값
			arr2[arr.length-num] = i; // 원래 배열의 값 = 새로운 배열의 끝 값
			num++;
		}
		System.out.print("\n역순 배열 -> ");
		for(String i : arr2) {
			System.out.print(i + " ");
		}
		
	}
}
 