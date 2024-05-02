package Chapter12.object;

public class Human {
	int age;
	String name;
	
	Human(int age, String name){
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return age+ "세의 " + name;
	}
	
	
}
