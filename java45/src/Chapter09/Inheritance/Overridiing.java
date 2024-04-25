package Chapter09.Inheritance;

public class Overridiing {
	public static void main(String[] args) {
/*

	메서드 오버라이딩 조건
	1. 상속 관계에서만 가능]
	2. 부모가가지고 있는 메서드의 파라미터의 타입, 개수, 선서가 동일 메소드의 이름동일, 리턴타입 동일
	 */
		
		class A{
			int num = 10;
			
			public void methodA() {
				System.out.println("A : "+ num);
			}
		}
		
		class B extends A{
			int num = 100;
			
			@Override
			public void methodA() {
				System.out.println("B : " + num);
			}
		}
		
		//멤버 변수는 참조타입이 결정
		//참조 타입 이름 = new 생성타입();
		A aa = new A(); //부모인 A클래스만
		//A 클래스의 멤버들을 모두 사용할 수 있지만, 메소드가 오버라이딩 되었을 경우에는 실제 객체의 메소드를 호출
		A ab = new B(); // A클래스를 참조했음, 다만 객체는 B이기 때문에 실제 메소드는 B가 실행
		B bb = new B(); //자식인 B클래스만
		
		System.out.println(aa.num); //10
		System.out.println(ab.num); //10
		System.out.println(bb.num); //100
		
		//멤버 메서드는 생성타입에 결정
		aa.methodA(); //a : 10
		ab.methodA(); //B : 100
		bb.methodA(); //b : 100
	}
	
}
