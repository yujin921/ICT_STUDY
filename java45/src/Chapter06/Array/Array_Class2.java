package Chapter06.Array;

public class Array_Class2 {
	public static void main(String[] args) {
		int[] score = new int[5];
		score[0] = 88;
		score[1] = 99;
		score[2] = 70;
		score[3] = 55;
		score[4] = 100;
		
		for(int i=0; i<score.length; i++) {
			System.out.println((i+1)+"번 학생의 성적 : "+ score[i]);
		}
	}
}
