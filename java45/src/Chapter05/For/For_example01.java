package Chapter05.For;

public class For_example01 {
	public static void main(String[] args) {
		for(int i=0; i<10;i++) {
			System.out.print(i+" ");
		}
		System.out.println("\n");
		for(int k=1; k<=10; k++) {
			System.out.print(k+" ");
		}
		System.out.println("\n");

		for(int j=1; j<=10;j+=2) {
			System.out.print(j+" ");
		}
		System.out.println("\n");

		for(int q=0; q<=10; q+=2) {
			System.out.print(q+" ");
		}
		System.out.println("\n");

		for(int a=1; a<=10; a++) {
			System.out.print(a*10+" ");
		}
		System.out.println("\n");

		for(int s=5; s>=1; s--) {
			System.out.print(s+" ");
		}
		System.out.println("\n");

		for (int d=10000; d>=1; d /= 10) {
			System.out.print(d+" ");
		}
	}
}
