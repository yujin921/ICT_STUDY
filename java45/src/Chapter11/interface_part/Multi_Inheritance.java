package Chapter11.interface_part;

class HandPhone{
	void call() {
		System.out.println("전화를 건다.");
	}
	
	void receive() {
		System.out.println("전화를 받는다.");
	}
}

interface Camera{
	void takepicture();
}

class HandPhoneCamera extends HandPhone implements Camera{
	//implements : 추상 메서드 완성한다

	@Override
	public void takepicture() {
		System.out.println("찰칵, 사진을 찍는다 ");
	}
	
}
public class Multi_Inheritance {
	public static void main(String[] args) {
		HandPhoneCamera myPhone = new HandPhoneCamera();
		myPhone.call();
		myPhone.receive();
		myPhone.takepicture();
	}
}

interface A{}
interface B{}
interface C extends A, B{} //인터페이스들끼리 다중 상속
class D{}
class E extends D implements A, B{}
//class H extends A,B //추상 메서드는 implements로 class와 연결