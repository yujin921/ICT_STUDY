package Chapter08.Class;

class Member{
	private String id;
	private String password;
	private String phonenumber;
	
	public Member(String id, String password, String phonenumber) {
		this.id = id;
		this.password = password;
		this.phonenumber = phonenumber;
	}
	
	public String getId() {
		return this.id;
	}
	
	public Member(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	//비밀번호 수정 setter
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void memberInfo(String pwCheck) {
		if(this.password.equals(pwCheck)) {
			System.out.println("[회원 정보]");
			System.out.println("* ID : " + this.id);
			System.out.println("* PW : " + this.password);
			System.out.println("* PHONE : " + this.phonenumber);
		}
	}
}
public class Class_basic5 {
/*
 	접근 지정자, 접근 제어자
 	- 클래스 내부의 변수나 메서드, 생성자에 대한 접근 권한을 가짐
 	- public : 일부 클래스 어디에서나 접슨
 	- protected : 같은 패키지 내부와 상속 간계의 클레스에서만 접근
 	- default : 같은 패키지 내부에서만 접근
 	- private : 같은 클래스 내부에서만 접근
 */
	public static void main(String[] args) {
		Member member1 = new Member("홍길동","123","01011112222");
		String id = member1.getId();
		System.out.println(id);
		member1.setPassword("456");
		
		member1.memberInfo("456");
		
	
	}

}
