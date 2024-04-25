package Study_Group;

class Human{
	String name;
	int age;
	int salary;
	
	Human(String name, int age, int salary){
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	void printInfo() {
		System.out.printf("이름 : %s / 나이 : %d / 연봉 : %d\n",name,age,salary);
	}
}

class Manager extends Human{
	String major;
	
	Manager(String name, int age, int salary, String major){
		super(name,age,salary);
		this.major = major;
	}
	
	@Override
	void printInfo() {
		System.out.printf("이름 : %s / 나이 : %d / 연봉 : %d / 부서 : %s\n",
				name,age,salary,major);
	}
	
}

class Developer extends Human{
	String Language;
	
	Developer(String name, int age, int salary, String Language){
		super(name,age,salary);
		this.Language = Language;
	}
	
	@Override
	void printInfo() {
		System.out.printf("이름 : %s / 나이 : %d / 연봉 : %d / 개발희망언어 : %s\n",
				name,age,salary,Language);
	}
	
}
public class Test_0426_2 {
	public static void main(String[] args) {
		Human human = new Human("신유진",26,0);
		human.printInfo();
		
		Manager manager = new Manager("김시은",26,3000,"운영팀");
		manager.printInfo();
		
		Developer developer = new Developer("구다은", 27, 5000, "서버팀");
		developer.printInfo();
	}
}
