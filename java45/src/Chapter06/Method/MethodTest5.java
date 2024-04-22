package Chapter06.Method;

public class MethodTest5 {
	public static void main(String[] args) {
		//가변 연자(variable arguments)
		System.out.println(getSum(1,2));
		System.out.println(getSum(1,2,3,4));
		System.out.println(getSum(1,2,3,4,5,6,7));
	}
	
	//가변인자를 사용할 경우 오버로딩된 메서드들 간의 구분이 되지 않아
	//가급적 가변인자를 사용한 메서드는 오버로딩 하지 않는게 좋다.
	static int getSum(int... a) {
		int sum=0;
		for(int i:a) {
			sum+=i;
		}
		return sum;
	}
}
