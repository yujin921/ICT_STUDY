package Chapter03.operater;

public class Artmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int value = 2;
		int a = ++value;
		System.out.println("value = "+ value +", a =" + a);
		
		value = 2;
		a = value++;
		System.out.println("value = "+ value +", a =" + a);
		*/
		int num = 10;
		int i = 2;
		boolean value = ((num = num+10)>10)&&((i=i+2)>10);
		System.out.println(value);
		System.out.println(num);
		System.out.println(i);
	}
	//&& t.t는 모ㄷ
}
