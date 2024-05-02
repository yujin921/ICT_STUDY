package Chapter12.object;

public class String1 {
	public static void main(String[] args) {
		int number = 10;
		double score = 12.345;
		String text = Integer.toBinaryString(number);
		
		System.out.printf("%b %n", 3<1);//boolean
		System.out.printf("%d %n", number);//10진수
		System.out.printf("%o %n", number);//8진수
		System.out.printf("%x %n", number);//16진수
		System.out.printf("%,d %n", 1000000);//3자리수마다, 표시
		System.out.printf("%+d %n", 10);//부호표시
		System.out.printf("%+d %n", -10);//부호표시
		
		
		System.out.printf("%f %n",score); //부동소수점
		System.out.printf("%e %n",score); //지수
		
		System.out.printf("%c %n", 65); //문자
		System.out.printf("%s %n", text); //문자열
		System.out.printf("%s %n", "ABcdeFG"); //문자열
		
		 System.out.printf("[%10d] %n",number); //전체 10자리(우측정렬)
		 System.out.printf("[%-10d] %n",number); //전체 10자리(좌측정렬)
		 System.out.printf("[%010d] %n",number); //전체 10자리(빈공간 0)
		 System.out.printf("[%10.5f] %n",score); //전체 10자리(소수점 5자리)
		 
		 System.out.println("========================");
		 String str = String.format("이름 : %s, 나이 : %d", "홍길동",20);
		 System.out.println(str);

		

	}
}
