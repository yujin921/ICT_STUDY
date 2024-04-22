package Chapter08.Class;

public class Constructor2 {
	public static void main(String[] args) {
		Class_basic4 t = new Class_basic4();
		
		System.out.println(t.num); // 걍 1번은 인스턴스를 만든 후 불러오기 / 2번은 바로 불러오기
		System.out.println(Class_basic4.num); //클래스이름.static변수
		method();
		Constructor2 c2 = new Constructor2();
		c2.method2();
	}
	
	public static void method() {
		
	}
	public void method2() {
		
	}
}
