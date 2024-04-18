package Chapter04.Condition;

import java.util.Scanner;

public class If_example06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("키를 입력해주세요 : ");
		float hight = scan.nextFloat();
		hight = hight/100;
		
		System.out.print("몸무게를 입력해주세요 : ");
		float weight = scan.nextFloat();
		
		String result;
		float bmi = weight/(hight*hight);
		
		if (bmi<18.5) {
			result = "저체중";
		}else if(bmi<23) {
			result = "정상";
		}else if(bmi<25) {
			result = "과체중";
		}else {
			result = "비만";
		}
		
		System.out.printf("BMI지수 : %f(%s)",bmi,result);
		scan.close();
	}
	
	
	
}
