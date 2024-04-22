package Chapter08.Class;


class Car{
	//멤버 변수
	String name;
	boolean gasoline;
	//기본 생성자
	Car(){
		System.out.println("기본 생성자 호출");
	}
	
	//명시적 생성자
	Car(String aName, boolean aGasoline){
		System.out.println("명시적 생성자 호출");
		name = aName;
		gasoline = aGasoline;
	}
	
	void run() {
		if(gasoline) System.out.println("부릉 부릉");
		else		 System.out.println("덜컹 덜컹");
	}
	
	void stop() {
		System.out.println("끼이익");
	}
}


public class Class_basic1 {
	public static void main(String[] args) {
		Car korando = new Car(); //기본 생성자 호출
		korando.name = "코란도C";
		korando.gasoline = false;
		System.out.println(korando.name + " : ");
		korando.run();
		
		Car equus = new Car("에쿠스",true); //명시적 생성자 호출
		System.out.println(equus.name + " : ");
		equus.run();
		equus.stop();
	}
}
