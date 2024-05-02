package Chapter12.object;

public class WrapperClass {
	public static void main(String[] args) {
/*
 	wrapper클래스(Integer, Boolean...)의 
 	생성자로부터의 인스턴스화를 권장하지 않음(자바9 이후)
 */
		//boxing 기본형 -> 참조형
		int i = 1234;
		Integer wrapint = new Integer(i);
		String str = wrapint.toString();
		System.out.println(str);
		
		String a = "56", b = "78";
		System.out.println(a+b);
		System.out.println(Integer.parseInt(a)+Integer.parseInt(b));
		
		
		//unboxing 참조형 -> 기본형
		Integer wrapint2 = new Integer(629);
		int j = wrapint2.intValue();
		System.out.println(j);
		
		Double wrapdouble = new Double("3.14");
		int di = wrapdouble.intValue();
		System.out.println(di);
		
		//auto boxing 컴파일러가 필요하다면 박싱, 언박싱
		Integer c = new Integer(3);
		Integer d = new Integer(4);
		int e = c+d;
		System.out.println(e);
		
		System.out.printf("int 타입의 크기 = %d, 최대값 = %d, 최소값 = %d\n",
						Integer.SIZE,Integer.MAX_VALUE,Integer.MIN_VALUE);
		System.out.printf("short 타입의 크기 = %d, 최대값 = %d, 최소값 = %d\n ",
				Integer.SIZE,Integer.MAX_VALUE,Integer.MIN_VALUE);
		
	}
}
