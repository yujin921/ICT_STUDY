package Study_Group;

//final class는 상속 불가
class AA{
	final static double PI = 3.14;
	
	void method() {
		System.out.println("method 실행");
	}
	
	final void finalMethod() {
		System.out.println("fianl method 실행");
	}
}

class BB extends AA{
	@Override
	void method() {
		super.method();
		System.out.println("method BB 실행");
	}
	
}
public class Fianl {
	//final
	//final 변수 : 상수, 값 변경 불가
	//final 클래스 : 상속 불가
	//final 메서드 : override 불가
	
	public static void main(String[] args) {
		AA aa = new AA();
		AA ab = new BB();
		BB bb = new BB();
		
		System.out.println(aa.PI);
		System.out.println(ab.PI);
		System.out.println(bb.PI);
		
		
		aa.method();
		aa.finalMethod();
		ab.method();
		ab.finalMethod();
		bb.method();
		bb.finalMethod();
	}
}
