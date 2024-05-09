package Chapter17.innerclass;

public class Local_InnerClass1 {
	public static void main(String[] args) {
		//지역 내부 클래스 = 메서드 내에서 클래스 선언 / 메서드 내부에서만 유효
		class Human99{
			int age;
			String name;
			
			Human99(int age, String name){
				this.age = age;
				this.name = name;
			}
			
			void intro() {
				System.out.println("안녕, " + age + "살 " + name + "이야");
			}
		}
		
		Human99 kim = new Human99(29, "김상형");
		kim.intro();
	}
	
	//메서드 외부에서는 지역 내부 클래스를 참조할 수 없다.
	static void otherMethod() {
		//Human99 kim = new Human99(29, "김상형");
	}

}
