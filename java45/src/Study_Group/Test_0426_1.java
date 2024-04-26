package Study_Group;
class Animal{
	String name;
	Animal(String name){
		this.name = name;
	}
	
	void sound() {
		System.out.printf("나는 %s\n",name);
	}
} 

class Cat extends Animal{
	String koe;
	Cat(String name, String koe){
		super(name);
		this.koe = koe;
	}
void Soun() {
	
}
	@Override
	void sound() {
		System.out.printf("나는 %s %s~\n",name,koe);
	}
}

class Tiger extends Animal{
	String koe;
	Tiger(String name, String koe){
		super(name);
		this.koe = koe;
	}
		
	@Override
	void sound() {
		System.out.printf("나는 %s다 %s~\n",name,koe);
	}
}
class Monkey extends Animal{
	String koe;
	Monkey(String name, String koe){
		super(name);
		this.koe = koe;
	}
	
	@Override
	void sound() {
		System.out.printf("나는 %s %s~\n",name,koe);
	}
}

public class Test_0426_1 {
	public static void main(String[] args) {
		Animal dog = new Animal("멍멍이");
		dog.sound();
		
		Cat cat = new Cat("고양이","야옹");
		cat.sound();
		
		Tiger tiger = new Tiger("호랑이","어흥");
		tiger.sound();
		
		Monkey monkey = new Monkey("원숭이","우끼끽");
		monkey.sound();
	}
}
