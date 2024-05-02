package Chapter13.genetic;

import java.util.ArrayList;

class Fruit{}
class Apple extends Fruit {}
class Banana extends Fruit{}

class FruitBox<T>{
	ArrayList<T> fruits = new ArrayList<>(); //fruits를 리스트 선언
	
	public void add(T fruit) {
		this.fruits.add(fruit);
	}

}

class FruitBox2<T,U>{
	ArrayList<T> apples = new ArrayList<>();
	ArrayList<U> bananas = new ArrayList<>();
	
	public void add(T apple, U banana) {
		apples.add(apple);
		bananas.add(banana);
	}
}

//제네릭 : 다형성의 원리 들어가있음
public class Generic_Test3 {
	public static void main(String[] args) {
		FruitBox<Fruit> box = new FruitBox<Fruit>(); //<Fruit>를 <>라고 써도 된다
		box.add(new Fruit());
		box.add(new Apple()); 
		box.add(new Banana());
		
		//복수 제네릭 타입 사용
		FruitBox2<Apple, Banana> box2 = new FruitBox2<>();
		box2.add(new Apple(), new Banana());
		box2.add(new Apple(), new Banana());
		
	}
}
