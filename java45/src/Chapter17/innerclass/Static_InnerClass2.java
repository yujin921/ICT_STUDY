package Chapter17.innerclass;

class Human3{
	int age;
	Name name;
	
	static class Name{
		String first;
		String family;
		
		Name(String first, String family){
			this.family = family;
			this.first = first;
		}
	}
	
	Human3(int age, String first, String family){
		this.age = age;
		this.name = new Name(first, family);
	}
	
	void intro() {
		System.out.printf("안녕, %d살 %s%s라고 해.\n", age, name.family, name.first);
	}
}
public class Static_InnerClass2 {
	public static void main(String[] args) {
		Human3 kim = new Human3(29, "상형", "김");
		kim.intro();
		
		//소속만 Human3일 뿐, 정적 내부 클래스의 인스턴스만 생성
		Human3.Name name = new Human3.Name("순신", "이");
		System.out.println("이름 : " + name.family + name.first);
	}
}
