package Chapter15.exception;


public class Throw_Test2 {
	public static void main(String[] args) {
		String name = null;
		try {
			printScore(name);
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램 종료");
	}
	
	static void printScore(String name) throws NullPointerException {
		if(name == null) {
			//예외발생
			throw new NullPointerException("이름이 무효합니다"); //NullPointerException 
		}
		
		
		System.out.println(name.length());
	}
}