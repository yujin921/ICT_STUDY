package Chapter06.Array;

public class Array_Class3 {
	public static void main(String[] args) {
		int[] score = {88,94,72,75,23};
		int sum=0;
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+ (float)sum/score.length);
	}
}
