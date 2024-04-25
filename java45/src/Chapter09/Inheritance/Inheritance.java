package Chapter09.Inheritance;

class Human{ //클래스
	int age; //멤버 변수
	String name;
	
	Human(int age, String name){
		System.out.println("==Human 생성자==");
		this.age = age;
		this.name = name;
	}
	
	void intro() {
		System.out.printf("안녕, %d살 %s이야\n",age,name);
	}
}

class Student extends Human{ //상속 예약어 extends
	int stNum;
	String major;
	
	Student(int age, String name, int stNum, String major){
		super(age, name);
		this.stNum = stNum;
		this.major = major;
	}
	
	void study() {
		System.out.println("스터디 스터디");
	}
}


public class Inheritance {
	public static void main(String[] args) {
		Human kim = new Human(29,"김상혁");
		kim.intro();
		
		Student lee = new Student(42,"이승우",9312345,"경영");
		lee.intro(); //휴먼 클래스가 가지고 있는 메서드 상속
		lee.study();
	}

}
