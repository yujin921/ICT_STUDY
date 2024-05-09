package Chapter17.innerclass;

class A{
	void methodA() {
		System.out.println("AI");
	}
}

interface B{
	void methodB();
}


public class AnonymousClass {
	public static void main(String[] args) {
		A a = new A();
		a.methodA();
		
		//익명 클래스
		// new 조상클래스 이름 { }
		new Object() {
			void method() {
				System.out.println("A2");
			}
		}.method();
		
		//new 구현하는 인터페이스 이름{ }
		new B() {
			@Override
			public void methodB() {
				System.out.println("B");
			}
		}.methodB();
		
		
	}
}
