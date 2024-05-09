package Chapter17.innerclass;

class Human2{
	int age = 30;
	Name name = new Name();
	class Name{
		int age = 50;
		void intro() {
			//클래스의 이름을 통해 this 호출 가능
			System.out.println(age);
			System.out.println(this.age);
			System.out.println(Human2.this.age);
		}
	}
}
public class InnerClass_this {
	public static void main(String[] args) {
		Human2 park = new Human2();
		park.name.intro();
	}
}
