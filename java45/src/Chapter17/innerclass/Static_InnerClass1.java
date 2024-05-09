package Chapter17.innerclass;

class OutClass2{
	private int num = 10;
	private static int sNum = 20;
	
	static class InstaticClass{
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			System.out.println("InStaticClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수 사용)");
			System.out.println("InstaticCClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용)");
			//System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수 사용)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
		}
		
		static void sTest() {
			//System.out.println(inNum);
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
			System.out.println("InstaticCClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용)");

		}
	}
}
public class Static_InnerClass1 {
	public static void main(String[] args) {
		OutClass2.InstaticClass sInClass = new OutClass2.InstaticClass();
		System.out.println("정적 내부 클래스 일반 메서드 호출");
		sInClass.inTest();
		
		System.out.println("\n정적 내부 클래스 정적 메서드 호출");
		OutClass2.InstaticClass.sTest();
	}
}
