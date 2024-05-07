package Chapter15.exception;

public class Throw_Test1 {
	public static void main(String[] args) {
		//String name = "빌게이츠";
		String name = null;
		System.out.println("printScore 실행 전");
		printScore(name);
	}
	
	static void printScore(String name) {
		System.out.println("printnScore 메서드 실행");
		try {
			System.out.println(name.length());

		}catch(NullPointerException e) {
			System.out.println("이름이 무효합니다.");
		}	
	}
}
