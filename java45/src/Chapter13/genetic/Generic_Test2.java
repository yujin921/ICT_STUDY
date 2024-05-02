package Chapter13.genetic;

import java.util.ArrayList;

public class Generic_Test2 {
	public static void main(String[] args) {
		//제네릭타입을 명시하지 않을 경우
		ArrayList arNum = new ArrayList();
		arNum.add(1);
		arNum.add("문자열");
		
		int value = (int) arNum.get(0);
		//int temp = (int) arNum.get(1); //맞는 타입을 신경써야함 err
		System.out.println(value);
		
		//제네릭타입을 명시할 경우
		ArrayList<Integer> arNum2 = new ArrayList<Integer>();
		arNum2.add(1);
		int value2 = arNum2.get(0);

		//arNum2.add("문자열"); //컴파일시점에서 타입체크 후 에러 발생
		System.out.println(arNum2.get(0));
		System.out.println(value2);
	}
}
