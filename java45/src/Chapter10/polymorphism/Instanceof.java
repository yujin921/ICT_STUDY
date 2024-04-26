package Chapter10.polymorphism;

/*class Animal {
void move() {
	System.out.println("동물이 움직입니다.");
}
}*/
class Dog extends Animal {
	void bark() {
		System.out.println("멍멍");
	}
}

class Dove extends Animal {
	void fly() {
		System.out.println("퍼득 퍼득");
	}
}

public class Instanceof {

	public static void main(String[] args) {
		Dog happy = new Dog();
		Dove donald = new Dove();
		
		//인스턴스 or 객체 instanceof 비교타입
		System.out.println(happy instanceof Animal);
		System.out.println(happy instanceof Dog);
		System.out.println(donald instanceof Animal);
		System.out.println(donald instanceof Dove);
		
		testAnimal(happy);
		testAnimal(donald);
	}
	
	static void testAnimal(Animal animal) {
//		animal.bark();		//에러    Animal 클래스로 animal을 선언했는데 bark는 Dog 클래스에만 있어서 실행 불가
		if (animal instanceof Dog) {	// 다운캐스팅
			Dog myDog = (Dog) animal;	//때문에 animal을 Dog 클래스로 바꿔줘야 bark를 실행 가능
			myDog.bark();
		}
		else if (animal instanceof Dove) {	//다운캐스팅
			Dove myDove = (Dove) animal;
			myDove.fly();
		}
	}
}
