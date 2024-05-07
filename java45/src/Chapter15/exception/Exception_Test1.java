package Chapter15.exception;

public class Exception_Test1 {
	public static void main(String[] args) {
/*
 	*예외처리(Exception handling)이란
 		프로그램 실행 시 발생할 수 있는 예외의 발생에 대비한 코드를 작성하는 것
 		프로그램의 비정상 종료를 막고, 정상적인 실행상태를 유지하는 것
 	* 프로그램 오류
 		a. 컴파일 에러(complie-time error) : 컴파일 할 때 발생하는 에러
 		b. 런타임 에러(runtime error) : 실행할 때 발생하는 에러
 		(문법에는 맞아 컴파일은 됐지만 실제로 JVM이 코드를 실행할 때 문제가 발생하는 경우)
 		c. 논리적 에러(logical error) : 작성 의도와 다르게 동작
 */
		
		int a,b,c;
		a = 2;
		b = 0;
		//c = a / b;
		/*if(b != 0) {
			c = a / b;
			System.out.println("c = " + c);
		}
		System.out.println("실행 종료");
		*/
		
		try {
			c = a /b;
			System.out.println("c = " + c);
		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("실행 종료");
	}
}
