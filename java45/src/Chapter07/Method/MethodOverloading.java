package Chapter07.Method;

public class MethodOverloading {
	public static void main(String[] args) {
		/*오버로딩 조건
		 - 메서드 이름이 같아야 한다(필수)
		 - 파라미터 개수가 달라야 한다
		 - 파라미터 타입이 달라야 한다
		 - 파라미터 순서가 달라야 한다
		 
		 * 장점
		 - 반복작업을 피할 수 있다
		 - 모듈화로 인해 전체적 코드의 가독성을 높인다
		 - 기능의 변경이 필요할 때 유지보수가 쉽다
		 */
		
		getMax(5); //int a
		getMax(5, 3.14); //int a, double b
		getMax(3.14, 5); //double a, int b
		System.out.println("[3,5] = "+getMax(3,5)); //int a, int b
		System.out.println("[3.4, 5.6] = " + getMax(3.5, 5.6)); //double a, double b
	}
	
	static void getMax(int a) {
		System.out.println(a);
	}
	
	static void getMax(int a, double b) {
		System.out.println(a+b);
	}
	
	static void getMax(double a, int b) {
		System.out.println(a*b);
	}
	
	
	static int getMax(int a, int b) {
		if(a>b) return a;
		else    return b;
	}
	
	static double getMax(double a, double b) {
		if(a>b) return a;
		else	return b;
	}
}
