package Chapter08.Class;

public class Constructor3 {
	public static void main(String[] args) {
		Class_basic4 now = new Class_basic4(true,12,34);
		now.whatTime();
		
		System.out.println("==============");
		Class_basic4 today = new Class_basic4(18,30);
		today.whatTime();
	}
}
