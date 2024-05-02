package Chapter12.object;

public class HashCode {
	public static void main(String[] args) {
		Student st1 = new Student("홍길동", 20240001);
		Student st2 = new Student("홍길동", 20240001);
		Student st3 = st1;
		Student st4 = new Student("홍길동", 20240003);

		
		System.out.println(st1 == st2); //주소가 같냐
		System.out.println(st1 == st3);
		System.out.println(st1 == st4);
		System.out.println("================");

		System.out.println(st1.equals(st2)); //
		System.out.println(st1.equals(st3));
		System.out.println(st1.equals(st4));
		System.out.println("================");

		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		System.out.println(st3.hashCode());
		System.out.println(st4.hashCode());
		System.out.println("================");

		
		//실제 객체 고유 hashcode
		System.out.println(System.identityHashCode(st1));
		System.out.println(System.identityHashCode(st2));
		System.out.println(System.identityHashCode(st3));
		System.out.println(System.identityHashCode(st4));

	}
}
