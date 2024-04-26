package Chapter11.interface_part;

abstract class Animal{ //추상화 예약어 abstract
	String name; //멤버 변수
	
	Animal(String name){ //생성자
		this.name = name;
	}
	
	void alive() { //멤버 메서드
		System.out.println("살아 있다");
	}
	
	abstract void move(); //추상메서드
}
abstract class Human extends Animal{
	Human(String name){
		super(name);
	}
	
	@Override
	abstract void move();
}

class Student extends Human{
	Student(String name){
		super(name);
	}
	
	@Override
	void move() {
		System.out.println("땡땡이 치기");
	}
}
class Tiger extends Animal{
	Tiger(String name){
		super(name);
	}
	
	@Override
	void move() {
		System.out.println("네 발로 뛴다");
	}
}
class Eagle extends Animal{
	Eagle(String name){
		super(name);
	}
	
	@Override
	void move() {
		System.out.println("날다");
	}
}
public class AbstractTest {
	public static void main(String[] args) {
		
		//Animal a = new Animal("동물"); // 추상 클래스는 인스턴스 생성 불가
		Animal b = new Student("학생");
		Animal c = new Tiger("호랑이");
		Animal d = new Eagle("독수리");
		
		b.alive();
		b.move();
		c.move();
		d.move();
	}
}
