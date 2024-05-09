package Chapter17.innerclass;

class Name{
	String first;
	String family;
	
	Name(String first, String family){
		this.first = first;
		this.family = family;
	}
}

class Human{
	int age;
	Name name;
	
	class Name{
		String first;
		String family;
		
		Name(String first, String family){
			this.first = first;
			this.family = family;
		}
		
		void outAge() {
			System.out.println("저는 "+ age + "살 입니다.");
		}
		
		void outWho() {//내부 클래스 Name의 메서드
			Util.outName(this);
			Util.outHuman(Human.this);
			
			System.out.println(this);
			System.out.println(Human.this);
		}

		@Override
		public String toString() { //Name 클래스 toString
			return "Name객체";
		}
		
	
	}
	@Override
	public String toString() { //Human 클래스 toString
		return "Human객체";
	}
	
	
	Human(int age, String first, String family){
		this.age = age;
		this.name = new Name(first, family);
	}
	
	void intro() {
		System.out.println("안녕, " + age + "살 " + name.family + name.first + "이라고 해.");
	}
}


class Util{
	static void outName(Human.Name name) {
		System.out.println(name.family + name.first +"이라고 해.");
	}
	static void outHuman(Human who) {
		who.intro();
	}
}
public class InnerClass_Test3 {
	public static void main(String[] args) {
		Human kim = new Human(29, "상형", "김");
		kim.intro();
		kim.name.outAge();
		kim.name.outWho();
	}
}
