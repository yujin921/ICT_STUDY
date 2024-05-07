package Chapter15.exception;

public class Throw_Test3 {
	public static void main(String[] args)
	//throws Exception
	{
		String name = null;
		try {
			printScore(name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}
	static void printScore(String name) throws Exception {
		if(name == null) {
			throw new Exception("이름이 무효합니다. "); //throw 예외를 생성함
		}
		System.out.println(name.length());
	}
}
