package Chapter11.interface_part;

interface Calc{ //상수, 추상 메서드
	//인터페이스에서 선언한 변수는 final static이 생략된 상수
	double PI = 3.14;
	int ERROR = -999999999;
	
	//인터페이스에서 선언한 메서드는 abstract가 생략된 추상 메서드
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	//default 메서드
	default void description() {
		System.out.println("정수 계산기를 구현합니다. ");
	}
	
	//static 메서드
	static int total(int[] arr) {
		int total = 0;
		for (int i : arr) {
			total +=i;
		}
		return total;
	}
}

abstract class Calculator implements Calc{

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1-num2;
	}

	//추상 메서드이기 때문에 생략이 가능
	@Override
	public abstract int times(int num1, int num2);

	@Override
	public abstract int divide(int num1, int num2);
	
}

class CompleteCalc extends Calculator{

	@Override
	public int times(int num1, int num2) {
		return num1*num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 !=0) 
			return num1/num2;
		else		
			return Calc.ERROR;
	}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현했습니다.");
	}
	
}
public class InterfaceTest {
	public static void main(String[] args) {
		System.out.println(Calc.PI);
		System.out.println(Calc.ERROR);
		System.out.println(Calc.total(new int[] {1,2,3,4,5}));
		
		CompleteCalc calc = new CompleteCalc();
		int num1 = 10;
		int num2 = 5;
		
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		
		calc.showInfo();
		calc.description();
	}
}
