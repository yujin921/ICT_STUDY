package Chapter06.Array;

public class Array_Class7 {
	public static void main(String[] args) {
		System.out.println("1~10 = " + calcSum(1,10));
		System.out.println("15~100 = " + calcSum(2,5));
	}
	
	public static int calcSum(int from, int to) {
		// TODO Auto-generated method stub
		int sum=0;
		for (int i=from; i<=to; i++) {
			sum+=i;
		}
		return sum;
	}
}
