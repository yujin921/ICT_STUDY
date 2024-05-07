package Chapter15.exception;

class NegativeException extends Exception{
	NegativeException(){
		super("음수는 안돼요");
	}
}
public class User_Exception {
	public static void main(String[] args) {
		//사용자 정의 예외 클래스
		int sum = 0;
		try {
			sum = calcSum(-100);
			System.out.println(sum);
		}catch(NegativeException e) {
			System.out.println(e.getMessage());
		}
	}
	
	static int calcSum(int to) throws NegativeException{
		if(to<0) {
			throw new NegativeException();
		}
		int sum = 0;
		for(int i = 0; 1<=to; i++) {
			sum += i;
		}
		return sum;
	}
}
