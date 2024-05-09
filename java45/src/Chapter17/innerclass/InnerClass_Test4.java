package Chapter17.innerclass;

public class InnerClass_Test4 {
	public static void main(String[] args) {
		Human kim = new Human(29, "상형","김");
		kim.intro();
		
		//내부 클래스 호출
		Human.Name name = kim.new Name("순신", "이");
		System.out.println(name.family + name.first + " : ");
		name.outAge();
	}
}
