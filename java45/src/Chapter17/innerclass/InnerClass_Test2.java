package Chapter17.innerclass;

class OutClass{
	private int num = 10;
	private static int sNum = 20;
	
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	public void usingClass() {
		inClass.inTest();
	}
	
	class InClass{
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			System.out.println("OutcClass num = " + num + "(외부 클래스의 인스턴스 변수");
			System.out.println("OutcClass sNum = " + sNum + "(외부 클래스의 정적 변수)");
			System.out.println("OutcClass InNum = " + inNum + "(외부 클래스의 인스턴스 변수");
			System.out.println("OutcClass sInNum = " + sInNum + "(외부 클래스의 인스턴스 변수");

			
		}
	}
}

public class InnerClass_Test2 {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		outClass.usingClass();
		
		System.out.println("\n다른 클래스에서 인스턴스 내부 클래스 생성");
		OutClass outClass2 = new OutClass();
		OutClass.InClass inClass = outClass2.new InClass();
		inClass.inTest();
	}
}
