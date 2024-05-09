package Chapter17.innerclass;

class Human5{
	int age;
	String name;
	
	Human5(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	void intro() {
		//지역클래스에서 사용할 지역변수는 반드시 final이어야 한다.
		//변경될 가능성이 있는 변수를 미래에 언제 실행될지도 모르는
		//메서드가 알 방법이 없기 때문
		final String nameCaption = "이름"; //지역 변수
		final String ageCaption = "나이";
		
		//지역 클래스는 객체를 생성하기 전에 클래스 선언문이 먼저 와야 한다.
		//Formatter format = new Formatter();
		//format.outInfo();
		
		//지역 클래스는 잠시 선언해서 사용하는 임시적인 타입이기 때문에
		//접근 지정자 및 static 을 사용할 수 없다.
		class Formatter{
			void outInfo() {
				System.out.println(nameCaption + " : " + name);
				System.out.println(ageCaption + " : " + age);
			}
		}
		
		Formatter format = new Formatter();
		format.outInfo();
	}
}
public class Local_InnerClass2 {
	public static void main(String[] args) {
		Human5 kim = new Human5(29, "김상형");
		kim.intro();
	}
}
