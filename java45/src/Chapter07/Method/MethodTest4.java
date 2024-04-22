package Chapter07.Method;
//다시 올리기
public class MethodTest4 {
	public static void main(String[] args) {
		//메서드 호출부
		method1();
		method2();
		int[] arr = {1,2,3,4,5};
		method3(arr);
		int sum = method4(2,5);
		System.out.println(sum);
		System.out.println(method4(10,100));
	}
	
	//메서드 정의부
	//1. 파라미터X, 반환값X
	public static void method1() {
		System.out.println("파라미터도 없고 반환값도 없는 메서드");
	}
	
	//2. 파라미터X, 반환값O
	public static String method2() {
		System.out.println("파라미터가 없고 반환값은 있는 메서드");
		return "hello java";
	}
	
	//3. 파라미터O, 반환값X
	public static void method3(int[] arr) {
		for(int i:arr) {
			System.out.println(i+" ");
		}
	}
	
	//4. 파라미터O, 반환값O
	public static int method4(int a, int b) {
		int sum = a+b;
		return sum;
	}
}
