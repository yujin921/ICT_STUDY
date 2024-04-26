package Chapter10.polymorphism;

class Animal {
	void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	@Override
	void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
}

class Tiger extends Animal {
	@Override
	void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
}

class Eagle extends Animal {
	@Override
	void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}	
}

public class Polymorphism {

	public static void main(String[] args) {
		// 다형성
//		method1();		//메서드 호출 방법
//		1. public static void method1(){}   -> static 영역에 메서드 생성
//		2. Polymorphism p = new Polymorphism(); 
//		   p.method1();						-> 인스턴스 생성
		
		//메서드 호출
//		moveAnimal(new Animal());
		Animal a = new Human();			//참조형 변수 선언
		moveAnimal(a);
		
//		int a = 10;
//		method(10);
//		method(10+20);
		
		moveAnimal(new Human());		
		moveAnimal(new Tiger());
		moveAnimal(new Eagle());
	}
	
	public static void moveAnimal(Animal a) {
		a.move();
	}			// -> 오버라이드된 값을 가져옴
	
//	public static void moveAnimal(Human a) {
//		a.move();
//	}
//	public static void moveAnimal(Tiger a) {
//		a.move();
//	}
//	public static void moveAnimal(Eagle a) {
//		a.move();								// 받아주는 걸 일일히 다 만들어줘야 해서 번거로움
//	}

}
