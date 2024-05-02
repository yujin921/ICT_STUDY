package Chapter12.object;

record Member(String name, int memberCode) {}

/*
 	record
 	불변 객체를 쉽게 생성할 수 있도록 하는 유형의 클래스
 	-모든 필드에 Final 선언
 	- 필드 값을 모두 조합한 생성자
 	- 접근자 메서드(getter)
 	
 	*자료생성
 	- 생성자메서드
 	- getters 메서드
 	- equals 메서드
 	- hashCode 메서드
 	- toString 메서드
 	
 	*레코드 제한
 	*- 레코드는 암묵적으로 final 클래스(상속불가)이며, abstract 선언 불가
 	*- 다른 클래스를 extends(상속) 받을 수 없음
 	*- 인터페이스 구현은 가능
 */
public class Record_Test {
	public static void main(String[] args) {
		Member member = new Member("홍길동",1234);
		System.out.println(member);
		System.out.println(member.name());
		System.out.println();
	}
}

