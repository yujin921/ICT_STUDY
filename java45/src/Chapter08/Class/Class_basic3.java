package Chapter08.Class;

//this
//-클래스 내부에서 해당 인스턴스를 부를 이름이 없음
//- 인스턴스 이름이 각자 달라지기 때문에 this를 사용해서 자신을 가리킴

//public은 무조건 파일명이랑 같아야함

class User{
	String name;
	int age;
	
	public void userInfo() {
		System.out.println("이름 : " + name + ", 나이 : " + age);
	}
	
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public User(String name) {
		this.name = name;
	}

	public User(int age) {
		this.age = age;
	}
	
	public User() {
		
	}
}




public class Class_basic3 {
/*	생정자 규칙
 	- 생성자는 이름이 클래스와 같다
 	- 클래스 생성시 생성자를 넣지 않아도 기본 생성자가 생성된다
 	- 부모클래스는 자식클래스 보다 먼저 생성되어야 한다
 	- 리턴 타입을 갖지 않는다
 	- 명시적 생성자가 있으면 기본 생성자는 별도로 생성해야한다
 */
	public static void main(String[] args) {
		User user1 = new User(25);
		user1.userInfo();
		
		User user2 = new User("홍길동");
		user2.userInfo();
		
		User user3 = new User("이순신", 70);
		user3.userInfo();
	}
}
