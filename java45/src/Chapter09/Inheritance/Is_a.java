package Chapter09.Inheritance;

class Animal{
	String name;
	
	void move() {
		System.out.println("움직이다");
	}
}

class Human4 extends Animal{
	@Override
	void move() {
		System.out.println("걷다");
	}
}
public class Is_a {
	public static void main(String[] args) {
		Animal a = new Human4(); // 사람은 동물이다 -> 가능
		Human4 b = new Human4(); // 사람은 사람이다 -> 가능
		//Human4 c = new Animal(); // 동물은 사람이다 -> 불가능 -> 자식 참조에 부모 객체 생성은 X
		a.move();
		b.move();
	}
}
