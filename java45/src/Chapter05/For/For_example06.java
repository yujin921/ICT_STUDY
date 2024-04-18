package Chapter05.For;

public class For_example06 {
	public static void main(String[] args) {
		System.out.println("1번");
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(j<=i) {
					System.out.print("*");
				}
			}
		System.out.println("");
		}
		
		System.out.println("\n교수님");
		for(int i=5; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
		System.out.println();
		}
		
		
		System.out.println("\n2번");
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i<=j) {
					System.out.print("*");
				}else {
					System.out.print("");
				}
			}
			System.out.println("");
		}
	}
}
