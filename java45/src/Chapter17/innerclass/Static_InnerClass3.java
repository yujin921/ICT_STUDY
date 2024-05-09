package Chapter17.innerclass;

class Human4{
	int field;
	static int staticField;
	
	//내부 클래스는 외부의 모든 멤버를 엑세스 할 수 있다.
	class Name{
		void method() {
			field = 0;
			staticField = 0;
		}
	}
	
	//정적 내부 클래스는 외부의 정적 멤버만 엑세스 할 수 있다.
	static class StaticName{
		void method() {
			//field = 0;
			staticField = 0;
		}
	}
	
	//비정적 메서드는 내부, 정적 내부 클래스 모두 엑세스 할 수 있다.
	void method() {
		Name n = new Name();;
		StaticName sn = new StaticName();
	}
	
	//정적 메서드는 내부 정적 클래스만 엑세스 할 수 있다.
	static void staticMethod() {
		//Name n = new Name();
		StaticName sn = new StaticName();
	}
}
public class Static_InnerClass3 {

}
