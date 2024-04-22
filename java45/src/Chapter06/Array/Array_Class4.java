package Chapter06.Array;
//다시 올리기
public class Array_Class4 {
	public static void main(String[] args) {
		
		int[] score = {88,92,72,25,23};
		int sum = 0;
		for(int i:score) { //score : 반복대상 
			sum +=i;
		}
		System.out.println("총점 : "+sum);
		System.out.println("평균 : " + (float)sum/score.length);
		
		//for each 읽기 전용 반복문
		int score2[] = {88,92,72,75,23};
		for(int i : score2) {
			i++;
		}
		System.out.println("score[0] = " + score[0]);
	}
}
