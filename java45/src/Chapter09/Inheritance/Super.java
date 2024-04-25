package Chapter09.Inheritance;

import java.time.LocalDate;

class Human2{
	int age;
	String name;
	
	Human2(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	Human2(float birth, String name){
		this(0,name);
		LocalDate now = LocalDate.now();
		this.age = now.getYear() - (int)birth +1;
				
	}
	
	void intro() {
		System.out.printf("안녕, %d살 %s이야\n",age,name);
	}
}

class Student2 extends Human2{
	int stNum;
	String major;
	
	Student2(int age, String name, int stNum, String major){
		super(age,name); //부모 클래스에서 상속
		this.stNum = stNum;
		this.major = major;
	}
	
	Student2(float birth, String name, int stNum, String major){
		super(birth,name); //부모 클래스에서 상속
		this.stNum = stNum;
		this.major = major;
	}
	
	
}
public class Super {
	public static void main(String[] args) {
		Student2 no = new Student2(39,"노정란",9908123,"건축");
		no.intro();
		Student2 bae = new Student2(1989.10f,"백지영",1125034,"간호");
		bae.intro();
	}
}
